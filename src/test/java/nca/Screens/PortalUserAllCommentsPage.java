package nca.Screens;

import com.sun.istack.internal.NotNull;
import com.thoughtworks.selenium.condition.Not;
import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by makovskiy on 26.05.2015.
 */
public class PortalUserAllCommentsPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(PortalUserAllCommentsPage.class);
    WriterReader mfw = new WriterReader();

    PortalUserAllCommentsPage(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }
    //***********Xpath***************
    private static final String PROBLEM_BTN_XPATH = "//div[@id='problem-but']";

    //***********Xpath End***************

    //***********SCRIPTS***************
    private static final String JQUERY_GET_STATUS_LOCK_BG = "return $('.lock-bg:visible').length;";
    private static final String JQUERY_GET_STATUS_YARD_TAB = "return $('#new-tab-1').length;";
    private static final String JQUERY_GET_STATUS_PITS_YARD = "return $('#tab-theme-328:visible').length;";
    private static final String JQUERY_GET_STATUS_TABS_PRELODER = "return $('.unlock:visible').length;";

    private static final String JQUERY_CLICK_YARD_TAB = "$('[idtab=\"1\"]').trigger('click');";
    private static final String JQUERY_CLICK_PITS_PROBLEM = "$('[idtab=\"1\"]').trigger('click');";
    //***********SCRIPTS END***************

    //***********STRING***************
    String fileProblemTextYardPits = "C://1_yardPits.txt";
    //***********STRING END***************

    //Ожидаем пока подгрузится вкладка Дворы
    public void waitYardTabIsVisible(){
        wrapper.jqReturnExecute(JQUERY_GET_STATUS_YARD_TAB);
    }

    //Нажимаем на вкладку дворы в ЛК
    public void clickYardTabUserCabinet(){
        Date date = new Date();
        Date date2 = new Date();
        wrapper.jqExecute(JQUERY_CLICK_YARD_TAB);
        long status = wrapper.jqReturnExecute(JQUERY_GET_STATUS_PITS_YARD);

        while (status == 0 && (date.getTime()+90000 > date2.getTime())) {
            status = wrapper.jqReturnExecute(JQUERY_GET_STATUS_PITS_YARD);
            if(status==0){
                wrapper.jqExecute(JQUERY_CLICK_YARD_TAB);
            }
            date2 = new Date();
        }
    }

    //Нажимаем на Наличие ям и выбоин на внутридворовых проездах и тротуарах
    public void clickPitsProblem(){
        $("#tab-theme-328").click();
    }

    //Ожидаем пока исчезнет прелодер загрузки
    public void waitLockPreloder() throws InterruptedException {
        wrapper.waitStatus_0(JQUERY_GET_STATUS_TABS_PRELODER);
    }
    
    //Берем текст с проблемой из файла
    public String getYardPitsProblemTextFile() throws InterruptedException, IOException {
        BufferedReader in = null;
        String line = "";
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

            while ((line = in.readLine()) != null) {
                line = line.toString();
                log.info(line);
                return line;
            }
            //commentTextArea.sendKeys(in.readLine()); Для одной строки
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
    
    //Забираем портальный номер сообщения
    public String getPortalProblemId(String problemTextYardPits){
        final String JQUERY_GET_MESSAGE_ID_COMMENT = "return $('p:contains("+problemTextYardPits+")').parents('.mes-list').attr('reqnum');";
        String portalIdComment = wrapper.jqReturnStringExecute(JQUERY_GET_MESSAGE_ID_COMMENT);
        log.info(portalIdComment);
        return portalIdComment;
    }
    
    //Забираем idComment сообщения
    public String getCommentProblemId(String problemTextYardPits){
        final String JQUERY_GET_MESSAGE_ID_COMMENT = "return $('p:contains("+problemTextYardPits+")').parents('.mes-list').attr('idcomment');";
        String idComment = wrapper.jqReturnStringExecute(JQUERY_GET_MESSAGE_ID_COMMENT);
        log.info(idComment);
        return idComment;
    }

    //Ожидаем появления Портального ID у созданного сообщения
    public void poralIdNotNull(String portalId) throws InterruptedException, IOException {
        String id = portalId;
        String newId = new String(id.getBytes(),"windows-1251");

        String newId1 = new String(id.getBytes(),"windows-1251");
        
        while (newId.equals("")){
            //Thread.sleep(60000);
            Thread.sleep(800);
            wrapper.getDriver().navigate().refresh();
            waitYardTabIsVisible();
            clickYardTabUserCabinet();
            waitLockPreloder();
            clickPitsProblem();
            waitLockPreloder();
            String yardPitsProblemText = getYardPitsProblemTextFile();

            String  getPoratlId = getPortalProblemId(yardPitsProblemText);
            newId = getPoratlId;

        }
    }

    //Сохраняем в файл
    public void writeToFile(String s, String f) {
        String text = s;

        String file = f;//"C://UserAdmin.txt";
        //Integer begin = letterText.indexOf("пароль: ") + 9;
        //Integer end = letterText.indexOf("Пожалуйста") - 2;
        mfw.Write(text, file);
    }
    
}
