package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaBy_SearchResultScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(GzkNcaBy_SearchResultScreen.class);

    GzkNcaBy_SearchResultScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String COPYING_BTN = "//td[@onmouseover='showauthhint()']";
    private static final String KRASNOZVEZDNIJ_12_RESULT = "//*[contains(text(), 'г.Минск, пер. Краснозвёздный д.12')]";
    //--------Xpath End------

    public void selectKrasnozvezdnijResult(){
        wrapper.clickByXpath(KRASNOZVEZDNIJ_12_RESULT);
    }

    public void scrollToCopyingBtn(){
        wrapper.scrollDown(COPYING_BTN);
    }

    public GzkNcaBy_CopyingScreen goToGzkNcaBy_CopyingScreen(){
        wrapper.clickByXpath(COPYING_BTN);
        return new GzkNcaBy_CopyingScreen(wrapper.getDriver());
    }
}
