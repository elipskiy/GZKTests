package nca.Screens;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class EmailPage {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(EmailPage.class);
    public static final String HTTP_ADDRESS = "http://mail.nca.by/";

    // Implementation
    //******************************************************************************************************************
    public EmailPage(WebDriver driver) throws IOException {
        this.driver = driver;

        LoadPage loadPage = new LoadPage();
        driver.get(HTTP_ADDRESS);
        loadPage.waitForPageLoaded(driver);
    }

    //Xpath
    private static final String LOGIN_FIELD_XPATH = "//input[@name='User']";
    private static final String PASSWORD_FIELD_XPATH = "//input[@name='Password']";
    private static final String THEME_DROPDOWN_XPATH = "//select[@id='Theme']";
    private static final String SIMPLE_THEME_DROPDOWN_XPATH = "//*[contains(text(), 'Simple')]";
    private static final String SIGNIN_BTN_XPATH = "//input[@id='Logon']";
    //End Xpath

    //Ввод логин\пароля, вход
    public LoginEmailPage loginToEmailPage(String login,String pass){
        $(By.xpath(LOGIN_FIELD_XPATH)).clear();
        $(By.xpath(LOGIN_FIELD_XPATH)).setValue(login);
        $(By.xpath(PASSWORD_FIELD_XPATH)).clear();
        $(By.xpath(PASSWORD_FIELD_XPATH)).setValue(pass);
        $(By.xpath(THEME_DROPDOWN_XPATH)).click();
        $(By.xpath(SIMPLE_THEME_DROPDOWN_XPATH)).click();
        $(By.xpath(SIGNIN_BTN_XPATH)).click();


        return new LoginEmailPage(driver);
    }
}
