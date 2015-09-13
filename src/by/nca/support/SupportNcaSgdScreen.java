package by.nca.support;

import by.nca.IndexScreen;
import utils.DriverWrapper;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mugi4_000 on 12.09.2015.
 */
public class SupportNcaSgdScreen extends IndexScreen {

    private static final String PAGE_URL = "http://support.nca.by:8888/nka_sgd.nsf";
    private DriverWrapper wrapper;

    public SupportNcaSgdScreen(WebDriver driver) {
        super(driver, PAGE_URL);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD = "//input[@name='Username']";
    private static final String PASSWORD_FIELD = "//input[@name='Password']";
    private static final String LOGIN_BUTTON   = "//input[@value='Войти']";

    private static final String TEXT_HEADER    = "//body/form/div/b/font"; //Закладные
    //--------Xpath End------

    public Map login (String username, String password) {
        HashMap map = new HashMap<>();
        wrapper.sendKeysByXpath(USERNAME_FIELD, username);
        wrapper.sendKeysByXpath(PASSWORD_FIELD, password);
        wrapper.clickByXpath(LOGIN_BUTTON);
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("Title", wrapper.getPageTitle());
        map.put("Header", wrapper.getTextByXpath(TEXT_HEADER));
        return map;
    }

}
