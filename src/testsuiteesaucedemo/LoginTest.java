package testsuiteesaucedemo;

import browseefactory.saucedemo.BaseTestSauceDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTestSauceDemo {
    String baseurl="https://www.saucedemo.com/";

    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter "standard user" username
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        //Enter password
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //Click On login Button
        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();
        //Verify the text "products
       WebElement textProducts= driver.findElement(By.xpath("//span[@class='title']"));
       textProducts.getText();
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter Username
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        //Enter password
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //Click On Login Button
        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();
        //verify six products are displayed
       WebElement sixProducts=driver.findElement(By.xpath("//div[@class='inventory_list']"));
       sixProducts.isDisplayed();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
