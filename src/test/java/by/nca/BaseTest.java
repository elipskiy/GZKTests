package by.nca;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebDriverStarter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by eviltechnology on 12.10.2014.
 */
public class BaseTest extends Assert {
    protected static WebDriver driver;
    protected static final Logger log = Logger.getLogger(BaseTest.class);
    protected ArrayList<String> errors = new ArrayList<>();

    public BaseTest() {
        nullErrors();
    }

    public void nullErrors() {
        errors.clear();
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

    public String getTodayDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(date);
    }

    public void assertEqualsContinue(Object actual, Object expected) {
        assertEqualsContinue(actual, expected, "No message provided\n");
    }

    public void assertEqualsContinue(Object actual, Object expected, String message) {
        String errorMessage = null;
        try {
            assertEquals(actual, expected, message);
        } catch (AssertionError error) {
            errorMessage = error.getMessage();
        } finally {
            if (errorMessage != null)
                errors.add(errorMessage + "\n");
        }
    }

}
