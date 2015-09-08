package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 08.09.2015.
 */
public class VlNcaBy_GardenerPartnershipScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(VlNcaBy_GardenerPartnershipScreen.class);

    VlNcaBy_GardenerPartnershipScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String ST_AVIATOR_DROP_DOWN = "//option[@value='60266']";
    private static final String HOUSE_NUMBER_FIELD = "//input[@type='text']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    private static final String PARCEL_DROP_DOWN = "//*[contains(text(), 'МИНСК г, Краснозвездный пер., 12')]";
    //--------Xpath End------

    public void selectStAviatorGardener(){
        wrapper.clickByXpath(ST_AVIATOR_DROP_DOWN);
    }

    public VlNcaBy_DescriptionParcelScreen goToVlNcaBy_DescriptionParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new VlNcaBy_DescriptionParcelScreen(wrapper.getDriver());
    }
}
