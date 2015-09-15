package by.nca.gzk;

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
    private static final String ORGANISATION_CODE_FIELD = "//input[@id='select_org']";
    private static final String TYPE_IN_C_RADIO_BTN = "//input[@id='select_type_1']";
    private static final String INV_NUM_FIELD = "//input[@id='select_num']";
    private static final String FIND_BTN = "//a[@onclick='doInvSearch()']";
    //--------Xpath End------

    public void insertOrgCode(String orgCode){
        wrapper.sendKeysByXpath(ORGANISATION_CODE_FIELD, orgCode);
    }

    public void selectTypeInC(){
        wrapper.clickByXpath(TYPE_IN_C_RADIO_BTN);
    }

    public void insertInvNum(String invNum){
        wrapper.sendKeysByXpath(INV_NUM_FIELD, invNum);
    }

    public SearchResultScreen goToGzkNcaBy_SearchResultScreen(){
        wrapper.clickByXpath(FIND_BTN);
        return new SearchResultScreen(wrapper.getDriver());
    }
}
