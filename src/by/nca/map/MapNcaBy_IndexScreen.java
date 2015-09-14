package by.nca.map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LoadPage;

import java.io.IOException;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class MapNcaBy_IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(MapNcaBy_IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://map.nca.by/";

    public MapNcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String CONFIRM_BTN = "//input[@value='Принимаю']";
    //--------End Xpath------

    public MapNcaBy_MapScreen goToMapNcaBy_MapScreen(){
        driver.findElement(By.xpath(CONFIRM_BTN)).click();
        return new MapNcaBy_MapScreen(driver);
    }
}

