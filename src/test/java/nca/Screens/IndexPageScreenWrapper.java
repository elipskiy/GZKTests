package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.title;
/**
 * Created by makovskiy on 20.12.2014.
 */
public class IndexPageScreenWrapper {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    //******************authorizationPageElements Begin*****************
    public static String LABEL_ENTER_XPATH = "//h2[@class='form-signin-heading']";
    public static String LABEL_FOR_JUSER_XPATH = "//label[@for='j_username']";
    public static String FIELD_JUSER_XPATH = "//input[@id='j_username']";
    public static String LABEL_PASSWORD_XPATH = "//label[@for='j_password']";
    public static String FIELD_JPASSWORD_XPATH = "//input[@id='j_password']";
    public static String LABEL_REMEMBER_ME_XPATH = "//label[@for='remember_me']";
    public static String CHECKBOX_REMEMBER_ME_XPATH = "//input[@id='remember_me']";
    public static String ENTER_BUTTON_XPATH = "//input[@id='submit']";
    public static String AUTH_ERROR_XPATH = "//div[@class='errors']";
    //****************authorizationPageElements END*****************************

    IndexPageScreenWrapper(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String getIndexPageTitle(){
        log.info("Получаем TITLE страницы Авторизация");
        String title = title();
        log.info(String.format("TITLE страницы Авторизация", title));
        return title;
    }

    //******************************************************************************************************************
    public List<String> checkAuthorizationPageElements(){
        log.info("Собираем данные в массив" );
        List<String> authorizationPageElements = new ArrayList<String>(8);
        authorizationPageElements.add(wrapper.getTextByXpath(LABEL_ENTER_XPATH));
        authorizationPageElements.add(wrapper.getTextByXpath(LABEL_FOR_JUSER_XPATH));
        authorizationPageElements.add(wrapper.getAttributeNameByXpath(FIELD_JUSER_XPATH));
        authorizationPageElements.add(wrapper.getTextByXpath(LABEL_PASSWORD_XPATH));
        authorizationPageElements.add(wrapper.getAttributeNameByXpath(FIELD_JPASSWORD_XPATH));
        authorizationPageElements.add(wrapper.getTextByXpath(LABEL_REMEMBER_ME_XPATH));
        authorizationPageElements.add(wrapper.getAttributeNameByXpath(CHECKBOX_REMEMBER_ME_XPATH));
        authorizationPageElements.add(wrapper.getAttributeValueByXpath(ENTER_BUTTON_XPATH));

        String dataResult = "";
        for (int i = 0; i < authorizationPageElements.size(); i++) {
            dataResult = dataResult + authorizationPageElements.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА authorizationPageElements: " + dataResult);

        return authorizationPageElements;
    }
    //******************************************************************************************************************
    public String checkAuthError(){
        log.info("Вводим некорректное имя пользователя");
        $(By.name("j_username")).setValue("Noname");
        log.info("Вводим некорректный пароль");
        $(By.name("j_password")).setValue("Noname");
        log.info("Нажимаем кнопку Войти");
        $("#submit").click();
        String authError = wrapper.getTextByXpath(AUTH_ERROR_XPATH);
        return authError;
    }

}
