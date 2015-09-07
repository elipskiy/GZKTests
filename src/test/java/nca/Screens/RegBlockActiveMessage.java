package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by makovskiy on 15.01.2015.
 */
public class RegBlockActiveMessage {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    WriterReader mfw = new WriterReader();

    public static final String HTTP_ADDRESS = "http://mail.nca.by/";
    public static final String HTTP_ADDRESS1 = "http://nka_rh:8080/";
    public static final String EMAIL_XPATH = "//input[@name='User']";
    public static final String PASS_XPATH = "//input[@name='Password']";
    public static final String SIGN_XPATH = "//input[@id='Logon']";

    public static final String THEME_XPATH = "//select[@id='Theme']";
    public static final String THEME_SIMPLE_XPATH = "//*[contains(text(), 'Simple')]";
    public static final String MESSAGE_XPATH = "//a[@title='Информационное сообщение NCA-RH']";

    public static final String LETTER_TEXT_XPATH = "//div[@id='messageBody']";

    final static String MAIN_PAGE_ENTER_LOGIN_XPATH = "//input[@name ='j_username']";
    final static String MAIN_PAGE_ENTER_PASSWORD_XPATH = "//input[@name ='j_password']";
    final static String MAIN_PAGE_ENTER_USER_XPATH = "//input[@id ='submit']";
    final static String AUTH_ERROR_XPATH = "//div[@class='errors']";
    final static String LETTER_CHECK_BOX_XPATH = "//input[@class='CheckBox']";
    final static String DELETE_LETTER_XPATH = "//a[@id='deleteSelected']";
    public static final String MESSAGE_LIST_XPATH = "//*[contains(text(), 'Список Сообщений')]";


    RegBlockActiveMessage(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    public RegBlockActiveMessage() {

    }

    public void verifyMessageAfterAdminReg() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);
        Thread.sleep(5000);
        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        log.info(letter);
    }

    //******************************************************************************************************************
    public String loginWOActivation() throws InterruptedException, IOException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
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
        mfw.Write(resultString,file);



        wrapper.openTab(HTTP_ADDRESS1);
        wrapper.GetTabFocus();
        wrapper.sendKeysByXpath(MAIN_PAGE_ENTER_LOGIN_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(MAIN_PAGE_ENTER_PASSWORD_XPATH,resultString);
        wrapper.clickByXpath(MAIN_PAGE_ENTER_USER_XPATH);
        String authError = wrapper.getTextByXpath(AUTH_ERROR_XPATH);

        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);

        wrapper.clickByXpath(LETTER_CHECK_BOX_XPATH);
        wrapper.clickByXpath(DELETE_LETTER_XPATH);
        wrapper.closeAlertWindow();
        log.info("Удаляем письмо");

        return authError;
    }

    //******************************************************************************************************************
    public String verifyLetterAfterBlock() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHADMIN");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);

        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);
        return letter;
    }

    //******************************************************************************************************************
    public String verifyLetterAfterRegUserRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHUSER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);

        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);

        String file = "C://InUser.txt";
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

        return letter;

    }

    //******************************************************************************************************************
    public String verifyMessageAfterBlockUserRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(80000);
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
        return letter;
    }

    //******************************************************************************************************************
    public String verifyLetterAfterRegManagerRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        Thread.sleep(5000);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGER");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);

        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);

        String file = "C://InManager.txt";
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

        return letter;
    }

    //******************************************************************************************************************
    public String verifyMessageAfterBlockManagerRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(80000);
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
        return letter;
    }

    //******************************************************************************************************************
    public String verifyLetterAfterRegManagerCreaterRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        Thread.sleep(5000);
        wrapper.GetTabFocus();

        Thread.sleep(5000);
        wrapper.clear(EMAIL_XPATH);
        wrapper.sendKeysByXpath(EMAIL_XPATH, "NKARHMANAGERorder");
        wrapper.sendKeysByXpath(PASS_XPATH, "78ncaRH!5623");
        wrapper.clickByXpath(THEME_XPATH);
        wrapper.clickByXpath(THEME_SIMPLE_XPATH);
        wrapper.clickByXpath(SIGN_XPATH);

        wrapper.clickByXpath(MESSAGE_XPATH);
        String letter = wrapper.getTextByXpath(LETTER_TEXT_XPATH);

        String file = "C://InManagerorder.txt";
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

        return letter;
    }

    //******************************************************************************************************************
    public String verifyMessageAfterBlockManageCreaterRole() throws InterruptedException {
        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();

        Thread.sleep(80000);
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
        return letter;
    }
}
