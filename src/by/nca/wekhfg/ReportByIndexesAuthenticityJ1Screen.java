package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class ReportByIndexesAuthenticityJ1Screen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    ReportByIndexesAuthenticityJ1Screen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String REPORT_BY_INDEXES_AUTH_J1_DROPDOWN = "//*[@id=\"ctl00_ContentPlaceHolder1_ComboBoxReg_I\"]";
    private static final String BREST_DROPDOWN = "//*[contains(text(), 'Брестсткий регистрационный округ')]";
    private static final String SHAPE_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    //--------End Xpath------

    public void selectReportByIndexJ1(){
        wrapper.clickByXpath(REPORT_BY_INDEXES_AUTH_J1_DROPDOWN);
    }

    public void selectBrest(){
        wrapper.clickByXpath(BREST_DROPDOWN);
    }

    public void clickShape(){
        wrapper.clickByXpath(SHAPE_BTN);
    }

    public boolean containsText(String text){
        boolean result = wrapper.containText(text);
        return result;
    }
}
