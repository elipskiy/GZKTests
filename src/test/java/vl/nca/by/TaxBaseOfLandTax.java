package vl.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 12.09.2015.
 */
public class TaxBaseOfLandTax {

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(TaxBaseOfLandTax.class);

    TaxBaseOfLandTax(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String BY_CADASTRAL_NUMBER_PARCEL_LANG_RADIO_BTN = "//input[@id='search_type_1']";
    private static final String BY_LOCALITY_ADDRESS_RADIO_BTN = "//input[@id='search_type_2']";
    private static final String BY_GARDENER_PARTNERSHIP_RADIO_BTN = "//input[@id='search_type_3']";
    private static final String BY_AREAS_OUTSIDE_SETTLEMENTS_RADIO_BTN = "//input[@id='search_type_4']";
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

    public void selectAreasOutsideSettlements(){
        wrapper.clickByXpath(BY_AREAS_OUTSIDE_SETTLEMENTS_RADIO_BTN);
    }

    public CadastralNumberParcelLangScreen goToVlNcaBy_CadastralNumberParcelLangScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new CadastralNumberParcelLangScreen(wrapper.getDriver());
    }

    public DistrictScreen goToVlNcaBy_DistrictScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new DistrictScreen(wrapper.getDriver());
    }

    public CityScreen goToVlNcaBy_CityScreen(){
        wrapper.clickByXpath(START_SEARCH_BTN);
        return new CityScreen(wrapper.getDriver());
    }
}
