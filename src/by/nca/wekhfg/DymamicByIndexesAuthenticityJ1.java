package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class DymamicByIndexesAuthenticityJ1 {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    DymamicByIndexesAuthenticityJ1(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String DYNAMIC_BY_INDEX_DROPDOWN = "//*[@id=\"ctl00_ContentPlaceHolder1_AsPxComboBoxCheck_I\"]";
    private static final String BIRTH_DATE_BEFORE_01_01_1850 = "//*[contains(text(), 'Дата рождения < 01.01.1850 (c 01.2008)')]";
    private static final String BREST_MENU = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxTreeList1_R-1\"]/td[2]/img";
    private static final String VALUE_100_MENU = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxTreeList1_R-100\"]/td[4]";
    private static final String DATE_FROM_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateEditFrom_I\"]";
    private static final String DATE_TO_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateEditTo_I\"]";
    private static final String SHOW_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_ASPxButton1_T\"]/span";
    //--------End Xpath------

    public void selectDynamicByIndex(){
        wrapper.clickByXpath(DYNAMIC_BY_INDEX_DROPDOWN);
    }

    public void selectBirthDateBefore(){
        wrapper.clickByXpath(BIRTH_DATE_BEFORE_01_01_1850);
    }

    public void clickBrestMenu(){
        wrapper.clickByXpath(BREST_MENU);
    }

    public void clickVal100(){
        wrapper.clickByXpath(VALUE_100_MENU);
    }

    public void insertDateFromTo(){
        wrapper.sendKeysByXpath(DATE_FROM_FIELD,"01.01.2015");
        wrapper.sendKeysByXpath(DATE_TO_FIELD, "17.07.2015");
    }

    public void clickShow(){
        wrapper.clickByXpath(SHOW_BTN);
    }

}
