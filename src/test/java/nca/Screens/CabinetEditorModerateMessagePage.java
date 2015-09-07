package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Eviltech on 05.06.2015.
 */
public class CabinetEditorModerateMessagePage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CabinetEditorModerateMessagePage.class);
    WriterReader mfw = new WriterReader();

    CabinetEditorModerateMessagePage(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //***********Xpath***************
    private static final String PROBLEM_BTN_XPATH = "//div[@id='problem-but']";
    private static final String YARDS_XPATH_XPATH = "//li[@id='titletab_44']";
    private static final String EXIT_BTN_XPATH = "//a[@href='index.php?logout']";

    private static final String MODERATION_DROPDOWN_XPATH = "//*[contains(text(), 'Выберите значение из списка')]";
    private static final String PUBLIC_CRITERIA_DROPDOWN_XPATH = "//*[contains(text(), 'Критерии публикации')]";
    private static final String NO_REASONS_FOR_REJECTION_DROPDOWN_XPATH = "//*[contains(text(), 'Нет причин отклонения')]";
    private static final String SAVED_TITLE_XPATH = "//*[contains(text(), 'Сохранение')]";
    private static final String QUIT_BTN_XPATH = "//*[contains(text(), 'Выйти')]";
    private static final String PUBLICK_BTN_XPATH = "//div[@id='compublbutton']";
    private static final String CLOSE_BTN_XPATH = "//i[@class='ui-center']";
    //***********Xpath End***************

    //***********SCRIPTS***************
    private static final String JQUERY_GET_PRELODER_STATUS = "return $('.intro_ajax:visible').length;";
    private static final String JQUERY_GET_LOCK_BG_STATUS = "return $('.lock-bg:visible').length;";
    private static final String JQUERY_GET_SUCCESS_APPROVE_WINDOW_STATUS = "return $('#cw50448:visible').length;";
    private static final String CLICK_LAST_PAGINATOR_PAGE = "return $('.simple-paginator a:contains('...')' ).click();";
    private static final String CLICK_MODER_ACTION_DROPDOWN = "return $('.caret','#dmoder_action').trigger('click');";
    private static final String CLICK_PUBLICATION_CRITERIA_DROPDOWN = "return $('.ui-tree-expander').get(4).click();";
    private static final String CLICK_NO_REASONS_TO_REJECTION_DROPDOWN = "return $('.ui-lvl-2').get(0).click();";
    private static final String CLICK_CLOSE_APPROVED_WINDOW_BTN = "$('.ui-center').click();";
    private static final String GET_MESSAGE_ID_AFTER_APPROVE = "return $('.ui-wnd.undefined.ui-active.ui-focus .ui-wnd-text').text();";
    private static final String GET_MESSAGE_TITLE_AFTER_APPROVE = "return $('.ui-wnd.undefined.ui-active.ui-focus .ui-wnd-title').text();";
    //***********SCRIPTS END***************

    //***********STRING***************
    String fileProblemTextYardPits = "C://YardPitsPortalId.txt";
    //***********STRING END***************


    //Ожидаем исчезновения прелодера
    public void waitPreloderInvisible(){
        wrapper.waitStatus_0(JQUERY_GET_PRELODER_STATUS);
    }
    
    
    //Ожидаем исчезновения LockBG
    public void waitLockBGInvisible(){
        wrapper.waitStatus_0(JQUERY_GET_LOCK_BG_STATUS);
    }
     
     //Ожидаем появления Окна с упешной отправкой сообщения
    public void waitSuccessApproveWindowisible(){
        wrapper.waitStatus_0(JQUERY_GET_SUCCESS_APPROVE_WINDOW_STATUS);
    }
    
    //Забираем надпись сохранение
    public String getSaveText(){
        String approvedMessageId = wrapper.jqReturnStringExecute(GET_MESSAGE_TITLE_AFTER_APPROVE);
        return approvedMessageId;
    }
    
    //Забираем ID Опубликованного сообщения
    public String getPublickIdMessage(){
        String approvedMessageId = wrapper.jqReturnStringExecute(GET_MESSAGE_ID_AFTER_APPROVE);
        return approvedMessageId;
    }
    
    //Нажимаем закрыть
    public void clickCloseBtn(){
        wrapper.jqExecute(CLICK_CLOSE_APPROVED_WINDOW_BTN);
    }
    
    public void clickExitBtn(){
        $(By.xpath(EXIT_BTN_XPATH)).click();
    }
    
    //Пишем в файл
    public String writeToFile(String s, String f) {
    
        String text = s;

        String file = f;//"C://UserAdmin.txt";
        Integer begin = text.indexOf("Сообщение ") + 10;
        Integer end = text.indexOf("опубликовано") - 2;
        String resultString = text.substring(begin, end);
        mfw.Write(resultString, file);
        return resultString;
    }
    
    
    
    public void moderateApproveMessage() throws InterruptedException {

        log.info("----Кликаем по Выберите значение из списка");
        wrapper.jqExecute(CLICK_MODER_ACTION_DROPDOWN);

        log.info("----Кликаем по Критерии публикации");
        wrapper.jqExecute(CLICK_PUBLICATION_CRITERIA_DROPDOWN);
        
        log.info("----Кликаем по Нет причин отклонения");
        wrapper.jqExecute(CLICK_NO_REASONS_TO_REJECTION_DROPDOWN);

        log.info("----Ожидаем исчезновения LOCK_BG");
        waitLockBGInvisible();

        log.info("----Кликаем по Нет причин отклонения");
        Thread.sleep(500);
        wrapper.scrollDown(PUBLICK_BTN_XPATH);
        wrapper.clickByXpath(PUBLICK_BTN_XPATH);
    }
}
