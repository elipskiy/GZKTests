package nca.Tests;

import nca.Utils.WebDriverStarter;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by eviltechnology on 12.10.2014.
 */
public class BaseTest extends Assert {
    protected static WebDriver driver;
    protected static final Logger log = Logger.getLogger(SmokeTest.class);

    public BaseTest() {
        //getDriver();
    }

    public void getDriver() {
        try {
            WebDriverStarter starter = new WebDriverStarter();
            driver = starter.getDriver();
        } catch (IOException e) {
            log.debug(e.getMessage());
            e.printStackTrace();
        }
    }
}
