package nca.Screens;

import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class MainPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(MainPage.class);

    MainPage(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //Xpath
    private static final String ADMINISTRATION_LINK_XPATH = "//a[@href='journalUsers.html']";
    private static final String EXIT_BTN_XPATH = "//a[@class='QA']";
    //End Xpath

    //Ввод логин\пароля, вход
    public AdministrationPage getAdministrationPage(){
        $(By.xpath(ADMINISTRATION_LINK_XPATH)).click();
        return new AdministrationPage(wrapper.getDriver());
    }

    //Забираем title страницы
    public String getMainPageTitle(){
        String title = title();
        return title;
    }

    //Кнопка выход
    public void clickExitBtn(){
        $(By.xpath(EXIT_BTN_XPATH)).click();
    }

}
