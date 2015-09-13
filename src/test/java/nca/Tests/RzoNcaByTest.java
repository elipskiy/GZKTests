package nca.Tests;

import nca.Screens.rzoNcaBy.RzoNcaBy_CommonStatistics;
import nca.Screens.rzoNcaBy.RzoNcaBy_IndexScreen;
import nca.Screens.rzoNcaBy.RzoNcaBy_StatisticsResult;
import nca.Screens.supportNcaBy.SupportNcaEdScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

        RzoNcaBy_IndexScreen indexScreen = new RzoNcaBy_IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);
        RzoNcaBy_CommonStatistics commonStatistics = indexScreen.goToCommonStatistics();
        RzoNcaBy_StatisticsResult statisticsResult = commonStatistics.getStatistics(estimationObject, from, till, city);
        List pageElements = statisticsResult.getTableElements();

        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
    }

//    //------------Test case #2-----------------
//
//    @DataProvider
//    public Object[][] estimationMethodsData() {
//        return new Object[][]{
//                {
//                        Arrays.asList("Дата статистики:",
//                                getTodayDate(),
//                                "Критерии для статистики:",
//                                "Не включая заключения до 01.05.2011",
//                                "Дата оценки",
//                                "01.01.2015 - 17.08.2015",
//                                "Объект оценки",
//                                "изолированное помещение",
//                                "Местоположение",
//                                "г. Минск"
//                        )
//                }
//        };
//    }
//
//    @Test(priority = 1, dataProvider = "estimationMethodsData")
//    public void getEstimationMethods(List expectedElements) throws IOException {
//
//        String estimationObject = "изолированное помещение";
//        String from = "01.01.2015";
//        String till = "17.08.2015";
//        String city = "г. Минск";
//
//        RzoNcaBy_IndexScreen indexScreen = new RzoNcaBy_IndexScreen(driver);
//        indexScreen.login(USERNAME, PASSWORD);
//        RzoNcaBy_CommonStatistics commonStatistics = indexScreen.goToCommonStatistics();
//        RzoNcaBy_StatisticsResult statisticsResult = commonStatistics.getStatistics(estimationObject, from, till, city);
//        List pageElements = statisticsResult.getTableElements();
//
//        assertEquals(pageElements, expectedElements, "Элементы таблицы не соответствуют ожидаемым");
//    }
//

}
