package nca.Tests;


import com.codeborne.selenide.ex.ElementNotFound;
import nca.Screens.IndexPageScreen;
import nca.Utils.LoadPage;
import nca.Utils.PageScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by Evil on 27.09.2014.
 */

public class SmokeTest extends BaseTest {

    /*final static String AUTHORIZATION_PAGE_TITLE = "Авторизация";
    final static String AUTH_ERROR = "Пользователь или пароль некорректен, повторите ввод.";
    final static String AUTHORIZATION_PAGE_SCREENSHOT = "AUTHORIZATION_PAGE";
    final static String AUTHORIZATION_PAGE_ERROR_SCREENSHOT = "AUTHORIZATION_PAGE_ERROR ";

    final static String MAIN_PAGE_TITLE = "Главная";
    final static String MAIN_PAGE_SCREENSHOT = "MAIN_PAGE ";
    final static String EXIT = "//a[@href='/j_spring_security_logout']";



    final static String ADMINISTARATION_PAGE_TITLE = "Журнал пользователей";
    final static String ADMINISTARATION_PAGE_TITLE_SCREENSHOT = "ADMINISTARATION_PAGE ";


    final static String ADD_NEW_USER_PAGE_TITLE = "Добавление пользователя";
    final static String MESSAGE_AFTER_REG = "MESSAGE_AFTER_REG";
    final static String END_UP_BTN = "//a[@class='btn btn-primary btn-lg active']";
    final static String MESSAGE_AFTER_REG_NEW_USER = "Сохранение прошло успешно! Завершить редактирование?";
    final static String MESSAGE_ADD_USER_WO_DATA_SCREENSHOT = "MessageAddUserWOData ";
    final static String FIND_NO_EXIST_USER = "FindNoExistUser";
    final static String ADD_NEW_USER_ADMIN_ROLE = "AddNewUserAdminRole";
    final static String MESSAGE_AFTER_ADMIN_REG = "MessageAfterAdminReg";
    final static String MAIL_BOX_EXIT = "//a[@id='SignOut']";

    final static String NECESSARILY_MESSAGE = "Это обязательное поле!";
    final static String WARNING_MESSAGE = "Предупреждение";

    final static boolean FALSE = false;
    final static boolean TRUE = true;

    final static String ALERTIFY_CANCEL_BTN = "Отмена";
    public final String ALERTIFY_CANCEL_BTN_XPATH = "//button[@id='alertify-cancel']";
    final static String ALERTIFY_OK_BTN = "Ок";

    final static String TITLE_EDIT_PAGE = "Редактирование пользователя";
    final static String TITLE_JOURNAL_ORDER = "Журнал";

    public static final String GO_TO_MAIN_XPATH = "На главную";
    public static final String GO_TO_JOURNAL_ORDER_XPATH = "Журнал заказов";
    public static final String GO_TO_FIND_VIEW_OBJECT_XPATH = "Поиск и просмотр объекта";
    public static final String GO_TO_BASE_KNOWLEGE_PAGE_XPATH = "База знаний";
    public static final String GO_TO_REESTR_PAGE_XPATH = "Реестр характеристик";
    public static final String GO_TO_CABINET_PAGE_XPATH = "Личный кабинет";
    public static final String GO_TO_HELP_PAGE_XPATH = "Помощь";
    public static final String EXIT_XPATH = "Выйти";

    public static final String TITLE_NEW_ORDER = "Субъект";
    public static final String TITLE_OBJECT_ORDER = "Информация об объекте";

    public static final String TITLE_EDIT_ADDRESS = "Редактирование адреса";
    public static final String TITLE_DOCUMENT_PAGE_TITLE = "Документы";
    public static final String TITLE_OPEARTION_PAGE_TITLE = "Операция";
    public static final String TITLE_VIEW_WINDOW = "Окно просмотра";
    public static final String TITLE_EDIT_VIEW_WINDOW = "Редактирование информации об объекте";
    public static final String TITLE_EDIT_DOC_VIEW_WINDOW = "Редактирование документа";

    public static final String CLOSE_UI_WIN_XPATH = "//button[@class='ui-dialog-titlebar-close']";
    public static final String WARNING_WINDOW_XPATH = "Предупреждение";
    public static final String JOBS_TITLE = "Предупреждение";
    public static final String COMPONENT_PART_TITLE = "Составные части";

    public static final String OPERATIONS_BTN_XPATH = "Операции";
    public static final String OVERALL_BTN_XPATH = "Общие";
    public static final String COST_BTN_XPATH = "Стоимости";
    public static final String COMPONET_PART_BTN_XPATH = "Составные части";
    public static final String BEAUTIFICATION_BTN_XPATH = "Благоустройство";
    public static final String RESIDENTIAL_ROOMS_BTN_XPATH = "Жилые помещения";
    public static final String ADD_BTN_XPATH = " Добавить\n" +
            "            ";
    public static final String DELETE_BTN_XPATH = " Удалить\n" +
            "            ";

    public static final String STANDART_TREE = "Эталонное дерево";
    public static final String OPERATION_TITLE = "Операция";
    public static final String OVER_ALL_TITLE = "Общие";
    public static final String COST_TITLE = "Стоимости";
    public static final String BEAUTIFICATION_TITLE = "Благоустройство";
    public static final String RESIDENTIAL_ROOMS_TITLE = "Жилые помещения";
    public static final String SEARCH_TITLE = "Поиск и просмотр объекта";
    public static final String KNOW_BASE_TITLE = "База знаний";
    public static final String INDIVIDUAL_GARAGE = "Индивидуальный гараж";
    public static final String NULL_TEXT ="";

    public static final String USING_DATE = "Дата ввода в эксплуатацию";
    public static final String BUILD_YEAR = "Год постройки";
    public static final String LITER = "Литер";
    public static final String SQUARE = "Наружная площадь, кв.м.";
    public static final String V = "Объем, куб. м.";
    public static final String FIZ_DESTR = "Физический износ, %";
    public static final String NEW_CHARACTERICTIC = "Площадь отмосток, крылец, пандусов и т.п., кв. м.";

    public static final String BASIC_YEAR_LEVEL_COST = "Год базисного уровня цен";
    public static final String VIEW_COST = "Вид стоимости";
    public static final String DEFENITION_DATE = "Дата определения";
    public static final String COST = "Стоимость";
    public static final String CONSERVATION_DATE = "Дата консервации";
    public static final String DOUMENT_NUMBER = "Номер документа";
    public static final String DOUMENT_NAME = "Наименование документа";
    public static final String ORG_NAME_DOC = "Организация, выдавшая документ";*/


    /*@Test(priority = 1)
    public void CheckIndexPageTitle() throws IOException, SQLException{
        log.info("--------------------------Проверка главной страницы_Вход-------------------------------------------");
        log.info("--------------------------ТЕСТ#1 Проверка title на странице Авторизации----------------------------");
        String indexPageTitle = (new IndexPageScreen(driver)).getIndexPage().getIndexPageTitle();
        $(indexPageTitle).shouldHave(value("Авторизация1"));
        //Assert.assertEquals(AUTHORIZATION_PAGE_TITLE, indexPageTitle, "TITLE страницы не совпадает");
    }



    @Test(priority = 2)
    public void CheckAuthPageElem() throws IOException, SQLException{
        log.info("-----------------------Проверка главной страницы_Вход----------------------------------------------");
        log.info("-----------------------ТЕСТ#2 Проверка элементов на странице Входа---------------------------------");

        List<String> myResultArr = (new IndexPageScreen(driver)).getIndexPage().checkAuthorizationPageElements();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot(AUTHORIZATION_PAGE_SCREENSHOT);

        log.info("ВСЕ ДАННЫЕ МАССИВА resultArraddResultArr: " + dataResult);

    }

    /*@Test(priority = 3)
    public void CheckAuthError() throws IOException, SQLException {
        log.info("--------------------Проверка главной страницы_Вход-------------------------------------------------");
        log.info("--------------------Тест#3 Проверка появления ошибки на странице Входа-----------------------------");

        String authError = (new IndexPageScreen(driver)).getIndexPage().checkAuthError();

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot(AUTHORIZATION_PAGE_ERROR_SCREENSHOT);
        Assert.assertEquals(AUTH_ERROR, authError, "Текст ошибки не совпадает");
    }

    @Test(priority = 4)
    public void GetMainPageTitle() throws IOException, SQLException {
        log.info("------------------------------Проверка главной страницы_Вход---------------------------------------");
        log.info("------------------------------Тест#4 Проверка входа пользователя-----------------------------------");

        String mainPageTitle = (new IndexPageScreen(driver)).getMainPageTitleANDElementsOnMainPage().getMainPageTitle();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, mainPageTitle, "TITLE страниц не совпадают");
    }

    @Test(priority = 5)
    public void VerifyRememberMe() throws IOException, SQLException {
        log.info("-------------------------------Проверка главной страницы_Вход--------------------------------------");
        log.info("-------------------------------Тест#5 Проверка функции remember_me---------------------------------");

        String mainPageTitle = (new IndexPageScreen(driver)).verifyRememberMe().verifyRememberMe();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, mainPageTitle, "TITLE страниц не совпадают");
    }

    @Test(priority = 6)
    public void GetMainPageTitleRoleAdmin() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("------------------Тест#1 Проверка входа пользователя с правами Администратора----------------------");

        String mainPageTitle = (new IndexPageScreen(driver)).getMainPageTitleANDElementsOnMainPage().getMainPageTitle();


        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, mainPageTitle, "TITLE страниц не совпадают");
    }

    @Test(priority = 7)
    public void VerifyElementsOnMainPage() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("------------------------Тест#2 Проверка элементов на Главной странице------------------------------");

        List<String> myResultArr = (new IndexPageScreen(driver)).getMainPageTitleANDElementsOnMainPage().verifyElementsOnMainPage();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot(MAIN_PAGE_SCREENSHOT);
        driver.findElement(By.xpath(EXIT)).click();

        log.info("ВСЕ ДАННЫЕ МАССИВА eElementsOnMainPage: " + dataResult);
    }

    @Test(priority = 8)
    public void VerifyTitleAdministrationScreen() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------------Тест#3 Проверка открытия журнала пользователей------------------------------");

        String titleAdministrationScreen = (new IndexPageScreen(driver)).verifyTitleAndElementsAdministrationScreen().verifyTitleAdministrationScreen();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(ADMINISTARATION_PAGE_TITLE, titleAdministrationScreen, "TITLE страниц не совпадают");
    }

    @Test(priority = 9)
    public void VerifyHeaderElementsAdministrationScreen() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------Тест#4 Проверка элементов в header на странице  журнал пользователей------------------");

        List<String> myResultArr = (new IndexPageScreen(driver)).verifyTitleAndElementsAdministrationScreen().verifyHeaderElementsAdministrationScreen();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot(ADMINISTARATION_PAGE_TITLE_SCREENSHOT);
        driver.findElement(By.xpath(EXIT)).click();

        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnHeaderAdministrationPage: " + dataResult);
    }

    @Test(priority = 10)
    public void VerifyElementsAdministrationScreen() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------Тест#5 Проверка элементов в на странице  журнала пользователей----------------------");

        List<String> myResultArr = new IndexPageScreen(driver).verifyTitleAndElementsAdministrationScreen().verifyElementsAdministrationScreen();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }
        driver.findElement(By.xpath(EXIT)).click();
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnAdministrationPage: " + dataResult);
    }

    @Test(priority = 11)
    public void VerifyTableElementsAdministrationScreen() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------Тест#6 Проверка элементов таблицы на странице журнала пользователей------------------");

        List<WebElement> myResultArr = (new IndexPageScreen(driver)).verifyTitleAndElementsAdministrationScreen().verifyTableElementsAdministrationScreen();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }

        driver.findElement(By.xpath(EXIT)).click();
        log.info("Массив Получен" );
    }

    @Test(priority = 12)
    public void VerifyAddNewUserScreenTitle() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------Тест#7 Проверка перехода на страницу Добваление пользователя----------------------");

        String addNewUserScreenTitle = (new IndexPageScreen(driver)).NewUserScreen().verifyAddNewUserScreenTitle();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(ADD_NEW_USER_PAGE_TITLE, addNewUserScreenTitle, "TITLE страниц не совпадают");
    }

    @Test(priority = 13)
    public void VerifyAddNewUserScreenElements() throws IOException, SQLException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------Тест#8 Проверка элементов на странице Добваление пользователя---------------------");

        List<String> myResultArr = (new IndexPageScreen(driver)).NewUserScreen().verifyAddNewUserScreenElements();

        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }
        driver.findElement(By.xpath(EXIT)).click();
        log.info("ВСЕ ДАННЫЕ МАССИВА AddNewUserScreenElements: " + dataResult);
    }*/

    /*@Test(priority = 14)
    public void VerifyAddNewUserMessageAfterReg() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---Тест#9 Проверка появления предупреждения Сохранение прошло успешно! Завершить редактирование?---");

        String addNewUserMessageAfterReg = (new IndexPageScreen(driver)).NewUserScreen().verifyAddNewUserMessageAfterReg();

        PageScreenShot util = new PageScreenShot(driver);
        util.takeScreenShot(MESSAGE_AFTER_REG);
        Thread.sleep(5000);
        driver.findElement(By.xpath(END_UP_BTN)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MESSAGE_AFTER_REG_NEW_USER, addNewUserMessageAfterReg, "Текст страниц не совпадают");


    }*/

    /*@Test(priority = 15)
    public void VerifyAddedUserByLogin() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------Тест#10 Создание пользователя(проверка создания по логину+скрин)---------------------");

        String addedUserByLogin = (new IndexPageScreen(driver)).NewUserScreen().verifyAddedUserByLogin();

        PageScreenShot util = new PageScreenShot(driver);
        util.takeScreenShot("VERIFY_BY_LOGIN");
        Thread.sleep(5000);

        driver.getPageSource().contains(addedUserByLogin);
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(addedUserByLogin, addedUserByLogin, "Логин не совпадает");

    }

    @Test(priority = 16)
    public void VerifyMessageAddUserWOData() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--Тест#11 Проверка появления ошибки заполнении полей пустыми символами при создании пользователя---");

        (new IndexPageScreen(driver)).NewUserScreen().VerifyMessageAddUserWOData();

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot(MESSAGE_ADD_USER_WO_DATA_SCREENSHOT);
        driver.findElement(By.xpath(EXIT)).click();

    }

    @Test(priority = 17)
    public void FindNoExistUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------------Тест#12 Поиск не существующего пользователя-------------------------------");

        (new IndexPageScreen(driver)).NewUserScreen().findNoExistUser();

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot(FIND_NO_EXIST_USER);
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 18)
    public void AddNewUserAdminRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#13 Создание пользователя с правами Администратор---------------------------");

        String newUserAdminRole = (new IndexPageScreen(driver)).NewUserScreen().addNewUserAdminRole();

        driver.getPageSource().contains(newUserAdminRole);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot(ADD_NEW_USER_ADMIN_ROLE);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 19)
    public void VerifyMessageAfterAdminReg() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------------Тест#14 Проверка письма после регистрации---------------------------------");

        (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyMessageAfterAdminReg();



        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot(MESSAGE_AFTER_ADMIN_REG);
        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
    }


    @Test(priority = 20)
    public void LoginWOActivation() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------Тест#15 Попытка залогиниться новым созданным пользователем без Активации--------------");

        String authError = (new IndexPageScreen(driver)).RegBlockActiveMessage().loginWOActivation();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        Assert.assertEquals(AUTH_ERROR, authError, "Текст ошибки не совпадает");
    }

    @Test(priority = 21)
    public void ActivateNewUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------------Тест#16 Активация созданного пользователя-------------------------------");

        String activateUserLetter = (new IndexPageScreen(driver)).activateBlockUser().activateNewUser();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
       log.info(activateUserLetter);
    }

    @Test(priority = 22)
    public void LoginWithActivateNewUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------------Тест#17 Попытка залогиниться активированным пользователем ---------------------");

        String pageTitle = (new IndexPageScreen(driver)).activateBlockUser().loginWithActivateNewUser();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, pageTitle, "Title страницы не совпадает");
    }

    @Test(priority = 23)
    public void VerifyErrorBlockWOReason() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------Тест#18 Проверка появления ошибки при незаполнении причины блокировки ---------------");

        String necessarilyField = (new IndexPageScreen(driver)).activateBlockUser().verifyErrorBlockWOReason();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(NECESSARILY_MESSAGE,necessarilyField,"Текст ошибки не совпадает");
    }

    @Test(priority = 24)
    public void BlockUserAfterActivate() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#19 Проверка Блокировки пользователя ------------------------------");

        String message = (new IndexPageScreen(driver)).activateBlockUser().blockUserAfterActivate();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_MESSAGE,message,"Текст не совпадает");
    }

    @Test(priority = 25)
    public void VerifyLetterAfterBlock() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#20 Проверка письма после блокировки  -----------------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyLetterAfterBlock();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 26)
    public void SecondActivateAdminUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#21 Попытка залогиниться заблокированным пользователем----------------------");

        String title = (new IndexPageScreen(driver)).activateBlockUser().verifyLoginWithBlockUser();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        Assert.assertEquals(AUTHORIZATION_PAGE_TITLE,title,"Title не совпадает");
    }

    @Test(priority = 27)
    public void VerifyLoginWithBlockUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------Тест#22 Активировать заблокированного пользователя---------------------------");

        String activateUserLetter = (new IndexPageScreen(driver)).activateBlockUser().secondActivateAdminUser();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(activateUserLetter);
    }

    @Test(priority = 28)
    public void LoginWithActivateNewUserAgain() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#23 Попытка залогиниться разблокированным пользователем---------------------");

        String pageTitle = (new IndexPageScreen(driver)).activateBlockUser().loginWithActivateNewUserAgain();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, pageTitle, "Title страницы не совпадает");
    }

    @Test(priority = 29)
    public void ChangeUserPassword() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------Тест#24 Проверка Смены пароля+Проверка письма после смены пароля------------------");

        String newPass = (new IndexPageScreen(driver)).activateBlockUser().changeUserPassword();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(newPass);
    }

    @Test(priority = 30)
    public void LoginAfterPassChange() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------------Тест#25 Проверка Входа после смены пароля-------------------------------");

        String pageTitle = (new IndexPageScreen(driver)).activateBlockUser().loginAfterPassChange();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, pageTitle, "Title страницы не совпадает");

    }

    @Test(priority = 31)
    public void CancelPassChange() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------------Тест#26 Проверка отмены при смене пароля--------------------------------");

        String pageTitle = (new IndexPageScreen(driver)).activateBlockUser().cancelPassChange();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, pageTitle, "Title страницы не совпадает");
    }

    *//*@Test(priority = 32)
    public void EditRHUser() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#27 Редактирование пользователя RH---------------------------------");

        String userEdited = (new IndexPageScreen(driver)).editRHUser().editRHUser();

        PageScreenShot util = new PageScreenShot(driver);

        Thread.sleep(5000);
        util.takeScreenShot("Отредактированный пользователь");
        log.info("Пользователь изменен");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }*//*

    //@Test(priority = 33)
    //public void EditCTIUser() throws IOException, SQLException, InterruptedException {
      //  log.info("--------------------------------------role Admin---------------------------------------------------");
       // log.info("---------------------------Тест#28 Редактирование пользователя CTI--------------------------------");
  //  }

    @Test(priority = 32)
    public void CreateNewUserRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#28 Создание пользователя с правами Пользователь----------------------------");

        String userRole = (new IndexPageScreen(driver)).createNewUserManagerCreatorRole().createNewUserRole();

        driver.getPageSource().contains(userRole);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("РОЛЬ пользователь");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 33)
    public void VerifyLetterAfterRegUserRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#29 Проверка письма с правами Пользователь----------------------------");//ПРОВЕРИТЬ ДОБАВЛЕНИЕ В ФАЙЛ

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyLetterAfterRegUserRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 34)
    public void ActivateUserRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#30 Активация пользоватля с правами Пользователь----------------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateUserRole();

        log.info(letter);
        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
    }

    @Test(priority = 35)
    public void BlockUserRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------Тест#31 Блокировка пользователя с правами Пользователь------------------------");

        String message = (new IndexPageScreen(driver)).activateBlockUser().blockUserRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_MESSAGE,message,"Текст не совпадает");

    }

    @Test(priority = 36)
    public void VerifyMessageAfterBlockUserRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#32 Проверка письма после блокировки  -----------------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyMessageAfterBlockUserRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 37)
    public void ActivateUserRoleAgain() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#33 Активация и письмо после активации-----------------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateUserRoleAgain();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 38)
    public void EnterUserRoleAfterActivate() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#33 Активация и письмо после активации-----------------------------");

        String title = (new IndexPageScreen(driver)).activateBlockUser().enterUserRoleAfterActivate();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, title, "Title страницы не совпадает");
    }

    @Test(priority = 39)
    public void CreateNewManagerRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------------Тест#34 Создание пользователя с правами Менеджер-------------------------------");

        String managerRole = (new IndexPageScreen(driver)).createNewUserManagerCreatorRole().createNewManagerRole();

        driver.getPageSource().contains(managerRole);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("РОЛЬ менеджер");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 40)
    public void VerifyLetterAfterRegManagerRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("--------------------Тест#35 Проверка письма после регистрации Менеджера----------------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyLetterAfterRegManagerRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);

    }

    @Test(priority = 41)
    public void ActivateManageRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#36 Активация пользоватля с правами Пользователь----------------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateManageRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 42)
    public void BlockManageRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------------Тест#37 Блокировка пользователя с правами Менеджер--------------------------");

        String message = (new IndexPageScreen(driver)).activateBlockUser().blockManageRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_MESSAGE,message,"Текст не совпадает");

    }

    @Test(priority = 43)
    public void VerifyMessageAfterBlockManagerRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#38 Проверка письма после блокировки  -----------------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyMessageAfterBlockManagerRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 44)
    public void ActivateManageRoleAgain() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#39 Активация и письмо после активации-----------------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateManageRoleAgain();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 45)
    public void EnterManageRoleAfterActivate() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#40 Активация и письмо после активации-----------------------------");

        String title = (new IndexPageScreen(driver)).activateBlockUser().enterManageRoleAfterActivate();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, title, "Title страницы не совпадает");
    }

    @Test(priority = 46)
    public void CreateNewManagerCreaterRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("------------------Тест#41 Создание пользователя с правами Менеджер заказов-------------------------");

        String managerCreaterRole = (new IndexPageScreen(driver)).createNewUserManagerCreatorRole().createNewManagerCreaterRole();

        driver.getPageSource().contains(managerCreaterRole);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("РОЛЬ менеджерзаказов");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 47)
    public void VerifyLetterAfterRegManagerCreaterRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------Тест#42 Проверка письма после регистрации Менеджера заказов-----------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyLetterAfterRegManagerCreaterRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);

    }

    @Test(priority = 48)
    public void ActivateManageCreaterRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-------------------Тест#43 Активация пользоватля с правами Менеджера заказов-----------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateManageCreaterRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 49)
    public void BlockManageCreaterRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------Тест#44 Блокировка пользователя с правами Менеджер---------------------------");

        String message = (new IndexPageScreen(driver)).activateBlockUser().blockManageCreaterRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_MESSAGE,message,"Текст не совпадает");

    }

    @Test(priority = 50)
    public void VerifyMessageAfterBlockManageCreaterRole() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#45 Проверка письма после блокировки  -----------------------------");

        String letter = (new IndexPageScreen(driver)).RegBlockActiveMessage().verifyMessageAfterBlockManageCreaterRole();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 51)
    public void ActivateManageCreaterRoleAgain() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#46 Активация и письмо после активации-----------------------------");

        String letter = (new IndexPageScreen(driver)).activateBlockUser().activateManageCreaterRoleAgain();

        Thread.sleep(5000);
        driver.findElement(By.xpath(MAIL_BOX_EXIT)).click();
        log.info(letter);
    }

    @Test(priority = 52)
    public void EnterManageCreaterRoleAfterActivate() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("----------------------------Тест#47 Активация и письмо после активации-----------------------------");

        String title = (new IndexPageScreen(driver)).activateBlockUser().enterManageCreaterRoleAfterActivate();

        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(MAIN_PAGE_TITLE, title, "Title страницы не совпадает");
    }

    @Test(priority = 53)
    public void FindUserByLastNameOnList() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------------------Тест#48 Поиск пользователя из списка----------------------------------");
        (new IndexPageScreen(driver)).verifyTitleAndElementsAdministrationScreen().findUserByLastNameOnList();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Поиск");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

   *//* @Test(priority = 54)
    public void UsigSpecialSymbols() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----Тест#49 Проверка появления ошибки заполнения полей спецсимволами при создании пользователя----");
        String errorMessage = (new IndexPageScreen(driver)).NewUserScreen().usigSpecialSymbols();
        log.info("Заглушка");
        driver.findElement(By.xpath(EXIT)).click();
    }*//*

    *//* @Test(priority = 55)
    public void SpecialSymbolsInBlockingWindow() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("------Тест#50 Проверка появления ошибки при заполнении причины блокировки спецсимволами №%?*()-----");
        String errorMessage = (new IndexPageScreen(driver)).activateBlockUser().specialSymbolsInBlockingWindow();
        log.info("Заглушка");
        driver.findElement(By.xpath(EXIT)).click();
    }*//*


    @Test(priority = 56)
    public void VerifyBlockedBlockingBTN() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------Тест#51 Проверка Блокировки блокированного пользователя-----------------------");
        boolean errorMessage = (new IndexPageScreen(driver)).activateBlockUser().verifyBlockedBlockingBTN();
        log.info(errorMessage);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(FALSE, errorMessage, "Значение должно приходить FALSE");
    }

    @Test(priority = 57)
    public void VerifyBlockedActivingBTN() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("---------------------Тест#51 Проверка Блокировки блокированного пользователя-----------------------");
        boolean errorMessage = (new IndexPageScreen(driver)).activateBlockUser().verifyBlockedActivingBTN();
        log.info(errorMessage);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(FALSE, errorMessage, "Значение должно приходить FALSE");
    }

    @Test(priority = 58)
    public void VerifyBtnLanguage() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------Тест#52 Проверка языка кнопок ошибки при не заполнении причины блокировки---------------");
        log.info("----------------------------Проверить когда исправят Название КНОПОК-------------------------------");
        List<String> btnLang = (new IndexPageScreen(driver)).activateBlockUser().verifyBtnLanguage();

        String dataResult = "";
        for (int i = 0; i < btnLang.size(); i++) {
            dataResult = dataResult + btnLang.get(i) + " ";
        }

        List<String> btnLangCheck = new ArrayList<String>(Arrays.asList(new String[]{ALERTIFY_CANCEL_BTN,ALERTIFY_OK_BTN}));
        int i = 0;
        List<String> btnLangCheckResult = new ArrayList<String>();
        for (String bl: btnLang) {
            boolean w = bl.equals(btnLangCheck.get(i));
            if (!w) {
                btnLangCheckResult.add(bl);
                btnLangCheckResult.add(btnLangCheck.get(i));
            }
            i++;
        }

        if (btnLangCheckResult.size() > 0) {
            log.info("ВСЕ ДАННЫЕ МАССИВА btnLangCheckResult: " + btnLangCheckResult);
        }

        driver.findElement(By.xpath(ALERTIFY_CANCEL_BTN_XPATH)).click();
        driver.findElement(By.xpath(EXIT)).click();

    }

    @Test(priority = 59)
    public void VerifyTitleEditPage() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------------------role Admin---------------------------------------------------");
        log.info("-----------------------Тест#53 Проверка title Редактирования  пользователя-------------------------");
        String title = (new IndexPageScreen(driver)).verifyTitleAndElementsAdministrationScreen().verifyTitleEditPage();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_PAGE, title, "Title страниц не совпадает");
    }

    @Test(priority = 60)
    public void VerifyTitleJournalOrders() throws IOException, SQLException, InterruptedException{
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------------------------Тест#1 Проверка title Журанала заказов---------------------------------");
        String getTitle = (new IndexPageScreen(driver)).journalOrdersScreen().getPageTitle();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_JOURNAL_ORDER,getTitle,"");
    }

    @Test(priority = 61)
    public void VerifyElementsJournalOrderHeader() throws IOException, SQLException, InterruptedException{
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----------------Тест#2 Проверка элементов в хедере на странице Журнал Заказов---------------------");
        List<String> headerLinks = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElementsJournalOrderHeader();

        String dataResult = "";
        for (int i = 0; i < headerLinks.size(); i++) {
            dataResult = dataResult + headerLinks.get(i) + " ";
        }

        List<String> headerLinksCheck = new ArrayList<String>(Arrays.asList(new String[]{GO_TO_MAIN_XPATH,GO_TO_JOURNAL_ORDER_XPATH,
                GO_TO_FIND_VIEW_OBJECT_XPATH,GO_TO_BASE_KNOWLEGE_PAGE_XPATH, GO_TO_REESTR_PAGE_XPATH, GO_TO_CABINET_PAGE_XPATH,
                GO_TO_HELP_PAGE_XPATH, EXIT_XPATH}));
        int i = 0;
        List<String> headerLinksCheckResult = new ArrayList<String>();
        for (String hl: headerLinks) {
            boolean w = hl.equals(headerLinksCheck.get(i));
            if (!w) {
                headerLinksCheckResult.add(hl);
                headerLinksCheckResult.add(headerLinksCheck.get(i));
            }
            i++;
        }

        if (headerLinksCheckResult.size() > 0) {
            log.info("ВСЕ ДАННЫЕ МАССИВА headerLinksCheckResult(Выводится в случае ошибки): " + headerLinksCheckResult);
        }

        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 62)
    public void VerifyElementsJournalOrderPageElem() throws IOException, SQLException, InterruptedException{
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--------------------Тест#3 Проверка элементов на странице Журнал Заказов---------------------------");
        List<String> pageElem = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElementsJournalOrderPage();

        String dataResult = "";
        for (int i = 0; i < pageElem.size(); i++) {
            dataResult = dataResult + pageElem.get(i) + " ";
        }

        log.info("ВСЕ ДАННЫЕ МАССИВА headerLinksCheckResult: " + pageElem);
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка элементов на странице Журнал Заказов");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 63)
    public void VerifyElementsJournalOrderTab() throws IOException, SQLException, InterruptedException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--------------------------Тест#4 Содержание хедера таблицы журнала---------------------------------");
        List<WebElement> myResultArr = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElementsJournalOrderTab();
        String dataResult = "";
        for (int i = 0; i < myResultArr.size(); i++) {
            dataResult = dataResult + myResultArr.get(i) + " ";
        }

        driver.findElement(By.xpath(EXIT)).click();
        log.info("Массив Получен");
    }

    @Test(priority = 64)
    public void GetTitleNewOrder() throws IOException, SQLException, InterruptedException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------Тест#5 Проверка перехода на страницу нового заказа----------------------------");
        String getTitleNewOrder = (new IndexPageScreen(driver)).journalOrdersScreen().getTitleNewOrder();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_NEW_ORDER,getTitleNewOrder,"Title страниц не совпадают");
    }

    //НЕОБХОДИМО ДОБАВИТЬ РЕАЛИЗАЦИЮ PAGESHOT
    @Test(priority = 65)
    public void verifyElemNewSubjScreen_1() throws IOException, SQLException, InterruptedException {//НЕОБХОДИМО ДОБАВИТЬ РЕАЛИЗАЦИЮ PAGESHOT
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--------------#6 Проверка наличия элементов на странице Субъект в бланке Заявитель-----------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyElemNewSubjScreen_1();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка элементов на странице Субъект");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();//НЕОБХОДИМО ДОБАВИТЬ РЕАЛИЗАЦИЮ PAGESHOT
    }

    //Продумать при Code Review(обрезать мусор)
    @Test(priority = 66)
    public void VerifyElemNewSubjScreenFiz () throws IOException, SQLException, InterruptedException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------#7 Проверка наличия элементов на странице Субъект в бланке Заявитель Физическое лицо---------");
        List<String> tableRow = (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyElemNewSubjScreenFiz();
        log.info("!!!!!!!!!!!Приходит мусор!!!!!!!!!!!!!!!!!!!!!!");
        log.info(tableRow);
        driver.findElement(By.xpath(EXIT)).click();
    }

    //Продумать при Code Review(обрезать мусор)
    @Test(priority = 67)
    public void VerifyElemNewSubjScreenUr () throws IOException, SQLException, InterruptedException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------#8 Проверка наличия элементов на странице Субъект в бланке Заявитель Юридическое лицо--------");
        List<String> tableRow = (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyElemNewSubjScreenUr();
        log.info("!!!!!!!!!!!Приходит мусор!!!!!!!!!!!!!!!!!!!!!!");
        log.info(tableRow);
        driver.findElement(By.xpath(EXIT)).click();
    }

    //Продумать при Code Review(обрезать мусор)
    @Test(priority = 68)
    public void VerifyElemNewSubjScreenIP () throws IOException, SQLException, InterruptedException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----------#9 Проверка наличия элементов на странице Субъект в бланке Заявитель ИП-----------------");
        List<String> tableRow = (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyElemNewSubjScreenIP();
        log.info("!!!!!!!!!!!Приходит мусор!!!!!!!!!!!!!!!!!!!!!!");
        log.info(tableRow);
        driver.findElement(By.xpath(EXIT)).click();
    }

    //Реализовать механизм (взять юзеров с одной страницы и сравнить данные в другой)
    @Test(priority = 69)
    public void FindUserByLastNameOnSubjectScreen() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("------------------------------------Журнал Заказов-------------------------------------------------");
        log.info("---------------------------Тест#10 Проверка поиска существующего заявителя-------------------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().findUserByLastNameOnSubjectScreen();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Поиск на SubjectScreen");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    //Реализовать механизм (взять юзеров с одной страницы и сравнить данные в другой)
    @Test(priority = 70)
    public void FindUserByLastNameOnSubjectScreenByEnter() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------------------Тест#10 Выбор заявителя существующего заявителя нажатием Enter-------------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().findUserByLastNameOnSubjectScreenByEnter();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Поиск на SubjectScreen по Enter");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 71)
    public void GetTitleEditAddressWindow() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------------------Тест#11 Кнопка Найти адрес (открытие окна Редактирование адреса)-----------------");
        String getText = (new IndexPageScreen(driver)).verifyElemNewSubjScreen().getTitleEditAddressWindow();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_ADDRESS,getText,"Title страниц не совпадает");
    }

    @Test(priority = 72)
    public void ForeignAddressBTN() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----------------------------Тест#12 Кнопка Иностранный адрес?-----------------------------");
        boolean result = (new IndexPageScreen(driver)).verifyElemNewSubjScreen().foreignAddressField();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TRUE,result,"Должно быть TRUE");
    }

    @Test(priority = 73)
    public void ChooseNationality() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------------------------------Тест#13 Кнопка Заполнение Гражданство-------------------------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().chooseNationality();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Гражданство");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 74)
    public void AddApplicant() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------------------Тест#13 Кнопка Добавить заявителя---------------------------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addApplicant();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Добавление нового заявителя");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 75)
    public void DelApplicant() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------------------Тест#14 Кнопка Удалить заявителя----------------------------------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().delApplicant();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Удаление нового заявителя");
        Thread.sleep(5000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 76)
    public void AddNewApplicantFIZ() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#15 Внесение нового заявителя в бланк Заявитель Физическое лицо (идеальные данные)--------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewApplicantFiz();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 77)
    public void AddNewApplicantUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#16 Внесение нового заявителя в бланк Заявитель Юридическое лицо (идеальные данные)-------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewApplicantUR();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 78)
    public void AddNewApplicantIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------------Тест#17 Внесение нового заявителя в бланк Заявитель ИП (идеальные данные)--------------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewApplicantIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 79)
    public void AddNewRepresentativeFIZ() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----Тест#18 Внесение навого заявителя в бланк Представитель Физическое лицо (идеальные данные)-----");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewRepresentativeFIZ();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 80)
    public void AddNewRepresentativeUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#19 Внесение навого заявителя в бланк на странице Субъект в бланке Представить Юридическое лицо");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewRepresentativeUR();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 81)
    public void AddNewRepresentativeIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------Тест#20 Внесение навого заявителя в бланк на странице Субъект в бланке Представить ИП-------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().addNewRepresentativeIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 82)
    public void GetObjecPageScreenShot() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------Тест#21 Проверка наличия элементов в бланке Информация об объекте  на странице Объект-------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().getObjecPageScreenShot();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Страница Субъект");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();

    }

    @Test(priority = 83)//убрать Thread.sleep
    public void GetTitleDocumentPage() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------------Тест#22 Проверка title страницы Документ--------------------------------");
        String title =(new IndexPageScreen(driver)).documentScreen().getTitleDocumentPage();
        Assert.assertEquals(TITLE_DOCUMENT_PAGE_TITLE,title,"Title страниц не совпадает");
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 84)//убрать Thread.sleep
    public void VerifyElementsBackBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#23 Проверка наличия элементов при возврате со страницы Документы на страницу Объект------");
        (new IndexPageScreen(driver)).documentScreen().verifyElementsBackBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Страница Объект Возврат с документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 85)//убрать Thread.sleep
    public void VerifyDataAfterBackBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--Тест#24 Проверка наличия ранее заполненой информации при возврате со страницы Документы на страницу Объект--");
        (new IndexPageScreen(driver)).documentScreen().verifyDataAfterBackBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка данных, при возврате со страницы Документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 86)//убрать Thread.sleep
    public void VerifyDataAfterClickBackBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--Тест#25 Проверка наличия ранее заполненой информации при возврате со страницы Информация об объекте на страницу Субъект--");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyDataAfterClickBackBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка данных, при возврате со страницы Информация об объекте");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 87)//убрать Thread.sleep
    public void VerifyElemDocumentPage() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------Тест#26 Проверка наличия элементов на странице Документы в Журнале пользователя----------");
        (new IndexPageScreen(driver)).documentScreen().verifyElemDocumentPage();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка наличия элементов на странице Документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 88)//убрать Thread.sleep и добавить человеческое добавление файла
    public void GetOperationPageTitle() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------Тест#27 Заполнение бланка Документ при внесении нового пользователя в Журнал заказов--------");
        String title = (new IndexPageScreen(driver)).operationScreen().getOperationPageTitle();
        Thread.sleep(2000);
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE,title,"Title не совпадает");
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 89)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemOperationPageTitle() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------Тест#28 Проверка наличия элементов на странице Операция в Журнале пользователя-----------");
       (new IndexPageScreen(driver)).operationScreen().verifyElemOperationPageTitle();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка наличия элементов на странице Документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 90)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyTitleAfterFilingAllData() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----------------Тест#29 Проверка заполнения формы Операции в Журнале пользователя-----------------");
        String title = (new IndexPageScreen(driver)).operationScreen().verifyTitleAfterFilingAllData();
        Assert.assertEquals(TITLE_JOURNAL_ORDER,title,"Title не совпадает");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 91)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyBackBtnAfterFilingAllData() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--Тест#30 Проверка наличия внесенных данных на странице Документ при возврате со страницы Операции-");
        (new IndexPageScreen(driver)).operationScreen().verifyBackBtnAfterFilingAllData();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка наличия внесенных данных на странице Документ при возврате со страницы Операции");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 92)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifySaveAfterFilingAllData() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------Тест#31 Проверка сохранения данных при добавлении нового заказа в Журнал заказов---------");
        boolean result = (new IndexPageScreen(driver)).operationScreen().verifySaveAfterFilingAllData();
        Assert.assertEquals(TRUE,result,"Не найдено");
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 93)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyViewBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------------Тест#32 Функция Просмотр в Журнале заказов------------------------------");
        String result = (new IndexPageScreen(driver)).journalOrdersScreen().verifyViewBtn();
        Assert.assertEquals(TITLE_VIEW_WINDOW,result,"Title не совпадает");
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 94)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabObj() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------------Тест#33 Проверка данных на странице Журнал-Окно просмотра-Вкладка объект---------------");
        (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabObj();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка данных на странице Журнал-Окно просмотра-Вкладка объект");
        Thread.sleep(2000);
        driver.findElement(By.xpath(CLOSE_UI_WIN_XPATH)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 95)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabPresentation() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#34 Проверка наличия элементов в Окне просмотра Сведения о заказе на закладке Заказчик/Представитель");
        (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabPresentation();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(5000);
        util.takeScreenShot("Проверка данных на странице Журнал-Окно просмотра-Вкладка Заказчик-представитель");
        Thread.sleep(2000);
        driver.findElement(By.xpath(CLOSE_UI_WIN_XPATH)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 96)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabDoc() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----Тест#35 Проверка наличия элементов в Окне просмотра Сведения о заказе на закладке Документы----");
        (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabDoc();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Проверка данных на странице Журнал-Окно просмотра-Вкладка Документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(CLOSE_UI_WIN_XPATH)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 97)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabOperation() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----Тест#36 Проверка наличия элементов в Окне просмотра Сведения о заказе на закладке Операция-----");
        (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabOperation();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Проверка данных на странице Журнал-Окно просмотра-Вкладка Операция");
        Thread.sleep(2000);
        driver.findElement(By.xpath(CLOSE_UI_WIN_XPATH)).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 98)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabObjEditBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#37 Проверке перехода на страницу Информация об объекте при нажатии на кнопку Редактировать на закладке Объект");
        String title = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabObjEditBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Информация об объекте при нажатии на кнопку Редактировать на закладке Объект");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_VIEW_WINDOW,title,"Title не совпадает");
    }

    *//*@Test(priority = 99)//убрать Thread.sleep изменить пользователя для редактирования
    public void VerifyElemViewTabPresentationEditBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#38 Проверке перехода на страницу Субъект при нажатии на кнопку Редактировать на закладке Заказчик-Представитель");
        String title = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabPresentationEditBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Информация об объекте при нажатии на кнопку Редактировать на закладке Заказчик-Представитель");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_VIEW_WINDOW,title,"Title не совпадает");
    }*//*

    @Test(priority = 100)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabDocEditBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#39 Проверке перехода на страницу Информация об объекте при нажатии на кнопку Редактировать на закладке Документы");
        String title = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabDocEditBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Информация об объекте при нажатии на кнопку Редактировать на закладке Документы");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_DOC_VIEW_WINDOW,title,"Title не совпадает");
    }

    @Test(priority = 101)//убрать Thread.sleep и добавить человеческое добавление файла
    public void VerifyElemViewTabOperationEditBtn() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#40 Проверке перехода на страницу Операция при нажатии на кнопку Редактировать на закладке Операции");
        String title = (new IndexPageScreen(driver)).journalOrdersScreen().verifyElemViewTabOperationEditBtn();
        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        Thread.sleep(2000);
        util.takeScreenShot("Информация об объекте при нажатии на кнопку Редактировать на закладке Операции");
        Thread.sleep(2000);
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_EDIT_DOC_VIEW_WINDOW,title,"Title не совпадает");
    }

    @Test(priority = 102)//убрать Thread.sleep и добавить человеческое добавление файла
    public void FillingFieldsWithOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---Тест#41 Проверка на заполнение формы Добавить пользователя при пограничном значении (1 символ)--");
        String title = (new IndexPageScreen(driver)).NewUserScreen().fillingFieldsWithOneSymbol();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_WINDOW_XPATH,title,"Title не совпадает");
    }

    *//*@Test(priority = 103)//закомментирован
    public void BoundaryValues() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---Тест#42 Проверка на заполнение формы Добавить пользователя при пограничном значении (1 символ)--");
        String title = (new IndexPageScreen(driver)).NewUserScreen().boundaryValues();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_WINDOW_XPATH,title,"Title не совпадает");
    }*//*

     @Test(priority = 104)
    public void DotEmailBegin() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--------------Тест#43 Проверка на внесение спец. символа . в поле Email первым символом------------");
        (new IndexPageScreen(driver)).NewUserScreen().dotEmailBegin();

         try {
             log.info("Проверяем подсвечивается ли элемент красным");
             assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
         } catch (ElementNotFound e) {
             log.info("Элемент не найден");
         }
         finally {
             driver.findElement(By.xpath(EXIT)).click();
         }
    }

    @Test(priority = 105)
    public void DotEmailEnd() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------------Тест#44 Проверка на внесение спец. символа . в поле Email последним символом----------");
        (new IndexPageScreen(driver)).NewUserScreen().dotEmailEnd();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 106)//убрать Thread.sleep и добавить человеческое добавление файла
    public void UseSpecialSymbolsInEmail() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------------------Тест#45 Проверка на внесение спец. символа в поле Email----------------------");
        String title = (new IndexPageScreen(driver)).NewUserScreen().useSpecialSymbolsInEmail();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(WARNING_WINDOW_XPATH,title,"Title не совпадает");
    }

    @Test(priority = 107)
    public void DoubleDotEmail() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------------Тест#46 Проверка на внесение спец. символов .. в поле Email  два и более раз----------");
        (new IndexPageScreen(driver)).NewUserScreen().doubleDotEmail();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 108)
    public void VerifyEmailIncorrectSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----------------------Тест#47 Проверка внесения символа @ в поля для ввода------------------------");
        (new IndexPageScreen(driver)).NewUserScreen().verifyEmailIncorrectSymbol();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 109)
    public void BirthDayAfterToday() throws IOException, SQLException, InterruptedException, AWTException {//Убрать String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------Тест#48 Проверка заполнения поля Дата рождения датой позднее текущей----------------");
        (new IndexPageScreen(driver)).NewUserScreen().birthDayAfterToday();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 110)
    public void UseRusSymbolsInEmail() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("------------------------------Тест#49 Проверка заполнения поля email-------------------------------");
        (new IndexPageScreen(driver)).NewUserScreen().useRusSymbolsInEmail();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 111)
    public void NoFillingFieldOrgId() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#46 Проверка перехода на следующую страницу при не заполненном поле Код организации-------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingFieldOrgId();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 112)
    public void NoFillingFieldInventory() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#47 Проверка перехода на следую страницу при не заполненном поле Инвентарный номер--------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingFieldInventory();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 113)
    public void NoFillingFieldFormObj() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("--------Тест#48 Проверка перехода на следую страницу при не заполненном поле Вид объекта-----------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingFieldFormObj();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 114)
    public void NoFillingFieldObjAddress() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-------Тест#49 Проверка перехода на следую страницу при не заполненном поле Адрес объекта----------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingFieldObjAddress();

        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 115)//убрать Thread.sleep
    public void NoFillingFieldDocPage() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("----------Тест#50 Проверка наличия элементов на странице Документы в Журнале пользователя----------");
        (new IndexPageScreen(driver)).documentScreen().noFillingFieldDocPage();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 116)//убрать Thread.sleep и добавить человеческое добавление файла
    public void UseIncorrectJobsTitle() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------------------Тест#51 Заполнение поля Должность---------------------------------");
        String title = (new IndexPageScreen(driver)).NewUserScreen().useIncorrectJobsTitle();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(JOBS_TITLE,title,"Title не совпадает");
    }

    @Test(priority = 117)
    public void UseCorrectSimbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#52 Проверка заполнения полей Фамилия, Имя, Отчество текстом с маленькой буквы на странице Субъект в добавлении нового заказа в Журнал заказов--------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().useCorrectSimbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 118)
    public void UseCorrectSmallSimbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#53 Проверка заполнеия полей фамилия, имя, отчество текстом с маленькой буквы на странице Субъект в добавлении нового заказа в Журнал заказов--------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().useCorrectSmallSimbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 119)
    public void verifyCheckBox() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#54 Проверка наличия Check box Нет возле поля Отчество на странице Субъект в добавлении нового заказа в Журнал заказов--------");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyCheckBox();

    }

    @Test(priority = 120)//убрать Thread.sleep
    public void useIncorrectSimbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#55 Проверка заполнения полей Фамилия, Имя, Отчество с использованием спец.символов  на странице Субъект в добавлении нового заказа в Журнал заказов");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().useIncorrectSimbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 121)
    public void MinValueSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("-----Тест#56 Проверка заполнения полей Фамилия, Имя, Отчество Кем выдан,  с минимальной длиной строки(1 символ)--------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().minValueSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 122)//убрать Thread.sleep
    public void BirthBeforeToday() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#56 Проверка заполнения полей Дата рождения, Когда выдан, Действителен до  датой позже текущей");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().birthBeforeToday();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }


    @Test(priority = 123)//убрать Thread.sleep
    public void useLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#57 Проверка заполнения полей Фамилия, Имя, Отчество с использованием спец.символов  на странице Субъект в добавлении нового заказа в Журнал заказов");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().useLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 124)//убрать Thread.sleep
    public void NoFillingPersonalNumberNationalityRB() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#58 Проверка связи между полем Идентификационный номер и полем Гражданство для граждан РБ в форме Субъект");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingPersonalNumberNationalityRB();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 125)//убрать Thread.sleep
    public void NoFillingPersonalNumberNationalityAnother() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#58 Проверка связи между полем Идентификационный номер и полем Гражданство для граждан другой страны в форме Субъект");
        String title =(new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingPersonalNumberNationalityAnother();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 126)//убрать Thread.sleep
    public void BirthActualBeforeToday() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#59 Проверка заполнения поля Действителен до на странице Заявитель, Физическое лицо датой предшествующей настоящей");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().birthActualBeforeToday();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 127)//убрать Thread.sleep
    public void CorrectIdentificationNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#60 Проверка заполнения поля Идентификационный номер по форме");
        String title =(new IndexPageScreen(driver)).verifyElemNewSubjScreen().correctIdentificationNumber();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 128)//убрать Thread.sleep ДОБАВИТЬ XPATH
    public void correctIdentificationNumberWithMessage() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#61 Проверка появления сообщения  Возможно  Идентификационный номер внесен неверно, перейти к следующей форме?");
        String text =(new IndexPageScreen(driver)).verifyElemNewSubjScreen().correctIdentificationNumberWithMessage();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, text, "Title страниц не совпадает");
    }

    @Test(priority = 129)//убрать Thread.sleep
    public void VerifyOneSymbolDesignationField() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#62 Проверка заполнения поля Полное наименование  мин. длиной 1 символ  на странице Субъект в форме заявитель Юридическое лицо");
        String text =(new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyOneSymbolDesignationField();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, text, "Title страниц не совпадает");
    }

    @Test(priority = 130)//убрать Thread.sleep
    public void FillingRegDayAfrterToDay() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#63 Проверка заполнения поля Дата регистрации позднее текущей на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fillingRegDayAfrterToDay();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 131)//убрать Thread.sleep
    public void VerifyLatinSymbolDesignationField() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#63 Проверка заполнения поля Полное наименование  латинскими буквами  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyLatinSymbolDesignationField();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 132)//убрать Thread.sleep
    public void VerifySpecialSymbolDesignationField() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#64 Проверка заполнения поля Полное наименование спец.символами  на странице Субъект в форме заявитель Юридическое лицо");
        String text =(new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifySpecialSymbolDesignationField();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, text, "Title страниц не совпадает");
    }

    @Test(priority = 133)//убрать Thread.sleep
    public void Verify8SymbolsRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#65 Проверка заполнения поля Номер регистрациии 8 цифр на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verify8SymbolsRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 134)//убрать Thread.sleep
    public void Verify10SymbolsRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#66 Проверка заполнения поля Номер регистрациии 10 цифр на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verify10SymbolsRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 135)//убрать Thread.sleep
    public void VerifyLatinSymbolsRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#67 Проверка заполнения поля Номер регистрации латинскими буквами на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyLatinSymbolsRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 136)//убрать Thread.sleep
    public void VerifyRusSymbolsRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#68 Проверка заполнения поля Номер регистрации   русскими буквами  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyRusSymbolsRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 137)//убрать Thread.sleep
    public void VerifySpaceSymbolRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#69 Проверка заполнения поля Номер регистрации с использованием пробела  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifySpaceSymbolRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 138)//убрать Thread.sleep
    public void VerifySpecialSymbolRegNumber() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#70 Проверка заполнения поля Номер регистрации спец.символов на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifySpecialSymbolRegNumber();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 139)//убрать Thread.sleep
    public void Verify8SymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#71 Проверка заполнения поля УНП 8 цифр  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verify8SymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 140)//убрать Thread.sleep
    public void Verify10SymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#72 Проверка заполнения поля УНП 10 цифр  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verify10SymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 141)//убрать Thread.sleep
    public void VerifyRusSymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#73 Проверка заполнения поля УНП русскими буквами  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyRusSymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 142)//убрать Thread.sleep
    public void VerifyLatinSymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#74 Проверка заполнения поля УНП латинскими буквами  на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyLatinSymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 143)//убрать Thread.sleep
    public void VerifySorcialSymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#75 Проверка заполнения поля УНП со спец.символами на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifySpecialSymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 144)//убрать Thread.sleep
    public void verifySpaceSymbolUnp() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#76 Проверка заполнения поля УНП с пробелами на странице Субъект в форме заявитель Юридическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifySpaceSymbolUnp();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 145)//убрать Thread.sleep
            public void useLatinSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
                log.info("-------------------------------------Журнал Заказов------------------------------------------------");
                log.info("Тест#76 Проверка заполнения поля Полное наименование латинскими буквами  на странице Субъект в форме заявитель ИП");
                (new IndexPageScreen(driver)).verifyElemNewSubjScreen().useLatinSymbolsIP();
                try {
                    log.info("Проверяем подсвечивается ли элемент красным");
                    assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
                } catch (ElementNotFound e) {
                    log.info("Элемент не найден");
                }
                finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 146)
    public void FullNameSpecialSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#77 Проверка заполнения поля Полное наименование спец.символами  на странице Субъект в форме заявитель ИП");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameSpecialSymbolsIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 147)
    public void FullNameOneSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#78 Проверка заполнения поля Полное наименование мин. длиной 1 символ  на странице Субъект в форме заявитель ИП");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameOneSymbolsIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 148)//убрать Thread.sleep
    public void Unp8SymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#79 Проверка заполнения поля УНП 8 цифр  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp8SymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 149)//убрать Thread.sleep
    public void Unp10SymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#80 Проверка заполнения поля УНП 10 цифр  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp10SymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 150)//убрать Thread.sleep
    public void UnpRusSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#80 Проверка заполнения поля УНП русскими буквами  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpRusSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 151)//убрать Thread.sleep
    public void UnpLatinSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#81 Проверка заполнения поля УНП латинскими буквами  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpLatinSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 152)//убрать Thread.sleep
    public void UnpSpecialSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#82 Проверка заполнения поля УНП со спец.символами на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpSpecialSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 153)//убрать Thread.sleep
    public void UnpSpaceSymbolIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#83 Проверка заполнения поля УНП  с пробелами на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpSpaceSymbolIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 154)//убрать Thread.sleep
    public void NumRegField8SymbolIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#84 Проверка заполнения поля Номер регистрациии 8 цифр на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegField8SymbolIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 155)//убрать Thread.sleep
    public void NumRegField10SymbolIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#84 Проверка заполнения поля Номер регистрациии 10 цифр на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegField10SymbolIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 156)//убрать Thread.sleep
    public void NumRegFieldLatinSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#85 Проверка заполнения поля Номер регистрации латинскими буквами на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegFieldLatinSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 157)//убрать Thread.sleep
    public void NumRegFieldRusSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#86 Проверка заполнения поля Номер регистрации русскими буквами  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegFieldRusSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 158)//убрать Thread.sleep
    public void NumRegFieldSpaceSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#87 Проверка заполнения поля Номер регистрации с использованием пробела  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegFieldSpaceSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 159)//убрать Thread.sleep
    public void NumRegSpecialSymbolsIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#88 Проверка заполнения поля Номер регистрации с спец.символов  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().numRegSpecialSymbolsIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 160)//убрать Thread.sleep
    public void RegDayAfterToDayIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#89 Проверка заполнения поля Дата регистрации позднее текущей  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regDayAfterToDayIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 161)//убрать Thread.sleep
    public void BirthDayAfterToDayIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#90 Проверка заполнения поля Дата рождения позднее текущей  на странице Субъект в форме заявитель ИП");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().birthDayAfterToDayIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 162)
    public void NameLastNPatromicFieldsRepresentFizSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#91 Спец.символы в полях Имя, Фамилия, Отчество на закладке Представитель Физ.лицо");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizSpecialSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 163)
    public void ТameLastNPatromicFieldsRepresentFizSmallSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#92 Спец.символы small symbols в полях Имя, Фамилия, Отчество на закладке Представитель Физ.лицо");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizSmallSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 164)
    public void VerifyCheckBoxRepresentFiz() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#93 Проверка наличия Check box Нет возле поля Отчество на странице Субъект в добавлении нового заказа в Журнал заказов на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().verifyCheckBoxRepresentFiz();
    }

    @Test(priority = 165)//убрать Thread.sleep
    public void NameLastNPatromicFieldsRepresentFizSpecialsSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#94 Проверка заполнения полей Фамилия, Имя, Отчество с использованием спец.символов  на странице Субъект в добавлении нового заказа в Журнал заказов на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizSpecialsSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 166)//убрать Thread.sleep
    public void NameLastNPatromicFieldsRepresentFizNumericSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#94 Проверка заполнения полей Фамилия, Имя, Отчество с использованием цифр  на странице Субъект в добавлении нового заказа в Журнал заказов на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizNumericSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 167)
    public void NameLastNPatromicFieldsRepresentFizOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#95 Проверка заполнения полей Фамилия, Имя, Отчество Кем выдан, с минимальной длиной строки(1 символ)  на страницеСубъект в добавлении нового заказа в Журнал заказов на закладке Представитель Физическое лицо");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 168)//убрать Thread.sleep
    public void NameLastNPatromicFieldsRepresentFizLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#96 Проверка заполнения полей Фамилия, Имя, Отчество Кем выдан, латинскими буквами на странице Субъект в добавлении нового заказа в Журнал заказов на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().nameLastNPatromicFieldsRepresentFizLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 169)//убрать Thread.sleep
    public void BirthWhenIsUserFieldsRepresentFizDayAfterToday() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#97 Проверка заполнения полей Дата рождения, Когда выдан, датой позже текущей на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().birthWhenIsUserFieldsRepresentFizDayAfterToday();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 170)//убрать Thread.sleep
    public void NoFillingPersonalNumberNationalityRBRepresentFiz() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#98 Проверка связи между полем Идентификационный номер и полем Гражданство для граждан РБ в форме Субъект на закладке Представитель Физическое лицо");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().noFillingPersonalNumberNationalityRBRepresentFiz();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 171)//убрать Thread.sleep
    public void FillingIsValidDayAfterToDayRepresentFiz() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#99 Проверка заполнения поля Действителен до на странице Представитель, Физическое лицо датой предшествующей настоящей");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fillingIsValidDayAfterToDayRepresentFiz();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 172)
    public void PersonalNumberValidDataRepresentFiz() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------Тест#100 Проверка заполнения поля Идентификационный номер по форме------------------");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().personalNumberValidDataRepresentFiz();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 173)//убрать Thread.sleep
    public void FullNameLatinSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#101 Проверка заполнения поля Полное наименование латинскими буквами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameLatinSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 174)
    public void FullNameSpecialValidSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#102 Проверка заполнения поля Полное наименование спец.символами  на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameSpecialValidSymbolsRepresentUR();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 175)
    public void FullNameOneSymbolRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#103 Проверка заполнения поля Полное наименование мин. длиной 1 символ на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameOneSymbolRepresentUR();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 176)//убрать Thread.sleep
    public void RegDateAfterTodayRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#104 Проверка заполнения поля Дата регистрации позднее текущей  на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regDateAfterTodayRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 177)//убрать Thread.sleep
    public void RegNum8SymbolRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#105 Проверка заполнения поля Номер регистрациии 8 цифр на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNum8SymbolRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 178)//убрать Thread.sleep
    public void RegNum10SymbolRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#106 Проверка заполнения поля Номер регистрациии 10 цифр на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNum10SymbolRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 179)//убрать Thread.sleep
    public void RegNumLatinSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#107 Проверка заполнения поля Номер регистрациии латинскимим символами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumLatinSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 180)//убрать Thread.sleep
    public void RegNumRusSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#108 Проверка заполнения поля Номер регистрациии русскими символами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumRusSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 181)//убрать Thread.sleep
    public void RegNumSpaceSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#109 Проверка заполнения поля Номер регистрациии с использованием пробела на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumSpaceSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 182)//убрать Thread.sleep
    public void RegNumSpecialSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#110 Проверка заполнения поля Номер регистрации с спец.символов  на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumSpecialSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 183)//убрать Thread.sleep
    public void Unp8SymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#111  Проверка заполнения поля УНП 8 цифр на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp8SymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 184)//убрать Thread.sleep
    public void Unp10SymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#112  Проверка заполнения поля УНП 10 цифр на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp10SymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 185)//убрать Thread.sleep
    public void UnpRusSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#113  Проверка заполнения поля УНП русскими символами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpRusSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 186)//убрать Thread.sleep
    public void UnpLatinSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#114 Проверка заполнения поля УНП латинскими символами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpLatinSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 187)//убрать Thread.sleep
    public void UnpSpecialSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#115 Проверка заполнения поля УНП спец. символами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpSpecialSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 188)//убрать Thread.sleep
    public void UnpSpaceSymbolsRepresentUR() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#116 Проверка заполнения поля УНП с пробелами на странице Субъект в форме заявитель Юридическое лицо на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpSpaceSymbolsRepresentUR();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 189)//убрать Thread.sleep - !!!!Проверить
    public void FullNameLatinSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#117 Проверка заполнения поля Полное наименование латинскими буквами  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameLatinSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 190)// !!!!Проверить
    public void FullNameSpecialValidSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#118 Проверка заполнения поля Полное наименование спец.символами  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameSpecialValidSymbolsRepresentIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 191)// !!!!Проверить
    public void FullNameOneSymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#119  Проверка заполнения поля Полное наименование  мин. длиной 1 символ  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().fullNameOneSymbolRepresentIP();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OBJECT_ORDER, title, "Title страниц не совпадает");
    }

    @Test(priority = 192)// !!!!Проверить
    public void Unp8SymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#120 Проверка заполнения поля УНП  8 цифр  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp8SymbolRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 193)// !!!!Проверить
    public void Unp10SymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#121 Проверка заполнения поля УНП  10 цифр  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unp10SymbolRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 194)// !!!!Проверить
    public void UnpRusSymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#122 Проверка заполнения поля УНП  русскими буквами  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpRusSymbolRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 195)// !!!!Проверить
    public void UnpLatinSymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#123 Проверка заполнения поля УНП  латинскими символами  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpLatinSymbolRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 196)// !!!!Проверить
    public void UnpInvalidSpecialSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#124 Проверка заполнения поля УНП со спец.символами на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpInvalidSpecialSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 197)// !!!!Проверить
    public void UnpSpaceSymbolRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#125 Проверка заполнения поля УНП с пробелами на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().unpSpaceSymbolRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 198)// !!!!Проверить
    public void RegNumber8SymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#126 Проверка заполнения поля Номер регистрациии 8 цифр на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumber8SymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

     @Test(priority = 199)// !!!!Проверить
    public void RegNumber10SymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#127 Проверка заполнения поля Номер регистрациии 10 цифр на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumber10SymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

     @Test(priority = 200)// !!!!Проверить
    public void RegNumberLatinSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#128 Проверка заполнения поля Номер регистрациии латинскими символами на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumberLatinSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

     @Test(priority = 201)// !!!!Проверить
    public void RegNumberRusSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#129 Проверка заполнения поля Номер регистрациии русскими символами на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumberRusSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

     @Test(priority = 202)// !!!!Проверить
    public void RegNumberSpaceSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#130 Проверка заполнения поля Номер с пробелом на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumberSpaceSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 203)// !!!!Проверить
    public void RegNumberSpecialSymbolsRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#131 Проверка заполнения поля Номер со спец.символами на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().regNumberSpecialSymbolsRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 204)// !!!!Проверить
    public void IcorrectRegDateRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#132 Проверка заполнения поля Дата регистрации позднее текущей  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().icorrectRegDateRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 205)// !!!!Проверить
    public void IcorrectBirthDateRepresentIP() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#133 Проверка заполнения поля Дата рождения позднее текущей  на странице Субъект в форме заявитель ИП на вкладке Представитель");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().icorrectBirthDateRepresentIP();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 206)// !!!!Проверить
    public void FilingInventoryNumWithText() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#134 Проверка заполнения поля Инвентарный номер данными содержащими текст  на странице Информация об объекте");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingInventoryNumWithText();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 207)// !!!!Проверить
    public void FilingInventoryNumWith7Text() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#135 Проверка заполнения поля Инвентарный номер 7 цифрами  на странице Информация об объекте");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingInventoryNumWith7Text();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 208)// !!!!Проверить
    public void FilingInventoryNumWith9Text() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#136 Проверка заполнения поля Инвентарный номер 9 цифрами  на странице Информация об объекте");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingInventoryNumWith9Text();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 209)// !!!!Проверить
      public void FilingInventoryNumWithSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#137 Проверка заполнения поля Инвентарный номер данными содержащими спец.символы  на странице Информация об объекте");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingInventoryNumWithSpecialSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 210)// !!!!Проверить
    public void FilingObjectNameIncorrectSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#138 Проверка заполнения поля Наименование объекта данными содержащими спец.символы на странице Информация об объекте в Журнале заказов");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingObjectNameIncorrectSpecialSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 211)// !!!!Проверить
    public void FilingObjectNameCorrectSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#139 Проверка заполнения поля Наименование объекта данными содержащими спец.символы на странице Информация об объекте в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingObjectNameCorrectSpecialSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_DOCUMENT_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 212)// !!!!Проверить
    public void FilingObjectNameOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#140 Проверка заполнения поля Наименование объекта данными содержащими только один символ на странице Информация об объекте в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingObjectNameOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_DOCUMENT_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 213)// !!!!Проверить
    public void FilingObjectNameLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#141 Проверка заполнения поля Наименование объекта данными содержащими буквы латинского алфавита на странице Информация об объекте в Журнале заказов");
        (new IndexPageScreen(driver)).verifyElemNewSubjScreen().filingObjectNameLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 214)// !!!!Проверить
    public void FillingDocNameWithLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#142 Проверка заполнения поля Наименование данными содержащими буквы латинского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingDocNameWithLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 215)// !!!!Проверить
    public void FillingDocNameWithIncorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#143 Проверка заполнения поля Наименование данными содержащими спец.символы на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingDocNameWithIncorrectSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 216)// !!!!Проверить
    public void FillingDocNameWithCorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#144 Проверка заполнения поля Наименование данными содержащими буквы русского алфавита, цифры, пробелы, символ №, ( ), тире (только в середине текста) на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingDocNameWithCorrectSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 217)// !!!!Проверить
    public void FillingDocNameWithOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#145 Проверка заполнения поля Наименование данными содержащими один символ на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingDocNameWithOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 218)// !!!!Проверить
    public void FillingOrgLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#146 Проверка заполнения поля Организация данными содержащими буквы латинского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingOrgLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 219)// !!!!Проверить
    public void FillingOrgIncorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#147 Проверка заполнения поля Организация данными содержащими спец.символы на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingOrgIncorrectSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 220)// !!!!Проверить
    public void FillingOrgCorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#148 Проверка заполнения поля Организация данными содержащими буквы русского алфавита, цифры, пробелы, символ №, ( ), тире (только в середине текста) на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingOrgCorrectSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 221)// !!!!Проверить
    public void FillingOrgOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#148 Проверка заполнения поля Организация данными содержащими один символ на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingOrgOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 222)// !!!!Проверить
    public void FillingDateAfterToday() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#149 Проверка заполнения поля Дата датой позднее текущей на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingDateAfterToday();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 223)// !!!!Проверить
    public void FillingNumberLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#150 Проверка заполнения поля Номер данными содержащими буквы латинского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingNumberLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 224)// !!!!Проверить
    public void FillingNumberRusSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#151 Проверка заполнения поля Номер данными содержащими буквы русского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingNumberRusSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 225)// !!!!Проверить
    public void FillingNumberSpaceSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#152 Проверка заполнения поля Номер данными содержащими пробелы на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingNumberSpaceSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 226)// !!!!Проверить
    public void FillingNumberSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#153 Проверка заполнения поля Коментарий к документу данными содержащими буквы латинского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingNumberSpecialSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 227)// !!!!Проверить
    public void FillingCommentLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#154 Проверка заполнения поля Коментарий к документу данными содержащими буквы латинского алфавита на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingCommentLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 228)// !!!!Проверить
    public void FillingCommentIncorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#155 Проверка заполнения поля Коментарий к документу данными содержащими спец.символы на странице Документы в Журнале заказов");
        (new IndexPageScreen(driver)).documentScreen().fillingCommentIncorrectSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 229)// !!!!Проверить
    public void FillingCommentCorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#156 Проверка заполнения поля Коментарий к документу данными содержащими буквы русского алфавита, цифры, пробелы, символ №, ( ), тире (только в середине текста) на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingCommentCorrectSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 230)// !!!!Проверить
    public void FillingCommentOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#157 Проверка заполнения поля Коментарий к документу данными содержащими один символ на странице Документы в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).documentScreen().fillingCommentOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Title страниц не совпадает");
    }

    @Test(priority = 231)// !!!!Проверить
    public void FilingDoingDateBeforeToday() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#158 Проверка заполнения поля Выполнить до датой ранее текущей на странице Операция в Журнале заказов");
        (new IndexPageScreen(driver)).operationScreen().filingDoingDateBeforeToday();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 232)// Удалить закрытие ошибки
    public void NoFilingExAndChecking() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#159 Проверка сохранения при не заполненных полях dropdown(с фамилией исполнителя и проверяющего) на странице Операция в Журнале заказов");
        (new IndexPageScreen(driver)).operationScreen().noFilingExAndChecking();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 233)// Удалить закрытие ошибки
    public void FilingCommentLatinSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#160 Проверка заполнения поля Примечание данными содержащими буквы латинского алфавита на странице Операция в Журнале заказов");
        (new IndexPageScreen(driver)).operationScreen().filingCommentLatinSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 234)// Удалить закрытие ошибки
    public void FilingCommentIncorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#161 Проверка заполнения поля Примечание данными содержащими спец.символы на странице Операция в Журнале заказов");
        (new IndexPageScreen(driver)).operationScreen().filingCommentIncorrectSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 235)// !!!!Проверить
    public void FilingCommentCorrectSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#162 Проверка заполнения поля Примечание данными содержащими буквы русского алфавита, цифры, пробелы, символ №, ( ), тире (только в середине текста) на странице Операция в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).operationScreen().filingCommentCorrectSymbols();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(GO_TO_JOURNAL_ORDER_XPATH, title, "Title страниц не совпадает");
    }

    @Test(priority = 236)// !!!!Проверить
    public void FilingCommentOneSymbol() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#163 роверка заполнения поля Примечание данными содержащими один символ на странице Операция в Журнале заказов");
        String title =  (new IndexPageScreen(driver)).operationScreen().filingCommentOneSymbol();
        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(GO_TO_JOURNAL_ORDER_XPATH, title, "Title страниц не совпадает");
    }

    // Тесты которые идут на http://localhost:8080/signin.html необходимо поменять на "http://nka_rh:8080/";

    @Test(priority = 237)
    public void VerifyTitleComponentsPartScreen() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("--------------------------Тест#1 Проверка открытия Составные части---------------------------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleComponetsPartScreen();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Элементы на странице составные части");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(COMPONENT_PART_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 238)
    public void VerifyElementsOnComponetsPartScreen() throws IOException, SQLException, InterruptedException{
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("--------------------------Тест#2 Проверка наличия элементов  на странице Составные части---------------------------------");
        List<String> btnLang = (new IndexPageScreen(driver)).componetsPartScreen().verifyElementsOnComponetsPartScreen();

        String dataResult = "";
        for (int i = 0; i < btnLang.size(); i++) {
            dataResult = dataResult + btnLang.get(i) + " ";
        }

        List<String> btnLangCheck = new ArrayList<String>(Arrays.asList(new String[]{OPERATIONS_BTN_XPATH,OVERALL_BTN_XPATH,COST_BTN_XPATH,
                COMPONET_PART_BTN_XPATH,BEAUTIFICATION_BTN_XPATH,RESIDENTIAL_ROOMS_BTN_XPATH,ADD_BTN_XPATH,DELETE_BTN_XPATH}));
        int i = 0;
        List<String> btnLangCheckResult = new ArrayList<String>();
        for (String bl: btnLang) {
            boolean w = bl.equals(btnLangCheck.get(i));
            if (!w) {
                btnLangCheckResult.add(bl);
                btnLangCheckResult.add(btnLangCheck.get(i));
            }
            i++;
        }

        if (btnLangCheckResult.size() > 0) {
            log.info("ВСЕ ДАННЫЕ МАССИВА btnLangCheckResult: " + btnLangCheckResult);
        }

        driver.findElement(By.xpath(EXIT)).click();

    }

    @Test(priority = 239)
    public void VerifyTitleStandartTree() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#3 Проверка открытия Эталонного дерева на странице Составные части-------------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleStandartTree();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Эталонное дерево");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(STANDART_TREE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 241)
    public void VerifyTitleOperationPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("---------Тест#4 Проверке перехода со страницы Составные части на страницу Операции-----------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleOperationPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Операция");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(OPERATION_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 242)
    public void VerifyTitleOverAllPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("---------Тест#5 Проверке перехода со страницы Составные части на страницу Общие-----------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleOverAllPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Общие");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(OVER_ALL_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 243)
    public void VerifyTitleCostPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("---------Тест#6 Проверке перехода со страницы Составные части на страницу Стоимости----------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleCostPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Стоимости");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(COST_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 244)
    public void VerifyTitleBeautificationPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-------Тест#7 Проверке перехода со страницы Составные части на страницу Благоустройство------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleBeautificationPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Благоустройство");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(BEAUTIFICATION_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 245)
    public void VerifyTitleResidentialPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-------Тест#8 Проверке перехода со страницы Составные части на страницу Жилые помещения-------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleResidentialPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Жилые помещения");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(RESIDENTIAL_ROOMS_TITLE, title, "TITLE страниц не совпадают");
    }

    *//*@Test(priority = 246) !!!!!!!!!!!!! Пока что ошибка
    public void VerifyTitleJournalPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-------Тест#9 Проверке перехода со страницы Составные части на страницу Журнал заказов-------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleJournalPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Журнал заказов");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(GO_TO_JOURNAL_ORDER_XPATH, title, "TITLE страниц не совпадают");
    }*//*

    *//*@Test(priority = 247) !!!!!!!!!!!!! Пока что ошибка
    public void VerifyTitleModuleSearchPage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----Тест#10 Проверке перехода со страницы Составные части на страницу Поиск и просмотр объекта------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleModuleSearchPage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Поиск и просмотр объекта");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(SEARCH_TITLE, title, "TITLE страниц не совпадают");
    }*//*

    *//*@Test(priority = 248) !!!!!!!!!!!!! Пока что ошибка
    public void VerifyTitleKnowBasePage() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#11 Проверке перехода со страницы Составные части на страницу База знаний------------");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyTitleKnowBasePage();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("База знаний");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(KNOW_BASE_TITLE, title, "TITLE страниц не совпадают");
    }*//*

    @Test(priority = 249)
    public void VerifyCanNotDelStandartTree() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-----------------Тест#12 Проверка не удаления коренного дерева Составные части---------------------");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyCanNotDelStandartTree();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Дерево не удалено");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 250)
    public void VerifyAddBranchOnStandartTree() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-------------------Тест#13 Проверка добавления ветки в дерево Составные части----------------------");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyAddBranchOnStandartTree();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст не найден");
    }

    @Test(priority = 251)
    public void VerifyDeleteBranchOnStandartTreeWoSaving() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("-------------------Тест#14 Проверка удаления ветки в дерево Составные части----------------------");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyDeleteBranchOnStandartTreeWoSaving();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(NULL_TEXT, result, "Текст найден");
    }

    @Test(priority = 252)
      public void VerifyDeleteBranchOnStandartTreeWithSaving() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#15 Проверка удаления ветки в дереве Составные части при  сохранненой информации-----");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyDeleteBranchOnStandartTreeWithSaving();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(NULL_TEXT, result, "Текст найден");
    }

    @Test(priority = 253)
    public void VerifyNotSaveBranchWithNotSavedInfo() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#16 Проверка не сохранения ветки при переходе на другую страницу при не сохраненной информации в ней на странице Составные части-----");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyNotSaveBranchWithNotSavedInfo();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(NULL_TEXT, result, "Текст найден");
    }

    @Test(priority = 254)
    public void VerifySaveBranchWithSavedInfo() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#17 Проверка  сохранения ветки при переходе на другую страницу при  сохраненной информации в ней на странице Составные части-----");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifySaveBranchWithSavedInfo();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 255)
    public void VerifyDateCorrectDate() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("----------Тест#18 Проверка заполнения поля Дата ввода в эксплуатацию и Год постройки идеальне данные-----");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyDateCorrectDate();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 256)
    public void VerifyTodayDate() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("--------Тест#19 Проверка заполнения поля Дата ввода в эксплуатацию и Год постройки текущей датой---");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyTodayDate();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 257)// Проверить
    public void verifyAfterTodayDate() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#20 Проверка заполнения поля Дата ввода в эксплуатацию и Год постройки датой позднее текущей");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyAfterTodayDate();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//div[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 258)//Проверить
    public void VerifyBorderDate() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#21 Проверка заполнения поля Дата ввода в эксплуатацию и Год постройки пограничной датой 01.01.1500г.---");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyBorderDate();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 259)// Проверить
    public void VerifyBeforeBorderDate() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#22 Проверка заполнения поля Дата ввода в эксплуатацию и Год постройки датой до 01.01.1500г.");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyBeforeBorderDate();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 260)// Проверить
    public void VerifyFillingVAndSFraction() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#23 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части дробью");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSFraction();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 261)//Проверить
    public void VerifyFillingVAndSCorrect() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#24 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части идеальными данными");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSCorrect();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 262)// Проверить
    public void VerifyFillingVAndSLatin() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#25 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части латинскими буквами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSLatin();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 263)// Проверить
    public void VerifyFillingVAndSRus() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#26 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части русскими буквами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSRus();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 264)// Проверить
    public void VerifyFillingVAndSSpecialSymbols() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#27 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части спец.символами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSSpecialSymbols();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 265)//Проверить
    public void VerifyFillingVAndSCorrectBorder() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#28 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части нижнее пограничное значение");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSCorrectBorder();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 266)// Проверить
    public void VerifyFillingVAndSNegative() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#29 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части отрицательное число");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSNegative();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 267)//Проверить
    public void VerifyFillingVAndSCorrectBorderTop() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#30 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части верхнее пограничное значение");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSCorrectBorderTop();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 268)// Проверить
    public void verifyFillingVAndSIncorrectBorderTop() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#31 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части более верхнего пограничного значения");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingVAndSIncorrectBorderTop();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 269)// Проверить
    public void VerifyFillingDeteriorationFraction1() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#32 Проверка не заполнения поля Физический износ дробным числом");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationFraction1();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 270)// Проверить
    public void VerifyFillingDeteriorationFraction2() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#32_1 Проверка не заполнения поля Физический износ дробным числом");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationFraction2();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 271)//Проверить
    public void VerifyFillingDeteriorationCorrect() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#33 Проверка заполнения поля Наружная площадь и Объем в модуле Составные части верхнее пограничное значение");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationCorrect();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 272)// Проверить
    public void VerifyFillingDeteriorationLatin() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#34 Проверка заполнения поля Физический износ латинскими буквами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationLatin();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 273)// Проверить
    public void VerifyFillingDeteriorationRus() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#34 Проверка заполнения поля Физический износ русскими буквами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationRus();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 274)// Проверить
    public void VerifyFillingDeteriorationSpecialSymb() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#35 Проверка заполнения поля Физический износ спец.символами");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationSpecialSymb();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 275)// Проверить
    public void VerifyFillingDeteriorationNegative() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#35 Проверка заполнения поля Физический износ отрицательным числом");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationNegative();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 276)//Проверить
    public void VerifyFillingDeteriorationCorrectTop() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#36_1 Проверка заполнения поля Физический износ пограничным значением");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationCorrectTop();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 277)//Проверить
    public void VerifyFillingDeteriorationCorrectLower() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#36_2 Проверка заполнения поля Физический износ пограничным значением");
        String result =(new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationCorrectLower();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(INDIVIDUAL_GARAGE, result, "Текст найден");
    }

    @Test(priority = 278)// Проверить
    public void VerifyFillingDeteriorationBigTop() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#37 Проверка не заполнения поля Физический износ значением больше пограничного");
        (new IndexPageScreen(driver)).componetsPartScreen().verifyFillingDeteriorationBigTop();
        try {
            log.info("Проверяем подсвечивается ли элемент красным");
            assertNotNull(driver.findElement(By.xpath("//td[@class = 'has-error']")));
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            driver.findElement(By.xpath(EXIT)).click();
        }
    }

    @Test(priority = 279)//Webelement and String
    public void VerifyTableElementsComponetGarage() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("Тест#38 Проверка наличия основных характеристик в ветке Индивидуальный гараж в модуле Составные части");
        List<String> btnLang = (new IndexPageScreen(driver)).componetsPartScreen().verifyTableElementsComponetGarage();

        String dataResult = "";
        for (int i = 0; i < btnLang.size(); i++) {
            dataResult = dataResult + btnLang.get(i) + " ";
        }

        List<String> btnLangCheck = new ArrayList<String>(Arrays.asList(new String[]{USING_DATE,BUILD_YEAR,LITER,SQUARE,V,FIZ_DESTR}));
        int i = 0;
        List<String> btnLangCheckResult = new ArrayList<String>();
        for (String bl: btnLang) {
            boolean w = bl.equals(btnLangCheck.get(i));
            if (!w) {
                btnLangCheckResult.add(bl);
                btnLangCheckResult.add(btnLangCheck.get(i));
            }
            i++;
        }

        if (btnLangCheckResult.size() > 0) {
            log.info("ВСЕ ДАННЫЕ МАССИВА btnLangCheckResult: " + btnLangCheckResult);
        }


        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 280)//Проверить
    public void verifyAddNewCharsetToTree() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#39 Проверка добавления дополнительной характеристики в ветке Индивидуальный гараж в модуле Составные части");
        String title = (new IndexPageScreen(driver)).componetsPartScreen().verifyAddNewCharsetToTree();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(NEW_CHARACTERICTIC, title, "Текст не найден");
    }

    @Test(priority = 0)
    public void VerifyTitleCostScreen() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Стоимости-----------------------------------------------");
        log.info("--------------------------Тест#1 Проверка открытия Стоимости и элементов---------------------------");
        String title = (new IndexPageScreen(driver)).costScreen().verifyTitleCostScreen();
        Thread.sleep(1000);

        PageScreenShot util = new PageScreenShot(driver);
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        util.takeScreenShot("Элементы на странице Стоимости");
        Thread.sleep(1000);

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(COST_TITLE, title, "TITLE страниц не совпадают");
    }

    @Test(priority = 282)//Webelement and String
    public void VerifyTableElementsCost() throws IOException, SQLException, InterruptedException, AWTException {
        log.info("-------------------------------------Журнал Заказов------------------------------------------------");
        log.info("---------------------Тест#2 Проверка наличия полей  на странице Стоимости--------------------------");
        List<String> btnLang = (new IndexPageScreen(driver)).costScreen().verifyTableElementsCost();

        String dataResult = "";
        for (int i = 0; i < btnLang.size(); i++) {
            dataResult = dataResult + btnLang.get(i) + " ";
        }

        List<String> btnLangCheck = new ArrayList<String>(Arrays.asList(new String[]{BASIC_YEAR_LEVEL_COST,VIEW_COST,DEFENITION_DATE,COST,
                CONSERVATION_DATE,DOUMENT_NUMBER,DOUMENT_NAME,ORG_NAME_DOC}));
        int i = 0;
        List<String> btnLangCheckResult = new ArrayList<String>();
        for (String bl: btnLang) {
            boolean w = bl.equals(btnLangCheck.get(i));
            if (!w) {
                btnLangCheckResult.add(bl);
                btnLangCheckResult.add(btnLangCheck.get(i));
            }
            i++;
        }

        if (btnLangCheckResult.size() > 0) {
            log.info("ВСЕ ДАННЫЕ МАССИВА btnLangCheckResult: " + btnLangCheckResult);
        }

        driver.findElement(By.xpath(EXIT)).click();
    }

    @Test(priority = 283)//Проверить
    public void VerifyTitleOper() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#3 Проверке перехода со страницы Стоимости на страницу Операции");
        String title = (new IndexPageScreen(driver)).costScreen().verifyTitleOper();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(TITLE_OPEARTION_PAGE_TITLE, title, "Текст не найден");
    }

    @Test(priority = 284)//Проверить
    public void verifyTitleCom() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#4 Проверке перехода со страницы Стоимости на страницу Общие");
        String title = (new IndexPageScreen(driver)).costScreen().verifyTitleCom();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(OVERALL_BTN_XPATH, title, "Текст не найден");
    }

    @Test(priority = 284)//Проверить
    public void VerifyTitleCompPart() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#5 Проверке перехода со страницы Стоимости на страницу Составные части");
        String title = (new IndexPageScreen(driver)).costScreen().verifyTitleCompPart();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(COMPONENT_PART_TITLE, title, "Текст не найден");
    }

    @Test(priority = 285)//Проверить
    public void VerifyTitleBeautification() throws IOException, SQLException, AWTException, InterruptedException {
        log.info("-------------------------------------Составные части-----------------------------------------------");
        log.info("------Тест#5 Проверке перехода со страницы Стоимости на страницу Благоустройство");
        String title = (new IndexPageScreen(driver)).costScreen().verifyTitleBeautification();

        driver.findElement(By.xpath(EXIT)).click();
        Assert.assertEquals(BEAUTIFICATION_TITLE, title, "Текст не найден");
    }*/




    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @AfterTest
    public static void CC(){
        driver.quit();
    }

}
