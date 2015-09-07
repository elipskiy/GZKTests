package nca.Screens;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class OzNcaBy_IndexScreen {

    public WebDriver driver;
    public static final Logger log = Logger.getLogger(OzNcaBy_IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://oz.nca.by/";

    public OzNcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String INVENTORY_NUM_RADIO_BTN = "//input[@id='search_type_3']";
    private static final String START_SEARCH_BTN = "//a[@onclick='searchNow()']";
    //--------Xpath End------

    public void selectInvNum(){
        driver.findElement(By.xpath(INVENTORY_NUM_RADIO_BTN)).click();
    }

    public OzNcaBy_SearchByInvNumScreen goToOzNcaBy_SearchByInvNumScreen(){
        driver.findElement(By.xpath(START_SEARCH_BTN)).click();
        return new OzNcaBy_SearchByInvNumScreen(driver);
    }
}
