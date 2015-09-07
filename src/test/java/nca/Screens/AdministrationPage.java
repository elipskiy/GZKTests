package nca.Screens;

import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class AdministrationPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AdministrationPage.class);

    AdministrationPage(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    //Xpath
    private static final String ADD_USER_BTN_XPATH = "//a[@href='createUser.html?oper=create']";
    private static final String ADMIN_USER_XPATH = "//*[contains(text(), 'NKARHADMIN')]";
    private static final String VIEW_LEVEL_1_XPATH = "//*[contains(text(), 'NKARHUSER')]";
    private static final String ACTIVATE_USER_BTN_XPATH = "//button[@id='activateUser']";
    private static final String BLOCK_USER_BTN_XPATH = "//button[@id='blockUser']";
    private static final String EXIT_BTN_XPATH = "//a[@class='QA']";
    //End Xpath

    //Клик по логину админа
    public void clickByAdminUserLogin(){
        $(By.xpath(ADMIN_USER_XPATH)).click();
    }

    //Клик по логину пользователя с правами Просмотр (уровень 1)
    public void clickByViewLevel_1Login(){
        $(By.xpath(VIEW_LEVEL_1_XPATH)).click();
    }

    //Нажимаем кнопку активировать
    public void clickActivateBtn(){
        $(By.xpath(ACTIVATE_USER_BTN_XPATH)).click();
    }

    //Нажимаем кнопку блокировать
    public void clickBlockBtn(){
        $(By.xpath(BLOCK_USER_BTN_XPATH)).click();
    }

    //Закрываем alert
    public void acceptAlert(){
        wrapper.closeAlertWindow();
    }

    //Проверяем статус боликировки
    public boolean verifyBlockStatus(String status) throws InterruptedException {
        Thread.sleep(1000);
        boolean b = wrapper.jqReturnBooleanExecute(status);
        return b;
    }

    //Переход на страницу добавление пользователей
    public AddNewUserPage getAddNewUserPage(){
        $(By.xpath(ADD_USER_BTN_XPATH)).click();
        return new AddNewUserPage(wrapper.getDriver());
    }

    //Кнопка выход
    public void clickExitBtn(){
        $(By.xpath(EXIT_BTN_XPATH)).click();
    }
}
