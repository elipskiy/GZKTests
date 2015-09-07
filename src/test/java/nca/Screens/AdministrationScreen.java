package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by makovskiy on 12.01.2015.
 */
public class AdministrationScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    public static final String GO_TO_MAIN_PAGE_XPATH = "//a[@href='guide.html']";
    public static final String GO_TO_JOURNAL_PAGE_XPATH = "//a[@href='journal.html']";
    public static final String GO_TO_FINDandVIEW_PAGE_XPATH = "//a[@href='moduleSearch.html']";
    public static final String GO_TO_BASE_KNOWLEGE_PAGE_XPATH = "//*[contains(text(), 'База знаний')]";//заменить на норм xpath
    public static final String GO_TO_REESTR_PAGE_XPATH = "//a[@href='general.html']";
    public static final String GO_TO_SEARCH_XPATH = "//input[@id='search']";
    public static final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'Личный кабинет')]";//заменить на норм xpath
    public static final String GO_TO_HELP_PAGE_XPATH = "//*[contains(text(), 'Помощь')]";//заменить на норм xpath
    public static final String EXIT_XPATH = "//a[@href='/j_spring_security_logout']";


    public static final String ADD_BTN_XPATH = "//a[@href='createUser.html?oper=create']";
    public static final String SHOW_ALL_BTN_XPATH = "//a[@href='journalUsers.html?getAlUs']";
    public static final String EDIT_USER_BTN_XPATH = "//button[@id='editUser']";
    public static final String BLOCK_USER_BTN_XPATH = "//button[@id='blockUser']";
    public static final String ACTIVATE_USER_BTN_XPATH = "//button[@id='activateUser']";
    public static final String CHANGE_PASS_USER_BTN_XPATH = "//button[@id='changePassword']";

    public static final String TH_CLASS_HEADER_XPATH = "//th[@class='header']";

    public static final String TABLE_HEADER_LASTNAME_XPATH = "//*[contains(text(), 'Фамилия')]";

    public static final String SEARCH_FIELD_XPATH = "//input[@id='search']";


    AdministrationScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String verifyTitleAdministrationScreen(){
        log.info("Получаем TITLE MainPage");
        String administrationPageTitle = wrapper.getPageTitle();
        log.info(String.format("Элемени содержит текст = %s", administrationPageTitle));
        return administrationPageTitle;
    }

    //******************************************************************************************************************
    public List<String> verifyHeaderElementsAdministrationScreen(){
        log.info("Собираем данные в массив" );
        List<String> elementsOnHeaderAdministrationPage = new ArrayList<String>(9);
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_MAIN_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_JOURNAL_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_FINDandVIEW_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_BASE_KNOWLEGE_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_REESTR_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_SEARCH_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_CABINET_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(GO_TO_HELP_PAGE_XPATH));
        elementsOnHeaderAdministrationPage.add(wrapper.getTextByXpath(EXIT_XPATH));

        String dataResult = "";
        for (int i = 0; i < elementsOnHeaderAdministrationPage.size(); i++) {
            dataResult = dataResult + elementsOnHeaderAdministrationPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnHeaderAdministrationPage: " + dataResult);

        return elementsOnHeaderAdministrationPage;
    }

    //******************************************************************************************************************
    public List<String> verifyElementsAdministrationScreen(){
        log.info("Собираем данные в массив" );
        List<String> elementsOnAdministrationPage = new ArrayList<String>(6);
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(ADD_BTN_XPATH));
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(SHOW_ALL_BTN_XPATH));
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(EDIT_USER_BTN_XPATH));
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(BLOCK_USER_BTN_XPATH));
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(ACTIVATE_USER_BTN_XPATH));
        elementsOnAdministrationPage.add(wrapper.getTextByXpath(CHANGE_PASS_USER_BTN_XPATH));

        String dataResult = "";
        for (int i = 0; i < elementsOnAdministrationPage.size(); i++) {
            dataResult = dataResult + elementsOnAdministrationPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnAdministrationPage: " + dataResult);

        return elementsOnAdministrationPage;
    }

    //******************************************************************************************************************
    public List<WebElement> verifyTableElementsAdministrationScreen(){
        log.info("Собираем данные в массив" );

        List<WebElement> rows = wrapper.findElementsByXpath(TH_CLASS_HEADER_XPATH);

        log.info("Number of columns:"+rows.size());

        List<String> stringList = new ArrayList<>();
        for(int rnum=0;rnum<rows.size();rnum++)
        {

                log.info(rows.get(rnum).getText());
                stringList.add(rows.get(rnum).getText());
        }
        log.info(stringList);
        return rows;
    }

    //******************************************************************************************************************
    public void findUserByLastNameOnList() throws AWTException {
        wrapper.sendKeysByXpath(SEARCH_FIELD_XPATH,"Фамилия");
        wrapper.pressEnter(SEARCH_FIELD_XPATH);
    }

    //******************************************************************************************************************
    public String verifyTitleEditPage() throws InterruptedException {
        Thread.sleep(5000);
        wrapper.clickByXpath(EDIT_USER_BTN_XPATH);
        Thread.sleep(3000);
        wrapper.GetTabFocus();
        Thread.sleep(3000);
        String title = wrapper.getPageTitle();
        return title;
    }

}
