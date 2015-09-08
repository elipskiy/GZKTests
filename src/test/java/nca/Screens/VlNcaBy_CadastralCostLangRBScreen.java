package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class VlNcaBy_CadastralCostLangRBScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(VlNcaBy_CadastralCostLangRBScreen.class);

    VlNcaBy_CadastralCostLangRBScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String BY_CADASTRAL_NUMBER_PARCEL_LANG_RADIO_BTN = "//input[@id='search_type_1']";
    private static final String BY_LOCALITY_ADDRESS_RADIO_BTN = "//input[@id='search_type_2']";
    private static final String BY_GARDENER_PARTNERSHIP_RADIO_BTN = "//input[@id='search_type_3']";
    private static final String BY_LOCALITY_ZONE_NUM_RADIO_BTN = "//input[@id='search_type_5']";
    private static final String START_SEARCH_BTN = "//*[contains(text(), 'Начать поиск')]";
    //Начать поиск
    //--------Xpath End------

    public void selectCadasralNumberParcel(){
        wrapper.clickByXpath(BY_CADASTRAL_NUMBER_PARCEL_LANG_RADIO_BTN);
    }

    public void selectLocalityAddress(){
        wrapper.clickByXpath(BY_LOCALITY_ADDRESS_RADIO_BTN);
    }

    public void selectLocalityZoneNum(){
        wrapper.clickByXpath(BY_LOCALITY_ZONE_NUM_RADIO_BTN);
    }

    public void selectGardenerPartnerShip(){
        wrapper.clickByXpath(BY_GARDENER_PARTNERSHIP_RADIO_BTN);
    }

    public VlNcaBy_CadastralNumberParcelLangScreen goToVlNcaBy_CadastralNumberParcelLangScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new VlNcaBy_CadastralNumberParcelLangScreen(wrapper.getDriver());
    }

    public VlNcaBy_DistrictScreen goToVlNcaBy_DistrictScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new VlNcaBy_DistrictScreen(wrapper.getDriver());
    }

    public VlNcaBy_CityScreen goToVlNcaBy_CityScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new VlNcaBy_CityScreen(wrapper.getDriver());
    }
}
