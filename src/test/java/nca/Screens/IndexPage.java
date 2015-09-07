package nca.Screens;

import nca.Tests.SmokeTest;
import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class IndexPage {

    public WebDriver driver;
    public static final Logger log = Logger.getLogger(IndexPage.class);
    public static final String HTTP_ADDRESS = "http://sila:8080/";

    WriterReader mfw = new WriterReader();

    // Implementation
    //******************************************************************************************************************
    public IndexPage(WebDriver driver) throws IOException {
        this.driver = driver;


        LoadPage loadPage = new LoadPage();
        driver.get(HTTP_ADDRESS);
        loadPage.waitForPageLoaded(driver);

    }

    //**********************************************NCA_RH FUNCTION*****************************************************

    //Ввод логин\пароля, вход
    public MainPage getIndexPage(String login, String pass){
        $("#j_username").setValue(login);
        $("#j_password").setValue(pass);
        $("#submit").click();
        return new MainPage(driver);
    }


    //Берем пароль администратора
    public String getPassUserAdminByFile(){
        String file = "C://UserAdmin.txt";

        String adminPass = mfw.Reader(file);
        log.info(adminPass);
        return adminPass;
    }

    //Берем пароль пользователя с правами Просмотр (уровень 1)
    public String getPassUserViewLevel_1File(){
        String file = "C://ViewLevel_1Pass.txt";

        String adminPass = mfw.Reader(file);
        log.info(adminPass);
        return adminPass;
    }
}
