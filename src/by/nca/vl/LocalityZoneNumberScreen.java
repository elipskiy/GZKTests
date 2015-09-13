package by.nca.vl;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 06.09.2015.
 */
public class LocalityZoneNumberScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(LocalityZoneNumberScreen.class);

    LocalityZoneNumberScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String ZONE_NUMBER_DROP_DOWN = "//option[@value='248082']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    //--------End Xpath------

    public void selectZoneNum(){
        wrapper.clickByXpath(ZONE_NUMBER_DROP_DOWN);
    }

    public DescriptionParcelScreen goToVlNcaBy_DescriptionParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new DescriptionParcelScreen(wrapper.getDriver());
    }
}


