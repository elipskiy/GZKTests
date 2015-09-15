package by.nca.support;

import by.nca.BaseIndexScreen;
import utils.DriverWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mugi4_000 on 12.09.2015.
 */
public class SupportNcaEdScreen extends BaseIndexScreen {

    private static final String PAGE_URL = "http://support.nca.by:8888/nka_ed.nsf";
    private DriverWrapper wrapper;

    public SupportNcaEdScreen(WebDriver driver) {
        super(driver, PAGE_URL);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD = "//input[@name='Username']";
    private static final String PASSWORD_FIELD = "//input[@name='Password']";
    private static final String LOGIN_BUTTON   = "//input[@value='Войти']";

    private static final String PAGE_ELEMENTS  = "/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/th/font";

    private static final String FRAME          = "//html/frameset/frameset[2]/frame[2]";
    //--------Xpath End------

    public Map login (String username, String password) {
        HashMap map = new HashMap<>();
        wrapper.sendKeysByXpath(USERNAME_FIELD, username);
        wrapper.sendKeysByXpath(PASSWORD_FIELD, password);
        wrapper.clickByXpath(LOGIN_BUTTON);
        loadPage.waitForPageLoaded(wrapper.getDriver());
        wrapper.switchFrame(wrapper.findByXpath(FRAME));
        map.put("Title", wrapper.getPageTitle());
        map.put("Elements", getPageElements());
        return map;
    }

    private List<String> getPageElements() {
        List<WebElement> listOfElements = wrapper.findElementsByXpath(PAGE_ELEMENTS);
        List<String> listOfParagraphs = new ArrayList<String>();
        for(WebElement element : listOfElements)
            listOfParagraphs.add(element.getText());
        return listOfParagraphs;
    }

}
