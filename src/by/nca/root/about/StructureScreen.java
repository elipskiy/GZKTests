package by.nca.root.about;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class StructureScreen {
    public StructureScreen(WebDriver driver) {
        new LoadPage().waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(StructureScreen.class);

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
