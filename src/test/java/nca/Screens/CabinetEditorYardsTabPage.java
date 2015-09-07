package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Eviltech on 05.06.2015.
 */
public class CabinetEditorYardsTabPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CabinetEditorYardsTabPage.class);

    CabinetEditorYardsTabPage(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //***********Xpath***************
    private static final String PROBLEM_BTN_XPATH = "//div[@id='problem-but']";
    private static final String YARDS_XPATH_XPATH = "//li[@id='titletab_44']";

    private static final String ADDRESS_PRIVOLNAYA_XPATH = "//*[contains(text(), 'Привольная улица д.1 к.1')]";
    private static final String QUIT_BTN_XPATH = "//*[contains(text(), 'Выйти')]";
    //***********Xpath End***************

    //***********SCRIPTS***************
    private static final String JQUERY_GET_PRELODER_STATUS = "return $('.intro_ajax:visible').length;";
    private static final String JQUERY_GET_PAGINATOR_STATUS = "return $('.simple-paginator:visible').length;";
    private static final String CLICK_LAST_PAGINATOR_PAGE = "return $( \".simple-paginator a:contains('...')\" ).click();";
    //***********SCRIPTS END***************

    //***********STRING***************
    String fileProblemTextYardPits = "C://YardPitsPortalId.txt";
    //***********STRING END***************

    //Ожидаем исчезновения прелодера
    public void waitPreloderInvisible(){
        wrapper.waitStatus_0(JQUERY_GET_PRELODER_STATUS);
    }
   
    //Ожидаем появления пагинатора
    public void waitPaginatorVisible(){
        wrapper.waitStatus_1(JQUERY_GET_PAGINATOR_STATUS);
    }
    
    //Кликаем по ... - последняя страница
    public void clickLastPaginatorLink(){
        wrapper.jqExecute(CLICK_LAST_PAGINATOR_PAGE);
    }

    //Берем текст с проблемой из файла
    public String getYardPitsPortalIdFile() throws InterruptedException, IOException {
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

    //Кликаем по ID проблемной темы
    public CabinetEditorModerateMessagePage clickByPortalProblemId(String problemTextYardPits){
        final String CLICK_LAST_PAGINATOR_PAGE = "$('.grid-table-wrap a:contains("+problemTextYardPits+")').click();";
        final String CLICK_LAST_PAGINATOR = "return $('p:contains("+problemTextYardPits+")').parents('.mes-list').attr('reqnum');";
        wrapper.jqExecute(CLICK_LAST_PAGINATOR_PAGE);
        return  new CabinetEditorModerateMessagePage(wrapper.getDriver());
    }
}
