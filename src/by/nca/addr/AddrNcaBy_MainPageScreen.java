package by.nca.addr;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 15.09.2015
 */
public class AddrNcaBy_MainPageScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AddrNcaBy_MainPageScreen.class);

    AddrNcaBy_MainPageScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String VIEW_BTN = "//input[@value='Просмотр']";
    //--------End Xpath------

    public AddrNcaBy_SearchAddrScreen goToAddrNcaBy_SearchAddrScreen(){
        wrapper.clickByXpath(VIEW_BTN);
        return new AddrNcaBy_SearchAddrScreen(wrapper.getDriver());
    }
}
