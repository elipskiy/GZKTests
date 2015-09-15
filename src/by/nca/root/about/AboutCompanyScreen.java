package by.nca.root.about;

import utils.DriverWrapper;
import utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class AboutCompanyScreen {
    public AboutCompanyScreen(WebDriver driver) {
        new LoadPage().waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(AboutCompanyScreen.class);

    //--------Xpath----------
    private static final String TEXT_HEADER = "//div[@class='chiter']/b/p[1]/strong";
    private static final String TEXT_PARAGRAPHS = "//div[@class='chiter']/p[3]/b";

    private static final String DIRECTORSHIP_LINK = "//ul[@id='mnu18']/li[1]/a";
    private static final String STRUCTURE_LINK = "//ul[@id='mnu18']/li[2]/a";
    private static final String FUNCTIONS_LINK = "//ul[@id='mnu18']/li[3]/a";
    private static final String LEGAL_LINK = "//ul[@id='mnu18']/li[4]/a";
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

    public DirectorshipScreen goToNcaBy_Directorship() {
        wrapper.clickByXpath(DIRECTORSHIP_LINK);
        return new DirectorshipScreen(wrapper.getDriver());
    }

    public StructureScreen goToNcaBy_Structure() {
        wrapper.clickByXpath(STRUCTURE_LINK);
        return new StructureScreen(wrapper.getDriver());
    }

    public ObjectivesAndFunctionsScreen goToNcaBy_ObjectivesAndFunctions() {
        wrapper.clickByXpath(FUNCTIONS_LINK);
        return new ObjectivesAndFunctionsScreen(wrapper.getDriver());
    }

    public LegalBaseScreen goToNcaBy_LegalBase() {
        wrapper.clickByXpath(LEGAL_LINK);
        return new LegalBaseScreen(wrapper.getDriver());
    }
}
