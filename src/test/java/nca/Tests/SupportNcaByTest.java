package nca.Tests;

import nca.Screens.NcaBy.NcaBy_IndexScreen;
import nca.Screens.NcaBy.electronicalAppeal.NcaBy_SendElectronicalAppealScreen;
import nca.Screens.supportNcaBy.SupportNcaEdScreen;
import nca.Screens.supportNcaBy.SupportNcaLibScreen;
import nca.Screens.supportNcaBy.SupportNcaSgdScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    //------------Test case #1-----------------

    @DataProvider
    public Object[][] LibNcaData() {
        return new Object[][]{
                {
                        "ГУП НКА / Открытая архивная информационная система",
                        "Реестр"
                }
        };
    }

    @Test(priority = 0, dataProvider = "LibNcaData")
    public void goToLibNca(String expectedTitle, String expectedHeader) throws IOException {

        SupportNcaLibScreen ncaLibScreen = new SupportNcaLibScreen(driver);
        Map map = ncaLibScreen.login(USERNAME, PASSWORD);

        assertEquals(map.get("Title"), expectedTitle, "Названия страниц не совпадают");
        assertEquals(map.get("Header"), expectedHeader, "Заголовок страницы не соотетствует ожидаемому");
    }

}
