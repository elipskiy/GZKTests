package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class DynamicIntegrityScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    DynamicIntegrityScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String DATE_FIELD= "//*[@id=\"ctl00_ContentPlaceHolder1_DateReport_I\"]";
    private static final String SHAPE_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    private static final String BREST_DISTRICT_DROPDOWN = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxTreeList1_R-1\"]/td[2]/img";
    private static final String VALUE_100_DROPDOWN = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxTreeList1_R-100\"]/td[4]";
    private static final String DATE_FROM_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateEditFrom_I\"]";
    private static final String DATE_TO_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateEditTo_I\"]";
    private static final String SHOW_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxButton1_T\"]/span";
    //--------End Xpath------

    public void selectBrestDistrict(){
        wrapper.clickByXpath(BREST_DISTRICT_DROPDOWN);
    }

    public void selectVal100(){
        wrapper.clickByXpath(VALUE_100_DROPDOWN);
    }

    public void insertDateFromTo(){
        wrapper.sendKeysByXpath(DATE_FROM_FIELD,"01.01.2015");
        wrapper.sendKeysByXpath(DATE_TO_FIELD,"17.07.2015");
    }

    public void clickShowBtn(){
        wrapper.clickByXpath(SHOW_BTN);
    }
}
