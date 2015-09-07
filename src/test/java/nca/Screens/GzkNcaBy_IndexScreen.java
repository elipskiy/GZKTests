package nca.Screens;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_IndexScreen {

    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexPage.class);
    private static final String MAIN_PAGE_URL = "http://gzk.nca.by/";

    public GzkNcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String FIND_BY_ADDRESS_RADIO_BTN = "//input[@id='search_type_1']";
    private static final String FIND_BY_CADASTRAL_RADIO_BTN = "//input[@id='search_type_2']";
    private static final String FIND_BY_INV_NUM_RADIO_BTN = "//input[@id='search_type_3']";
    private static final String START_SEARCH_BTN = "//a[@id='startButton']";
    //--------Xpath End------

    public void clickFindByAddressRadioBtn(){
        driver.findElement(By.xpath(FIND_BY_ADDRESS_RADIO_BTN)).click();
    }

    public void clickFindByCadastralRadioBtn(){
        driver.findElement(By.xpath(FIND_BY_CADASTRAL_RADIO_BTN)).click();
    }

    public void clickFindByInvNumRadioBtn(){
        driver.findElement(By.xpath(FIND_BY_INV_NUM_RADIO_BTN)).click();
    }

    public GzkNcaBy_RegionScreen goToGzkNcaBy_RegionScreen(){
        driver.findElement(By.xpath(START_SEARCH_BTN)).click();
        return new GzkNcaBy_RegionScreen(driver);
    }

    public GzkNcaBy_SearchByCadastralNumScreen goToGzkNcaBy_SearchByCadastralNum(){
        driver.findElement(By.xpath(START_SEARCH_BTN)).click();
        return new GzkNcaBy_SearchByCadastralNumScreen(driver);
    }

    public GzkNcaBy_SearchByInvNumScreen goToGzkNcaBy_SearchByInvNumScreen(){
        driver.findElement(By.xpath(START_SEARCH_BTN)).click();
        return new GzkNcaBy_SearchByInvNumScreen(driver);
    }

}
