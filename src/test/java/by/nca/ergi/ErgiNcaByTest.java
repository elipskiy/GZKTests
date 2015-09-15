package by.nca.ergi;

import by.nca.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by mugi4_000 on 15.09.2015.
 */
public class ErgiNcaByTest extends BaseTest {

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
    private final static String PASSWORD = "8327YTR296";

    //------------Test case #1-----------------

    @DataProvider
    public Object[][] subjectDetailsData() {
        return new Object[][]{
            {
                "http://ergi.nca.by/output/tmpSubjectsOutList.htm",
                "Поиск субъектов",
                "Поиск субъектов",
                "http://ergi.nca.by/print/outputForms.htm",
                "Типы выходных форм",
                "Типы выходных форм"
            }
        };
    }

    @Test(priority = 1, dataProvider = "subjectDetailsData")
    public void getSubjectDetails(String subjectExpectedUrl, String subjectExpectedTitle, String subjectExpectedHeader,
                                  String printExpectedUrl, String printExpectedTitle, String printExpectedHeader) throws IOException {

        String pageUrl, pageTitle, pageHeader;

        IndexScreen indexScreen = new IndexScreen(driver);
        indexScreen.login(USERNAME, PASSWORD);

        pageHeader = indexScreen.goToSubjectDetails();
        pageUrl    = indexScreen.getPageUrl();
        pageTitle  = indexScreen.getPageTitle();

        screenshot.takeScreenShot("ergiRcaBy_Отображение страницы_Поиск субъектов");

        assertEqualsContinue(pageUrl, subjectExpectedUrl, "URL страницы неверный");
        assertEqualsContinue(pageTitle, subjectExpectedTitle, "Название страницы не соответствует ожидаемому");
        assertEqualsContinue(pageHeader, subjectExpectedHeader, "Содержимое страницы не соответствует ожидаемому");

        indexScreen.cancel();

        pageHeader = indexScreen.goToPrintForms();
        pageUrl    = indexScreen.getPageUrl();
        pageTitle  = indexScreen.getPageTitle();

        screenshot.takeScreenShot("ergiRcaBy_Отображение страницы_Типы выходных форм");

        assertEqualsContinue(pageUrl, printExpectedUrl, "URL страницы неверный");
        assertEqualsContinue(pageTitle, printExpectedTitle, "Название страницы не соответствует ожидаемому");
        assertEqualsContinue(pageHeader, printExpectedHeader, "Содержимое страницы не соответствует ожидаемому");

        assertTrue(errors.isEmpty(), errors.toString());

    }


}
