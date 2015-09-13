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
public class NcaBy_AboutCompanyScreen {
    public NcaBy_AboutCompanyScreen(WebDriver driver) {
        new LoadPage().waitForPageLoaded(driver);
        wrapper = new DriverWrapper(driver);
    }

    DriverWrapper wrapper;

    public static final Logger log = Logger.getLogger(NcaBy_AboutCompanyScreen.class);

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

    public NcaBy_DirectorshipScreen goToNcaBy_Directorship() {
        wrapper.clickByXpath(DIRECTORSHIP_LINK);
        return new NcaBy_DirectorshipScreen(wrapper.getDriver());
    }

    public NcaBy_StructureScreen goToNcaBy_Structure() {
        wrapper.clickByXpath(STRUCTURE_LINK);
        return new NcaBy_StructureScreen(wrapper.getDriver());
    }

    public NcaBy_ObjectivesAndFunctionsScreen goToNcaBy_ObjectivesAndFunctions() {
        wrapper.clickByXpath(FUNCTIONS_LINK);
        return new NcaBy_ObjectivesAndFunctionsScreen(wrapper.getDriver());
    }

    public NcaBy_LegalBaseScreen goToNcaBy_LegalBase() {
        wrapper.clickByXpath(LEGAL_LINK);
        return new NcaBy_LegalBaseScreen(wrapper.getDriver());
    }
}
