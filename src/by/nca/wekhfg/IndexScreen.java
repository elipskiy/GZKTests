package by.nca.wekhfg;

import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class IndexScreen {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://wekhfg.nca.by/";

    public IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String CRITERIA_CHECK_DROPDOWN = "//*[contains(text(), 'КРИТЕРИИ ПРОВЕРКИ')]";
    private static final String INDEX_J1_LINK = "//*[contains(text(), 'Сведения по индексу достоверности J1')]";
    private static final String INTEGRITY_REPORT_DROPDOWN = "//*[contains(text(), 'ОТЧЕТЫ ПО ЦЕЛОСТНОСТИ')]";
    private static final String INTEGRITY_GENERAL_REPORT_LINK = "//*[contains(text(), 'Общий отчет по целостности')]";
    private static final String DYNAMIC_INTEGRITY__LINK = "//*[contains(text(), 'Динамика целостности')]";
    private static final String REPORT_BY_INDEXES_INTEGRITY_LINK = "//*[contains(text(), 'Отчет по индексам целостности')]";
    private static final String REPORT_BY_INDEXES_AUTHENTICITYJ1_LINK = "//*[contains(text(), 'Отчет по индексу достоверности J1')]";
    private static final String DYNAMIC_BY_INDEXES_AUTHENTICITYJ1_LINK = "//*[contains(text(), 'Динамика по индексу достоверности J1')]";
    private static final String ANOTHER_REPORTS_LINK = "//*[contains(text(), 'ИНЫЕ ОТЧЕТЫ')]";
    private static final String REPORT_BY_STRUCTURED_ADDRESS_LINK = "//*[contains(text(), 'Отчет по структурированным адресам')]";
    private static final String REPORT_BY_REGISTERED_OBJECT_LINK = "//*[contains(text(), 'Отчет по зарегистрированным объектам недвижимости')]";
    private static final String INCOMPLETED_IDENTIFICATION_INFO_OF_SUBJECTS_WITHOUT_DEAD_LINK = "//*[contains(text(), 'Неполные идентификационные сведения субъектов без учета умерших (по критерию КР 75 индекса J1)')]";
    //IncompleteIdentificationInformationOfSubjectsWithoutDead
    //--------Xpath End------

    public CheckCriteriaJ1Screen goToWekhfgNcaBy_CheckCriteriaJ1Screen() throws InterruptedException {
        driver.findElement(By.xpath(CRITERIA_CHECK_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(INDEX_J1_LINK)).click();
        return new CheckCriteriaJ1Screen(driver);
    }

    public CriteriaGeneralReportScreen goToWekhfgNcaBy_CriteriaGeneralReportScreen() throws InterruptedException {
        driver.findElement(By.xpath(INTEGRITY_REPORT_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(INTEGRITY_GENERAL_REPORT_LINK)).click();
        return new CriteriaGeneralReportScreen(driver);
    }

    public DynamicIntegrityScreen goToWekhfgNcaBy_DinamicIntegrityScreen() throws InterruptedException {
        driver.findElement(By.xpath(INTEGRITY_REPORT_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(DYNAMIC_INTEGRITY__LINK)).click();
        return new DynamicIntegrityScreen(driver);
    }

    public ReportByIndexesIntegrityScreen goToWekhfgNcaBy_ReportByIndexesIntegrityScreen() throws InterruptedException {
        driver.findElement(By.xpath(INTEGRITY_REPORT_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(REPORT_BY_INDEXES_INTEGRITY_LINK)).click();
        return new ReportByIndexesIntegrityScreen(driver);
    }

    public ReportByIndexesAuthenticityJ1Screen goToWekhfgNcaBy_reportByIndexesAuthenticityJ1Screen() throws InterruptedException {
        driver.findElement(By.xpath(INTEGRITY_REPORT_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(REPORT_BY_INDEXES_AUTHENTICITYJ1_LINK)).click();
        return new ReportByIndexesAuthenticityJ1Screen(driver);
    }

    public DymamicByIndexesAuthenticityJ1 goToWekhfgNcaBy_DymamicByIndexesAuthenticityJ1() throws InterruptedException {
        driver.findElement(By.xpath(INTEGRITY_REPORT_DROPDOWN)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(DYNAMIC_BY_INDEXES_AUTHENTICITYJ1_LINK)).click();
        return new DymamicByIndexesAuthenticityJ1(driver);
    }

    public ReportByStructuredAddress goToWekhfgNcaBy_ReportByStructuredAddress() throws InterruptedException {
        driver.findElement(By.xpath(ANOTHER_REPORTS_LINK)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(REPORT_BY_STRUCTURED_ADDRESS_LINK)).click();
        return new ReportByStructuredAddress(driver);
    }

    public ReportByRegistredSubjects goToWekhfgNcaBy_reportByRegistredSubjects() throws InterruptedException {
        driver.findElement(By.xpath(ANOTHER_REPORTS_LINK)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(REPORT_BY_REGISTERED_OBJECT_LINK)).click();
        return new ReportByRegistredSubjects(driver);
    }

    public IncompleteIdentificationInformationOfSubjectsWithoutDead goToWekhfgNcaBy_IncompleteIdentificationInformationOfSubjectsWithoutDead() throws InterruptedException {
        driver.findElement(By.xpath(ANOTHER_REPORTS_LINK)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(INCOMPLETED_IDENTIFICATION_INFO_OF_SUBJECTS_WITHOUT_DEAD_LINK)).click();
        return new IncompleteIdentificationInformationOfSubjectsWithoutDead(driver);
    }
}
