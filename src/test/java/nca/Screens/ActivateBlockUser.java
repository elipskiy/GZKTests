package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by makovskiy on 16.01.2015.
 */
public class ActivateBlockUser {
    public static final String LOGIN_XPATH = "//input[@id='j_username']";
    public static final String PASSWORD_XPATH = "//input[@id='j_password']";
    public static final String ENTER_BTN_XPATH = "//input[@id='submit']";
    final static String EXIT = "//a[@href='/j_spring_security_logout']";
    public final String BLOCK_BTN_XPATH = "//button[@id='blockUser']";
    public final String ALERTIFY_OK_BTN_XPATH = "//button[@id='alertify-ok']";
    public final String ALERTIFY_CANCEL_BTN_XPATH = "//button[@id='alertify-cancel']";
    public final String NECESSARILY_FIELD_XPATH = "//p[@class='alertify-message']";
    public final String ALERTIFY_TEXT_FIELD_XPATH = "//input[@id='alertify-text']";
    public final String UI_DIALOG_TITLE_XPATH = "//span[@class='ui-dialog-title']";

    public static final String SHOW_ALL_USER_XPATH = "//a[@href='journalUsers.html?getAlUs']";
    public static final String USER_LOGIN_XPATH = "//*[contains(text(), 'ФамилияАдмин')]"; //NKARHADMIN
    public static final String ACTIVATE_BTN_XPATH = "//button[@id='activateUser']";
    public final static String END_UP_BTN = "//a[@class='btn btn-primary btn-lg active']";
    public static final String HTTP_ADDRESS = "http://mail.nca.by/";
    public static final String EMAIL_XPATH = "//input[@name='User']";
    public static final String PASS_XPATH = "//input[@name='Password']";
    public static final String THEME_XPATH = "//select[@id='Theme']";
    public static final String THEME_SIMPLE_XPATH = "//*[contains(text(), 'Simple')]";
    public static final String SIGN_XPATH = "//input[@id='Logon']";
    public static final String MESSAGE_XPATH = "//a[@title='Информационное сообщение NCA-RH']";
    public static final String MESSAGE_LIST_XPATH = "//*[contains(text(), 'Список Сообщений')]";
    final static String LETTER_CHECK_BOX_XPATH = "//input[@class='CheckBox']";
    final static String DELETE_LETTER_XPATH = "//a[@id='deleteSelected']";
    final static String MAIL_BOX_EXIT = "//a[@id='SignOut']";
    final static String CHANGE_PASSWORD_BTN_XPATH = "//button[@id='changePassword']";
    final static String EDIT_BTN_XPATH = "//button[@id='editUser']";

    public static final String LETTER_TEXT_XPATH = "//div[@id='messageBody']";

    public static final String LAST_NAME_XPATH = "//input[@id='lastName']";
    public static final String NAME_XPATH = "//input[@id='firstName']";
    public static final String PATRONYMIC_XPATH = "//input[@id='patronymic']";
    public static final String PATRONYMIC_CHECKBOX_XPATH = "//input[@id='NoPatronymic']";
    public static final String BIRDTHDATE_XPATH = "//input[@id='birdthDate']";
    public static final String CODE_ORGANIZATION_XPATH = "//input[@id='codeOrganization']";
    public static final String CODE_BTN_ORGANIZATION_XPATH = "//button[@id='viewCode']";
    public static final String POSITION_XPATH = "//div[@id='s2id_position']";
    public static final String SUBVISION_XPATH = "//input[@id='subdivision']";
    public static final String SELECT_ADMIN_USER_XPATH = "//option[@value='ROLE_ADMIN']";
    public static final String CREATE_EDIT_USER_XPATH = "//input[@class='btn btnSub btn-danger']";
    public static final String ADMINISRATION_LINK_XPATH = "//a[@href='journalUsers.html']";

    public WebDriver driver;

    LoadPage loadPage = new LoadPage();

    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    ActivateBlockUser(WebDriver driver) {
        this.driver = driver;
        wrapper = new DriverWrapper(driver);

    }

    //******************************************************************************************************************
    public String activateNewUser() throws InterruptedException {
        loginPassEnter();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(SHOW_ALL_USER_XPATH);
        Thread.sleep(5000);

        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }



    //******************************************************************************************************************
    public String loginWithActivateNewUser() throws IOException {
        adminLoginAndReadAdminPass();

        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }



    //******************************************************************************************************************
    public String verifyErrorBlockWOReason() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String necessarilyField = wrapper.getTextByXpath(NECESSARILY_FIELD_XPATH);
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        wrapper.clickByXpath(ALERTIFY_CANCEL_BTN_XPATH);
        return necessarilyField;
    }

    //******************************************************************************************************************
    public String blockUserAfterActivate() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(ALERTIFY_TEXT_FIELD_XPATH,"SPAM");
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String uiDialogTitle = wrapper.getTextByXpath(UI_DIALOG_TITLE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        return  uiDialogTitle;
    }

    //******************************************************************************************************************
    public String verifyLoginWithBlockUser() throws IOException, InterruptedException {
        adminLoginAndReadAdminPass();

        String getTitle = wrapper.getPageTitle();
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удаляем письмо");
        return getTitle;
    }



    //******************************************************************************************************************
    public String secondActivateAdminUser() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(SHOW_ALL_USER_XPATH);
        Thread.sleep(5000);
        //wrapper.clickByXpath(USER_LOGIN_XPATH);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");

        wrapper.clickByXpath(THEME_XPATH);wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);

        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String loginWithActivateNewUserAgain(){
        adminLoginAndReadAdminPass();

        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }

    //******************************************************************************************************************
    public String changeUserPassword() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(CHANGE_PASSWORD_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);

        String file = "C://In.txt";
        Integer begin = letter.indexOf("пароль: ") + 9;
        Integer end = letter.indexOf("Пожалуйста") - 2;
        String resultString = letter.substring(begin, end);
        log.info(resultString);

        WriterReader mfw = new WriterReader();
        mfw.Write(resultString,file);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        return resultString;
    }

    //******************************************************************************************************************
    public String loginAfterPassChange(){
        adminLoginAndReadAdminPass();

        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }

    //******************************************************************************************************************
    public String cancelPassChange() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(CHANGE_PASSWORD_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ALERTIFY_CANCEL_BTN_XPATH);
        wrapper.clickByXpath(EXIT);
        wrapper.sendKeysByXpath(LOGIN_XPATH,"NKARHADMIN");
        String file = "C://In.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(PASSWORD_XPATH,adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }

    //******************************************************************************************************************
    public String editRHUser() throws InterruptedException {
        loginPassEnter();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(EDIT_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.GetTabFocus();

        String lastName = "ФамилияАдминEdit";
        String name = "ИмяАдминEdit";
        String otchestvo = "ОтчествоАдминEdit";

        String codeOrg = "334";
        String structPod = "СтруктурноеПодразделение";

        wrapper.clear(LAST_NAME_XPATH);
        wrapper.sendKeysByXpath(LAST_NAME_XPATH, lastName);
        wrapper.clear(NAME_XPATH);
        wrapper.sendKeysByXpath(NAME_XPATH, name);
        wrapper.clear(PATRONYMIC_XPATH);
        wrapper.sendKeysByXpath(PATRONYMIC_XPATH, otchestvo);


        wrapper.clear(CODE_ORGANIZATION_XPATH);
        wrapper.sendKeysByXpath(CODE_ORGANIZATION_XPATH, codeOrg);
        wrapper.clear(SUBVISION_XPATH);
        wrapper.sendKeysByXpath(SUBVISION_XPATH,structPod);

        wrapper.clickByXpath(CREATE_EDIT_USER_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(5000);


        return codeOrg;
    }

    //******************************************************************************************************************
    public String activateUserRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHUSER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String blockUserRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(ALERTIFY_TEXT_FIELD_XPATH,"SPAM");
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String uiDialogTitle = wrapper.getTextByXpath(UI_DIALOG_TITLE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        return  uiDialogTitle;
    }

    //******************************************************************************************************************
    public String activateUserRoleAgain() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHUSER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String enterUserRoleAfterActivate(){
        log.info("Вводим логин");
        wrapper.sendKeysByXpath(LOGIN_XPATH,"NKARHUSER");
        String file = "C://InUser.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String activateManageRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String blockManageRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(ALERTIFY_TEXT_FIELD_XPATH,"SPAM");
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String uiDialogTitle = wrapper.getTextByXpath(UI_DIALOG_TITLE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        return  uiDialogTitle;
    }

    //******************************************************************************************************************
    public String activateManageRoleAgain() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String enterManageRoleAfterActivate(){
        log.info("Вводим логин");
        wrapper.sendKeysByXpath(LOGIN_XPATH,"NKARHMANAGER");
        String file = "C://InManager.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String activateManageCreaterRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGERorder");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String blockManageCreaterRole() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(ALERTIFY_TEXT_FIELD_XPATH,"SPAM");
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String uiDialogTitle = wrapper.getTextByXpath(UI_DIALOG_TITLE_XPATH);
        wrapper.clickByXpath(END_UP_BTN);
        return  uiDialogTitle;
    }

    //******************************************************************************************************************
    public String activateManageCreaterRoleAgain() throws InterruptedException {
        adminLoginAndReadAdminPass();

        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(ACTIVATE_BTN_XPATH);

        Thread.sleep(5000);
        wrapper.clickByXpath(END_UP_BTN);
        Thread.sleep(80000);
        wrapper.clickByXpath(EXIT);
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGERorder");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        wrapper.clickByXpath(MESSAGE_LIST_XPATH);
        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удалили письмо");
        //RegBlockActiveMessage rg = new RegBlockActiveMessage();
        //String adminPass = rg.REMEMBER_ADMIN_PASSWORD;
        return letter;
    }

    //******************************************************************************************************************
    public String enterManageCreaterRoleAfterActivate(){
        log.info("Вводим логин");
        wrapper.sendKeysByXpath(LOGIN_XPATH,"NKARHMANAGERorder");
        String file = "C://InManagerorder.txt";
        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(PASSWORD_XPATH, adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String specialSymbolsInBlockingWindow() throws InterruptedException {//Пока что это заглушка для Тест#50
        adminLoginAndReadAdminPass();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.sendKeysByXpath(ALERTIFY_TEXT_FIELD_XPATH,"%%%%%%");
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(5000);
        String errorMessage = "";
        return errorMessage;//Пока что это заглушка для Тест#50
    }

    //******************************************************************************************************************
    public boolean verifyBlockedBlockingBTN(){
        adminLoginAndReadAdminPass();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        boolean result = wrapper.isEnable(BLOCK_BTN_XPATH);
        return result;
    }

    //******************************************************************************************************************
    public boolean verifyBlockedActivingBTN(){
        adminLoginAndReadAdminPass();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        boolean result = wrapper.isEnable(ACTIVATE_BTN_XPATH);
        return result;
    }

    //******************************************************************************************************************
    public List<String> verifyBtnLanguage() throws InterruptedException {
        adminLoginAndReadAdminPass();
        wrapper.clickByXpath(ADMINISRATION_LINK_XPATH);
        wrapper.clickByXpath(BLOCK_BTN_XPATH);
        Thread.sleep(3000);
        List<String> btnLang = new ArrayList<String>(2);
        btnLang.add(wrapper.getTextByXpath(ALERTIFY_CANCEL_BTN_XPATH));
        btnLang.add(wrapper.getTextByXpath(ALERTIFY_OK_BTN_XPATH));
        String dataResult = "";

        for (int i = 0; i < btnLang.size(); i++) {
            dataResult = dataResult + btnLang.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnHeaderAdministrationPage: " + dataResult);

        return btnLang;
    }

    //******************************************Methods*****************************************************************
    //******************************************************************************************************************
    private void loginPassEnter() {
        log.info("Вводим логин");
        wrapper.sendKeysByXpath(LOGIN_XPATH, "11");
        log.info("Вводим пароль");

        wrapper.sendKeysByXpath(PASSWORD_XPATH,"1");
        log.info("Нажимаем вход");

        wrapper.clickByXpath(ENTER_BTN_XPATH);
        log.info("Осуществляем вход на главную страницу");
    }

    //******************************************************************************************************************
    private void adminLoginAndReadAdminPass() {
        log.info("Вводим логин");
        wrapper.sendKeysByXpath(LOGIN_XPATH,"NKARHADMIN");

        String file = "C://In.txt";

        WriterReader wr = new WriterReader();

        String adminPass = wr.Reader(file);
        log.info(adminPass);
        wrapper.sendKeysByXpath(PASSWORD_XPATH,adminPass);
        wrapper.clickByXpath(ENTER_BTN_XPATH);
    }

    //******************************************************************************************************************


    //******************************************************************************************************************
    public void clickByXpaths(String[] path) {
        loadPage.waitForPageLoaded(driver);
        for (String pathElement : path) {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            loadPage.waitForPageLoaded(driver);
            wrapper.clickByXpath(pathElement);
        }
    }
}
