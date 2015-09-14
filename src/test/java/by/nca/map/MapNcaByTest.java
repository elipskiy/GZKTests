package by.nca.map;

import by.nca.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageScreenShot;

import java.io.IOException;

/**
 * @author Makovsky Dmitry
 * @since 14.09.2015
 */
public class MapNcaByTest extends BaseTest {

    @BeforeMethod()
    public void getNewDriver()	{
        getDriver();
        nullErrors();
    }

    @AfterMethod
    public void closeBrowser()	{
        driver.quit();
    }

    @Test(priority = 1)
    public void reliabilityIndexJ1() throws IOException, InterruptedException {

        MapNcaBy_IndexScreen indexScreen = (new MapNcaBy_IndexScreen(driver));
        MapNcaBy_MapScreen mapScreen = indexScreen.goToMapNcaBy_MapScreen();
        mapScreen.selectLand();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        mapScreen.clickZoom();
        Thread.sleep(5000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Границы земельных участков");
    }
}
