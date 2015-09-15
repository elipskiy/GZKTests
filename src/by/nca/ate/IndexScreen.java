package by.nca.ate;

import by.nca.BaseIndexScreen;
import by.nca.rzo.AnalysisScreen;
import by.nca.rzo.CommonStatisticsScreen;
import by.nca.rzo.SearchScreen;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.PageScreenShot;

import java.io.IOException;
import java.util.List;

/**
 * Created by mugi4_000 on 14.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {
    private static final String MAIN_PAGE_URL = "http://ate.nca.by";
    private DriverWrapper wrapper;
    PageScreenShot screenShot;

    public IndexScreen(WebDriver driver) {
        super(driver, MAIN_PAGE_URL);
        wrapper = new DriverWrapper(driver);
        screenShot = new PageScreenShot(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD                   = "//input[@name='user_login']";
    private static final String PASSWORD_FIELD                   = "//input[@name='user_pass']";
    private static final String LOGIN_BUTTON                     = "//*[@id='logon_btn']";

    private static final String NAME_BUTTON                      = "//*[@id='search_type_1']";
    private static final String CATEGORY_BUTTON                  = "//*[@id='search_type_2']";
    private static final String REGNUMBER_BUTTON                 = "//*[@id='search_type_3']";
    private static final String SOATO_CODE_BUTTON                = "//*[@id='search_type_4']";
    private static final String START_SEARCH_BUTTON              = "//*[@id='contentFrame']/table/tbody/tr[5]/td/table/tbody/tr/td/a/span/span";

    private static final String NAME_NAME_INPUT                  = "//*[@id='objname']";
    private static final String NAME_SEARCH_BUTTON               = "//*[@id='contentFrame']/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/a/span/span";
    private static final String NAME_TABLE                       = "//table/tbody/tr[4]/td[2]/div/table/tbody/tr/td";

    private static final String CATEGORY_PLUS_BUTTON             = "//*[@id='contentFrame']/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[1]/img";
    private static final String CATEGORY_MINSK_BUTTON            = "//*[@id='contentFrame']/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/div/table[5]/tbody/tr[1]/td[1]/img";
    private static final String CATEGORY_INNER_DISTRICT_CHECKBOX = "//*[@id='cat_param_1']";
    private static final String CATEGORY_SHOW_BUTTON             = "//*[@id='contentFrame']/table/tbody/tr/td[2]/div/div/table/tbody/tr/td[3]/a/span/span";
    private static final String CATEGORY_TABLE                   = "//div[@id='contentFrame']/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td";

    private static final String REGNUMBER_INPUT                  = "//*[@id='contentFrame']/div[1]/table/tbody/tr[1]/td[2]/input";
    private static final String REGNUMBER_FIND_BUTTON            = "//*[@id='contentFrame']/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/a/span/span";
    private static final String REGNUMBER_TABLE                  = "//div[@id='contentFrame']/table/tbody/tr[2]/td/div/table/tbody/tr/td";

    private static final String SOATO_CODE_INPUT                 = "//*[@id='contentFrame']/div[1]/table/tbody/tr[1]/td[2]/input";
    private static final String SOATO_CODE_FIND_BUTTON           = "//*[@id='contentFrame']/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/a/span/span";
    private static final String SOATO_CODE_TABLE                 = "//div[@id='contentFrame']/table/tbody/tr[2]/td/div/table/tbody/tr/td";
    //--------Xpath End------

    public void takeScreen(String name) {
        try {
            screenShot.takeScreenShot(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void login(String username, String password) {
        wrapper.sendKeysByXpath(USERNAME_FIELD, username);
        wrapper.sendKeysByXpath(PASSWORD_FIELD, password);
        wrapper.clickByXpath(LOGIN_BUTTON);
        loadPage.waitForPageLoaded(driver);
    }

    public List<String> searchByName(String name) {
        wrapper.clickByXpath(NAME_BUTTON);
        wrapper.clickByXpath(START_SEARCH_BUTTON);
        wrapper.sendKeysByXpath(NAME_NAME_INPUT, name);
        wrapper.clickByXpath(NAME_SEARCH_BUTTON);
        return getTextOfElements(NAME_TABLE);
    }

    public List<String> searchByCategory() {
        wrapper.clickByXpath(CATEGORY_BUTTON);
        wrapper.clickByXpath(START_SEARCH_BUTTON);
        wrapper.clickByXpath(CATEGORY_PLUS_BUTTON);
        wrapper.clickByXpath(CATEGORY_MINSK_BUTTON);
        wrapper.clickByXpath(CATEGORY_INNER_DISTRICT_CHECKBOX);
        wrapper.clickByXpath(CATEGORY_SHOW_BUTTON);
        return getTextOfElements(CATEGORY_TABLE);
    }

    public List<String> searchByRegistrationNumber(String number) {
        wrapper.clickByXpath(REGNUMBER_BUTTON);
        wrapper.clickByXpath(START_SEARCH_BUTTON);
        wrapper.sendKeysByXpath(REGNUMBER_INPUT, number);
        wrapper.clickByXpath(REGNUMBER_FIND_BUTTON);
        return getTextOfElements(REGNUMBER_TABLE);
    }

    public List<String> searchBySOATOCode(String code) {
        wrapper.clickByXpath(SOATO_CODE_BUTTON);
        wrapper.clickByXpath(START_SEARCH_BUTTON);
        wrapper.sendKeysByXpath(SOATO_CODE_INPUT, code);
        wrapper.clickByXpath(SOATO_CODE_FIND_BUTTON);
        return getTextOfElements(SOATO_CODE_TABLE);
    }

}
