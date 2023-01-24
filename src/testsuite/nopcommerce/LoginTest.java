package testsuite.nopcommerce;

import browserfactory.nopcommerce.BaseTestOrange;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestOrange {
    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);

    }
    @Test
    public void login(){
        //userShouldNavigateToLoginPageSuccessfully
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        //verify welcome message
        WebElement welcomeMsg=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText=welcomeMsg.getText();
        String expectedText="Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
       //click login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();
        //Enter email id in to email field
        WebElement emailIdField=driver.findElement(By.id("Email"));
        emailIdField.sendKeys("so@gmail.com");
        //Enter password into password field
        WebElement passwordField= driver.findElement(By.name("Password"));
        passwordField.sendKeys("Dhanani");
        //Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
       //click on log out button
//        WebElement logOutLink=driver.findElement(By.className("ico-logout"));
        WebElement logOutLink=driver.findElement(By.className("ico-logout"));
        String actualText = logOutLink.getText();
        String expectedText="Log out";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void verifyTheErrorMessage(){
        //click on login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();
        //Enter invalid email id in email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("sina@gmail.com");
        //Enter invalid password in email field
        WebElement passwordField= driver.findElement(By.name("Password"));
        passwordField.sendKeys("1234");
        //Click on login button
        WebElement loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        //Verify the error message
        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        errorMessage.getText();


        }

     @After
    public void tearDown(){
        closeBrowser();
     }



}
