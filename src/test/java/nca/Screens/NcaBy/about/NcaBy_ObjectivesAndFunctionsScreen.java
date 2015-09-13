package nca.Screens.ncaBy.about;

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
public class NcaBy_ObjectivesAndFunctionsScreen {
    public NcaBy_ObjectivesAndFunctionsScreen(WebDriver driver) {
        new LoadPage().waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(NcaBy_ObjectivesAndFunctionsScreen.class);

    //--------Xpath----------
    private static final String TEXT_HEADER = "//div[@class='path']/h1/a";
    private static final String TEXT_PARAGRAPHS = "//div[@class='chiter']/p[position() mod 2 = 1]";
    //--------Xpath End------

    public String getPageTitle() {
        return wrapper.getPageTitle();
    }

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

    public List<String> getTextParagraphs() {
        List<WebElement> listOfElements = wrapper.findElementsByXpath(TEXT_PARAGRAPHS);
        List<String> listOfParagraphs = new ArrayList<String>();
        for(WebElement element : listOfElements)
            listOfParagraphs.add(element.getText());
        return listOfParagraphs;
    }
}
