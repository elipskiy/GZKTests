package nca.Screens;

import com.codeborne.selenide.Condition;
import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Eviltech on 25.05.2015.
 */
public class PortalMainSignInPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(PortalMainSignInPage.class);

    PortalMainSignInPage(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //***********Xpath***************
    private static final String PROBLEM_BTN_XPATH = "//div[@id='problem-but']";
    private static final String YARD_TAB_XPATH = "//div[@id='new-tab-1']";
    private static final String PITS_PROBLEM_XPATH = "//span[@id='tab-theme-328']";
    private static final String LOCK_BG_XPATH = "//div[@class='lock-bg']";
    private static final String PRELODER_AFTER_ADDRESS_XPATH = "//div[@id='commentLockScreen']";
    private static final String ADDRESS_FIELD_XPATH = "//input[@id='search_object-address']";
    private static final String ADDRESS_SEARCH_RESULT_XPATH = "//div[@id='search_result-object']";
    private static final String ADDRESS_PRIVOLNAYA_XPATH = "//*[contains(text(), 'Привольная улица д.1 к.1')]";
    private static final String QUIT_BTN_XPATH = "//*[contains(text(), 'Выйти')]";
    //***********Xpath End***************
    
    //***********SCRIPTS***************
    private static final String JQUERY_GET_STATUS_LOCK_BG = "return $('.lock-bg:visible').length;";
    private static final String JQUERY_GET_STATUS_ADDR_PRELOADER_FIELD = "return $('.comment-lock-wrapper:visible').length;";
    private static final String JQUERY_GET_STATUS_ADDRESS_IS_OPEN = "return $('#search_result-object:contains(\"Привольная улица д.1 к.1\"):visible').length;";
    private static final String JQUERY_GET_STATUS_COMMENT_FIELD = "return $('#comment_value:visible').length;";
    private static final String JQUERY_GET_STATUS_PROBLEM_BTN = "return $('#problem-but:visible').length;";
    private static final String JQUERY_GET_STATUS_MESSAGE_CONTAINER = "return $('#themeDictBox:visible').length;";
    private static final String JQUERY_GET_ADDR_PRELODER_STATUS = "return $('.comment-lock-wrapper:visible').length;";
    private static final String JQUERY_GET_STATUS_PHOTO_PRELOADER = "return $('#commentPhotosLoad:visible').length;";
    private static final String JQUERY_GET_STATUS_PHOTO_LODER_TEXT = "return $('#commentPhotosLoad:visible').length;";
    private static final String JQUERY_GET_STATUS_SUCCESS_MODAL = "return $('#modal-content-w:visible').length;";
    private static final String JQUERY_GET_STATUS_OK_BTN_SUCCESS_MODAL = "return $('#comment-finishOK:visible').length;";
    private static final String JQUERY_GET_STATUS_POPUP = "return $('.con-user:visible').length;";
    //***********SCRIPTS END***************

    //***********STRING***************
    String fileProblemTextYardPits = "C://1_yardPits.txt";
    //***********STRING END***************

    //Кликаем Сообщить о проблеме
    public void clickProblemBtn() throws InterruptedException {
        long status = 0;
        Date date = new Date();
        Date date2 = new Date();

        while (status == 0 && (date.getTime()+60000 > date2.getTime())) {
            status = wrapper.jqReturnExecute(JQUERY_GET_STATUS_PROBLEM_BTN);
            date2 = new Date();
        }
        Thread.sleep(3000);// Убрать
        $("#problem-but").click();

        long newStatus = wrapper.jqReturnExecute(JQUERY_GET_STATUS_MESSAGE_CONTAINER);

        while (newStatus == 0) {
            newStatus = wrapper.jqReturnExecute(JQUERY_GET_STATUS_MESSAGE_CONTAINER);
            if (newStatus==0){
                $("#problem-but").click();
            }
        }
    }
    
    //Кликаем Дворы
    public void clickYardTab(){
        $(By.xpath(YARD_TAB_XPATH)).waitUntil(Condition.enabled, 1000).click();
    }
    
    //Выбираем проблемную тему ямы
    public void clickPitsProblem(){
        $(By.xpath(PITS_PROBLEM_XPATH)).waitUntil(Condition.enabled, 1000).click();
    }
    
    //Ожидаем пока страница станет доступны
    public void waitUnlockBg() {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        //$(By.xpath(LOCK_BG_XPATH)).should(Condition.disappear);
        wrapper.waitStatus_0(JQUERY_GET_STATUS_LOCK_BG);
    }
    
    //вводим адрес
    public void insertAddress(String street){
        $(By.xpath(ADDRESS_FIELD_XPATH)).setValue(street);

    }
    
    //Ожидааем появления адресов
    public void waitClickAddressResultVisible(){
        wrapper.waitStatus_1(JQUERY_GET_STATUS_ADDR_PRELOADER_FIELD);
        $(By.xpath(ADDRESS_SEARCH_RESULT_XPATH)).should(Condition.hasText("Привольная улица д.1 к.1"));
        $(By.xpath(ADDRESS_PRIVOLNAYA_XPATH)).click();
    }

    //Выбираем адрес из выпадающего списка
    public void selectAddr(String text) throws InterruptedException {
        long status = 0;
        Date date = new Date();
        Date date2 = new Date();
        while (status == 0 && (date.getTime()+90000 > date2.getTime())) {
            status = wrapper.jqReturnExecute(JQUERY_GET_STATUS_ADDRESS_IS_OPEN);
            date2 = new Date();
            $(By.xpath(ADDRESS_FIELD_XPATH)).clear();
            Thread.sleep(800);
            $(By.xpath(ADDRESS_FIELD_XPATH)).sendKeys(text);
            Thread.sleep(200);
        }

        $(By.xpath(ADDRESS_PRIVOLNAYA_XPATH)).click();
    }

    //Ожидаем исчезновения прелодера после выбора адреса
    public void waitPreloderAfterAddress(){
        wrapper.waitStatus_0(JQUERY_GET_ADDR_PRELODER_STATUS);
    }

    //Читаем из файла и вводим текст проблемы
    public void insertProblemText()  {
        long status = 0;
        Date date = new Date();
        Date date2 = new Date();
        while (status == 0 && (date.getTime()+90000 > date2.getTime())) {
            status = wrapper.jqReturnExecute(JQUERY_GET_STATUS_COMMENT_FIELD);
            date2 = new Date();
        }

        BufferedReader in = null;
        try {

            final StringBuilder stringBuilder = new StringBuilder();
            InputStream inStream = new FileInputStream(fileProblemTextYardPits);
            final InputStreamReader streamReader = new InputStreamReader(inStream, "windows-1251");
            in = new BufferedReader(streamReader);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Для нескольких строк
        try {
            String line = "";
            while ((line = in.readLine()) != null) {
                $("#comment_value").setValue(line);
            }

            //commentTextArea.sendKeys(in.readLine()); Для одной строки

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Добавляем фото
    public void addFotoFile(String stringPhotoPlace){
        $("#comment_photo").sendKeys(stringPhotoPlace);
    }

    //Ожидаем пока исчезнет прелодер загрузки фото
    public void waitPhotoPreloaderNotVisible(){
       wrapper.waitStatus_0(JQUERY_GET_STATUS_PHOTO_PRELOADER);
    }

    //Нажимаем кнопку отправить
    public void clickSendMessage(){
       wrapper.waitStatus_0(JQUERY_GET_STATUS_PHOTO_LODER_TEXT);
        $("#comment-makePost").click();
    }

    //Ожидаем когда появится всплывающее окно с успешным подтверждением отправки
    public void waitMessageSuccessModalIsVisible(){
       wrapper.waitStatus_1(JQUERY_GET_STATUS_SUCCESS_MODAL);
    }

    //Забираем текст из всплывающего окна
    public String getSuccessText(){
        String s = $(By.xpath("//span[@class='welcome']")).getText();
        return s;
    }

    //Ожидаем загрузки кнопки Ок во всплывающем окне с успешным подтверждением отправки
    public void waitOkButtonInSuccessModalIsVisible(){
        wrapper.jqReturnExecute(JQUERY_GET_STATUS_OK_BTN_SUCCESS_MODAL);
    }

    //Нажимаем OK в модальном окне
    public void clickOkBtnInSuccessModal(){
       $("#comment-finishOK").click();
    }

    //Кликаем по popUp
    public void clickPopUp(){
        $("#login-sign").click();
    }

    //Ожидаем раскрытия popUp
    public void clickAndWaitPopUpIsOpen() throws InterruptedException {
        long newStatus = wrapper.jqReturnExecute(JQUERY_GET_STATUS_POPUP);
        while (newStatus == 0) {
            Thread.sleep(800);
            newStatus = wrapper.jqReturnExecute(JQUERY_GET_STATUS_POPUP);
            log.info("Статус раскрытия popUp" + newStatus);
            if(newStatus == 0){
                $("#login-sign").click();
            }
        }
    }

    //Переход в ЛК пользователя на страницу с сообщениями
    public PortalUserAllCommentsPage doEnterPortalUserCommentsPage(){
        $(By.xpath("//a[@href='index.php?show=cabinet&action=comments']")).click();
        return new PortalUserAllCommentsPage(wrapper.getDriver());
    }

    //Нажимаем Выход
    public void clickLogOutLink(){
        $(By.xpath(QUIT_BTN_XPATH)).click();
    }

}

