package testsuite.nopcommerce;

import browserfactory.nopcommerce.BaseTestOrange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTestOrange {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on the 'Register' link
        driver.findElement(By.className("ico-register")).click();
        //Verify the text 'Register'
        WebElement registerText=driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        registerText.getText();

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the 'Register' link
        driver.findElement(By.className("ico-register")).click();
        //Select gender radio button

     WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='gender-male']"));//Male radio button
     WebElement radioButtonFemale =driver.findElement(By.xpath("//input[@id='gender-female']"));//Female radio button
     String GenderToBeSelected="Female";

     if(GenderToBeSelected.equalsIgnoreCase("male")){
         radioButtonMale.click();
        }
        else if(GenderToBeSelected.equalsIgnoreCase("female")){
            radioButtonFemale.click();
        }
        //Enter First Name
      WebElement firstName=driver.findElement(By.id("FirstName"));
      firstName.sendKeys("Rahul");
      //Enter Last Name
         WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Patel");
        //Enter Email address
        WebElement emailAddress=driver.findElement(By.id("Email"));
        emailAddress.sendKeys("sinase@gmail.com");
        //Enter Password
        WebElement passwordfield= driver.findElement(By.id("Password"));
        passwordfield.sendKeys("123456");
        //Enter Confirm Password
        WebElement confirmPassword=driver.findElement(By.name("ConfirmPassword"));
        confirmPassword.sendKeys("123456");
        //Click on Register button
        WebElement registerButton= driver.findElement(By.id("register-button"));
        registerButton.click();
        //Verify the text 'Your registration completed'
        WebElement textYourRegistrationCompleted= driver.findElement(By.className("result"));
            textYourRegistrationCompleted.getText();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
