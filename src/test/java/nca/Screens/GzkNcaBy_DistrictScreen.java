package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_DistrictScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(GzkNcaBy_DistrictScreen.class);

    GzkNcaBy_DistrictScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK_DISTRICT = "//option[@value='636']";
    private static final String NEXT_BTN = "//a[@onclick='doSearchSettlement()']";
    //--------Xpath End------

    public void selectMinskDistrict(){
        wrapper.clickByXpath(MINSK_DISTRICT);
    }

    public GzkNcaBy_LocalityScreen goToGzkNcaBy_LocalityScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new GzkNcaBy_LocalityScreen(wrapper.getDriver());
    }
}
