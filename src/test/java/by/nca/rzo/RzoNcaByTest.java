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
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Общая_статистика:_общие_параметры");

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
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Общая_статистика:_методы_оценки");

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }

    //------------Test case #3-----------------
    @DataProvider
    public Object[][] estimationObjectData() {
        return new Object[][]{
                {
                        Arrays.asList(
                        "Дата поиска:",
                        getTodayDate(),
                        "Критерии поиска:",
                        "Не включая заключения до 01.05.2011",
                        "Имущественные права, ограничения, обременения",
                        "Право собственности",
                        "Функциональное назначение объекта",
                        "Все для жизни человека"
                        )
                }
        };
    }

    @Test(priority = 3, dataProvider = "estimationObjectData")
    public void getEstimationObjectStatistics(List expectedElements) throws IOException {

        String propertyRestictions = "Право собственности";
        String propertyPurpose = "Жилая недвижимость";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        SearchScreen searchScreen = indexScreen.goToSearch();
        StatisticsResultScreen statisticsResult = searchScreen.getSearchResults(propertyRestictions, propertyPurpose);
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Поиск:_объект_оценки");

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }

    //------------Test case #4-----------------
    @DataProvider
    public Object[][] estimationObjectCostData() {
        return new Object[][]{
                {
                        Arrays.asList(
                        "Дата поиска:",
                        getTodayDate(),
                        "Критерии поиска:",
                        "Не включая заключения до 01.05.2011",
                        "Валюта оценки",
                        "USD(доллар США)",
                        "Виды определяемой стоимости (и)",
                        "Рыночная стоимость\nРыночная стоимость в текущем использовании"
                        )
                }
        };
    }

    @Test(priority = 4, dataProvider = "estimationObjectCostData")
    public void getEstimationObjectCostStatistics(List expectedElements) throws IOException {

        String currency = "USD (доллар США)";

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        SearchScreen searchScreen = indexScreen.goToSearch();
        StatisticsResultScreen statisticsResult = searchScreen.getPropertyCost(currency);
        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Поиск:_стоимость_объекта_оценки");

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }

//    //------------Test case #5-----------------
//    @DataProvider
//    public Object[][] estimationMethodsSearchData() {
//        return new Object[][]{
//                {
//                        Arrays.asList(
//                                "Дата поиска:",
//                                "13.09.2015",
//                                "Критерии поиска:",
//                                "Не включая заключения до 01.05.2011",
//                                "Имущественные права, ограничения, обременения",
//                                "Право собственности",
//                                "Функциональное назначение объекта",
//                                "Все для жизни человека"
//                        )
//                }
//        };
//    }
//
//    @Test(priority = 3, dataProvider = "estimationMethodsSearchData")
//    public void getEstimationMethodsSearchStatistics(List expectedElements) throws IOException {
//
//        String propertyRestictions = "Право собственности";
//        String propertyPurpose = "Жилая недвижимость";
//
//        IndexScreen indexScreen = new IndexScreen(driver);
//        indexScreen.login(USERNAME, PASSWORD);
//        SearchScreen searchScreen = indexScreen.goToSearch();
//        StatisticsResultScreen statisticsResult = searchScreen.getSearchResults(propertyRestictions, propertyPurpose);
//        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Поиск: объект оценки\n");
//
//        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
//    }
//
//    //------------Test case #6-----------------
//    @DataProvider
//    public Object[][] additionalDataSearchData() {
//        return new Object[][]{
//                {
//                        Arrays.asList(
//                                "Дата поиска:",
//                                "13.09.2015",
//                                "Критерии поиска:",
//                                "Не включая заключения до 01.05.2011",
//                                "Имущественные права, ограничения, обременения",
//                                "Право собственности",
//                                "Функциональное назначение объекта",
//                                "Все для жизни человека"
//                        )
//                }
//        };
//    }
//
//    @Test(priority = 3, dataProvider = "additionalDataSearchData")
//    public void additionalDataSearch(List expectedElements) throws IOException {
//
//        String propertyRestictions = "Право собственности";
//        String propertyPurpose = "Жилая недвижимость";
//
//        IndexScreen indexScreen = new IndexScreen(driver);
//        indexScreen.login(USERNAME, PASSWORD);
//        SearchScreen searchScreen = indexScreen.goToSearch();
//        StatisticsResultScreen statisticsResult = searchScreen.getSearchResults(propertyRestictions, propertyPurpose);
//        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Поиск: объект оценки\n");
//
//        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
//    }
//
//    //------------Test case #7-----------------
//    @DataProvider
//    public Object[][] commonParametersSearchData() {
//        return new Object[][]{
//                {
//                        Arrays.asList(
//                                "Дата поиска:",
//                                "13.09.2015",
//                                "Критерии поиска:",
//                                "Не включая заключения до 01.05.2011",
//                                "Имущественные права, ограничения, обременения",
//                                "Право собственности",
//                                "Функциональное назначение объекта",
//                                "Все для жизни человека"
//                        )
//                }
//        };
//    }
//
//    @Test(priority = 3, dataProvider = "commonParametersSearchData")
//    public void commonParametersSearch(List expectedElements) throws IOException {
//
//        String propertyRestictions = "Право собственности";
//        String propertyPurpose = "Жилая недвижимость";
//
//        IndexScreen indexScreen = new IndexScreen(driver);
//        indexScreen.login(USERNAME, PASSWORD);
//        SearchScreen searchScreen = indexScreen.goToSearch();
//        StatisticsResultScreen statisticsResult = searchScreen.getSearchResults(propertyRestictions, propertyPurpose);
//        List pageElements = statisticsResult.getTableElements("rzo.nca.by_Поиск: объект оценки\n");
//
//        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
//    }
}
