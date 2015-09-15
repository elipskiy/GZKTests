package by.nca;

import org.openqa.selenium.WebElement;
import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mugi4_000 on 12.09.2015.
 */
public abstract class BaseIndexScreen {

    public WebDriver driver;
    public Logger log;
    public LoadPage loadPage;

    public BaseIndexScreen(WebDriver driver, String mainPageUrl) {
        this.driver = driver;
        driver.get(mainPageUrl);
        log = Logger.getLogger(this.getClass());
        loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    protected List<String> getTextOfElements(String elementsXpath) {
        List<WebElement> listOfElements = new DriverWrapper(driver).findElementsByXpath(elementsXpath);
        List<String> listOfParagraphs = new ArrayList<String>();
        for(WebElement element : listOfElements)
            listOfParagraphs.add(element.getText());
        return listOfParagraphs;
    }
}
