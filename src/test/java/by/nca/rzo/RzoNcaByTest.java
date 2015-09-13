package by.nca.rzo;

import by.nca.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class RzoNcaByTest extends BaseTest {

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
    private final static String PASSWORD = "U1111M";

    //------------Test case #1-----------------

    @DataProvider
    public Object[][] commonStatisticsData() {
        return new Object[][]{
            {
                Arrays.asList("Дата статистики:",
                getTodayDate(),
                "Критерии для статистики:",
                "Не включая заключения до 01.05.2011",
                "Дата оценки",
                "01.01.2015 - 17.08.2015",
                "Объект оценки",
                "изолированное помещение",
                "Местоположение",
                "г. Минск"
                )
            }
        };
    }

    @Test(priority = 1, dataProvider = "commonStatisticsData")
    public void getCommonStatistics(List expectedElements) throws IOException {

        String estimationObject = "изолированное помещение";
        String from = "01.01.2015";
        String till = "17.08.2015";
        String city = "г. Минск";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        CommonStatisticsScreen commonStatistics = indexScreen.goToCommonStatistics();
        StatisticsResultScreen statisticsResult = commonStatistics.getStatistics(estimationObject, from, till, city);
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Общая статистика: общие параметры");

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }

    //------------Test case #2-----------------
    @DataProvider
    public Object[][] estimationMethodsData() {
        return new Object[][]{
                {
                        Arrays.asList(
                                "Дата статистики:",
                                getTodayDate(),
                                "Критерии для статистики:",
                                "Не включая заключения до 01.05.2011",
                                "Методы оценки (и)",
                                "рыночный доходный метод"
                        )
                }
        };
    }

    @Test(priority = 2, dataProvider = "estimationMethodsData")
    public void getEstimationMethodsStatistics(List expectedElements) throws IOException {

        String estimationMethod = "рыночный доходный метод";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        CommonStatisticsScreen commonStatistics = indexScreen.goToCommonStatistics();
        StatisticsResultScreen statisticsResult = commonStatistics.getEvaluationMethodStatistics(estimationMethod);
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Общая статистика: методы оценки");

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }


}
