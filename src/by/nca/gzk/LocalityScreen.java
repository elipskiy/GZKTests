package by.nca.gzk;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class LocalityScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(LocalityScreen.class);

    LocalityScreen(WebDriver driver) {
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

    public ObjectRealtyScreen goToGzkNcaBy_ObjectRealtyScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new ObjectRealtyScreen(wrapper.getDriver());
    }
}
