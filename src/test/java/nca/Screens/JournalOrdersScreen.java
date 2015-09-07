package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.MyRandom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by makovskiy on 09.02.2015.
 */
public class JournalOrdersScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    public static final String GO_TO_MAIN_XPATH = "//a[@href='guide.html']";
    public static final String GO_TO_JOURNAL_ORDER_XPATH = "//a[@href='journal.html']";
    public static final String GO_TO_FIND_VIEW_OBJECT_XPATH = "//a[@href='moduleSearch.html']";
    public static final String GO_TO_BASE_KNOWLEGE_PAGE_XPATH = "//*[contains(text(), 'База знаний')]";// Добавить норма XPATH
    public static final String GO_TO_REESTR_PAGE_XPATH = "//a[@href='general.html']";
    public static final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'Личный кабинет')]";//заменить на норм xpath
    public static final String GO_TO_HELP_PAGE_XPATH = "//*[contains(text(), 'Помощь')]";
    public static final String EXIT_XPATH = "//a[@href='/j_spring_security_logout']";

    public static final String NEW_ORDER_XPATH = "//button[@id='newOrder']";
    public static final String VIEW_OERDER_XPATH = "//button[@id='viewOrder']";
    public static final String CHOICE_SEARCH_FIELDS_XPATH = "//select[@id='choiceSearchFields']";
    public static final String SEARCH_XPATH = "//input[@id='search']";
    public static final String ADD_CHARACTERISTIC_XPATH = "//button[@id='addCharacteristic']";

    public static final String TH_CLASS_HEADER_XPATH = "//th[@class='header']";

    public static final String CODE_ORGANIZTION_XPATH = "//input[@id='inventoryFirst']";
    public static final String INVENTORY_SECOND_XPATH = "//select[@id='inventorySecond']";
    public static final String INVENTORY_SECOND_SELECT_XPATH = "//option[@value='2']";
    public static final String INVENTORY_THIRD_XPATH = "//input[@id='inventoryThird']";
    public static final String FIZ2_ADDRESS_XPATH = "//input[@id='adresFiz']";
    public static final String FIND2_BTN_XPATH = "//input[@id='searchAddressBut']";
    public static final String ADD2_ADDRESS_BTN_XPATH = "//input[@id='addAdrBut']";
    public static final String OBJ_TYPE_BTN_XPATH = "//select[@id='objType']";
    public static final String OBJ_TYPE_VALUE2_BTN_XPATH = "//*[contains(text(), 'Одноквартирный, блокированный жилой дом ')]";
    public static final String OBJ_TYPE_VALUE1_BTN_XPATH = "//option[@value='1']";
    public static final String NAME_OBJ_FIELD_XPATH = "//input[@id='nameObj']";
    public static final String FOR_BUILDING_SELECT_XPATH = "//select[@id='forBuilding']";
    public static final String NO_LIVE_BUILDING_OPTION_XPATH = "//option[@value='22000']";
    public static final String BACK_BTN_XPATH = "//input[@value='← Назад']";

    public static final String FILE_UPLOAD_BTN_XPATH = "//input[@id='fileupload']";
    public static final String DOC_TYPE_SELECT_XPATH = "//select[@id='docType1']";
    public static final String DOC_TYPE_ACT_OPTION_XPATH = "//option[@value='3200']";
    public static final String DOC_NAME_FIELD_XPATH = "//input[@id='docName1']";
    public static final String DOC_ORG_FIELD_XPATH = "//input[@id='docOrg1']";
    public static final String DOC_DATA_FIELD_XPATH = "//input[@id='docDate1']";
    public static final String DOC_NUMBER_FIELD_XPATH = "//input[@id='docNumber1']";
    public static final String DOC_COMMENT_FIELD_XPATH = "//textarea[@id='docComment1']";
    public static final String WORK_NAME_SELECT_XPATH = "//select[@id='workName1']";
    public static final String WORK_NAME_SELECT100_XPATH = "//option[@value='100']";
    public static final String EXECUTOR_SELECT_XPATH = "//select[@id='executor1']";
    public static final String EXECUTOR_SELECT3_XPATH = "//option[@value='3']";
    public static final String CHECKING_SELECT_XPATH = "//select[@id='checking1']";
    public static final String CHECKING_SELECT3_XPATH = "//option[@value='3']";
    public static final String STATUS_DATA_FIELD_XPATH = "//input[@id='statusDate1']";

    public static final String APPLICANT_XPATH = "//a[@href='#applicant1']";
    public static final String REPRESENTATIVE_XPATH = "//a[@href='#representative1']";
    public static final String FIZFACE_XPATH = "//input[@id='fizFace1']";
    public static final String ADD_EDIT_DATA_XPATH = "//*[contains(text(), 'Внести/редактировать данные о заявителе?')]";
    public static final String FIZ_UR_IP_USER_XPATH = "//td[@align='right']";
    public static final String UR_USER_XPATH = "//input[@id='urik1']";
    public static final String IP_USER_XPATH = "//input[@id='ipe1']";
    public static final String FIZ_ADDRESS_XPATH = "//input[@id='adresFiz1']";
    public static final String GET_TITLE_ADDRESS_XPATH = "//span[@id='ui-id-6']";
    public static final String FIND_BTN_XPATH = "//input[@id='searchAddressBut1']";

    public static final String OWNER_SHIP_DROP_XPATH = "//select[@id='ownership1']";
    public static final String ANOTHER_SUBJECT_XPATH = "//option[@value='13']";
    public static final String DESIGNATION_FIELD_XPATH = "//input[@id='designation1']";
    public static final String UNP_FIELD_XPATH = "//input[@id='UNN1']";
    public static final String DATE_REG_XPATH = "//input[@id='DateRegistration1']";
    public static final String REG_NUMBER_XPATH = "//input[@id='registrationNumber1']";

    public static final String FOWRWARD_BTN_XPATH = "//button[@id='forward']";
    public static final String FOWRWARD_INPUT_XPATH = "//input[@id='forward']";

    public static final String MINSK_XPATH = "//*[contains(text(), 'г. Минск')]";
    public static final String STREET_RADIO_BTN_XPATH = "//input[@id='radioStreets']";
    public static final String SELECT_ELEM_INTERNAL_ADDRESS_XPATH = "//select[@id='selectElementOfInternalAddress']";
    public static final String SELECT_ELEM_STREET_INTERNAL_ADDRESS_XPATH = "//option[@value='46404']";
    public static final String ADDRESS_VALUE_XPATH = "//input[@value='33135']";
    public static final String ADD_ADDRESS_BTN_XPATH = "//input[@id='addAdrBut1']";
    public static final String VIEW_WINDOW_XPATH = "//span[@class='ui-dialog-title']";
    public static final String CLOSE_UI_WIN_XPATH = "//button[@class='ui-dialog-titlebar-close']";
    public static final String PRESENTATION_TAB_XPATH = "//a[@href='#tabs-2']";
    public static final String DOC_TAB_XPATH = "//a[@href='#tabs-3']";
    public static final String OPERATION_TAB_XPATH = "//a[@href='#tabs-4']";
    public static final String EDIT_BTN_OBJ_XPATH = "//input[@id='editButtonObject']";
    public static final String EDIT_BTN_DOC_XPATH = "//input[@id='editButtonDocuments']";
    public static final String EDIT_BTN_OPER_XPATH = "//input[@id='editButtonOperations']";
    public static final String ALERTIFY_BTN_XPATH = "//button[@id='alertify-ok']";



    JournalOrdersScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String getPageTitle(){
        String getJournalPageTitle = wrapper.getPageTitle();
        return getJournalPageTitle;
    }

    //******************************************************************************************************************
    public List<String> verifyElementsJournalOrderHeader(){
        log.info("Собираем данные в массив" );
        List<String> elementsOnJournalOrderHeader = new ArrayList<String>(8);
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_MAIN_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_JOURNAL_ORDER_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_FIND_VIEW_OBJECT_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_BASE_KNOWLEGE_PAGE_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_REESTR_PAGE_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_CABINET_PAGE_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(GO_TO_HELP_PAGE_XPATH));
        elementsOnJournalOrderHeader.add(wrapper.getTextByXpath(EXIT_XPATH));

        String dataResult = "";
        for (int i = 0; i < elementsOnJournalOrderHeader.size(); i++) {
            dataResult = dataResult + elementsOnJournalOrderHeader.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnJournalOrderHeader: " + dataResult);

        return elementsOnJournalOrderHeader;
    }

    //******************************************************************************************************************
    public List<String> verifyElementsJournalOrderPage(){
        log.info("Собираем данные в массив" );
        List<String> elementsOnJournalOrderPage = new ArrayList<String>(5);
        elementsOnJournalOrderPage.add(wrapper.getTextByXpath(NEW_ORDER_XPATH));
        elementsOnJournalOrderPage.add(wrapper.getTextByXpath(VIEW_OERDER_XPATH));
        elementsOnJournalOrderPage.add(wrapper.getTextByXpath(CHOICE_SEARCH_FIELDS_XPATH));
        elementsOnJournalOrderPage.add(wrapper.getTextByXpath(SEARCH_XPATH));
        elementsOnJournalOrderPage.add(wrapper.getTextByXpath(ADD_CHARACTERISTIC_XPATH));

        String dataResult = "";
        for (int i = 0; i < elementsOnJournalOrderPage.size(); i++) {
            dataResult = dataResult + elementsOnJournalOrderPage.get(i) + " ";
        }
        log.info("ВСЕ ДАННЫЕ МАССИВА elementsOnJournalOrderPage: " + dataResult);

        return elementsOnJournalOrderPage;
    }

    //******************************************************************************************************************
    public List<WebElement> verifyElementsJournalOrderTab(){
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
    public String getTitleNewOrder(){
        wrapper.clickByXpath(NEW_ORDER_XPATH);
        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }

    //******************************************************************************************************************
    public String verifyViewBtn() throws InterruptedException, AWTException {//убрать Thread.sleep
        Thread.sleep(6000);
        wrapper.clickByXpath(NEW_ORDER_XPATH);
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        Thread.sleep(4000);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "123456789");
        wrapper.clickByXpath(FIZ2_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.clickByXpath(SELECT_ELEM_STREET_INTERNAL_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(FIND2_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD2_ADDRESS_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE2_BTN_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE1_BTN_XPATH);

        Random rand = new Random();
        String randomObjName = MyRandom.generateString(rand, "FINDNAME", 8);
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, randomObjName);

        Thread.sleep(2000);
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(FILE_UPLOAD_BTN_XPATH);//OpenScreen
        Thread.sleep(2000);
        wrapper.setClipboardData("C:\\upload.txt");
        Thread.sleep(2000);
        wrapper.addFile();
        wrapper.clickByXpath(DOC_TYPE_SELECT_XPATH);
        wrapper.clickByXpath(DOC_TYPE_ACT_OPTION_XPATH);
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"Сертификат");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"БТИ");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(WORK_NAME_SELECT_XPATH);
        Thread.sleep(500);
        wrapper.clickByXpath(WORK_NAME_SELECT100_XPATH);
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        Thread.sleep(500);
        wrapper.clickByXpath(EXECUTOR_SELECT_XPATH);
        wrapper.clickByXpath(EXECUTOR_SELECT3_XPATH);
        Thread.sleep(500);
        wrapper.clickByXpath(CHECKING_SELECT_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        //wrapper.clickByXpath(CHECKING_SELECT3_XPATH);
        wrapper.sendKeysByXpath(STATUS_DATA_FIELD_XPATH,"04.02.2015");
        Thread.sleep(500);
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String getTitle = wrapper.getPageTitle();
        log.info(getTitle);
        log.info(String.format("Элемент по xpath = %s найден", randomObjName));

        wrapper.containText(randomObjName);

        final String OBJ_NAME_XPATH = "//*[contains(text(),'" + randomObjName + "')]";
        log.info(OBJ_NAME_XPATH);
        wrapper.scrollDown(OBJ_NAME_XPATH);
        wrapper.doubleClick(OBJ_NAME_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getTextByXpath(VIEW_WINDOW_XPATH);
        wrapper.clickByXpath(CLOSE_UI_WIN_XPATH);
        return title;
    }

    //******************************************************************************************************************
    public void verifyElemViewTabObj() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyElemViewTabPresentation() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(PRESENTATION_TAB_XPATH);
    }

    //******************************************************************************************************************
    public void verifyElemViewTabDoc() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(DOC_TAB_XPATH);
    }

    //******************************************************************************************************************
    public void verifyElemViewTabOperation() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPERATION_TAB_XPATH);
    }

    //******************************************************************************************************************
    public String verifyElemViewTabObjEditBtn() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(EDIT_BTN_OBJ_XPATH);
        wrapper.GetTabFocus();
        Thread.sleep(2000);
        wrapper.clickByXpath(ALERTIFY_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyElemViewTabPresentationEditBtn() throws InterruptedException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(PRESENTATION_TAB_XPATH);
        wrapper.clickByXpath(EDIT_BTN_OBJ_XPATH);
        wrapper.GetTabFocus();
        Thread.sleep(2000);
        wrapper.clickByXpath(ALERTIFY_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyElemViewTabDocEditBtn() throws InterruptedException, AWTException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(DOC_TAB_XPATH);
        wrapper.clickByXpath(EDIT_BTN_DOC_XPATH);
        wrapper.GetTabFocus();
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyElemViewTabOperationEditBtn() throws InterruptedException, AWTException {
        Thread.sleep(6000);
        final String GO_TO_CABINET_PAGE_XPATH = "//*[contains(text(), 'NFDMDAAN')]";
        wrapper.scrollDown(GO_TO_CABINET_PAGE_XPATH);
        wrapper.doubleClick(GO_TO_CABINET_PAGE_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OPERATION_TAB_XPATH);
        wrapper.clickByXpath(EDIT_BTN_OPER_XPATH);
        wrapper.GetTabFocus();
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        String title = wrapper.getPageTitle();
        return title;
    }

}
