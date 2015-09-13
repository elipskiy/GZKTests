package vl.nca.by;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by eviltech on 05.09.2015.
 */
public class CadastralNumberParcelLangScreen {
    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(CadastralNumberParcelLangScreen.class);

    CadastralNumberParcelLangScreen(WebDriver driver) {
        LoadPage loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    //--------Xpath----------
    private static final String FIELD1 = "//input[@maxlength='10']";
    private static final String FIELD2 = "//input[@maxlength='2']";
    private static final String FIELD3 = "//input[@maxlength='6']";
    private static final String NEXT_BTN = "//*[contains(text(), 'Далее')]";
    //--------Xpath End------

    public void insertNum(String num1, String num2, String num3){
        wrapper.sendKeysByXpath(FIELD1, num1);
        wrapper.sendKeysByXpath(FIELD2, num2);
        wrapper.sendKeysByXpath(FIELD3, num3);
    }

    public DescriptionParcelScreen goToVlNcaBy_DescriptionParcelScreen(){
        wrapper.clickByXpath(NEXT_BTN);
        return new DescriptionParcelScreen(wrapper.getDriver());
    }
}
