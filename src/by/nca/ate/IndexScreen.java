package by.nca.ate;

import by.nca.BaseIndexScreen;
import by.nca.rzo.AnalysisScreen;
import by.nca.rzo.CommonStatisticsScreen;
import by.nca.rzo.SearchScreen;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;

/**
 * Created by mugi4_000 on 14.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {
    private static final String MAIN_PAGE_URL = "http://ate.nca.by";
    private DriverWrapper wrapper;

    public IndexScreen(WebDriver driver) {
        super(driver, MAIN_PAGE_URL);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD    = "//input[@name='user_login']";
    private static final String PASSWORD_FIELD    = "//input[@name='user_pass']";
    private static final String LOGIN_BUTTON      = "//*[@id='logon_btn']";

    private static final String NAME_BUTTON       = "//*[@id='search_type_1']";
    private static final String CATEGORY_BUTTON   = "//*[@id='search_type_2']";
    private static final String REGNUMBER_BUTTON  = "//*[@id='search_type_3']";
    private static final String SOATO_CODE_BUTTON = "//*[@id='search_type_4']";

    //--------Xpath End------

    public void login(String username, String password) {
        wrapper.sendKeysByXpath(USERNAME_FIELD, username);
        wrapper.sendKeysByXpath(PASSWORD_FIELD, password);
        wrapper.clickByXpath(LOGIN_BUTTON);
        loadPage.waitForPageLoaded(driver);
    }


    public SearchScreen goToSearch() {
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new SearchScreen(driver);
    }

    public AnalysisScreen goToAnalysis() {
        wrapper.clickByXpath(ANALYSIS_BUTTON);
        return new AnalysisScreen(driver);
    }

}
