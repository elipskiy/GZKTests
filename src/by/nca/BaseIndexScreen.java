package by.nca;

import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 12.09.2015.
 */
public abstract class BaseIndexScreen {

    public WebDriver driver;
    public Logger log;
    public LoadPage loadPage;

    public BaseIndexScreen(WebDriver driver, String mainPageUrl) {
        this.driver = driver;
        driver.get(mainPageUrl);
        log = Logger.getLogger(this.getClass());
        loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }
}
