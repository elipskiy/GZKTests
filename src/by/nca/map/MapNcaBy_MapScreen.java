package by.nca.map;

import by.nca.wekhfg.CheckCriteriaJ1Screen;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class MapNcaBy_MapScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    MapNcaBy_MapScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String LAND_CHECKBOX = "//*[@id=\"dijit_form_CheckBox_36\"]";
    private static final String ZOOM_ON_BTN = "//*[@id=\"map_zoom_slider\"]/tbody/tr[1]/td[2]/div";
    private static final String REPORT_BY_CBD = "//*[@id=\"ctl00_ContentPlaceHolder1_carTabPage_T2T\"]/span";
    //--------End Xpath------

    public void selectLand(){
        wrapper.clickByXpath(LAND_CHECKBOX);
    }

    public void clickZoom(){
        wrapper.clickByXpath(ZOOM_ON_BTN);
    }
}
