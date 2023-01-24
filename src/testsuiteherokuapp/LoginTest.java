package testsuiteherokuapp;

import browsefractory.herokuapp.BaseTestHerokuapp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestHerokuapp {
    String baseurl="http://the-internet.herokuapp.com/login";

    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter "tomsmith" username
        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        //Enter "SuperSecretPassword" password
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        //click on login button
       WebElement loginButton= driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
       loginButton.click();
       //Verify the text "Secure Area"
        WebElement textSecureArea= driver.findElement((By.xpath("//i[@class='icon-lock']")));
        textSecureArea.getText();

    }
    @Test
    public void UserNameErrorMessage(){
        //Enter "tomsmith1" username
        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("tomsmith1");
        //Enter"SuperSecretPassword!
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        //Click on Login Button
        WebElement loginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        //Verify the Error message "Your username is invalid"
       WebElement errorMessage= driver.findElement(By.xpath("//div[@id='flash']"));
       errorMessage.getText();
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        //Enter "tomsmith username
        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        //Enter "SuperSecretPassword" password
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");
        //Click On login Button
        WebElement loginButton= driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        //Verify the error message "Your password is invalid"
        WebElement errorMessage=driver.findElement(By.xpath("//div[@id='flash']"));
        errorMessage.getText();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
