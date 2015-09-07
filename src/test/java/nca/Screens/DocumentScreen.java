package nca.Screens;


import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import nca.Utils.MyRandom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by makovskiy on 17.02.2015.
 */
public class DocumentScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

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

    public static final String FOREIGN_ADDRESS_BTN_XPATH = "//label[@for='inAdress1']";
    public static final String ENTER_ADDRESS_FIELD_XPATH = "//textarea[@id='enteredAddress1']";
    public static final String NATIONALITY_DROPDOWN_XPATH = "//span[@class='select2-chosen']";
    public static final String NATIONALITY_SEARCH_XPATH = "//input[@id='s2id_autogen1_search']";
    public static final String ADD_APP_Repr_XPATH = "//input[@id='addAppRepr']";
    public static final String FOWRWARD_BTN_XPATH = "//button[@id='forward']";
    public static final String FOWRWARD_INPUT_XPATH = "//input[@id='forward']";
    public static final String DEL_APP_REPR_XPATH = "//input[@value='удалить заявителя']";

    public static final String SURNAME_XPATH = "//input[@id='surname1']";
    public static final String USERNAME_XPATH = "//input[@id='userName1']";
    public static final String PATROMIC_XPATH = "//input[@id='patronymic1']";
    public static final String BIRHDAY_XPATH = "//input[@id='birth1']";
    public static final String IS_VALID_XPATH = "//input[@id='isValid1']";
    public static final String WHEN_IS_ISED_XPATH = "//input[@id='whenIssued1']";
    public static final String IS_ISED_XPATH = "//input[@id='issued1']";
    public static final String PERSONAL_NUMBER_XPATH = "//input[@id='personalNumber1']";
    public static final String MINSK_XPATH = "//*[contains(text(), 'г. Минск')]";
    public static final String STREET_RADIO_BTN_XPATH = "//input[@id='radioStreets']";
    public static final String SELECT_ELEM_INTERNAL_ADDRESS_XPATH = "//select[@id='selectElementOfInternalAddress']";
    public static final String SELECT_ELEM_STREET_INTERNAL_ADDRESS_XPATH = "//option[@value='46404']";
    public static final String ADDRESS_VALUE_XPATH = "//input[@value='33135']";
    public static final String ADD_ADDRESS_BTN_XPATH = "//input[@id='addAdrBut1']";

    public static final String OWNER_SHIP_DROP_XPATH = "//select[@id='ownership1']";
    public static final String ANOTHER_SUBJECT_XPATH = "//option[@value='13']";
    public static final String DESIGNATION_FIELD_XPATH = "//input[@id='designation1']";
    public static final String UNP_FIELD_XPATH = "//input[@id='UNN1']";
    public static final String DATE_REG_XPATH = "//input[@id='DateRegistration1']";
    public static final String REG_NUMBER_XPATH = "//input[@id='registrationNumber1']";

    public static final String FULL_NAME_XPATH = "//input[@id='fullName1']";
    public static final String UNP2_FIELD_XPATH = "//input[@id='UNNIP1']";
    public static final String BIRTH_FIELD_XPATH = "//input[@id='birthIP1']";
    public static final String DATE_REG_IP_FIELD_XPATH = "//input[@id='DateRegistrationIP1']";
    public static final String REG_NUM_IP_FIELD_XPATH = "//input[@id='registrationNumberIP1']";
    public static final String ADR_IP_BTN_XPATH = "//input[@id='adresIP1']";

    public static final String REPRESENTATIVE_LINK_XPATH = "//a[@href='#representative1']";
    public static final String AVAILABILITY_BTN_XPATH = "//label[@for='availabilityRep2']";
    public static final String FIZFACE2_XPATH = "//input[@id='fizFace2']";
    public static final String SURNAME2_XPATH = "//input[@id='surname2']";
    public static final String USERNAME2_XPATH = "//input[@id='userName2']";
    public static final String PATROMIC2_XPATH = "//input[@id='patronymic2']";
    public static final String BIRTH2_FIELD_XPATH = "//input[@id='birth2']";
    public static final String IS_VALID2_XPATH = "//input[@id='isValid2']";
    public static final String WHEN_IS_ISED2_XPATH = "//input[@id='whenIssued2']";
    public static final String IS_ISED2_XPATH = "//input[@id='issued2']";
    public static final String PERSONAL_NUMBER2_XPATH = "//input[@id='personalNumber2']";
    public static final String FIZ_ADDRESS2_XPATH = "//input[@id='adresFiz2']";
    public static final String ADD_EDIT_DATA2_XPATH = "//label[@for='addAR2']";
    public static final String FIND_BTN2_XPATH = "//input[@id='searchAddressBut2']";
    public static final String ADD_ADDRESS2_BTN_XPATH = "//input[@id='addAdrBut2']";
    public static final String UR2_USER_XPATH = "//input[@id='urik2']";
    public static final String OWNER_SHIP2_DROP_XPATH = "//select[@id='ownership2']";
    public static final String DESIGNATION2_FIELD_XPATH = "//input[@id='designation2']";
    public static final String UNP_FIELD2_XPATH = "//input[@id='UNN2']";
    public static final String DATE_REG2_XPATH = "//input[@id='DateRegistration2']";
    public static final String REG2_NUMBER_XPATH = "//input[@id='registrationNumber2']";
    public static final String IP2_USER_XPATH = "//input[@id='ipe2']";
    public static final String FULL2_NAME_XPATH = "//input[@id='fullName2']";
    public static final String UNP2_FIELD2_XPATH = "//input[@id='UNNIP2']";
    public static final String BIRTH2_FIELD2_XPATH = "//input[@id='birthIP2']";
    public static final String DATE_REG2_IP_FIELD_XPATH = "//input[@id='DateRegistrationIP2']";
    public static final String REG_NUM_IP2_FIELD_XPATH = "//input[@id='registrationNumberIP2']";
    public static final String ADR_IP2_BTN_XPATH = "//input[@id='adresIP2']";

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
    public static final String VIEW_WINDOW_XPATH = "//span[@class='ui-dialog-title']";
    public static final String CLOSE_UI_WIN_XPATH = "//button[@class='ui-dialog-titlebar-close']";




    DocumentScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public String getTitleDocumentPage() throws InterruptedException, AWTException {
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
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Замок");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        String getTitle = wrapper.getPageTitle();
        return getTitle;
    }

    //******************************************************************************************************************
    public void verifyElementsBackBtn() throws InterruptedException, AWTException {
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
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Замок");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(BACK_BTN_XPATH);
        Thread.sleep(4000);
    }

    //******************************************************************************************************************
    public void verifyDataAfterBackBtn() throws InterruptedException, AWTException {
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
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Замок");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(BACK_BTN_XPATH);
        Thread.sleep(4000);
    }

    //******************************************************************************************************************
    public void verifyElemDocumentPage() throws InterruptedException, AWTException {
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
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Замок");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
    }

    //******************************************************************************************************************
    public void  noFillingFieldDocPage() throws InterruptedException, AWTException {
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
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Замок");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingDocNameWithLatinSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"Свидетельство Z");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"БТИ");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingDocNameWithIncorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"Свидетельство!");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"БТИ");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String fillingDocNameWithCorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"Свидетельство!");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"БТИ");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String  fillingDocNameWithOneSymbol() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"БТИ");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void fillingOrgLatinSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"Свидетельство Z");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingOrgIncorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"Свидетельство!");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String fillingOrgCorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"Свидетельство - №(1)");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String fillingOrgOneSymbol() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");
        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH,"04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void fillingDateAfterToday() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"123");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");

        String birthday = dayAfterToday();

        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, birthday);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingNumberLatinSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021ZQ");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingNumberRusSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021ИЦ");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingNumberSpaceSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"211220    21");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingNumberSpecialSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"211220!!21");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingCommentLatinSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"КомментарийZ");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingCommentIncorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий!");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String fillingCommentCorrectSymbols() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"Комментарий-№(1)");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String fillingCommentOneSymbol() throws InterruptedException, AWTException {//убрать Thread.sleep
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
        String randomObjName = MyRandom.generateString(rand, "АБВГДЕПРАОВГУ", 8);
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
        wrapper.sendKeysByXpath(DOC_NAME_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_ORG_FIELD_XPATH,"С");
        wrapper.sendKeysByXpath(DOC_NUMBER_FIELD_XPATH,"21122021");
        wrapper.sendKeysByXpath(DOC_COMMENT_FIELD_XPATH,"К");


        wrapper.sendKeysByXpath(DOC_DATA_FIELD_XPATH, "04.02.2015");
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //***************************Methods********************************************************************************
    private String dayAfterToday() {
        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        return formatter.format(tomorrow);
    }
}
