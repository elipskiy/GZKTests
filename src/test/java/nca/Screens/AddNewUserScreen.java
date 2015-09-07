package nca.Screens;


import com.codeborne.selenide.ex.ElementNotFound;
import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.MyRandom;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by makovskiy on 13.01.2015.
 */
public class AddNewUserScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    public static final String LAST_NAME_XPATH = "//input[@id='lastName']";
    public static final String NAME_XPATH = "//input[@id='firstName']";
    public static final String PATRONYMIC_XPATH = "//input[@id='patronymic']";
    public static final String PATRONYMIC_CHECKBOX_XPATH = "//input[@id='NoPatronymic']";
    public static final String BIRDTHDATE_XPATH = "//input[@id='birdthDate']";
    public static final String CODE_ORGANIZATION_XPATH = "//input[@id='codeOrganization']";
    public static final String CODE_BTN_ORGANIZATION_XPATH = "//button[@id='viewCode']";
    public static final String POSITION_XPATH = "//div[@id='s2id_position']";
    public static final String LOGIN_XPATH = "//input[@id='login']";
    public static final String ENTER_LOGIN_XPATH = "//input[@id='j_username']";
    public static final String PASSWORD_XPATH = "//input[@id='password']";
    public static final String ENTER_PASSWORD_XPATH = "//input[@id='j_password']";
    public static final String EMAIL_XPATH = "//input[@id='eMail']";

    public static final String ROLE_XPATH = "//select[@id='roleID']";
    public static final String SELECT_ADMIN_USER_XPATH = "//option[@value='ROLE_ADMIN']";
    public static final String SELECT_ROLE_USER_XPATH = "//option[@value='ROLE_USER']";
    public static final String SELECT_ROLE_TELLER_XPATH = "//option[@value='ROLE_TELLER']";
    public static final String SELECT_ROLE_CREATOR_XPATH = "//option[@value='ROLE_CREATOR']";
    public static final String ORGANIZATION_XPATH = "//input[@id='nameOrganization']";
    public static final String SUBVISION_XPATH = "//input[@id='subdivision']";
    public static final String SEARCH_XPATH = "//input[@id='findSTIUser']";
    public static final String CANCEL_XPATH = "//a[@href='journalUsers.html']";
    public static final String CREATE_EDIT_USER_XPATH = "//input[@id='createEditUser']";
    public static final String ADMINISRATION_LINK_XPATH = "//a[@href='journalUsers.html']";
    public static final String ENTER_BTN_XPATH = "//input[@id='submit']";
    public static final String ADD_USER_BTN_XPATH = "//a[@href='createUser.html?oper=create']";
    public static final String SEARCH_USER_BTN_XPATH = "//input[@id='findSTIUser']";


    public static final String RANDOM_STRING_XPATH = "randomstring";

    public static final String SELECT_BIRDTHDATE_XPATH = "//*[contains(text(), '1')]";
    public static final String NEWUSERMESSAGE = "//*[contains(text(), 'Сохранение прошло успешно! Завершить редактирование?')]";

    final static String END_UP_BTN = "//a[@class='btn btn-primary btn-lg active']";
    public static final String WARNING_MESSAGE_XPATH = "//span[@class='ui-dialog-title']";
    public static final String HAS_ERROR_DIV_XPATH = "//div[@class='has-error']";
    public static final String JOB_TITLE_XPATH = "//span[@id='select2-chosen-1']";
    public static final String JOB_TITLE_SEARCH_XPATH = "//input[@id='s2id_autogen1_search']";
    public static final String JOB_TITLE_SEARCH_NOT_FOUND_XPATH = "//li[@class='select2-no-results']";


    AddNewUserScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String verifyAddNewUserScreenTitle(){
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Получаем TITLE Add New User Page");
        String addNewUserPageTitle = wrapper.getPageTitle();
        log.info(String.format("Элемени содержит текст = %s", addNewUserPageTitle));
        return addNewUserPageTitle;
    }

    //******************************************************************************************************************
    public List<String> verifyAddNewUserScreenElements(){
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        log.info("Собираем данные в массив" );
        List<String> elementsOnAddNewUserPage = new ArrayList<String>(15);
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(LAST_NAME_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(NAME_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(PATRONYMIC_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(PATRONYMIC_CHECKBOX_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(BIRDTHDATE_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(CODE_ORGANIZATION_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(CODE_BTN_ORGANIZATION_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(POSITION_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(LOGIN_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(PASSWORD_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(EMAIL_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(ROLE_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(ORGANIZATION_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(SUBVISION_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(SEARCH_XPATH));
        elementsOnAddNewUserPage.add(wrapper.getTextByXpath(CANCEL_XPATH));

        String dataResult = "";
        for (int i = 0; i < elementsOnAddNewUserPage.size(); i++) {
            dataResult = dataResult + elementsOnAddNewUserPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnHeaderAdministrationPage: " + dataResult);

        return elementsOnAddNewUserPage;
    }

    //******************************************************************************************************************
    public String verifyAddNewUserMessageAfterReg() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        Random rand = new Random();
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, MyRandom.generateString(rand, RANDOM_STRING_XPATH, 8));
        wrapper.sendKeysByXpath(NAME_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, "11.10.1986");
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH,"300");
        wrapper.sendKeysByXpath(EMAIL_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.sendKeysByXpath(SUBVISION_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        String addNewUserMessageAfterReg = wrapper.getTextByXpath(NEWUSERMESSAGE);
        return addNewUserMessageAfterReg;

    }

    //******************************************************************************************************************
    public String verifyAddedUserByLogin() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        Random rand = new Random();
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.sendKeysByXpath(NAME_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, "11.10.1986");
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH,"300");
        String emailLogin = MyRandom.generateString(rand, RANDOM_STRING_XPATH, 8) ;
        wrapper.sendKeysByXpath(EMAIL_XPATH, emailLogin);
        wrapper.sendKeysByXpath(SUBVISION_XPATH, MyRandom.generateString(rand,RANDOM_STRING_XPATH,8));
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(5000);
        return emailLogin;
    }

    //******************************************************************************************************************
    public void VerifyMessageAddUserWOData() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
         wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);

    }

    //******************************************************************************************************************
    public void findNoExistUser() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.sendKeysByXpath(LAST_NAME_XPATH,"asdfgh");
        wrapper.sendKeysByXpath(NAME_XPATH,"asdfgh");
        Thread.sleep(5000);
        wrapper.clickByXpath(SEARCH_XPATH);
    }

    //******************************************************************************************************************
    public String addNewUserAdminRole() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        String lastName = "ФамилияАдмин";
        String name = "ИмяАдмин";
        String otchestvo = "ОтчествоАдмин";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";
        String email = "NKARHADMIN";
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        wrapper.sendKeysByXpath(EMAIL_XPATH,email);
        Thread.sleep(6000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(6000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(6000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(60000);
        return email;

    }

    //******************************************************************************************************************
    public String createNewUserRole() throws InterruptedException {
        wrapper.sendKeysByXpath(ENTER_LOGIN_XPATH,"NKARHADMIN");
        String file = "C://In.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(ENTER_PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);

        String lastName = "ФамилияПользователь";
        String name = "ИмяПользователь";
        String otchestvo = "ОтчествоПользователь";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";
        String email = "NKARHUSER";
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        wrapper.sendKeysByXpath(EMAIL_XPATH,email);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ROLE_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        return email;
    }

    //******************************************************************************************************************
    public String createNewManagerRole() throws InterruptedException {
        wrapper.sendKeysByXpath(ENTER_LOGIN_XPATH,"NKARHADMIN");
        String file = "C://In.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(ENTER_PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);

        String lastName = "ФамилияМенеджер";
        String name = "ИмяМенеджер";
        String otchestvo = "ОтчествоМенеджер";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";
        String email = "NKARHMANAGER";
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        wrapper.sendKeysByXpath(EMAIL_XPATH,email);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ROLE_TELLER_XPATH);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        return email;
    }

    //******************************************************************************************************************
    public String createNewManagerCreaterRole() throws InterruptedException {
        wrapper.sendKeysByXpath(ENTER_LOGIN_XPATH,"NKARHADMIN");
        String file = "C://In.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(ENTER_PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);

        String lastName = "ФамилияМенеджерЗаказов";
        String name = "ИмяМенеджер";
        String otchestvo = "ОтчествоМенеджерЗаказов";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";
        String email = "NKARHMANAGERorder";
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        wrapper.sendKeysByXpath(EMAIL_XPATH,email);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ROLE_CREATOR_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        return email;
    }

    //******************************************************************************************************************
    public String usigSpecialSymbols() throws InterruptedException {//Пока что это заглушка для Тест#49
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        wrapper.clickByXpath(SEARCH_XPATH);
        String lastName = "$$$$$$";
        String name = "$$$$$$";
        String otchestvo = "$$$$$$";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "$$$$$$$";
        String email = "$$$$$$$";
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        wrapper.sendKeysByXpath(EMAIL_XPATH,email);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ROLE_CREATOR_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
       String errorMessage = wrapper.getTextByXpath(END_UP_BTN);
        return errorMessage;//Пока что это заглушка для Тест#49
    }

    //******************************************************************************************************************
    public String fillingFieldsWithOneSymbol() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(2000);
        String lastName = "А";
        String name = "Я";
        String otchestvo = "О";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        Random rand = new Random();
        String randomObjName = MyRandom.generateString(rand, "QWERTYUIOPASDFGHJKLZXCVBNM", 1);
        wrapper.sendKeysByXpath(EMAIL_XPATH, randomObjName);

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(2000);
        String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(1000);
        return messageTitle;
    }

    //******************************************************************************************************************
    public String boundaryValues() throws InterruptedException {//Пока закомментирован
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(2000);
        String lastName = "Аааааааааааааррррррррррррррррррррррррррррррррррррррррррррррррррррррччч";
        String name = "Аааааааааааааррррррррррррррррррррррррррррррррррррррррррррррррррррррччч";
        String otchestvo = "Аааааааааааааррррррррррррррррррррррррррррррррррррррррррррррррррррррччч";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        Random rand = new Random();
        String randomObjName = MyRandom.generateString(rand, "QWERTYUIOPASDFGHJKLZXCVBNM", 100);
        wrapper.sendKeysByXpath(EMAIL_XPATH, randomObjName);

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(2000);
        String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(1000);
        return messageTitle;
    }

    //******************************************************************************************************************
    public void dotEmailBegin() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        String lastName = "А";
        String name = "А";
        String otchestvo = "А";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, ".");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
    }

    //******************************************************************************************************************
    public void dotEmailEnd() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        String lastName = "А";
        String name = "А";
        String otchestvo = "А";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "a.");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
    }

    //******************************************************************************************************************
    public String useSpecialSymbolsInEmail() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(2000);
        String lastName = "А";
        String name = "Я";
        String otchestvo = "О";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "1a!");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(2000);
        String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(1000);
        return messageTitle;
    }

    //******************************************************************************************************************
    public void doubleDotEmail() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        String lastName = "А";
        String name = "А";
        String otchestvo = "А";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "..");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
    }

    //******************************************************************************************************************
    public void verifyEmailIncorrectSymbol() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(5000);
        String lastName = "@";
        String name = "@";
        String otchestvo = "@";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "@";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "@");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
    }

    //******************************************************************************************************************
    public String birthDayAfterToday() throws InterruptedException {//Убрать String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(2000);
        String lastName = "Lastname";
        String name = "Name";
        String otchestvo = "otchestvo";


        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        String birthday = formatter.format(tomorrow);

        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        Random rand = new Random();
        String randomObjName = MyRandom.generateString(rand, "QWERTYUIOPASDFGHJKLZXCVBNM", 6);
        wrapper.sendKeysByXpath(EMAIL_XPATH, randomObjName);

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(2000);
        String messageTitle = wrapper.getTextByXpath(WARNING_MESSAGE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(1000);
        return messageTitle;
    }

    //******************************************************************************************************************
    public void useRusSymbolsInEmail() throws InterruptedException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(2000);
        String lastName = "А";
        String name = "Я";
        String otchestvo = "О";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "Иванов");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);
        wrapper.clickByXpath(SELECT_ADMIN_USER_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(2000);
    }
    //******************************************************************************************************************
    public String useIncorrectJobsTitle() throws InterruptedException, AWTException {
        wrapper.clickByXpath(ADD_USER_BTN_XPATH);
        Thread.sleep(3000);
        log.info("Осуществляем переход на страницу Добавление пользователя");
        wrapper.clickByXpath(SEARCH_USER_BTN_XPATH);
        log.info("Поля для заполнения становятся доступными");
        Thread.sleep(4000);
        String lastName = "А";
        String name = "Я";
        String otchestvo = "О";
        String birthday = "11.10.1986";
        String codeOrg = "300";
        String structPod = "СтруктурноеПодразделение";

        wrapper.sendKeysByXpath(EMAIL_XPATH, "nextlevel");

        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);
        wrapper.sendKeysByXpath(BIRDTHDATE_XPATH, birthday);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);
        Thread.sleep(2000);
        wrapper.clickByXpath(ROLE_XPATH);

        wrapper.clickByXpath(JOB_TITLE_XPATH);
        wrapper.sendKeysByXpath(JOB_TITLE_SEARCH_XPATH, "ссссс");
        String notFound = wrapper.getTextByXpath(JOB_TITLE_SEARCH_NOT_FOUND_XPATH);
        wrapper.clear(JOB_TITLE_SEARCH_XPATH);
        wrapper.sendKeysByXpath(JOB_TITLE_SEARCH_XPATH, "геодези");
        wrapper.pressEnterOnly();
        return notFound;
    }
}
