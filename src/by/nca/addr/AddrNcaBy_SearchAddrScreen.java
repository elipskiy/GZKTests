package by.nca.addr;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 15.09.2015
 */
public class AddrNcaBy_SearchAddrScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AddrNcaBy_MainPageScreen.class);

    AddrNcaBy_SearchAddrScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK = "//*[contains(text(), 'г. Минск')]";
    private static final String BUILT_RADIO_BTN = "//*[@id=\"radioBuiltUp\"]";
    private static final String ADDRESSES_DROPDOWN = "//*[@id=\"selectElementOfInternalAddress\"]";
    private static final String KRASNOZVEZDNIJ_STREET_DROPDOWN = "//*[@id=\"selectElementOfInternalAddress\"]/option[589]";
    private static final String KS_NUMBER_FIELD = "//*[@id=\"textBuildingNumber\"]";
    private static final String FIND_BTN = "//*[@id=\"buttonSearch\"]";
    //--------End Xpath------

    public void selectMinsk(){
        wrapper.doubleClick(MINSK);
    }

    public void selectBuilt(){
        wrapper.clickByXpath(BUILT_RADIO_BTN);
    }

    public void clickAddresses(){
        wrapper.clickByXpath(ADDRESSES_DROPDOWN);
    }

    public void selectKrasnozvezdnijStr(){
        wrapper.clickByXpath(KRASNOZVEZDNIJ_STREET_DROPDOWN);
    }

    public void insertBuildNumber(){
        wrapper.sendKeysByXpath(KS_NUMBER_FIELD, "12");
    }

    public void clickFind(){
        wrapper.clickByXpath(FIND_BTN);
    }
}
