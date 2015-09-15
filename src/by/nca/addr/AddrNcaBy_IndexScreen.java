package by.nca.addr;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LoadPage;

import java.io.IOException;

/**
 * @author Makovsky Dmitry
 * @since 15.09.2015
 */
public class AddrNcaBy_IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(AddrNcaBy_IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://addr.nca.by/";

    public AddrNcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD = "//input[@id='j_username']";
    private static final String PASSWORD_FIELD = "//input[@id='j_password']";
    private static final String ENTER_BTN = "//input[@id='submit']";
    //--------End Xpath------

    public AddrNcaBy_MainPageScreen goToAddrNcaBy_MainPage(){
        driver.findElement(By.xpath(USERNAME_FIELD)).sendKeys("Monitoring");
        driver.findElement(By.xpath(PASSWORD_FIELD)).sendKeys("96ce16");
        driver.findElement(By.xpath(ENTER_BTN)).click();
        return new AddrNcaBy_MainPageScreen(driver);
    }
}
