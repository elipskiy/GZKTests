package wekhfg.nca.by;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://wekhfg.nca.by/";

    public IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String CHECK_CRITERIA_LINK = "//input[@id='search_type_5']";
    private static final String CRITERIA_CHECK_DROPDOWN = "//*[contains(text(), 'КРИТЕРИИ ПРОВЕРКИ')]";
    private static final String INDEX_J1_LINK = "//*[contains(text(), 'Сведения по индексу достоверности J1')]";
    //--------Xpath End------

    public CheckCriteriaJ1Screen goToWekhfgNcaBy_CheckCriteriaJ1Screen() throws InterruptedException {
        driver.findElement(By.xpath(CRITERIA_CHECK_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(INDEX_J1_LINK)).click();
        return new CheckCriteriaJ1Screen(driver);
    }
}
