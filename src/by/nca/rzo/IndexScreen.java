package by.nca.rzo;

import by.nca.BaseIndexScreen;
import utils.DriverWrapper;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {

    private static final String MAIN_PAGE_URL = "http://rzo.nca.by";
    private DriverWrapper wrapper;

    public IndexScreen(WebDriver driver) {
        super(driver, MAIN_PAGE_URL);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD = "//input[@name='login']";
    private static final String PASSWORD_FIELD = "//input[@name='pw']";
    private static final String LOGIN_BUTTON   = "//input[@type='submit']";

    private static final String COMMON_STATISTICS_BUTTON = "//*[@id=\"sddm\"]/li[2]/a";
    //--------Xpath End------

    public void login(String username, String password) {
        wrapper.sendKeysByXpath(USERNAME_FIELD, username);
        wrapper.sendKeysByXpath(PASSWORD_FIELD, password);
        wrapper.clickByXpath(LOGIN_BUTTON);
        loadPage.waitForPageLoaded(driver);
    }

    public CommonStatisticsScreen goToCommonStatistics() {
        wrapper.clickByXpath(COMMON_STATISTICS_BUTTON);
        return new CommonStatisticsScreen(driver);
    }

}
