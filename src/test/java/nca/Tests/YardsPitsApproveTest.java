package nca.Tests;

import nca.Screens.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Eviltech on 25.05.2015.
 */
public class YardsPitsApproveTest extends BaseTest{

    @Test(priority = 1)
    public void CreateYardPitsProblemMessage() throws IOException, InterruptedException {
        log.info("---------Сообщение по Дворам - Наличие ям и выбоин на внутридворовых проездах и тротуарах----------");
        log.info("---------------------------------ТЕСТ#1 Создание сообщения-----------------------------------------");
        
        String email = "eviltech86@gmail.com";
        String pass = "aqw134tr";
        String address = "Привольная улица д.1 к.";
        String stringPhotoPlace = "C:\\foto1.jpg";
        String successTextEcpected = "ВАШЕ СООБЩЕНИЕ ОТПРАВЛЕНО НА МОДЕРАЦИЮ В ЕДИНУЮ РЕДАКЦИЮ!";

        log.info("Переходим на г4");
        PortalMainNotSignInPage portalMainNotSignInPage = (new PortalMainNotSignInPage(driver));
        log.info("Логинимся");
        PortalMainSignInPage portalMainSignInPage = portalMainNotSignInPage.loggin(email, pass);
        log.info("Ожидаем пока элементы станут доступны");
        portalMainSignInPage.waitUnlockBg();
        log.info("Кликаем сообщить о проблеме");
        portalMainSignInPage.clickProblemBtn();
        log.info("Кликаем по вкладке Дворовые территории");
        portalMainSignInPage.clickYardTab();
        log.info("Кликаем по проблемной теме Наличие ям и выбоин на внутридворовых проездах и тротуарах");
        portalMainSignInPage.clickPitsProblem();
        log.info("Вводим адрес:" + address);
        portalMainSignInPage.insertAddress(address);
        log.info("Ожидаем появления списка адресов и Выбираем адрес");
        portalMainSignInPage.selectAddr(address);
        log.info("Ожидаем исчезновения прелодера");
        portalMainSignInPage.waitPreloderAfterAddress();
        log.info("Читаем из файла и вводим проблему");
        portalMainSignInPage.insertProblemText();
        log.info("Добавляем фото");
        portalMainSignInPage.addFotoFile(stringPhotoPlace);
        log.info("Ждем загрузки фото");
        portalMainSignInPage.waitPhotoPreloaderNotVisible();
        log.info("Нажимаем отправить");
        portalMainSignInPage.clickSendMessage();
        log.info("Ожидаем исчезновения прелодера");
        portalMainSignInPage.waitPreloderAfterAddress();
        log.info("Ожидаем появление окна после успешной отправки сообщения");
        portalMainSignInPage.waitMessageSuccessModalIsVisible();
        log.info("Забираем текст модального окна");
        String successText = portalMainSignInPage.getSuccessText();
        log.info("Текст:" + successText);
        log.info("Ждем загрузки кнопки Ок в модальном");
        portalMainSignInPage.waitOkButtonInSuccessModalIsVisible();
        log.info("Кликаем по кнопке ОК в модальном окне");
        portalMainSignInPage.clickOkBtnInSuccessModal();

        try {
            log.info("Проверка появления success окна");
            Assert.assertEquals(successText, successTextEcpected, "Текст не совпадает");
        }catch (Exception e){
            log.info("Элемент не найден");
        }finally {
            log.info("Клик и Ожидание раскрытия PopUp");
            portalMainSignInPage.clickAndWaitPopUpIsOpen();
            log.info("Кликаем Выход");
            Thread.sleep(1000);
            portalMainSignInPage.clickLogOutLink();
        }
    }

    @Test(priority = 2)
    public void getAttrYardPitsMessage() throws IOException, InterruptedException {
        log.info("---------Сообщение по Дворам - Наличие ям и выбоин на внутридворовых проездах и тротуарах----------");
        log.info("-------------------------ТЕСТ#2 Забираем аттрибуты созданного сообщения----------------------------");

        String email = "eviltech86@gmail.com";
        String pass = "aqw134tr";
        String filePortalId = "C://YardPitsPortalId.txt";
        String fileIdProblem = "C://YardPitsIdProblem.txt";

        log.info("Переходим на г4");
        PortalMainNotSignInPage portalMainNotSignInPage = (new PortalMainNotSignInPage(driver));
        log.info("Логинимся");
        PortalMainSignInPage portalMainSignInPage = portalMainNotSignInPage.loggin(email, pass);
        log.info("Ожидаем пока элементы станут доступны");
        portalMainSignInPage.waitUnlockBg();
        log.info("Клик по PopUp");
        portalMainSignInPage.clickPopUp();
        log.info("Ожидаем раскрытия PopUp");
        portalMainSignInPage.clickAndWaitPopUpIsOpen();
        log.info("Переходим в Личный кабинет пользователя страница сообщений");
        PortalUserAllCommentsPage portalUserAllCommentsPage = portalMainSignInPage.doEnterPortalUserCommentsPage();
        log.info("Ожидаем загрузки вкладки Дворы");
        portalUserAllCommentsPage.waitYardTabIsVisible();
        log.info("Нажимаем вкладку дворовые территории");
        portalUserAllCommentsPage.clickYardTabUserCabinet();
        log.info("Ожидаем исчезновения прелодера");
        portalUserAllCommentsPage.waitLockPreloder();
        log.info("Нажимаем Наличие ям и выбоин на внутридворовых проездах и тротуарах");
        portalUserAllCommentsPage.clickPitsProblem();
        log.info("Ожидаем исчезновения прелодера");
        portalUserAllCommentsPage.waitLockPreloder();
        log.info("Берем текст из файла");
        String yardPitsProblemText = portalUserAllCommentsPage.getYardPitsProblemTextFile();
        log.info("Tекст" + yardPitsProblemText + "из файла");
        String  portalProblemId = portalUserAllCommentsPage.getPortalProblemId(yardPitsProblemText);
        portalUserAllCommentsPage.poralIdNotNull(portalProblemId);//!!!!!!!!!!!!!ПРОВЕРИТЬ НА НОВОМ
        portalUserAllCommentsPage.writeToFile(portalProblemId,filePortalId);
        log.info(portalProblemId);
        String idProblem = portalUserAllCommentsPage.getCommentProblemId(yardPitsProblemText);
        portalUserAllCommentsPage.writeToFile(idProblem,fileIdProblem);
    }

    @Test(priority = 3)
    public void EditorApproveYardPitsMessage() throws IOException, InterruptedException {
        log.info("---------Сообщение по Дворам - Наличие ям и выбоин на внутридворовых проездах и тротуарах----------");
        log.info("---------------ТЕСТ#3 Ищем сообщение в кабинете редактора и опубликовываем-------------------------");
        
        String email = "editor";
        String pass = "demo";
        String editorApproveYardPitsIdMessage = "C://EditorApproveYardPitsIdMessage.txt";

        log.info("Переходим на er4");
        CabinetNotSignInPage cabinetNotSignInPage = (new CabinetNotSignInPage(driver));
        log.info("Логинимся");
        CabinetEditorPage cabinetEditorPage = cabinetNotSignInPage.loggin(email, pass);
        log.info("Ожидаем исчезновения прелодера");
        cabinetEditorPage.waitPreloderAfterAddress();        
        log.info("Нажимаем вкладку дворы");
        CabinetEditorYardsTabPage cabinetEditorYardsTabPage = cabinetEditorPage.doEnterCabinetEditorYardsTabPage();
        log.info("Ожидаем исчезновения прелодера");
        cabinetEditorYardsTabPage.waitPreloderInvisible();
        log.info("Ожидаем появления пагинатора");
        cabinetEditorYardsTabPage.waitPaginatorVisible();
        log.info("Кликаем по последней страницы");
        cabinetEditorYardsTabPage.clickLastPaginatorLink();
        log.info("Ожидаем исчезновения прелодера");
        cabinetEditorYardsTabPage.waitPreloderInvisible();
        log.info("Берем портальный id из файла");
        String yardPitsPortalId = cabinetEditorYardsTabPage.getYardPitsPortalIdFile();
        log.info("Tекст" + yardPitsPortalId + "из файла");
        log.info("Кликаем по сообщению");
        CabinetEditorModerateMessagePage cabinetEditorModerateMessagePage = cabinetEditorYardsTabPage.clickByPortalProblemId(yardPitsPortalId);
        log.info("Ожидаем исчезновения прелодера");
        cabinetEditorModerateMessagePage.waitPreloderInvisible();
        log.info("Модерируем сообщения(Опубликовываем");
        cabinetEditorModerateMessagePage.moderateApproveMessage();
        log.info("Ожидаем исчезновения LockBG");
        cabinetEditorModerateMessagePage.waitLockBGInvisible();
        log.info("Ожидаем появления Окна с упешной отправкой сообщения");
        cabinetEditorModerateMessagePage.waitSuccessApproveWindowisible();
        log.info("Забираем Id опубликованного сообщения");
        String messgeID = cabinetEditorModerateMessagePage.getPublickIdMessage();
        log.info("Записываем Id опубликованного сообщения");
        cabinetEditorModerateMessagePage.writeToFile(messgeID,editorApproveYardPitsIdMessage);
        log.info("Забираем надпись сохранение");
        String savedText = cabinetEditorModerateMessagePage.getSaveText();
        log.info("Нажимаем закрыть");
        cabinetEditorModerateMessagePage.clickCloseBtn();

        try {
            log.info("Проверка появления success окна");
            Assert.assertEquals(savedText,"Сохранение", "Текст не совпадает");
        }catch (Exception e){
            log.info("Элемент не найден");
        }finally {
            log.info("Клик и Ожидание раскрытия PopUp");
           cabinetEditorModerateMessagePage.clickExitBtn();
        }
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
