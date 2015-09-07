package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eviltechnology on 19.10.2014.
 */
public class IndexPageScreen {
    // Interface
    final static String MAIN_PAGE_ENTER_LOGIN_XPATH = "//input[@name ='j_username']";
    final static String MAIN_PAGE_ENTER_PASSWORD_XPATH = "//input[@name ='j_password']";
    final static String MAIN_PAGE_ENTER_USER_XPATH = "//input[@id ='ok']";

    // Const
    public static final String ENTER_SUCCESS = "Вход осуществлен";
    public static final String HTTP_ADDRESS = "http://localhost:8080/signin.html";
    public static final String MAIN_PAGE_REGISTRATION_S = "Main Page Registration= %s";
    public static final String DO_ENTER = "Осуществляем вход";
    public static final String TEST = "test";
    public static final String RIK_TEST = "RIKTest";

    public static final String LOGIN_XPATH = "//input[@id='j_username']";
    public static final String PASSWORD_XPATH = "//input[@id='j_password']";
    public static final String ENTER_BTN_XPATH = "//input[@id='submit']";
    public static final String CHECKBOX_REMEMBER_ME_XPATH = "//input[@id='remember_me']";
    public static final String ADMINISRATION_LINK_XPATH = "//a[@href='journalUsers.html']";
    public static final String ADD_USER_BTN_XPATH = "//a[@href='createUser.html?oper=create']";
    public static final String SEARCH_USER_BTN_XPATH = "//input[@id='findSTIUser']";
    public static final String JOURNAL_ORDER_LINK_XPATH = "//a[@href='journal.html']";
    public static final String COMPONENT_PART_LINK_XPATH = "//a[@id='reestrLink']";
    public static final String REESTR_LINK_XPATH = "//a[@id='moduleSearchLink']";
    public static final String COST_LINK_XPATH = "//a[@id='cost']";
    public static final String REESTR_ELEM_NAME_XPATH = "//*[contains(text(), 'Хатка боброида')]";
    public static final String REESTR_BTN_XPATH = "//a[@id='moduleReestr']";
    public static final String COMPONET_PART_BTN_XPATH = "//a[@id='componentParts']";


    public static final String NEW_ORDER_XPATH = "//button[@id='newOrder']";

    public WebDriver driver;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    // Implementation
    //******************************************************************************************************************
    public IndexPageScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        

        LoadPage loadPage = new LoadPage();
        driver.get(HTTP_ADDRESS);
        loadPage.waitForPageLoaded(driver);

    }

    //**********************************************NCA_RH FUNCTION*****************************************************
    public IndexPageScreenWrapper getIndexPage(){
        log.info("Осуществляем вход на страницу Авторизации");
        return new IndexPageScreenWrapper(driver);
    }

    //******************************************************************************************************************
    public MainPageScreen getMainPageTitleANDElementsOnMainPage(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        //driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        $(By.name("j_username")).setValue("11");
        log.info("Вводим пароль");
        $(By.name("j_password")).setValue("1");
        log.info("Нажимаем вход");
        $("#submit").click();
        log.info("Осуществляем вход на главную страницу");
        return new MainPageScreen(driver);
    }


    //******************************************************************************************************************
    public MainPageScreen verifyRememberMe(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Находим CheckBox Запомнить меня");
        driver.findElement(By.xpath(CHECKBOX_REMEMBER_ME_XPATH)).click();
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        return new MainPageScreen(driver);
    }

    //******************************************************************************************************************
    public AdministrationScreen verifyTitleAndElementsAdministrationScreen(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(ADMINISRATION_LINK_XPATH)).click();
        log.info("Осуществляем переход на страницу Администрирование");
        return new AdministrationScreen(driver);
    }

    //******************************************************************************************************************
    public AddNewUserScreen NewUserScreen(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(ADMINISRATION_LINK_XPATH)).click();
        log.info("Осуществляем переход на страницу Администрирование");
        return new AddNewUserScreen(driver);
    }

    //******************************************************************************************************************
    public RegBlockActiveMessage RegBlockActiveMessage(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        return new RegBlockActiveMessage(driver);
    }

    //******************************************************************************************************************
    public ActivateBlockUser activateBlockUser()  {
        log.info("Осуществляем вход на страницу Авторизации");
        return new ActivateBlockUser(driver);
    }


    //******************************************************************************************************************
   // public ActivateBlockUser editCTIUser(){
    //    log.info("Осуществляем вход на страницу Авторизации");
    //    log.info("Вводим логин");
    //    driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
    //    log.info("Вводим пароль");
    //    driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
    //    log.info("Нажимаем вход");
    //    driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
    //    log.info("Осуществляем вход на главную страницу");
    //    driver.findElement(By.xpath(ADMINISRATION_LINK_XPATH)).click();
     //   return new ActivateBlockUser(driver);
   // }

    //******************************************************************************************************************
    public AddNewUserScreen createNewUserManagerCreatorRole(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        return new AddNewUserScreen(driver);
    }

    //******************************************************************************************************************
    public JournalOrdersScreen journalOrdersScreen(){
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(JOURNAL_ORDER_LINK_XPATH)).click();
        log.info("Осуществляем переход на страницу Журнал заказов");
        return new JournalOrdersScreen(driver);
    }

    //******************************************************************************************************************
    public NewSubjectScreen verifyElemNewSubjScreen() throws InterruptedException {//Убрать Thread.sleep
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(JOURNAL_ORDER_LINK_XPATH)).click();
        Thread.sleep(8000);
        log.info("Осуществляем переход на страницу Журнал заказов");
        driver.findElement(By.xpath(NEW_ORDER_XPATH)).click();
        return new NewSubjectScreen(driver);
    }

    //******************************************************************************************************************
    public DocumentScreen documentScreen() throws InterruptedException {//Убрать Thread.sleep
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(JOURNAL_ORDER_LINK_XPATH)).click();
        Thread.sleep(6000);
        log.info("Осуществляем переход на страницу Журнал заказов");
        driver.findElement(By.xpath(NEW_ORDER_XPATH)).click();
        Thread.sleep(2000);
        return new DocumentScreen(driver);
    }


    //******************************************************************************************************************
    public OperationScreen operationScreen() throws InterruptedException {//Убрать Thread.sleep
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(JOURNAL_ORDER_LINK_XPATH)).click();
        Thread.sleep(8000);
        log.info("Осуществляем переход на страницу Журнал заказов");
        driver.findElement(By.xpath(NEW_ORDER_XPATH)).click();
        Thread.sleep(2000);
        return new OperationScreen(driver);
    }

    // Тесты которые идут на http://localhost:8080/signin.html необходимо поменять на "http://nka_rh:8080/";
    public ComponetsPartScreen componetsPartScreen() throws InterruptedException {
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(REESTR_LINK_XPATH)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(REESTR_ELEM_NAME_XPATH)).click();
        driver.findElement(By.xpath(REESTR_BTN_XPATH)).click();
        driver.findElement(By.xpath(COMPONET_PART_BTN_XPATH)).click();

        return new ComponetsPartScreen(driver);
    }

    //******************************************************************************************************************
    public CostScreen costScreen() throws InterruptedException {
        log.info("Осуществляем вход на страницу Авторизации");
        log.info("Вводим логин");
        driver.findElement(By.xpath(LOGIN_XPATH)).sendKeys("11");
        log.info("Вводим пароль");
        driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("1");
        log.info("Нажимаем вход");
        driver.findElement(By.xpath(ENTER_BTN_XPATH)).click();
        log.info("Осуществляем вход на главную страницу");
        driver.findElement(By.xpath(REESTR_LINK_XPATH)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(REESTR_ELEM_NAME_XPATH)).click();
        driver.findElement(By.xpath(REESTR_BTN_XPATH)).click();
        driver.findElement(By.xpath(COST_LINK_XPATH)).click();
        return new CostScreen(driver);
    }


    //**********************************************NCA_RH END**********************************************************

    //Методы
    //******************************************************************************************************************
    private void GetTabFocus() {
        //handle windows change
        String base = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        set.remove(base);
        driver.close();
        assert set.size() == 1;
        driver.switchTo().window((String) set.toArray()[0]);

        //close the window and sitch back to the base tab
        //driver.close();
        //driver.switchTo().window(base);
    }

    //******************************************************************************************************************
    private void SignIn() {
        log.info(DO_ENTER);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_LOGIN_XPATH)).sendKeys(RIK_TEST);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_PASSWORD_XPATH)).sendKeys(TEST);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_USER_XPATH)).click();
    }

    //******************************************************************************************************************
    private void SignIn(String A, String B) {
        log.info(DO_ENTER);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_LOGIN_XPATH)).sendKeys(A);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_PASSWORD_XPATH)).sendKeys(B);
        driver.findElement(By.xpath(MAIN_PAGE_ENTER_USER_XPATH)).click();
    }

    //******************************************************************************************************************
    private void SimpleEnterLogging() {
        SignIn();
        log.info(ENTER_SUCCESS);
    }


}
