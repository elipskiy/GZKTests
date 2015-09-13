package vl.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class DescriptionParcelScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(DescriptionParcelScreen.class);

    DescriptionParcelScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String BY_CADASTRAL_NUMBER_PARCEL_LANG_RADIO_BTN = "//input[@id='search_type_1']";
    private static final String START_SEARCH_BTN = "//*[contains(text(), 'Начать поиск')]";
    //Начать поиск
    //--------Xpath End------

    public boolean containsVal(String val){
        boolean result = wrapper.containText(val);
        return result;
    }
}
