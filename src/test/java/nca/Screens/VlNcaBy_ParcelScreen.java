package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class VlNcaBy_ParcelScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(VlNcaBy_ParcelScreen.class);

    VlNcaBy_ParcelScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String KRASNOZVEZDNIJ_DROP_DOWN = "//option[@value='11974']";
    private static final String HOUSE_NUMBER_FIELD = "//input[@type='text']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    private static final String PARCEL_DROP_DOWN = "//*[contains(text(), 'МИНСК г, Краснозвездный пер., 12')]";
    //--------Xpath End------

    public void selectParcel(){
        wrapper.clickByXpath(PARCEL_DROP_DOWN);
    }

    public VlNcaBy_DescriptionParcelScreen goToVlNcaBy_DescriptionParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new VlNcaBy_DescriptionParcelScreen(wrapper.getDriver());
    }
}
