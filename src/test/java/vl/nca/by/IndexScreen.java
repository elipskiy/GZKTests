package vl.nca.by;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://vl.nca.by/";

    public IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String CADASTRAL_COST_LANGRB_BTN = "//a[@class='bigbtnn']";
    private static final String TAX_BASE_OF_LAND_TAX_BTN = "//a[@class='bigcbtnn']";
    //--------Xpath End------

    public CadastralCostLangRBScreen goToVlNcaBy_CadastralCostLangRBScreen(){
        driver.findElement(By.xpath(CADASTRAL_COST_LANGRB_BTN)).click();
        return new CadastralCostLangRBScreen(driver);
    }

    public TaxBaseOfLandTax goToVlNcaBy_TaxBaseOfLandTax(){
        driver.findElement(By.xpath(TAX_BASE_OF_LAND_TAX_BTN)).click();
        return new TaxBaseOfLandTax(driver);
    }
}
