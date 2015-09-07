package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Eviltech on 05.06.2015.
 */
public class CabinetEditorPage {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(PortalMainSignInPage.class);

    CabinetEditorPage(WebDriver driver) {
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
    //***********SCRIPTS END***************

    //***********STRING***************
    String fileProblemTextYardPits = "C://1_yardPits.txt";
    //***********STRING END***************

    public void waitPreloderAfterAddress(){
        wrapper.waitStatus_0(JQUERY_GET_PRELODER_STATUS);
    }


    //Переход в ЛК пользователя на страницу с сообщениями
    public CabinetEditorYardsTabPage doEnterCabinetEditorYardsTabPage(){
        $(By.xpath(YARDS_XPATH_XPATH)).click();
        return new CabinetEditorYardsTabPage(wrapper.getDriver());
    }

}
