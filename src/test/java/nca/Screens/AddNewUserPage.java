package nca.Screens;

import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class AddNewUserPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AddNewUserPage.class);

    AddNewUserPage(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //Xpath
    private static final String FIND_BTN_XPATH = "//input[@id='findSTIUser']";
    private static final String LAST_NAME_FIELD_XPATH = "//input[@id='lastName']";
    private static final String FIRST_NAME_FIELD_XPATH = "//input[@id='firstName']";
    private static final String PATROMIC_FIELD_XPATH = "//input[@id='patronymic']";

    private static final String SELECT_ORG_100_BREST_AGENCY = "$('#codeOrganization').select2('val',100);";
    private static final String SELECT_WORKER_POSITION = "$('#s2id_position').select2('val',2);";

    private static final String SELECT_ROLE_ADMIN = "$('#roleID').select2('val',ROLE_ADMIN).trigger('change');";
    private static final String SELECT_ROLE_ADMIN2 = "$('#roleID').val(ROLE_ADMIN);";

    private static final String WORKER_POSITION_DROPDOWN_XPATH = "//div[@id='s2id_position']";
    private static final String WORKER_POSITION_LEAD_ENGINEER_XPATH = "//option[@value='2']";
    private static final String SUBVISION_FIELD_XPATH = "//input[@id='subdivision']";
    private static final String ROLE_ID_DROPDOWN_XPATH = "//select[@id='roleID']";
    private static final String ROLE_ADMIN_XPATH = "//option[@value='ROLE_ADMIN']";
    private static final String ROLE_VIEW_LEVEL_1_XPATH = "//option[@value='ROLE_VIEWER_1']";
    private static final String EMAIL_FIELD_XPATH = "//input[@id='eMail']";
    private static final String CREATE_EDIT_USER_BTN_XPATH = "//input[@id='createEditUser']";
    private static final String END_CREATE_USER_BUTTON_XPATH = "//a[@class='btn btn-primary btn-lg active']";

    private static final String JQUERY_GET_VISIBLE_STATUS_CREATE_BTN = "return $('#createEditUser:visible').length;";
    //End Xpath

    //Нажатие на кнопку поиск
    public void clickFindBtn(){
        $(By.xpath(FIND_BTN_XPATH)).click();
    }

    //Ожидание появления кнопки создать
    public void waitCreateBtn(){
        long status = 0;
        Date date = new Date();
        Date date2 = new Date();
        while (status == 0 && (date.getTime()+60000 > date2.getTime())) {
            status = wrapper.jqReturnExecute(JQUERY_GET_VISIBLE_STATUS_CREATE_BTN);
            date2 = new Date();
        }
    }

    public void insertLastName(String s){
        $(By.xpath(LAST_NAME_FIELD_XPATH)).setValue(s);
    }

    public void insertFirstName(String s){
        $(By.xpath(FIRST_NAME_FIELD_XPATH)).setValue(s);
    }

    public void insertPatromic(String s){
        $(By.xpath(PATROMIC_FIELD_XPATH)).setValue(s);
    }

    public void insertBirthDate(String s){
        $("#birdthDate").setValue(s);
    }

    public void selectCodeOrganization(){
        wrapper.jqExecute(SELECT_ORG_100_BREST_AGENCY);
    }

    public void selectWorkerPosition(){
        wrapper.jqExecute(SELECT_WORKER_POSITION);
    }

    public void insertStructuralSubdivision(String s){
        $(By.xpath(SUBVISION_FIELD_XPATH)).setValue(s);
    }

    //Выраем роль Админ
    public void selectRoleAdmin(){
        $(By.xpath(ROLE_ID_DROPDOWN_XPATH)).click();
        $(By.xpath(ROLE_ADMIN_XPATH)).click();
    }

    //Выраем роль Просмотр (уровень 1)
    public void selectRoleViewLevel_1(){
        $(By.xpath(ROLE_ID_DROPDOWN_XPATH)).click();
        $(By.xpath(ROLE_VIEW_LEVEL_1_XPATH)).click();
    }

    public void insertEmail(String s){
        $(By.xpath(EMAIL_FIELD_XPATH)).setValue(s);
    }

    public void clickCreateEdit(){
        $(By.xpath(CREATE_EDIT_USER_BTN_XPATH)).click();
    }

    //Дожидаемся появления всплывашки от том что пользователя зарегестрировался, переходим на страницу адмистрирование
    public AdministrationPage getAdministrationPage() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(END_CREATE_USER_BUTTON_XPATH)).click();
        return new AdministrationPage(wrapper.getDriver());
    }
}
