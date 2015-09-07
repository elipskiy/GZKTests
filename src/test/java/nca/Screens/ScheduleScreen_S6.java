package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by temp on 21.08.2015.
 */
public class ScheduleScreen_S6 {
        DriverWrapper wrapper;

        public static final Logger log = Logger.getLogger(IndexScreen_S6.class);

        ScheduleScreen_S6(WebDriver driver) {
            LoadPage loadPage = new LoadPage();
            loadPage.waitForPageLoaded(driver);
            wrapper = new DriverWrapper(driver);
        }

}
