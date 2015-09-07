package nca.Screens;

import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by makovskiy on 26.03.2015.
 */
public class ComponetsPartScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    public static final String OPERATIONS_BTN_XPATH = "//a[@id='operations']";
    public static final String OVERALL_BTN_XPATH = "//a[@id='overall']";
    public static final String COST_BTN_XPATH = "//a[@id='cost']";
    public static final String COMPONET_PART_BTN_XPATH = "//a[@id='componentParts']";
    public static final String BEAUTIFICATION_BTN_XPATH = "//a[@id='beautification']";
    public static final String RESIDENTIAL_ROOMS_BTN_XPATH = "//a[@id='residentialRooms']";
    public static final String ADD_BTN_XPATH = "//button[@id='addNodeCharakteristik']";
    public static final String DELETE_BTN_XPATH = "//button[@id='deleteNodeCharakteristik']";
    public static final String STANDART_TREE_TITLE_XPATH = "//span[@id='ui-id-2']";
    public static final String CLOSE_STANDART_TREE_TITLE_XPATH = "$('#dialogueTreeCharacteristics').dialog('close')";
    public static final String ALERTIFY_OK_BTN_XPATH = "//button[@id='alertify-ok']";
    public static final String JOURNAL_LINK_XPATH = "//a[@href='journal.html']";
    public static final String MODULE_SEARCH_LINK_XPATH = "//a[@href='moduleSearch.html']";
    public static final String KNOW_BASE_LINK_XPATH = "//a[@href='#']"; //!!!!!!!!!!! Заглушка
    public static final String JSTREE_ANCHORXPATH = "//a[@class='jstree-anchor']";

    public static final String INDIVIDUAL_GARAGE_XPATH = "//*[@id='3000000']/a";
    public static final String SAVE_BRANCH_XPATH = "//button[@id='addNodeCharakteristikOfReference']";
    public static final String OPEN_STANDART_TREE_XPATH = "//*[@id='1']/i";
    public static final String INDIVIDUAL_GARAGE_TEXT = "$(':contains(\"Индивидуальный гараж\")','#myJstree').last().text()";
    public static final String INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH = "//*[contains(text(), 'Индивидуальный гараж')]";
    public static final String USED_DATA_FIELD_XPATH = "//input[@data-charid='252']";
    public static final String BUILD_YEAR_FIELD_XPATH = "//input[@data-charid='251']";
    public static final String LITER_FIELD_XPATH = "//input[@data-charid='151']";
    public static final String SQ_FIELD_XPATH = "//input[@data-charid='7']";
    public static final String SIZE_FIELD_XPATH = "//input[@data-charid='6']";
    public static final String PCT_FIELD_XPATH = "//input[@data-charid='5']";
    public static final String SAVE_ALL_DATA_XPATH = "//button[@id='saveAllData']";
    public static final String TD_CLASS_XPATH = "//td[@class='limitedBandwidth']";

    public static final String ADD_ANOTHER_CHARSET_XPATH = "//span[@class='glyphicon glyphicon-plus']";
    public static final String SEARCH_CHARASTERITIC_XPATH = "//input[@id='serchCharacteristic']";
    public static final String THEME_SIMPLE_XPATH = "//*[contains(text(), 'Площадь отмосток, крылец, пандусов и т.п.')]";
    public static final String NEW_CHARASTERITIC_XPATH = "//*[contains(text(), 'Площадь отмосток, крылец, пандусов и т.п., кв. м.')]";


    public static final String JOURNAL_ORDER_XPATH = "//a[@href='journal.html']";
    public static final String FIND_LOOK_OBJECT_XPATH = "//a[@href='moduleSearch.html']";

    ComponetsPartScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    public String verifyTitleComponetsPartScreen() throws AWTException {
        log.info("Получаем TITLE ");
        wrapper.pressFullScreen();
        String title = wrapper.getPageTitle();
        log.info(String.format("Элемент содержит текст = %s", title));
        return title;
    }

    //******************************************************************************************************************
    public List<String> verifyElementsOnComponetsPartScreen(){
        log.info("Собираем данные в массив" );
        List<String> eElementsOnMainPage = new ArrayList<String>(8);
        eElementsOnMainPage.add(wrapper.getTextByXpath(OPERATIONS_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(OVERALL_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(COST_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(COMPONET_PART_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(BEAUTIFICATION_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(RESIDENTIAL_ROOMS_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(ADD_BTN_XPATH));
        eElementsOnMainPage.add(wrapper.getTextByXpath(DELETE_BTN_XPATH));


        String dataResult = "";
        for (int i = 0; i < eElementsOnMainPage.size(); i++) {
            dataResult = dataResult + eElementsOnMainPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА eElementsOnMainPage: " + dataResult);

        return eElementsOnMainPage;
    }

    //******************************************************************************************************************
    public String verifyTitleStandartTree() throws InterruptedException, AWTException {
        log.info("Нажатие на добавить - открытие дерева");
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(1000);
        log.info("Берем title окна");
        String windowTitle = wrapper.getTextByXpath(STANDART_TREE_TITLE_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(1000);
        return windowTitle;
    }

    //******************************************************************************************************************
    public String verifyTitleOperationPage() throws InterruptedException, AWTException {
        log.info("Нажатие кнопку Операция");
        wrapper.clickByXpath(OPERATIONS_BTN_XPATH);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleOverAllPage() throws InterruptedException, AWTException {
        log.info("Нажатие кнопку Общие");
        wrapper.clickByXpath(OVERALL_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(ALERTIFY_OK_BTN_XPATH);
        Thread.sleep(1000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleCostPage() throws InterruptedException, AWTException {
        log.info("Нажатие кнопку Стоимости");
        wrapper.clickByXpath(COST_BTN_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleBeautificationPage() throws InterruptedException, AWTException {
        log.info("Нажатие кнопку Благоустройство");
        wrapper.clickByXpath(BEAUTIFICATION_BTN_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleResidentialPage() throws InterruptedException, AWTException {
        log.info("Нажатие кнопку Жилые помещения");
        wrapper.clickByXpath(RESIDENTIAL_ROOMS_BTN_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleJournalPage() throws InterruptedException, AWTException {
        log.info("Нажатие ссылку Журнал заказов");
        wrapper.clickByXpath(JOURNAL_LINK_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleModuleSearchPage() throws InterruptedException, AWTException {
        log.info("Нажатие ссылку Поиск и просмотр объекта");
        wrapper.clickByXpath(MODULE_SEARCH_LINK_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleKnowBasePage() throws InterruptedException, AWTException {
        log.info("Нажатие ссылку База знаний");
        wrapper.clickByXpath(KNOW_BASE_LINK_XPATH);
        Thread.sleep(2000);
        String title= wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void verifyCanNotDelStandartTree() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        wrapper.closeAlertWindow();

    }
    //******************************************************************************************************************
    public String verifyAddBranchOnStandartTree() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        return text;
    }

    //******************************************************************************************************************
    public String verifyDeleteBranchOnStandartTreeWoSaving() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        return text;
    }

    //******************************************************************************************************************
    public String verifyDeleteBranchOnStandartTreeWithSaving() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, "12.05.2011");
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH,"12.05.2010");
        wrapper.sendKeysByXpath(LITER_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"98");
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        return text;
    }

    //******************************************************************************************************************
    public String verifyNotSaveBranchWithNotSavedInfo() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        return text;
    }

    //******************************************************************************************************************
    public String verifySaveBranchWithSavedInfo() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, "12.05.2011");
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH,"12.05.2010");
        wrapper.sendKeysByXpath(LITER_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH,"100");
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"98");
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public String verifyDateCorrectDate() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH,"12.12.2012");

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public String verifyTodayDate() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        String birthday = dayToday();

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, birthday);
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH, birthday);

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyAfterTodayDate() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, birthday);
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH, birthday);

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        Thread.sleep(1000);

    }

    //******************************************************************************************************************
    public String verifyBorderDate() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        String birthday = dayToday();

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, birthday);
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH, birthday);

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyBeforeBorderDate() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(USED_DATA_FIELD_XPATH, "01.01.1000");
        wrapper.sendKeysByXpath(BUILD_YEAR_FIELD_XPATH, "01.01.1000");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(8000);
        wrapper.closeAlertWindow();

    }

    //******************************************************************************************************************
    public void verifyFillingVAndSFraction() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "11,5");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "11.5");

        Thread.sleep(2000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(8000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public String verifyFillingVAndSCorrect() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);



        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "12");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "12");

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyFillingVAndSLatin() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "ZVw");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "ZVw");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingVAndSRus() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "ИМКУлло");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "ИМКУлло");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingVAndSSpecialSymbols() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "№;:!!!");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "№;:!!!");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public String verifyFillingVAndSCorrectBorder() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "1");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "1");

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyFillingVAndSNegative() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "-12");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "-12");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public String verifyFillingVAndSCorrectBorderTop() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "999999");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "999999");

        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyFillingVAndSIncorrectBorderTop() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(SQ_FIELD_XPATH, "1999999");
        wrapper.sendKeysByXpath(SIZE_FIELD_XPATH, "1999999");

        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationFraction1() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"12.5");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationFraction2() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"12,5");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public String verifyFillingDeteriorationCorrect() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH, "15");


        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationLatin() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"ZQWv");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationRus() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"Роим");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationSpecialSymb() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"№%?");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationNegative() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"-1");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public String verifyFillingDeteriorationCorrectTop() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH, "100");


        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public String verifyFillingDeteriorationCorrectLower() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH, "0");


        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(13000);
        wrapper.closeAlertWindow();

        wrapper.clickByXpath(COST_BTN_XPATH);
        wrapper.clickByXpath(COMPONET_PART_BTN_XPATH);
        Thread.sleep(1000);
        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        String text = wrapper.getJSText();
        log.info(text);
        Thread.sleep(1000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(DELETE_BTN_XPATH);
        Thread.sleep(5000);
        wrapper.closeAlertWindow();
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
        return text;
    }

    //******************************************************************************************************************
    public void verifyFillingDeteriorationBigTop() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.sendKeysByXpath(PCT_FIELD_XPATH,"101");


        Thread.sleep(8000);
        wrapper.scrollDown(SAVE_ALL_DATA_XPATH);
        wrapper.clickByXpath(SAVE_ALL_DATA_XPATH);
        Thread.sleep(10000);
        wrapper.closeAlertWindow();
    }

    //******************************************************************************************************************
    public List<String> verifyTableElementsComponetGarage() throws AWTException, InterruptedException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        log.info("Собираем данные в массив" );

        List<WebElement> rows = wrapper.findElementsByXpath(TD_CLASS_XPATH);

        log.info("Number of columns:"+rows.size());

        List<String> stringList = new ArrayList<>();
        for(int rnum=0;rnum<rows.size();rnum++)
        {

            log.info(rows.get(rnum).getText());
            stringList.add(rows.get(rnum).getText());
        }
        log.info(stringList);
        return stringList;
    }

    //******************************************************************************************************************
    public String  verifyAddNewCharsetToTree() throws InterruptedException, AWTException {
        log.info("Клик по дереву");
        wrapper.pressFullScreen();
        Thread.sleep(2000);
        wrapper.clickByXpath(JSTREE_ANCHORXPATH);
        wrapper.clickByXpath(ADD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_XPATH);
        wrapper.clickByXpath(SAVE_BRANCH_XPATH);
        wrapper.closeDialog(CLOSE_STANDART_TREE_TITLE_XPATH);
        Thread.sleep(2000);

        wrapper.clickByXpath(OPEN_STANDART_TREE_XPATH);
        wrapper.clickByXpath(INDIVIDUAL_GARAGE_ADDED_BRANCH_XPATH);
        wrapper.clickByXpath(ADD_ANOTHER_CHARSET_XPATH);
        wrapper.sendKeysByXpath(SEARCH_CHARASTERITIC_XPATH,"Площадь отмосток");
        wrapper.doubleClick(THEME_SIMPLE_XPATH);
        wrapper.robotESC();
        String title = wrapper.getTextByXpath(NEW_CHARASTERITIC_XPATH);
        return title;
    }



    //----------------------------------------Methods--------------------------------------------------------------
    //******************************************************************************************************************
    private String dayAfterToday() {
        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        return formatter.format(tomorrow);
    }
    //******************************************************************************************************************
    //******************************************************************************************************************
    private String dayToday() {
        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60));
        return formatter.format(tomorrow);
    }
}
