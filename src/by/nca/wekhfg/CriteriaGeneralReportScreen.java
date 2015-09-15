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
public class CriteriaGeneralReportScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    CriteriaGeneralReportScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String DATE_FIELD = "//*[@id=\"ctl00_ContentPlaceHolder1_DateReport_I\"]";
    private static final String SHAPE_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_btnFind\"]";
    private static final String REPORT_BY_CBD = "//*[@id=\"ctl00_ContentPlaceHolder1_carTabPage_T2T\"]/span";
    //--------End Xpath------

    public void getDateAndInsert(){
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date = dateFormat.format(d);
        wrapper.sendKeysByXpath(DATE_FIELD,date);
    }

    public void clickShape(){
        wrapper.clickByXpath(SHAPE_BTN);
    }

    public void clickCbdReport(){
        wrapper.clickByXpath(REPORT_BY_CBD);
    }

    public boolean containsText(String text){
        boolean result = wrapper.containText(text);
        return result;
    }
}
