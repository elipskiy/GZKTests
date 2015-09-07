package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_LocalityScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(GzkNcaBy_LocalityScreen.class);

    GzkNcaBy_LocalityScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK_LOCALITY = "//option[@value='17030']";
    private static final String NEXT_BTN = "//a[@onclick='doSearchStreet()']";
    //--------Xpath End------

    public void selectMinskLocality(){
        wrapper.clickByXpath(MINSK_LOCALITY);
    }

    public GzkNcaBy_ObjectRealtyScreen goToGzkNcaBy_ObjectRealtyScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new GzkNcaBy_ObjectRealtyScreen(wrapper.getDriver());
    }
}
