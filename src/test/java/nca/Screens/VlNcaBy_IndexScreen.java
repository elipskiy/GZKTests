package nca.Screens;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class VlNcaBy_IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(VlNcaBy_IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://vl.nca.by/";

    public VlNcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String CADASTRAL_COST_LANGRB_BTN = "//a[@class='bigbtnn']";
    //--------Xpath End------

    public VlNcaBy_CadastralCostLangRBScreen goToVlNcaBy_CadastralCostLangRBScreen(){
        driver.findElement(By.xpath(CADASTRAL_COST_LANGRB_BTN)).click();
        return new VlNcaBy_CadastralCostLangRBScreen(driver);
    }
}
