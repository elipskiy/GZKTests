package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class ReportByStructuredAddress {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    ReportByStructuredAddress(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String BY_CDB_CHECKBOX = "//*[@id=\"ctl00_ContentPlaceHolder1_CheckBox_db\"]";
    private static final String SHOW_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    //--------End Xpath------

    public void selectCdbCheckbox(){
        wrapper.clickByXpath(BY_CDB_CHECKBOX);
    }

    public void clickShowBtn(){
        wrapper.clickByXpath(SHOW_BTN);
    }

    public boolean containsText(String text){
        boolean result = wrapper.containText(text);
        return result;
    }
}
