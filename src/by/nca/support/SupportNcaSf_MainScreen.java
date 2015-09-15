package by.nca.support;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.DriverWrapper;
import utils.LoadPage;

/**
 * @author Makovsky Dmitry
 * @since 15.09.2015
 */
public class SupportNcaSf_MainScreen {

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(SupportNcaEs_MainScreen.class);

    SupportNcaSf_MainScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    public String getTitle(){
        String  title = wrapper.getPageTitle();
        return title;
    }
}
