package pr.nca.by;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://pr.nca.by/";

    public IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String ISOLATED_ROOM_RADIO_BTN = "//input[@id='search_type_3']";
    private static final String SETTELMENTS_MENU = "//img[@src='http://pr.nca.by/img/tree_plus.gif']";
    private static final String SHOW_BTN = "//a[@id='okButton']";
    private static final String USERNAME_FIELD = "//input[@id='inputUserName']";
    private static final String PASSWORD_FIELD = "//input[@id='inputUserKey']";
    private static final String ENTER_BTN = "//a[@id='enterButton']";
    private static final String FIND_BTN = "//*[@id=\"SearchFrame\"]/table/tbody/tr[5]/td/table/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/a/span/span";
    private static final String DATE_OF_TRANSACTION_TO = "//*[@id=\"SearchFrame\"]/table/tbody/tr[5]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/table/tbody/tr/td[4]/input";
    private static final String DATE_OF_TRANSACTION_OF = "//*[@id=\"SearchFrame\"]/table/tbody/tr[5]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/table/tbody/tr/td[2]/input";
    private static final String BRESTSKAYA_DISTRICT_MENU = "//*[contains(text(), '\n" +
            "Брестская обл.')]";
    private static final String BARANOVICHI_MENU = "//*[contains(text(), '\n" +
            "г. Барановичи')]";
    private static final String TAX_BASE_OF_LAND_TAX_BTN = "//a[@class='bigcbtnn']";
    //--------Xpath End------

    public void scrollDownToIsolatedRoom()  {
        WebElement element = driver.findElement(By.xpath(ISOLATED_ROOM_RADIO_BTN));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,element);
    }

    public void selectIsolatedRoom(){
        driver.findElement(By.xpath(ISOLATED_ROOM_RADIO_BTN)).click();
    }

    public void clickSettelments(){
        driver.findElement(By.xpath(SETTELMENTS_MENU)).click();
    }

    public void clickBrestskaya(){
        driver.findElement(By.xpath(BRESTSKAYA_DISTRICT_MENU)).click();
    }

    public void clickBaranovichi(){
        driver.findElement(By.xpath(BARANOVICHI_MENU)).click();
    }

    public void insertDateTransactionOf(){
        driver.findElement(By.xpath(DATE_OF_TRANSACTION_OF)).clear();
        driver.findElement(By.xpath(DATE_OF_TRANSACTION_OF)).sendKeys("01.05.2015");
    }

    public void insertDateTransactionTo(){
        driver.findElement(By.xpath(DATE_OF_TRANSACTION_TO)).clear();
        driver.findElement(By.xpath(DATE_OF_TRANSACTION_TO)).sendKeys("02.05.2015");
    }

    public void scrollDownToFindBtn()  {
        WebElement element = driver.findElement(By.xpath(FIND_BTN));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                , element);
    }

    public void clickFindBtn(){
        driver.findElement(By.xpath(FIND_BTN)).click();
    }

    public void scrollUpToShowBtn()  {
        WebElement element = driver.findElement(By.xpath(SHOW_BTN));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                , element);
    }

    public void clickShowBtn(){
        driver.findElement(By.xpath(SHOW_BTN)).click();
    }

    public void insertUsername(){
        driver.findElement(By.xpath(USERNAME_FIELD)).sendKeys("monitoring");
    }

    public void insertPassword(){
        driver.findElement(By.xpath(PASSWORD_FIELD)).sendKeys("v1baap9vl");
    }

    public void clickEnter(){
        driver.findElement(By.xpath(ENTER_BTN)).click();
    }

    public void closeAlertWindow(){
        driver.switchTo().alert().accept();
    }


}
