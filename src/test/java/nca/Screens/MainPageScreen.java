package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.title;

/**
 * Created by makovskiy on 20.12.2014.
 */
public class MainPageScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);


    public static final String HTTP_ADDRESS = "https://www.google.ru";
    public static final String HTTP_ADDRESS1 = "http://nka_rh:8080/";

    public static final String MY_CABINET_XPATH = "//*[contains(text(), 'Мой кабинет')]";
    public static final String ADMINISTRATION_XPATH = "//a[@href='journalUsers.html']";
    public static final String LOG_OUT_XPATH = "//a[@href='/j_spring_security_logout']";
    public static final String JOURNAL_ORDER_XPATH = "//a[@id='journalLink']";
    public static final String SEARCH_AND_VIEW_XPATH = "//a[@id='moduleSearchLink']";
    public static final String KNOWLEGE_BASE_XPATH = "//a[@id='knowledgeBase']";
    public static final String REESTR_LINK_XPATH = "//a[@id='reestrLink']";

    MainPageScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String getMainPageTitle(){
        log.info("Получаем TITLE MainPage");
        String title = title();
        log.info(String.format("TITLE страницы MainPage", title));
        return title;
    }
    //******************************************************************************************************************
    public String verifyRememberMe() throws IOException {
        log.info("Получаем TITLE MainPage");
        String mainPageTitle = wrapper.getPageTitle();
        log.info(String.format("Элемени содержит текст = %s", mainPageTitle));

        wrapper.openTab(HTTP_ADDRESS);
        wrapper.GetTabFocus();
        wrapper.openTab(HTTP_ADDRESS1);
        wrapper.GetTabFocus();

        String mainTitle = wrapper.getPageTitle();
        return mainTitle;
    }

    //******************************************************************************************************************
    public List<String> verifyElementsOnMainPage(){
        log.info("Собираем данные в массив" );
        List<String> eElementsOnMainPage = new ArrayList<String>(7);
        eElementsOnMainPage.add(wrapper.getTextByXpath(MY_CABINET_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(ADMINISTRATION_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(LOG_OUT_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(JOURNAL_ORDER_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(SEARCH_AND_VIEW_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(KNOWLEGE_BASE_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(REESTR_LINK_XPATH));

        String dataResult = "";
        for (int i = 0; i < eElementsOnMainPage.size(); i++) {
            dataResult = dataResult + eElementsOnMainPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА eElementsOnMainPage: " + dataResult);

        return eElementsOnMainPage;
    }
    //******************************************************************************************************************


}

