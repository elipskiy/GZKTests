package nca.Tests;

import nca.Screens.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 25.05.2015.
 */
public class RegistrationActivationBlockingAdminUsersTest extends BaseTest {

    @Test(priority = 1)
    public void RegistrationUserAdminTest() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("---------------------ТЕСТ#1 Регистрация пользователя с правами администратор----------------------");

        String lastName = "ФамилияАдминистратор";
        String firstName = "ИмяАдминистратор";
        String patronymic = "ОтчествоАдминистратор";
        String birthDate = "22.06.2000";
        String subdivision = "Подразделение";
        String email = "NKARHADMIN";
        String login = "11";
        String pass = "1";


        MainPage mainPage = (new IndexPage(driver)).getIndexPage(login,pass);
        AdministrationPage administrationPage = mainPage.getAdministrationPage();
        AddNewUserPage addNewUserPage = administrationPage.getAddNewUserPage();
        addNewUserPage.clickFindBtn();
        addNewUserPage.waitCreateBtn();
        addNewUserPage.insertLastName(lastName);
        addNewUserPage.insertFirstName(firstName);
        addNewUserPage.insertPatromic(patronymic);
        addNewUserPage.insertBirthDate(birthDate);
        addNewUserPage.selectCodeOrganization();
        addNewUserPage.selectWorkerPosition();
        addNewUserPage.insertStructuralSubdivision(subdivision);
        addNewUserPage.selectRoleAdmin();
        addNewUserPage.insertEmail(email);
        addNewUserPage.clickCreateEdit();
        administrationPage = addNewUserPage.getAdministrationPage();
        $("#resultTabl").shouldHave(text(email+"@nca.by"));
        administrationPage.clickExitBtn();
    }

    @Test(priority = 2)
    public void GetUserAdminPasswordTest() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("----------------------------------ТЕСТ#2 Записываем пароль в файл----------------------------------");

        String email = "NKARHADMIN";
        String pass = "78ncaRH!5623";

        LoginEmailPage loginEmailPage = new EmailPage(driver).loginToEmailPage(email,pass);
        loginEmailPage.waitUserRoleEmailVisible(email,pass);
        loginEmailPage.openRegMessage();
        String newPassword = loginEmailPage.getAdminPass();
        log.info(newPassword);
        loginEmailPage.clickListMessage();
        loginEmailPage.clickCheckBox();
        loginEmailPage.deleteMessage();
        loginEmailPage.clickExit();

    }

    @Test(priority = 3)
    public void LoginWithOutActivateAdminUserTest() throws IOException, SQLException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("-------------------ТЕСТ#3 Попытка залогиниться не активированным пользователем-------------------------");

        String username = "NKARHADMIN";
        String pass = new IndexPage(driver).getPassUserAdminByFile();
        MainPage mainPage = (new IndexPage(driver)).getIndexPage(username,pass);
        $(".errors").shouldHave(text("\n" +
                "                  Пользователь или пароль некорректен, повторите ввод."));
    }


    @Test(priority = 4)
    public void ActivateAdminUserTest() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("-------------------------------ТЕСТ#4 Активация пользователя админ---------------------------------");

        String login = "11";
        String pass = "1";

        final String USER_STATUS = "return $('tr:contains(\"NKARHADMIN@nca.by\")').hasClass('blockedUsers');";

        MainPage mainPage = (new IndexPage(driver)).getIndexPage(login,pass);
        AdministrationPage administrationPage = mainPage.getAdministrationPage();
        administrationPage.clickByAdminUserLogin();
        administrationPage.clickActivateBtn();
        boolean result = administrationPage.verifyBlockStatus(USER_STATUS);
        log.info(result);
        administrationPage.clickExitBtn();
        Assert.assertEquals(result,false,"Пользователь не активировался");
    }

    @Test(priority = 5)
    public void VerifyAdminUserEmailAfterActivateTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("------------------------------ТЕСТ#5 Проверка письма после активации-------------------------------");

        String email = "NKARHADMIN";
        String pass = "78ncaRH!5623";


        LoginEmailPage loginEmailPage = new EmailPage(driver).loginToEmailPage(email,pass);

        loginEmailPage.waitUserRoleEmailVisible(email, pass);
        loginEmailPage.openRegMessage();
        String messageAfterActivate = loginEmailPage.getAdminUserMessageAfterActivate();
        loginEmailPage.clickListMessage();
        loginEmailPage.clickCheckBox();
        loginEmailPage.deleteMessage();
        loginEmailPage.clickExit();
        log.info("Текст после активации:" + messageAfterActivate);
    }

    @Test(priority = 6)
    public void VerifyLoginAdminUserAfterActivateTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("------------------------------ТЕСТ#6 Проверка входа после активации-------------------------------");

        String username = "NKARHADMIN";
        String pass = new IndexPage(driver).getPassUserAdminByFile();
        MainPage mainPage = (new IndexPage(driver)).getIndexPage(username, pass);
        String title = mainPage.getMainPageTitle();
        mainPage.clickExitBtn();
        Assert.assertEquals(title,"Главная","Title не совпадает, пользователь не залогинился");
    }

    @Test(priority = 7)
    public void BlockAdminUserTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("------------------------------ТЕСТ#7 Проверка блокировки Admin User--------------------------------");

        String login = "11";
        String pass = "1";

        final String USER_STATUS = "return $('tr:contains(\"NKARHADMIN@nca.by\")').hasClass('blockedUsers');";

        MainPage mainPage = (new IndexPage(driver)).getIndexPage(login,pass);
        AdministrationPage administrationPage = mainPage.getAdministrationPage();
        administrationPage.clickByAdminUserLogin();
        administrationPage.clickBlockBtn();
        administrationPage.acceptAlert();
        boolean result = administrationPage.verifyBlockStatus(USER_STATUS);
        log.info(result);
        administrationPage.clickExitBtn();
        Assert.assertEquals(result,true,"Пользователь не заблокировался");
    }

    @Test(priority = 8)
    public void VerifyAdminUserEmailAfterBlockTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("-----------------------------ТЕСТ#8 Проверка письма после блокировки-------------------------------");

        String email = "NKARHADMIN";
        String pass = "78ncaRH!5623";


        LoginEmailPage loginEmailPage = new EmailPage(driver).loginToEmailPage(email,pass);

        loginEmailPage.waitUserRoleEmailVisible(email, pass);
        loginEmailPage.openRegMessage();
        String messageAfterActivate = loginEmailPage.getAdminUserMessageAfterBlock();
        loginEmailPage.clickListMessage();
        loginEmailPage.clickCheckBox();
        loginEmailPage.deleteMessage();
        loginEmailPage.clickExit();
        log.info("Текст после блокировки:" + messageAfterActivate);
    }

    @Test(priority = 9)
    public void LoginAfterBlockTest() throws IOException, SQLException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("--------------------ТЕСТ#9 Попытка залогиниться заблокированным пользователем----------------------");

        String username = "NKARHADMIN";
        String pass = new IndexPage(driver).getPassUserAdminByFile();
        MainPage mainPage = (new IndexPage(driver)).getIndexPage(username,pass);
        $(".errors").shouldHave(text("\n" +
                "                  Пользователь или пароль некорректен, повторите ввод."));
    }

    @Test(priority = 10)
    public void ActivateAdminUserAgainTest() throws IOException, SQLException, InterruptedException {
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("-------------------------ТЕСТ#10 Повторная активация пользователя админ----------------------------");

        String login = "11";
        String pass = "1";

        final String USER_STATUS = "return $('tr:contains(\"NKARHADMIN@nca.by\")').hasClass('blockedUsers');";

        MainPage mainPage = (new IndexPage(driver)).getIndexPage(login,pass);
        AdministrationPage administrationPage = mainPage.getAdministrationPage();
        administrationPage.clickByAdminUserLogin();
        administrationPage.clickActivateBtn();
        boolean result = administrationPage.verifyBlockStatus(USER_STATUS);
        log.info(result);
        administrationPage.clickExitBtn();
        Assert.assertEquals(result,false,"Пользователь не активировался");
    }

    @Test(priority = 11)
    public void VerifyAdminUserEmailAfterActivateAgainTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("------------------------ТЕСТ#11 Повторная проверка письма после активации---------------------------");

        String email = "NKARHADMIN";
        String pass = "78ncaRH!5623";



        LoginEmailPage loginEmailPage = new EmailPage(driver).loginToEmailPage(email,pass);

        loginEmailPage.waitUserRoleEmailVisible(email, pass);
        loginEmailPage.openRegMessage();
        String messageAfterActivate = loginEmailPage.getAdminUserMessageAfterActivate();
        loginEmailPage.clickListMessage();
        loginEmailPage.clickCheckBox();
        loginEmailPage.deleteMessage();
        loginEmailPage.clickExit();
        log.info("Текст после активации:" + messageAfterActivate);
    }

    @Test(priority = 12)
    public void VerifyLoginAdminUserAfterActivateAgainTest() throws IOException, SQLException, InterruptedException{
        log.info("--------------------------Создание пользователя с правами администратор----------------------------");
        log.info("-------------------------ТЕСТ#12 Проверка входа после повторной активации---------------------------");

        String username = "NKARHADMIN";
        String pass = new IndexPage(driver).getPassUserAdminByFile();
        MainPage mainPage = (new IndexPage(driver)).getIndexPage(username, pass);
        String title = mainPage.getMainPageTitle();
        mainPage.clickExitBtn();
        Assert.assertEquals(title,"Главная","Title не совпадает, пользователь не залогинился");
    }

    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @AfterTest
    public static void CC(){
        driver.quit();
    }
}
