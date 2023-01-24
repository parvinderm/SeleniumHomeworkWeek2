package testsuite.nopcommerce;

import browserfactory.nopcommerce.BaseTestOrange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTestOrange {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
       //click on 'computer'tab

        driver.findElement(By.linkText("Computers")).click();
       //Verify the text 'Computers'
       WebElement textComputers=driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
       textComputers.getText();
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the 'Electronics'Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href=\"/electronics\"]")).click();
        //Verify the text 'Electronics'
        WebElement textElectronics=driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        textElectronics.getText();
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
     //Click On Apparel Tab
        driver.findElement(By.linkText("Apparel")).click();
        //Verify the text Apparel
        WebElement textApparel=driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        textApparel.getText();
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Click on 'DigitalDownloadsPage
        driver.findElement(By.linkText("Digital downloads")).click();
        //Verify the text 'Digital downloads
        WebElement textDigitalDownloads=driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        textDigitalDownloads.getText();

    }
    @Test
    public void userShouldNavigateToBooksaPageSuccessfully(){
        //click on the 'Books' Tab
        driver.findElement(By.linkText("Books")).click();
        //Verify the text 'Books'
        WebElement textBooks = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        textBooks.getText();
    }
    @Test
    public void userShouldNavigateToJewelryPageSuCCessfully(){
        //click on the 'Jewelry' Tab
        driver.findElement(By.linkText("Jewelry")).click();
        //Verify the 'Jewelry' Tab
        WebElement jewelryText=driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        jewelryText.getText();
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Click on the 'Gift Cards' Tab
        driver.findElement(By.linkText("Gift Cards")).click();
        //Verify the text 'Gift Cards'
        WebElement textGiftCards=driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        textGiftCards.click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
