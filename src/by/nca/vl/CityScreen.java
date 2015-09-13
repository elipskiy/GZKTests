package by.nca.vl;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class CityScreen {

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(ParcelScreen.class);

    CityScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK_DROP_DOWN = "//option[@value='17030']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    //--------End Xpath------

    public void selectMinsk(){
        wrapper.clickByXpath(MINSK_DROP_DOWN);
    }

    public LocalityZoneNumberScreen goToVlNcaBy_LocalityZoneNumber(){
        wrapper.clickByXpath(NEXT_BTN);
        return new LocalityZoneNumberScreen(wrapper.getDriver());
    }
}
