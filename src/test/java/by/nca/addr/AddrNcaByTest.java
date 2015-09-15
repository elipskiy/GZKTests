package by.nca.addr;

import by.nca.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageScreenShot;

import java.io.IOException;

/**
 * @author Makovsky Dmitry
 * @since 15.09.2015
 */
public class AddrNcaByTest  extends BaseTest {

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
    public void reestrAteAndTe() throws IOException, InterruptedException {
        AddrNcaBy_IndexScreen indexScreen = (new AddrNcaBy_IndexScreen(driver));
        AddrNcaBy_MainPageScreen mainPage = indexScreen.goToAddrNcaBy_MainPage();
        AddrNcaBy_SearchAddrScreen searchAddrScreen = mainPage.goToAddrNcaBy_SearchAddrScreen();
        Thread.sleep(3000);
        searchAddrScreen.selectMinsk();
        Thread.sleep(10000);
        searchAddrScreen.selectBuilt();
        searchAddrScreen.clickAddresses();
        searchAddrScreen.selectKrasnozvezdnijStr();
        searchAddrScreen.insertBuildNumber();
        searchAddrScreen.clickFind();
        Thread.sleep(4000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Административно-территориальная принадлежность _Реестр АТЕ и ТЕ_");
    }
}
