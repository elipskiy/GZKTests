package by.nca.wekhfg;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class ReportByIndexesIntegrityScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    ReportByIndexesIntegrityScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String DATE_FIELD= "//*[@id=\"ctl00_ContentPlaceHolder1_DateReport_I\"]";
    private static final String J1_RADIO_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_RadioButtonList1_0\"]";
    private static final String SHOW_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    //--------End Xpath------

    public void getDateAndInsert(){
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date = dateFormat.format(d);
        wrapper.sendKeysByXpath(DATE_FIELD,date);
    }

    public void selectJ1(){
        wrapper.clickByXpath(J1_RADIO_BTN);
    }

    public void clickShow(){
        wrapper.clickByXpath(SHOW_BTN);
    }
}
