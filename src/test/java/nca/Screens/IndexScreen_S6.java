package nca.Screens;

import com.google.gson.JsonElement;
import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import nca.Utils.WriterReader;
import org.apache.log4j.Logger;
import org.mortbay.util.ajax.JSON;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by temp on 21.08.2015.
 */
public class IndexScreen_S6 {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(IndexScreen_S6.class);
    WriterReader wr = new WriterReader();


    IndexScreen_S6(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //***********Xpath***************
    private static final String SCHEDULE_LINK_XPATH = "//a[@href='/s6/schedule/index']";
    private static final String JSON_TEXT_XPATH = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']";
    private static final String USERNAME_BTN_XPATH = "//a[@href='#']";
    private static final String LOGOUT_BTN_XPATH = "//a[@href='/s6/logout/index']";

    private static final String QUIT_BTN_XPATH = "//*[contains(text(), 'Выйти')]";
    //***********Xpath End***************

    // ***********JS Scrips***************
    private static final String JQUERY_GET_STATUS_LOCK_BG = "return $('.lock-bg:visible').length;";
    //***********JS Scrips End***************

    String file = "C://JsonSites.json";

    public ScheduleScreen_S6 openScheduleScreen(){
        log.info("----Click Schedule Link");
        $(By.xpath(SCHEDULE_LINK_XPATH)).click();
        return new ScheduleScreen_S6(wrapper.getDriver());
    }

    public void openSiteIdScreen(String url){
        log.info("Open new Window");
        wrapper.openNewWindow(url);
    }

    public void switchToWindow(int i){
        wrapper.switchWindow(i);
    }

    public void closeWindow(){
        wrapper.closeTab();
    }

    public String getSiteId(){
        String text = wrapper.getTextByXpath(JSON_TEXT_XPATH);
        wr.Write(text, file);
        return text;
    }

    public String getJsonText(){
        String text = wrapper.getTextByXpath(JSON_TEXT_XPATH);
        return text;
    }

    public LoginScreen_S6 clickExitBtn() throws IOException, InterruptedException {
        $(By.xpath(USERNAME_BTN_XPATH)).click();
        Thread.sleep(1500);
        $(By.xpath(LOGOUT_BTN_XPATH)).click();
        Thread.sleep(1500);
        return new LoginScreen_S6(wrapper.getDriver());
    }
}
