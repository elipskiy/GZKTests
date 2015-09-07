package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class LoginEmailPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(MainPage.class);
    WriterReader mfw = new WriterReader();

    LoginEmailPage(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //Xpath
    private static final String MESSAGE_XPATH = "//a[@title='Информационное сообщение NCA-RH']";
    private static final String LETTER_TEXT_XPATH = "//div[@id='messageBody']";
    private static final String MESSAGE_LIST_XPATH = "//*[contains(text(), 'Список Сообщений')]";
    private static final String GET_LETTERS_LINK_XPATH = "//a[@id='GetMail']";
    private static final String LETTER_CHECK_BOX_XPATH = "//input[@class='CheckBox']";
    private static final String DELETE_LETTER_XPATH = "//a[@id='deleteSelected']";
    private static final String EXIT_BTN_XPATH = "//a[@id='SignOut']";
    private static final String LOGIN_FIELD_XPATH = "//input[@name='User']";
    private static final String PASSWORD_FIELD_XPATH = "//input[@name='Password']";
    private static final String THEME_DROPDOWN_XPATH = "//select[@id='Theme']";
    private static final String SIMPLE_THEME_DROPDOWN_XPATH = "//*[contains(text(), 'Simple')]";
    private static final String SIGNIN_BTN_XPATH = "//input[@id='Logon']";


    private static final String JQUERY_GET_VISIBLE_MESSAGE_STATUS = "return $('td:contains(\"Информационное сообщение NCA-RH\"):visible').length;";
    //End Xpath

    //Ожидаем появления письма
    public void waitUserRoleEmailVisible(String log, String pas) throws InterruptedException {
        long status = 0;
        Date date = new Date();
        Date date2 = new Date();
        while (status == 0 && (date.getTime()+90000 > date2.getTime())) {

            status = wrapper.jqReturnExecute(JQUERY_GET_VISIBLE_MESSAGE_STATUS);
            date2 = new Date();
            if (status==0){

                Thread.sleep(5000);
                clickExit();

                $(By.xpath(LOGIN_FIELD_XPATH)).clear();
                $(By.xpath(LOGIN_FIELD_XPATH)).setValue(log);
                $(By.xpath(PASSWORD_FIELD_XPATH)).clear();
                $(By.xpath(PASSWORD_FIELD_XPATH)).setValue(pas);
                $(By.xpath(THEME_DROPDOWN_XPATH)).click();
                $(By.xpath(SIMPLE_THEME_DROPDOWN_XPATH)).click();
                $(By.xpath(SIGNIN_BTN_XPATH)).click();
                status = wrapper.jqReturnExecute(JQUERY_GET_VISIBLE_MESSAGE_STATUS);
            }
        }
    }

    //Открываем письмо
    public void openRegMessage(){
        $(By.xpath(MESSAGE_XPATH)).click();
    }

    //Сохраняем пароль администратора в документ
    public String getAdminPass() {
        String letterText =$(By.xpath(LETTER_TEXT_XPATH)).getText();

        String file = "C://UserAdmin.txt";
        Integer begin = letterText.indexOf("пароль: ") + 9;
        Integer end = letterText.indexOf("Пожалуйста") - 2;
        String resultString = letterText.substring(begin, end);
        log.info(resultString);
        mfw.Write(resultString, file);
        return resultString;
    }

    //Сохраняем пароль Просмотр (уровень 1) в документ
    public String getViewLevel_1Pass() {
        String letterText =$(By.xpath(LETTER_TEXT_XPATH)).getText();

        String file = "C://ViewLevel_1Pass.txt";
        Integer begin = letterText.indexOf("пароль: ") + 9;
        Integer end = letterText.indexOf("Пожалуйста") - 2;
        String resultString = letterText.substring(begin, end);
        log.info(resultString);
        mfw.Write(resultString, file);
        return resultString;
    }

    //Записываем в файл письмо для Админа после активации
    public String getAdminUserMessageAfterActivate() {
        String letterText =$(By.xpath(LETTER_TEXT_XPATH)).getText();
        String file = "C://MessageUserAdminAfterActivate.txt";
        String resultString = letterText;
        log.info(letterText);
        mfw.Write(resultString, file);
        return resultString;
    }

    //Записываем в файл письмо для пользователя с правами Просмотр (уровень 1) после активации
    public String getViewLevel_1MessageAfterActivate() {
        String letterText =$(By.xpath(LETTER_TEXT_XPATH)).getText();
        String file = "C://MessageViewLevel_1AfterActivate.txt";
        String resultString = letterText;
        log.info(letterText);
        mfw.Write(resultString, file);
        return resultString;
    }

    //Записываем в файл письмо для Админа после блокировки
    public String getAdminUserMessageAfterBlock() {
        String letterText =$(By.xpath(LETTER_TEXT_XPATH)).getText();
        String file = "C://MessageUserAdminAfterBlock.txt";
        String resultString = letterText;
        log.info(letterText);
        mfw.Write(resultString, file);
        return resultString;
    }

    //Кликаем по списку писем
    public void clickListMessage(){
        $(By.xpath(MESSAGE_LIST_XPATH)).click();
    }

    //Выделяем письмо
    public void clickCheckBox() throws InterruptedException {
        Thread.sleep(500);
        $(By.xpath(LETTER_CHECK_BOX_XPATH)).click();
    }

    //Удалем письмо
    public void deleteMessage(){
        $(By.xpath(DELETE_LETTER_XPATH)).click();
        wrapper.getDriver().switchTo().alert().accept();
    }

    //Нажимаем выход
    public void clickExit() throws InterruptedException {
        Thread.sleep(500);
        $(By.xpath(EXIT_BTN_XPATH)).click();
    }


}
