package by.nca.wekhfg;

import by.nca.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageScreenShot;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class WekhfgNcaByTest extends BaseTest {

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
        String expectedResult = "По ЦБД";
        IndexScreen indexScreen = (new IndexScreen(driver));
        CheckCriteriaJ1Screen checkCriteriaScreen = indexScreen.goToWekhfgNcaBy_CheckCriteriaJ1Screen();
        //selectSubject.selectNotCorrectBirth.selectBirthBefore01_01_1980.clickShowScript.selectCDB.clickShow.containsText
        checkCriteriaScreen.selectSubject();
        checkCriteriaScreen.selectNotCorrectBirth();
        checkCriteriaScreen.selectBirthBefore01_01_1980();
        Thread.sleep(200);
        checkCriteriaScreen.clickShowScript();
        Thread.sleep(200);
        checkCriteriaScreen.selectCDB();
        Thread.sleep(400);
        checkCriteriaScreen.clickShow();
        boolean result = checkCriteriaScreen.containsText(expectedResult);
        Assert.assertEquals(result, true);
    }

    @Test(priority = 2)
    public void integrityGeneralReport () throws IOException, InterruptedException {
        String expectedResult = "Наименование БД";
        IndexScreen indexScreen = (new IndexScreen(driver));
        CriteriaGeneralReportScreen criteriaGeneralReportScreen = indexScreen.goToWekhfgNcaBy_CriteriaGeneralReportScreen();
        criteriaGeneralReportScreen.getDateAndInsert();
        criteriaGeneralReportScreen.clickShape();
        Thread.sleep(400);
        criteriaGeneralReportScreen.clickCbdReport();
        Thread.sleep(300);
        boolean actualResult = criteriaGeneralReportScreen.containsText(expectedResult);
        Assert.assertEquals(actualResult,true);
    }

    @Test(priority = 3)
    public void dynamicIntegrity() throws InterruptedException, IOException {
        IndexScreen indexScreen = (new IndexScreen(driver));
        DynamicIntegrityScreen dynamicIntegrityScreen = indexScreen.goToWekhfgNcaBy_DinamicIntegrityScreen();
        dynamicIntegrityScreen.selectBrestDistrict();
        dynamicIntegrityScreen.selectVal100();
        dynamicIntegrityScreen.insertDateFromTo();
        dynamicIntegrityScreen.clickShowBtn();
        Thread.sleep(2000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Динамика целостности");
    }

    @Test(priority = 4)
    public void reportByIndexesIntegrity() throws InterruptedException, IOException {
        IndexScreen indexScreen = (new IndexScreen(driver));
        ReportByIndexesIntegrityScreen reportByIndexesIntegrityScreen = indexScreen.goToWekhfgNcaBy_ReportByIndexesIntegrityScreen();
        reportByIndexesIntegrityScreen.getDateAndInsert();
        reportByIndexesIntegrityScreen.selectJ1();
        reportByIndexesIntegrityScreen.clickShow();
        Thread.sleep(2000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отчет по индексам целостности");
    }

    @Test(priority = 5)
    public void reportByIndexesAuthenticityJ1() throws InterruptedException, IOException {
        String expectedResult = "\n" +
                "                Лучшие ТОР";
        IndexScreen indexScreen = (new IndexScreen(driver));
        ReportByIndexesAuthenticityJ1Screen reportByIndexesAuthenticityJ1Screen = indexScreen.goToWekhfgNcaBy_reportByIndexesAuthenticityJ1Screen();
        reportByIndexesAuthenticityJ1Screen.selectReportByIndexJ1();
        Thread.sleep(100);
        reportByIndexesAuthenticityJ1Screen.selectBrest();
        reportByIndexesAuthenticityJ1Screen.clickShape();
        Thread.sleep(2000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отчет по индексу достоверности J1");
        boolean actualResult = reportByIndexesAuthenticityJ1Screen.containsText(expectedResult);
        Thread.sleep(1000);
        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 6)
    public void dymamicByIndexesAuthenticityJ1() throws InterruptedException, IOException {
        IndexScreen indexScreen = (new IndexScreen(driver));
        DymamicByIndexesAuthenticityJ1 dymamicByIndexesAuthenticityJ1 = indexScreen.goToWekhfgNcaBy_DymamicByIndexesAuthenticityJ1();
        dymamicByIndexesAuthenticityJ1.selectDynamicByIndex();
        Thread.sleep(100);
        dymamicByIndexesAuthenticityJ1.selectBirthDateBefore();
        Thread.sleep(100);
        dymamicByIndexesAuthenticityJ1.clickBrestMenu();
        Thread.sleep(100);
        dymamicByIndexesAuthenticityJ1.clickVal100();
        dymamicByIndexesAuthenticityJ1.insertDateFromTo();
        dymamicByIndexesAuthenticityJ1.clickShow();
        Thread.sleep(3000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Динамика по индексу достоверности J1");
    }

    @Test(priority = 7)
    public void reportByStructuredAddress() throws InterruptedException, IOException {
        String expectedResult = "Наименование";
        IndexScreen indexScreen = (new IndexScreen(driver));
        ReportByStructuredAddress reportByStructuredAddress = indexScreen.goToWekhfgNcaBy_ReportByStructuredAddress();
        Thread.sleep(500);
        reportByStructuredAddress.selectCdbCheckbox();
        reportByStructuredAddress.clickShowBtn();
        Thread.sleep(5000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отчет по структурированным адресам");
        Thread.sleep(3000);
        boolean actualResult = reportByStructuredAddress.containsText(expectedResult);
        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 8) //Поправить
    public void reportByRegistredSubjects() throws InterruptedException, IOException {
        String expectedResult = "";
        IndexScreen indexScreen = (new IndexScreen(driver));
        ReportByRegistredSubjects reportByRegistredSubjects = indexScreen.goToWekhfgNcaBy_reportByRegistredSubjects();
        reportByRegistredSubjects.insertDate();
        reportByRegistredSubjects.clickShape();
        Thread.sleep(5000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Отчет по зарегистрированным объектам недвижимости");
        Thread.sleep(3000);
        boolean actualResult = reportByRegistredSubjects.containsText(expectedResult);
        Assert.assertEquals(actualResult,true);
    }

    @Test(priority = 9)
    public void incompleteIdentificationInformationOfSubjectsWithoutDead() throws InterruptedException, IOException {
        String expectedResult = "Наименование";
        IndexScreen indexScreen = (new IndexScreen(driver));
        IncompleteIdentificationInformationOfSubjectsWithoutDead incompleteIdentificationInformationOfSubjectsWithoutDead = indexScreen.goToWekhfgNcaBy_IncompleteIdentificationInformationOfSubjectsWithoutDead();
        incompleteIdentificationInformationOfSubjectsWithoutDead.insertDate();
        incompleteIdentificationInformationOfSubjectsWithoutDead.selectCdb();
        incompleteIdentificationInformationOfSubjectsWithoutDead.clickShape();
        Thread.sleep(5000);
        PageScreenShot screenshot = new PageScreenShot(driver);
        screenshot.takeScreenShot("Неполные идентификационные сведения субъектов без учета умерших");
        Thread.sleep(3000);
        boolean actualResult = incompleteIdentificationInformationOfSubjectsWithoutDead.containsText(expectedResult);
        Assert.assertEquals(actualResult,true);

    }
}
