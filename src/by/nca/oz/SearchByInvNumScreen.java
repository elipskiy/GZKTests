package by.nca.oz;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class SearchByInvNumScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(SearchByInvNumScreen.class);

    SearchByInvNumScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String ORG_ID_FIELD = "//input[@id='select_org']";
    private static final String TYPE_IN_C_RADIO_BTN = "//input[@id='select_type_1']";
    private static final String INV_NUM_FIELD = "//input[@id='select_num']";
    private static final String FIND_BTN = "//a[@onclick='doInvSearch()']";
    private static final String COPYING_BTN = "//a[@id='ibtn']";

    private static final String NAME_FIELD = "//input[@id='inputUserName']";
    private static final String KEY_FIELD = "//input[@id='inputUserKey']";
    private static final String ENTER_BTN = "//a[@id='enterButton']";
    private static final String CADASTRAL_NUMBER = "//*[contains(text(), '500000000008002041')]";
    //--------Xpath End------

    public void insertOrgId(String ordId){
        wrapper.sendKeysByXpath(ORG_ID_FIELD,ordId);
    }

    public void selectIn(){
        wrapper.clickByXpath(TYPE_IN_C_RADIO_BTN);
    }

    public void insertNum(String num){
        wrapper.sendKeysByXpath(INV_NUM_FIELD, num);
    }

    public void clickFindBtn(){
        wrapper.clickByXpath(FIND_BTN);
    }

    public void clickCopying(){
        wrapper.clickByXpath(COPYING_BTN);
    }

    public void login(String name, String key){
        wrapper.sendKeysByXpath(NAME_FIELD,name);
        wrapper.sendKeysByXpath(KEY_FIELD,key);
        wrapper.clickByXpath(ENTER_BTN);
    }

    public String cadastralNumber(){
        return wrapper.getTextByXpath(CADASTRAL_NUMBER);
    }

}
