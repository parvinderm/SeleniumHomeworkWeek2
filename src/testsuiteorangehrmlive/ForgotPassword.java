package testsuiteorangehrmlive;

import browserfactory.nopcommerce.BaseTestOrange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseTestOrange {
    String baseurl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNvigateToForgotPasswordPaageSuccessfully(){
        //click on the 'Forgot your password'link
        WebElement forgotPassword= driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPassword.click();
        //Verify the text 'Forgot your Password
        //Soory but the website doesn't have any verify text for forgot password

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
