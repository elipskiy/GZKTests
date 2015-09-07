package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_SearchByCadastralNumScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(GzkNcaBy_SearchByCadastralNumScreen.class);

    GzkNcaBy_SearchByCadastralNumScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String OSATO_FIELD = "//input[@id='soato_select']";
    private static final String BLOCK_NUM_FIELD = "//input[@id='block_select']";
    private static final String PARCEL_NUM_FIELD = "//input[@id='parcel_select']";
    private static final String FIND_BTN = "//a[@onclick='doCNSearch()']";
    //--------Xpath End------

    public void insertOsato(String osato){
        wrapper.sendKeysByXpath(OSATO_FIELD, osato);
    }

    public void insertBlockNum(String blockNum){
        wrapper.sendKeysByXpath(BLOCK_NUM_FIELD, blockNum);
    }

    public void insertParcelNum(String parcelNum){
        wrapper.sendKeysByXpath(PARCEL_NUM_FIELD, parcelNum);
    }

    public GzkNcaBy_SearchResultScreen goToGzkNcaBy_SearchResultScreen(){
        wrapper.clickByXpath(FIND_BTN);
        return new GzkNcaBy_SearchResultScreen(wrapper.getDriver());
    }
}
