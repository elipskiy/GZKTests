package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class ReportByRegistredSubjects {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    ReportByRegistredSubjects(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String DATE_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateReport_I\"]";
    private static final String SHAPE_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    //--------End Xpath------

    public void insertDate(){
        wrapper.sendKeysByXpath(DATE_FIELD,"04.08.2015");
    }

    public void clickShape(){
        wrapper.clickByXpath(SHAPE_BTN);
    }

    public boolean containsText(String text){
        boolean result = wrapper.containText(text);
        return result;
    }
}
