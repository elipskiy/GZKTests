package nca.Screens;

import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by temp on 21.08.2015.
 */
public class LoginScreen_S6 {
    public WebDriver driver;

    public static final Logger log = Logger.getLogger(LoginScreen_S6.class);
    private static final String LOGIN_SCREEN_URL = "http://50.56.183.70/s6/";

    //***********Xpath***************
    private static final String USERNAME_FIELD_XPATH = "//input[@name='j_username']";
    private static final String PASSWORD_FIELD_XPATH = "//input[@name='j_password']";
    private static final String SIGN_IN_BTN_XPATH = "//*[contains(text(), 'Sign In')]";

    private static final String QUIT_BTN_XPATH = "//*[contains(text(), 'Выйти')]";
    //***********Xpath End***************

    public LoginScreen_S6(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(LOGIN_SCREEN_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    public IndexScreen_S6 loggin(String email, String pass){
        log.info("----Insert Username or email");
        $(By.xpath(USERNAME_FIELD_XPATH)).setValue(email);
        log.info("----Insert Pass");
        $(By.xpath(PASSWORD_FIELD_XPATH)).setValue(pass);
        log.info("----Click Sign In");
        $(By.xpath(SIGN_IN_BTN_XPATH)).click();
        return new IndexScreen_S6(driver);
    }
}
