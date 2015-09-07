package nca.Screens.NcaBy.registrationOrganizations;

import nca.Screens.NcaBy.about.NcaBy_DirectorshipScreen;
import nca.Screens.NcaBy.about.NcaBy_LegalBaseScreen;
import nca.Screens.NcaBy.about.NcaBy_ObjectivesAndFunctionsScreen;
import nca.Screens.NcaBy.about.NcaBy_StructureScreen;
import nca.Utils.DriverWrapper;
import nca.Utils.LoadPage;
import nca.Utils.PageScreenShot;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class NcaBy_RegistrationOrganizationsScreen {

    public NcaBy_RegistrationOrganizationsScreen(WebDriver driver) {
        loadPage = new LoadPage();
        loadPage.waitForPageLoaded(driver);
        screenShot = new PageScreenShot(driver);
        wrapper = new DriverWrapper(driver);
        listOfLinks = getLinksElementsList();
    }

    PageScreenShot screenShot;
    LoadPage loadPage;
    DriverWrapper wrapper;
    List<WebElement> listOfLinks;
    HashMap<String, String> map = new HashMap<>();

    public static final Logger log = Logger.getLogger(NcaBy_RegistrationOrganizationsScreen.class);

    //--------Xpath----------
    private static final String LINKS_COLUMN = "//div[@class='chiter']/table/tbody/tr[position()>1]/td[3]/p/a";

    //--------Xpath End------

    public String getPageTitle() {
        return wrapper.getPageTitle();
    }

    public String getPageURL() {
        return wrapper.getCurrentUrl();
    }

    private List<WebElement> getLinksElementsList() {
        return wrapper.findElementsByXpath(LINKS_COLUMN);
    }

    public List<String> getLinksList() {
        List<String> listOfParagraphs = new ArrayList<>();
        for(WebElement element : listOfLinks)
            listOfParagraphs.add(element.getText());
        return listOfParagraphs;
    }

    public Map goToBrestLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(0).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("agr.brest.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
            //loadPage.waitForPageLoaded(wrapper.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToVitebskLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(1).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("vagr.vitebsk.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToGomelLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(2).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("gagrzk.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToGrodnoLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(3).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("kadastr.grodno.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToMinskLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(4).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("mga.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToMinskRegionMainLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(5).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("moa.by_main_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToMinskRegionStructureUnitsLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(6).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("moa.by_units_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map goToMogilevLink() {
        map.clear();
        try {
            listOfLinks = getLinksElementsList();
            listOfLinks.get(7).click();
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("mogilev.kadastr.by_from_nca.by_case_2");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

}
