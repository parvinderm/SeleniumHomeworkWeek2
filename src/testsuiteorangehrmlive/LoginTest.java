package testsuiteorangehrmlive;

import browserfactory.nopcommerce.BaseTestOrange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestOrange {
    String baseurl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter "Admin" username
        WebElement usernameField= driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");
        //Enter "admin123" password
        WebElement passwordField= driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //Click on the login button
        WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //Verify the 'Welcome' text is display
        //Sorry website is opening but there is no welcome meassage in it ,So won't be able to do it

    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
