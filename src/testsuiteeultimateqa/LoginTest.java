package testsuiteeultimateqa;

import browsfactory.ultimateqa.BaseTestUltimateqa;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestUltimateqa {

    String baseurl="https://courses.ultimateqa.com/";

    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Click on the sign in link
        WebElement signIn= driver.findElement(By.linkText("Sign In"));
        signIn.click();
        //Verify the text 'Welcome Back'
        WebElement textWelcomeBack= driver.findElement(By.xpath("//h2[@class='page__heading']"));
        textWelcomeBack.getText();

    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the sign in link
        WebElement signIn= driver.findElement(By.linkText("Sign In"));
        signIn.click();
        //Enter invalid username
        WebElement invalidEmail= driver.findElement(By.id("user[email]"));
        invalidEmail.sendKeys("sina@gmail.com");
        //Enter invalid username
        WebElement invalidPassword= driver.findElement(By.name("user[password]"));
        invalidPassword.sendKeys("12345");
        //Click on login button
       WebElement signInButton=driver.findElement(By.xpath("//button[@type='submit']"));
       signInButton.click();
       //Verify the error message
        WebElement invalidEmailOrPassword= driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        invalidEmailOrPassword.getText();

    }
}
