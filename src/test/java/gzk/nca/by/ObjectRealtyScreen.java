package gzk.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class ObjectRealtyScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(ObjectRealtyScreen.class);

    ObjectRealtyScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String STREET = "//option[@value='11974']";
    private static final String HOUSE_NUM_FIELD = "//input[@id='house_select']";
    private static final String NEXT_BTN = "//a[@onclick='getResult()']";
    //--------Xpath End------

    //-------String----------
    private String porch = "12";
    //-------String End------

    public void selectStreet(){
        wrapper.clickByXpath(STREET);
    }

    public void inputHouseNumber(){
        wrapper.sendKeysByXpath(HOUSE_NUM_FIELD,porch);
    }

    public SearchResultScreen goToGzkNcaBy_SearchResultScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new SearchResultScreen(wrapper.getDriver());
    }
}
