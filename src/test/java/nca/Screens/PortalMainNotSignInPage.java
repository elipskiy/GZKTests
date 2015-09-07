package nca.Screens;

import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Eviltech on 25.05.2015.
 */
public class PortalMainNotSignInPage {
    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexPage.class);
    private static final String MAIN_PAGE_URL = "http://gorod:demo@gorod4.mos.ru/";

    WriterReader mfw = new WriterReader();
    
    //***********Xpath***************
    private static final String ENTER_LINK_XPATH = "//div[@id='login-trigger']";
    private static final String EMAIL_FIELD_XPATH = "//input[@id='auth_user_name']";
    private static final String PASS_FIELD_XPATH = "//input[@id='auth_user_password']";
    private static final String ENTER_BTN_XPATH = "//div[@id='loginUser_ok']";
    //***********Xpath End***************


    public PortalMainNotSignInPage(WebDriver driver) throws IOException {
        this.driver = driver;
        LoadPage loadPage = new LoadPage();
        driver.get(MAIN_PAGE_URL);
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();

    }
    
    public PortalMainSignInPage loggin(String email, String pass){
        $(By.xpath(ENTER_LINK_XPATH)).click();
        $(By.xpath(EMAIL_FIELD_XPATH)).setValue(email);
        $(By.xpath(PASS_FIELD_XPATH)).setValue(pass);
        $(By.xpath(ENTER_BTN_XPATH)).click();
        return new PortalMainSignInPage(driver);
    }
}
