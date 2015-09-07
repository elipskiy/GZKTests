package nca.Tests;

import nca.Screens.IndexScreen_S6;
import nca.Screens.LoginScreen_S6;
import nca.Utils.JSONDemo;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by temp on 21.08.2015.
 */
public class ApiDoesNotAllowToAccessForeignDataTest extends BaseTest {

    @Test(priority = 1)
    public void ApiDoesNotAllowToAccessForeignDataTest() throws IOException, SQLException, InterruptedException, ParseException {
        log.info("--------------------------API does not allow to access foreign data----------------------------");

        String email = "steve";
        String pass = "steve";
        String email1 = "eviltech86@gmail.com";
        String pass1 = "Dim2010_mak";
        String url = "http://50.56.183.70/s6/api/v0.1/sites";
        String file = "C://JsonSites.json";
        String expectedText = "{\n" +
                "  \"message\": \"User eviltech86@gmail.com (#444) was denied access to Sites: [8]\"\n" +
                "}";
        int i = 1;
        int a = 0;

        log.info("Go to login page");
        LoginScreen_S6 loginScreen_s6 = (new LoginScreen_S6(driver));
        IndexScreen_S6 indexScreen_s6 = loginScreen_s6.loggin(email, pass);
        indexScreen_s6.openSiteIdScreen(url);
        indexScreen_s6.switchToWindow(i);
        indexScreen_s6.getSiteId();
        JSONDemo jsonDemo = new JSONDemo();
        long id = jsonDemo.readJson(file);
        log.info(id);
        indexScreen_s6.closeWindow();
        indexScreen_s6.switchToWindow(a);
        loginScreen_s6 = indexScreen_s6.clickExitBtn();
        indexScreen_s6 = loginScreen_s6.loggin(email1, pass1);
        String apiRequest = "http://50.56.183.70:80/s6/api/v0.1/sites/"+id+"/schedules?max=10";
        indexScreen_s6.openSiteIdScreen(apiRequest);
        indexScreen_s6.switchToWindow(i);
        String assertText = indexScreen_s6.getJsonText();
        indexScreen_s6.closeWindow();
        indexScreen_s6.switchToWindow(a);
        indexScreen_s6.clickExitBtn();
        Assert.assertEquals(expectedText,assertText,"Does not match");

    }

    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @AfterTest
    public static void CC(){
        driver.quit();
    }
}
