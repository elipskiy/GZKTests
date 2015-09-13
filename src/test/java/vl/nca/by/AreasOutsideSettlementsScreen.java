package vl.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 12.09.2015.
 */
public class AreasOutsideSettlementsScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AreasOutsideSettlementsScreen.class);

    AreasOutsideSettlementsScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String VELIKOLYKSKIJ_DROP_DOWN = "//option[@value='61054']";
    private static final String BARANOVICHY_DROP_DOWN = "//option[@value='2']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    private static final String START_SEARCH_BTN = "//*[contains(text(), 'Начать поиск')]";
    //--------Xpath End------

    public void selectVelikolykskij(){
        wrapper.clickByXpath(VELIKOLYKSKIJ_DROP_DOWN);
    }

    public DescriptionParcelScreen goToVlNcaBy_DescriptionParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new DescriptionParcelScreen(wrapper.getDriver());
    }
}
