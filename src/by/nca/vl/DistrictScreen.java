package by.nca.vl;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class DistrictScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(DistrictScreen.class);

    DistrictScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String MINSK_DROP_DOWN = "//option[@value='17030']";
    private static final String BARANOVICHY_DROP_DOWN = "//option[@value='2']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    private static final String START_SEARCH_BTN = "//*[contains(text(), 'Начать поиск')]";
    //--------Xpath End------

    public void selectMinsk(){
        wrapper.clickByXpath(MINSK_DROP_DOWN);
    }

    public void selectBaranovichyDistrict(){
        wrapper.clickByXpath(BARANOVICHY_DROP_DOWN);
    }

    public ExactAddressScreen goToVlNcaBy_ExactAddressScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new ExactAddressScreen(wrapper.getDriver());
    }

    public GardenerPartnershipScreen goToVlNcaBy_GardenerPartnershipScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new GardenerPartnershipScreen(wrapper.getDriver());
    }

    public AreasOutsideSettlementsScreen goToVlNcaBy_AreasOutsideSettlementsScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new AreasOutsideSettlementsScreen(wrapper.getDriver());
    }
}
