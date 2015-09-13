package gzk.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class CopyingScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CopyingScreen.class);

    CopyingScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String NAME_FIELD = "//input[@id='inputUserName']";
    private static final String KEY_FIELD = "//input[@id='inputUserKey']";
    private static final String ENTER_BTN = "//a[@id='enterButton']";
    //--------Xpath End------


    public void login(String name, String key){
        wrapper.sendKeysByXpath(NAME_FIELD,name);
        wrapper.sendKeysByXpath(KEY_FIELD,key);
        wrapper.clickByXpath(ENTER_BTN);
    }

}
