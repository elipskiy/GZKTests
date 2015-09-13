package nca.Screens;

import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mugi4_000 on 08.09.2015.
 */
public abstract class WrappedScreen {

    public WrappedScreen(WebDriver driver) {
        loadPage.waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
        log = Logger.getLogger(this.getClass());
    }

    public DriverWrapper wrapper;
    public LoadPage loadPage = new LoadPage();

    public String getPageTitle() {
        return wrapper.getPageTitle();
    }

    protected List<String> getTextOfElements(String elementsXpath) {
        List<WebElement> listOfElements = wrapper.findElementsByXpath(elementsXpath);
        List<String> listOfParagraphs = new ArrayList<String>();
        for(WebElement element : listOfElements)
            listOfParagraphs.add(element.getText());
        return listOfParagraphs;
    }

    public final Logger log;

}
