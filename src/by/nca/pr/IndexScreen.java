package by.nca.pr;

import by.nca.BaseIndexScreen;
import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {
    public WebDriver driver;
    public DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://pr.nca.by/";

    public IndexScreen(WebDriver driver) throws IOException {
        super(driver, MAIN_PAGE_URL);
        this.driver = driver;
        wrapper = new DriverWrapper(driver);
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
        wrapper.scrollDown(ISOLATED_ROOM_RADIO_BTN);
    }

    public void selectIsolatedRoom(){
        wrapper.clickByXpath(ISOLATED_ROOM_RADIO_BTN);
    }

    public void clickSettelments(){
        wrapper.clickByXpath(SETTELMENTS_MENU);
    }

    public void clickBrestskaya(){
        wrapper.clickByXpath(BRESTSKAYA_DISTRICT_MENU);
    }

    public void clickBaranovichi(){
        wrapper.clickByXpath(BARANOVICHI_MENU);
    }

    public void insertDateTransactionOf(){
        wrapper.clear(DATE_OF_TRANSACTION_OF);
        wrapper.sendKeysByXpath(DATE_OF_TRANSACTION_OF, "01.05.2015");
    }

    public void insertDateTransactionTo(){
        wrapper.clear(DATE_OF_TRANSACTION_TO);
        wrapper.sendKeysByXpath(DATE_OF_TRANSACTION_TO, "02.05.2015");
    }

    public void scrollDownToFindBtn()  {
        wrapper.scrollDown(FIND_BTN);
    }

    public void clickFindBtn(){
        wrapper.clickByXpath(FIND_BTN);
    }

    public void scrollUpToShowBtn()  {
        wrapper.scrollDown(SHOW_BTN);
    }

    public void clickShowBtn(){
        wrapper.clickByXpath(SHOW_BTN);
    }

    public void insertUsername(){
        wrapper.sendKeysByXpath(USERNAME_FIELD, "monitoring");
    }

    public void insertPassword(){
        wrapper.sendKeysByXpath(PASSWORD_FIELD, "v1baap9vl");
    }

    public void clickEnter(){
        wrapper.clickByXpath(ENTER_BTN);
    }

    public void closeAlertWindow(){
        wrapper.closeAlertWindow();
    }


}
