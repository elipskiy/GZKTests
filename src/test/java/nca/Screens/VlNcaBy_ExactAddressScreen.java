package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class VlNcaBy_ExactAddressScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(VlNcaBy_ExactAddressScreen.class);

    VlNcaBy_ExactAddressScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String KRASNOZVEZDNIJ_DROP_DOWN = "//option[@value='11974']";
    private static final String HOUSE_NUMBER_FIELD = "//input[@type='text']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    private static final String START_SEARCH_BTN = "//*[contains(text(), 'Начать поиск')]";
    //--------Xpath End------

    public void selectKrasnozvezdnij(){
        wrapper.clickByXpath(KRASNOZVEZDNIJ_DROP_DOWN);
    }

    public void insertHouseNum(){
        wrapper.sendKeysByXpath(HOUSE_NUMBER_FIELD,"12");
    }

    public VlNcaBy_ParcelScreen goToVlNcaBy_ParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new VlNcaBy_ParcelScreen(wrapper.getDriver());
    }
}
