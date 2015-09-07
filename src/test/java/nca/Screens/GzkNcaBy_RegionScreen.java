package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_RegionScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(GzkNcaBy_RegionScreen.class);

    GzkNcaBy_RegionScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK_REGION = "//option[@value='6']";
    private static final String NEXT_BTN = "//a[@onclick='doSearchArea()']";
    //--------Xpath End------

    public void selectMinskRegion(){
        wrapper.clickByXpath(MINSK_REGION);
    }

    public GzkNcaBy_DistrictScreen goToGzkNcaBy_DistrictScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new GzkNcaBy_DistrictScreen(wrapper.getDriver());
    }
}
