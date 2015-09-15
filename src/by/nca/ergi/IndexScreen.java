package by.nca.ergi;

import by.nca.BaseIndexScreen;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.PageScreenShot;

import java.io.IOException;

/**
 * Created by mugi4_000 on 15.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {

    private static final String MAIN_PAGE_URL = "http://ergi.nca.by";
    private DriverWrapper wrapper;
    PageScreenShot screenShot;

    public IndexScreen(WebDriver driver) {
        super(driver, MAIN_PAGE_URL);
        wrapper = new DriverWrapper(driver);
        screenShot = new PageScreenShot(driver);
    }

    //--------Xpath----------
    private static final String USERNAME_FIELD                   = "//input[@name='j_username']";
    private static final String PASSWORD_FIELD                   = "//input[@name='j_password']";
    private static final String LOGIN_BUTTON                     = "//*[@id='ok']";

    private static final String SUBJECT_DETAILS                  = "//*[@id='el1']";
    private static final String PRINT_FORMS                      = "//*[@id='el4']";

    private static final String SUBJECT_DETAILS_TABLE_HEAD       = "/html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td[1]";
    private static final String SUBJECT_DETAILS_CANCEL           = "/html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/input";

    private static final String PRINT_FORMS_TABLE_HEAD           = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td";
    //--------Xpath End------

    public String getPageTitle() {
        return wrapper.getPageTitle();
    }
    public String getPageUrl() {
        return wrapper.getCurrentUrl();
    }

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

    public String goToSubjectDetails() {
        wrapper.clickByXpath(SUBJECT_DETAILS);
        loadPage.waitForPageLoaded(driver);
        return wrapper.getTextByXpath(SUBJECT_DETAILS_TABLE_HEAD);
    }

    public void cancel() {
        wrapper.clickByXpath(SUBJECT_DETAILS_CANCEL);
        loadPage.waitForPageLoaded(driver);
    }

    public String goToPrintForms() {
        wrapper.clickByXpath(PRINT_FORMS);
        loadPage.waitForPageLoaded(driver);
        return wrapper.getTextByXpath(PRINT_FORMS_TABLE_HEAD);
    }

}
