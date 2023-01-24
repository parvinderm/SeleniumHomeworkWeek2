package browseefactory.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTestSauceDemo {

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        ChromeOptions options = new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
