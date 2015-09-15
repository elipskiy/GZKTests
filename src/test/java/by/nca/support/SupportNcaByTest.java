package by.nca.support;

import by.nca.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.PageScreenShot;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by mugi4_000 on 12.09.2015.
 */
public class SupportNcaByTest extends BaseTest {

    @BeforeMethod()
    public void getNewDriver()	{
        getDriver();
        nullErrors();
    }

    @AfterMethod
    public void closeBrowser()	{
        driver.quit();
    }

    private final static String USERNAME = "Test TOR";
    private final static String PASSWORD = "123456";

    //------------Test case #1-----------------

    @DataProvider
    public Object[][] EdNcaData() {
        return new Object[][]{
                {
                        "ГУП НКА / Архивная открытая информационная система",
                        Arrays.asList("Документация", "Последние документы", "Несформированные дела", "Поиск", "Сформировать отчёт")
                }
        };
    }

    @Test(priority = 1, dataProvider = "EdNcaData")
    public void goToEdNca(String expectedTitle, List expectedElements) throws IOException {

        SupportNcaEdScreen ncaEdScreen = new SupportNcaEdScreen(driver);
        Map map = ncaEdScreen.login(USERNAME, PASSWORD);

        assertEquals(map.get("Title"), expectedTitle, "Названия страниц не совпадают");
        assertEquals(map.get("Elements"), expectedElements, "Элементы бокового меню не соответствуют ожидаемым");
    }

    //------------Test case #2-----------------

    @DataProvider
    public Object[][] SgdNcaData() {
        return new Object[][]{
                {
                        "ГУП НКА / NKA_E-Services / Предоставление сведений из ЕГРНИ исполнительным и распорядительным органам",
                        "Закладные"
                }
        };
    }

    @Test(priority = 2, dataProvider = "SgdNcaData")
    public void goToSgdNca(String expectedTitle, String expectedHeader) throws IOException {

        SupportNcaSgdScreen ncaSgdScreen = new SupportNcaSgdScreen(driver);
        Map map = ncaSgdScreen.login(USERNAME, PASSWORD);

        assertEquals(map.get("Title"), expectedTitle, "Названия страниц не совпадают");
        assertEquals(map.get("Header"), expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

    //------------Test case #3-----------------

    @DataProvider
    public Object[][] LibNcaData() {
        return new Object[][]{
                {
                        "ГУП НКА / Открытая архивная информационная система",
                        "Реестр"
                }
        };
    }

    @Test(priority = 3, dataProvider = "LibNcaData")
    public void goToLibNca(String expectedTitle, String expectedHeader) throws IOException {

        SupportNcaLibScreen ncaLibScreen = new SupportNcaLibScreen(driver);
        Map map = ncaLibScreen.login(USERNAME, PASSWORD);

        assertEquals(map.get("Title"), expectedTitle, "Названия страниц не совпадают");
        assertEquals(map.get("Header"), expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

    //------------Test case #4-----------------

    @Test(priority = 4)
    public void viewPage_SupportNcaEs() throws InterruptedException, IOException {
        String expectedResult = "ГУП НКА / NKA_E-Services / Предоставление сведений из ЕГРНИ исполнительным и распорядительным органам";
        SupportNcaEs_IndexScreen indexScreen = (new SupportNcaEs_IndexScreen(driver));
        SupportNcaEs_MainScreen mainScreen = indexScreen.goToSupportNcaEs_MainScreen();
        Thread.sleep(500);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отображение страницы SupportNcaEs");
        String actualResult = mainScreen.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

    //------------Test case #5-----------------

    @Test(priority = 5)
    public void viewPage_SupportNcaSf() throws InterruptedException, IOException {
        String expectedResult = "ГУП НКА / NKA_SF";
        SupportNcaSf_IndexScreen indexScreen = (new SupportNcaSf_IndexScreen(driver));
        SupportNcaSf_MainScreen mainScreen = indexScreen.goToSupportNcaSf_MainScreen();
        Thread.sleep(500);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отображение страницы SupportNcaSf");
        String actualResult = mainScreen.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

    //------------Test case #6-----------------

    @Test(priority = 0)
    public void viewPage_SupportNcaRs() throws InterruptedException, IOException {
        String expectedResult = "ГУП НКА / Автоматизированная информационная система государственной регистрации заключений об оценке недвижимого имущества";
        SupportNcaRs_IndexScreen indexScreen = (new SupportNcaRs_IndexScreen(driver));
        SupportNcaRs_MainScreen mainScreen = indexScreen.goToSupportNcaRs_MainScreen();
        Thread.sleep(500);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отображение страницы SupportNcaSf");
        String actualResult = mainScreen.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

}
