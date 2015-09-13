package wekhfg.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 13.09.2015.
 */
public class CheckCriteriaJ1Screen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CheckCriteriaJ1Screen.class);

    CheckCriteriaJ1Screen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String ZONE_NUMBER_DROP_DOWN = "//option[@value='248082']";
    private static final String SUBJECT_MENU = "//*[@id=\"ctl00_ContentPlaceHolder1_TreeView2n1\"]/img";
    private static final String NOT_CORRECT_BIRH_DATE_MENU = "//*[@id=\"ctl00_ContentPlaceHolder1_TreeView2n5\"]/img";
    private static final String BIRTH_BEFORE_01_01_1980 = "//*[@id=\"ctl00_ContentPlaceHolder1_TreeView2t6\"]";
    private static final String SHOW_SCRIPT_LINK = "//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton1\"]";
    private static final String CDB_CHECKBOX = "//*[@id=\"ctl00_ContentPlaceHolder1_CheckBox_db\"]";
    private static final String SHOW_BTN = "//*[@id=\"ctl00_ContentPlaceHolder1_Button1\"]";
    //--------End Xpath------

    public void selectSubject(){
        wrapper.clickByXpath(SUBJECT_MENU);
    }

    public void selectNotCorrectBirth(){
        wrapper.clickByXpath(NOT_CORRECT_BIRH_DATE_MENU);
    }

    public void selectBirthBefore01_01_1980(){
        wrapper.clickByXpath(BIRTH_BEFORE_01_01_1980);
    }

    public void clickShowScript(){
        wrapper.clickByXpath(SHOW_SCRIPT_LINK);
    }

    public void selectCDB(){
        wrapper.scrollDown(CDB_CHECKBOX);
        wrapper.clickByXpath(CDB_CHECKBOX);
    }

    public void clickShow(){
        wrapper.clickByXpath(SHOW_BTN);
    }

    public boolean containsText(String text){
        boolean result = wrapper.containText(text);
        return result;
    }
}
