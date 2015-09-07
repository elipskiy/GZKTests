package nca.Screens;


import com.codeborne.selenide.ex.ElementNotFound;
import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by makovskiy on 10.02.2015.
 */
public class NewSubjectScreen {
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
    public static final String BACK1_BTN_XPATH = "//a[@id='cancel']";

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
    public static final String FOWRWARD_INPUT_XPATH = "//input[@id='forward']";
    public static final String SELECT_ELEM_STREET_INTERNAL_ADDRESS_XPATH = "//option[@value='46404']";
    public static final String CHECK_BOX_NO_OTCHESTVO_XPATH = "//input[@id='NoPatronymic']";
    final static String EXIT_XPATH = "//a[@href='/j_spring_security_logout']";
    public static final String SELECT_COUNTRY_XPATH = "//div[@id='s2id_selectCountry1']";
    public static final String SELECT_COUNTRY_SEARCH_XPATH = "//input[@id='s2id_autogen1_search']";
    public static final String SELECT_COUNTRY_SEARCH_AUSTRALIAN_XPATH = "//*[contains(text(), 'Австралия')]";



    NewSubjectScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //******************************************************************************************************************
    public void verifyElemNewSubjScreen_1(){
        log.info("Перешли на страницу Субъект");
    }

    //******************************************************************************************************************
    public List<String> verifyElemNewSubjScreenFiz(){
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        return addElementsToList(FIZ_UR_IP_USER_XPATH);
    }

    //******************************************************************************************************************
    public List<String> verifyElemNewSubjScreenUr(){
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        wrapper.clickByXpath(UR_USER_XPATH);
        return addElementsToList(FIZ_UR_IP_USER_XPATH);
    }

    //******************************************************************************************************************
    public List<String> verifyElemNewSubjScreenIP(){
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        wrapper.clickByXpath(IP_USER_XPATH);
        return addElementsToList(FIZ_UR_IP_USER_XPATH);
    }

    //******************************************************************************************************************
    public void findUserByLastNameOnSubjectScreen() throws AWTException {
        wrapper.sendKeysByXpath(FIZFACE_XPATH,"Фамилия");
        wrapper.pressEnter(FIZFACE_XPATH);
    }

    //******************************************************************************************************************
    public void findUserByLastNameOnSubjectScreenByEnter() throws AWTException {
        wrapper.sendKeysByXpath(FIZFACE_XPATH,"Фамилия");
        wrapper.pressOnlyEnter(FIZFACE_XPATH);
    }

    //******************************************************************************************************************
    public String getTitleEditAddressWindow() throws InterruptedException {
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(3000);
        String getText = wrapper.getTextByXpath(GET_TITLE_ADDRESS_XPATH);
        wrapper.pressESC(FIND_BTN_XPATH);
        return getText;
    }

    //******************************************************************************************************************
    public boolean foreignAddressField() throws InterruptedException {
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(3000);
        wrapper.clickByXpath(FOREIGN_ADDRESS_BTN_XPATH);
        boolean result = wrapper.isEnable(ENTER_ADDRESS_FIELD_XPATH);
        return result;
    }

    //******************************************************************************************************************
    public void chooseNationality() throws InterruptedException, AWTException {
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(3000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(NATIONALITY_DROPDOWN_XPATH);
        wrapper.sendKeysByXpath(NATIONALITY_SEARCH_XPATH,"Арме");
        wrapper.pressDownEnter(NATIONALITY_SEARCH_XPATH);
    }

    //******************************************************************************************************************
    public void addApplicant() throws AWTException, InterruptedException {
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.scrollDown(ADD_APP_Repr_XPATH);
        wrapper.clickByXpath(ADD_APP_Repr_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
    }

    //******************************************************************************************************************
    public void delApplicant() throws AWTException, InterruptedException {
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.scrollDown(ADD_APP_Repr_XPATH);
        wrapper.clickByXpath(ADD_APP_Repr_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(DEL_APP_REPR_XPATH);
        wrapper.pressFullScreen();
    }
    //******************************************************************************************************************
    public String addNewApplicantFiz() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Сидоров");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH,"Сидоров");
        wrapper.sendKeysByXpath(USERNAME_XPATH,"Семен");
        wrapper.sendKeysByXpath(PATROMIC_XPATH,"Семенович");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH,"Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String addNewApplicantUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH,"21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String addNewApplicantIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "Standard Oil");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String addNewRepresentativeFIZ()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Сидоров");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"Сидоров");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"Семен");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"Семенович");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH,"Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH,"41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String addNewRepresentativeUR()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Сидоров");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(OWNER_SHIP2_DROP_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_XPATH, "21.12.2012");
        wrapper.pressEnterOnly();
        Thread.sleep(500);
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String addNewRepresentativeIP()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Сидоров");
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "Standard Oil");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void getObjecPageScreenShot() throws AWTException, InterruptedException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Сидоров");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(OWNER_SHIP2_DROP_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_XPATH, "21.12.2012");
        wrapper.pressEnterOnly();
        Thread.sleep(500);
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyDataAfterClickBackBtn() throws AWTException, InterruptedException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Сидоров");
        Thread.sleep(2000);
        wrapper.pressFullScreen();
        wrapper.clickByXpath(OWNER_SHIP2_DROP_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_XPATH, "21.12.2012");
        wrapper.pressEnterOnly();
        Thread.sleep(500);
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(BACK1_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void noFillingFieldOrgId() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "");//
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
    public void noFillingFieldInventory() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "");
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
    public void noFillingFieldFormObj() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
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
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        wrapper.closeAlertWindow();
        Thread.sleep(1000);
    }

    //******************************************************************************************************************
    public void noFillingFieldObjAddress() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
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
    public String useCorrectSimbols() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Д'Артаньян-Мушкетер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String useCorrectSmallSimbols() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "д'Артаньян-Мушкетер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }


    //******************************************************************************************************************
    public void verifyCheckBox() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "д'Артаньян-Мушкетер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        try {
            log.info("Проверяем чек-бокс");
            wrapper.findByXpath(CHECK_BOX_NO_OTCHESTVO_XPATH);
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            wrapper.clickByXpath(EXIT_XPATH);
        }
    }

    //******************************************************************************************************************
    public void useIncorrectSimbols() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "д'Артаньян-Мушкетер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "д'Артаньян!Мушкетер");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "д'Артаньян!Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "д'Артаньян!Мушкетер");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String minValueSymbols() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "М");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "М");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "М");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "М");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }


    //******************************************************************************************************************
    public void useLatinSymbols() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "ZZZ");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "ZZZ");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "ZZZ");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "ZZZ");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "ZZZ");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void birthBeforeToday() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "ZZZ");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,birthday);
        wrapper.sendKeysByXpath(IS_VALID_XPATH,birthday);
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,birthday);
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void noFillingPersonalNumberNationalityRB() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Аноним");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        //wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String noFillingPersonalNumberNationalityAnother() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        //wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");
        wrapper.clickByXpath(SELECT_COUNTRY_XPATH);
        wrapper.sendKeysByXpath(SELECT_COUNTRY_SEARCH_XPATH, "Австра");
        wrapper.pressEnterOnly();

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void birthActualBeforeToday() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);


        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String  correctIdentificationNumber() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);


        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"1121212B123RB1");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String  correctIdentificationNumberWithMessage() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);


        wrapper.sendKeysByXpath(SURNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(USERNAME_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PATROMIC_XPATH, "Аноним");
        wrapper.sendKeysByXpath(BIRHDAY_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_VALID_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(WHEN_IS_ISED_XPATH,"12.12.2000");
        wrapper.sendKeysByXpath(IS_ISED_XPATH, "Аноним");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"1121212312661");

        wrapper.clickByXpath(FIZ_ADDRESS_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        String text = wrapper.getTextByXpath("");
        wrapper.clickByXpath("");
        Thread.sleep(2000);
        return text;
    }

    //******************************************************************************************************************
    public String verifyOneSymbolDesignationField()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "А");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void fillingRegDayAfrterToDay()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "А");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, birthday);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyLatinSymbolDesignationField()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ZZZZZZ");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String verifySpecialSymbolDesignationField()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аир!!!тт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void verify8SymbolsRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "12021123");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verify10SymbolsRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "1202112317");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyLatinSymbolsRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "Zzzzzzzzz");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyRusSymbolsRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "фывапролд");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifySpaceSymbolRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "1234 5678");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifySpecialSymbolRegNumber()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "1234!5678");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verify8SymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "12345678");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verify10SymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "1234567890");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyRusSymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "смитьбючс");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifyLatinSymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "zzzzzzz");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifySpecialSymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123!45678");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void verifySpaceSymbolUnp()  throws InterruptedException, AWTException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "Аиртт");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123 45678");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void useLatinSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "zn");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String fullNameSpecialSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "чс!ур");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String fullNameOneSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void unp8SymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"12345678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unp10SymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"1234567890");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpRusSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"рус");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpLatinSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"zzzzzzzzz");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpSpecialSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpSpaceSymbolIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegField8SymbolIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"12021123");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegField10SymbolIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"1202112317");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegFieldLatinSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"Zzzzzzzzz");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegFieldRusSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"фывапролд");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegFieldSpaceSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"1234 5678");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void numRegSpecialSymbolsIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"1234!5678");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regDayAfterToDayIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH, birthday);
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"120211236");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void birthDayAfterToDayIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(IP_USER_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.sendKeysByXpath(FULL_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH_FIELD_XPATH, birthday);
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG_IP_FIELD_XPATH, "21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP_FIELD_XPATH,"120211236");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String  nameLastNPatromicFieldsRepresentFizSpecialSymbols() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"Д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String  nameLastNPatromicFieldsRepresentFizSmallSymbols() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void verifyCheckBoxRepresentFiz() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);

        try {
            log.info("Проверяем чек-бокс");
            wrapper.findByXpath(CHECK_BOX_NO_OTCHESTVO_XPATH);
        } catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
        finally {
            wrapper.clickByXpath(EXIT_XPATH);
        }
    }

    //******************************************************************************************************************
    public void nameLastNPatromicFieldsRepresentFizSpecialsSymbols() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void nameLastNPatromicFieldsRepresentFizNumericSymbols() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"Муш!кетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "Мозырский РОВД");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String nameLastNPatromicFieldsRepresentFizOneSymbol() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"М");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"М");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"М");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "М");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void nameLastNPatromicFieldsRepresentFizLatinSymbols() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"ZZZZ");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"ZZZZ");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"ZZZZZ");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "ZZZZ");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);

    }

    //******************************************************************************************************************
    public void birthWhenIsUserFieldsRepresentFizDayAfterToday() throws InterruptedException, AWTException {
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH,"Д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH,"д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH, birthday);
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, "12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH, birthday);
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH, "41212120Н044РВ1");
        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void noFillingPersonalNumberNationalityRBRepresentFiz() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "д'Артаньян-Мушкетер");
        //wrapper.sendKeysByXpath(PERSONAL_NUMBER_XPATH,"41212120Н044РВ1");

        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fillingIsValidDayAfterToDayRepresentFiz() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH,"41212120Н044РВ1");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH, birthday);
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "д'Артаньян-Мушкетер");


        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String personalNumberValidDataRepresentFiz() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(SURNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(USERNAME2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PATROMIC2_XPATH, "д'Артаньян-Мушкетер");
        wrapper.sendKeysByXpath(PERSONAL_NUMBER2_XPATH,"1121212B123RB1");
        wrapper.sendKeysByXpath(BIRTH2_FIELD_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_VALID2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(WHEN_IS_ISED2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(IS_ISED2_XPATH, "д'Артаньян-Мушкетер");


        wrapper.clickByXpath(FIZ_ADDRESS2_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void fullNameLatinSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"Zzzzzzz");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public String fullNameSpecialValidSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"Аир!!!тт");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String fullNameOneSymbolRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void regDateAfterTodayRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        String birthday = dayAfterToday();

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH, birthday);
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNum8SymbolRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"12021123");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNum10SymbolRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"1202112317");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNumLatinSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"Zzzzzzzzz");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNumRusSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"фывапролд");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNumSpaceSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"1234 5678");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void regNumSpecialSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"1234!5678");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unp8SymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"12345678");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unp10SymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"1234567890");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpRusSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"смитьбючс");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpLatinSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"zzzzzzzzz");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpSpecialSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123!45678");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void unpSpaceSymbolsRepresentUR() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(UR2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "д'Артаньян-Мушкетер");
        Thread.sleep(2000);

        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        wrapper.sendKeysByXpath(REG2_NUMBER_XPATH,"123456789");
        wrapper.sendKeysByXpath(DATE_REG2_XPATH,"12.12.2012");
        wrapper.sendKeysByXpath(UNP_FIELD2_XPATH,"123 45678");
        wrapper.sendKeysByXpath(DESIGNATION2_FIELD_XPATH,"А");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
    }

    //******************************************************************************************************************
    public void fullNameLatinSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "zn");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public String fullNameSpecialValidSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "чс!ур");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String fullNameOneSymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void unp8SymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"12345678");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void unp10SymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"1234567890");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void unpRusSymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"смитьбючс");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void unpLatinSymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"Zzzzzz");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void unpInvalidSpecialSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123!45678");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void unpSpaceSymbolRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123 45678");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"123456789");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumber8SymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"12021123");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumber10SymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"1202112317");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumberLatinSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"Zzzzzzzzz");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumberRusSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"фывапролд");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumberSpaceSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"фывапролд");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void regNumberSpecialSymbolsRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"1234!5678");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void icorrectRegDateRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();


        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH,"21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH, birthday);
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"1234!5678");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void icorrectBirthDateRepresentIP() throws InterruptedException, AWTException {//Нужно будет подредактировать
        wrapper.clickByXpath(REPRESENTATIVE_LINK_XPATH);
        wrapper.clickByXpath(IP2_USER_XPATH);
        wrapper.clickByXpath(AVAILABILITY_BTN_XPATH);
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(FIZFACE2_XPATH, "Рокфеллер");
        wrapper.clickByXpath(ADD_EDIT_DATA2_XPATH);
        Thread.sleep(2000);

        String birthday = dayAfterToday();


        wrapper.sendKeysByXpath(FULL2_NAME_XPATH, "ч");
        wrapper.sendKeysByXpath(UNP2_FIELD2_XPATH,"123456789");
        wrapper.sendKeysByXpath(BIRTH2_FIELD2_XPATH, birthday);
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(DATE_REG2_IP_FIELD_XPATH, "21.12.2012");
        wrapper.pressEnterOnly();
        wrapper.sendKeysByXpath(REG_NUM_IP2_FIELD_XPATH,"1234!5678");
        wrapper.clickByXpath(ADR_IP2_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(MINSK_XPATH);
        wrapper.clickByXpath(STREET_RADIO_BTN_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(SELECT_ELEM_INTERNAL_ADDRESS_XPATH);
        wrapper.pressDownOnly();
        wrapper.pressEnterOnly();
        wrapper.clickByXpath(FIND_BTN2_XPATH);
        Thread.sleep(4000);
        wrapper.clickByXpath(ADDRESS_VALUE_XPATH);
        wrapper.clickByXpath(ADD_ADDRESS2_BTN_XPATH);
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(3000);
    }

    //******************************************************************************************************************
    public void filingInventoryNumWithText() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345п56");
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
    public void filingInventoryNumWith7Text() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "1234561");
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
    public void filingInventoryNumWith9Text() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "123411561");
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
    public void filingInventoryNumWithSpecialSymbols() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345!56");
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
    public void filingObjectNameIncorrectSpecialSymbols() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345!56");
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE2_BTN_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE1_BTN_XPATH);
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Домик у моря!");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
    }

    //******************************************************************************************************************
    public String filingObjectNameCorrectSpecialSymbols() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345678");
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE2_BTN_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE1_BTN_XPATH);
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Домик - море(№1)");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String filingObjectNameOneSymbol() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345678");
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE2_BTN_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE1_BTN_XPATH);
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Д");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public void filingObjectNameLatinSymbols() throws AWTException, InterruptedException {
        wrapper.clickByXpath(UR_USER_XPATH);
        wrapper.sendKeysByXpath(FIZFACE_XPATH, "Пупкин");
        wrapper.clickByXpath(ADD_EDIT_DATA_XPATH);
        Thread.sleep(2000);
        wrapper.clickByXpath(OWNER_SHIP_DROP_XPATH);
        wrapper.clickByXpath(ANOTHER_SUBJECT_XPATH);
        wrapper.sendKeysByXpath(DESIGNATION_FIELD_XPATH, "ООО Рога И Копыта");
        wrapper.sendKeysByXpath(UNP_FIELD_XPATH, "123456789");
        wrapper.sendKeysByXpath(DATE_REG_XPATH, "21.12.2012");
        wrapper.pressFullScreen();
        wrapper.sendKeysByXpath(REG_NUMBER_XPATH, "123456789");
        wrapper.scrollDown(FOWRWARD_BTN_XPATH);
        wrapper.clickByXpath(FOWRWARD_BTN_XPATH);
        Thread.sleep(2000);
        wrapper.sendKeysByXpath(CODE_ORGANIZTION_XPATH, "100");//
        wrapper.clickByXpath(INVENTORY_SECOND_XPATH);
        wrapper.clickByXpath(INVENTORY_SECOND_SELECT_XPATH);
        wrapper.sendKeysByXpath(INVENTORY_THIRD_XPATH, "12345678");
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE2_BTN_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(OBJ_TYPE_BTN_XPATH);
        wrapper.clickByXpath(OBJ_TYPE_VALUE1_BTN_XPATH);
        wrapper.sendKeysByXpath(NAME_OBJ_FIELD_XPATH, "Домик у мореZZZ");
        wrapper.clickByXpath(FOR_BUILDING_SELECT_XPATH);
        wrapper.clickByXpath(NO_LIVE_BUILDING_OPTION_XPATH);
        wrapper.pressEnterOnly();
        Thread.sleep(2000);
        wrapper.clickByXpath(FOWRWARD_INPUT_XPATH);
        Thread.sleep(4000);
    }

    //***************************Methods********************************************************************************
    private List<String> addElementsToList(String xpath) {
        List<WebElement> rows = wrapper.findElementsByXpath(xpath);

        log.info("Number of columns:"+rows.size());

        List<String> stringList = new ArrayList<>();
        for(int rnum=0;rnum<rows.size();rnum++)
        {

            log.info(rows.get(rnum).getText());
            if (rows.get(rnum).getText() != null && !((String) rows.get(rnum).getText()).equals("")) {
                stringList.add(rows.get(rnum).getText());
            }
        }
        log.info(stringList);
        return stringList;
    }
    //******************************************************************************************************************
    private String dayAfterToday() {
        Date today = new Date();
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        return formatter.format(tomorrow);
    }
}
