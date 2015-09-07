package nca.Screens.NcaBy.about;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class NcaBy_StructureScreen {
    public NcaBy_StructureScreen(WebDriver driver) {
        new LoadPage().waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(NcaBy_StructureScreen.class);

    //--------Xpath----------
    private static final String TEXT_HEADER = "//div[@class='path']/h1/a";
    private static final String TEXT_PARAGRAPH = "//div[@class='chiter']/p[3]";
    //--------Xpath End------

    public String getPageTitle() {
        return wrapper.getPageTitle();
    }

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

    public String getTextParagraph() {
        return wrapper.getTextByXpath(TEXT_PARAGRAPH);
    }
}
