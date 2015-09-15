package by.nca.ate;

import by.nca.BaseTest;
import by.nca.rzo.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mugi4_000 on 14.09.2015.
 */
public class AteNcaByTest extends BaseTest {

    @BeforeMethod()
    public void getNewDriver()	{
        getDriver();
        nullErrors();
    }

    @AfterMethod
    public void closeBrowser()	{
        driver.quit();
    }

    private final static String USERNAME = "Monitoring";
    private final static String PASSWORD = "ghEvT45!as";

    //------------Test case #1-----------------

    @Test(priority = 1)
    public void searchByName() throws IOException {

        String city = "Минск";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        List result = indexScreen.searchByName(city);
        screenshot.takeScreenShot("ateNcaBy_Поиск по наименованию");
        assertTrue(!result.isEmpty(), "Выходная таблица пуста");
    }

    //------------Test case #2-----------------

    @Test(priority = 2)
    public void searchByCategory() throws IOException {

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        List result = indexScreen.searchByCategory();
        screenshot.takeScreenShot("ateNcaBy_Поиск по категории и расположению");
        assertTrue(!result.isEmpty(), "Выходная таблица пуста");
    }

    //------------Test case #2-----------------

    @Test(priority = 3)
    public void searchByRegistrationNumber() throws IOException {
        String regNumber = "17031";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        List result = indexScreen.searchByRegistrationNumber(regNumber);
        screenshot.takeScreenShot("ateNcaBy_Поиск по регистрационному номеру");
        assertTrue(!result.isEmpty(), "Выходная таблица пуста");
    }

    //------------Test case #2-----------------

    @Test(priority = 4)
    public void searchBySOATOCode() throws IOException {
        String code = "5264000000";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        List result = indexScreen.searchBySOATOCode(code);
        screenshot.takeScreenShot("ateNcaBy_Поиск по коду СОАТО");
        assertTrue(!result.isEmpty(), "Выходная таблица пуста");
    }

}
