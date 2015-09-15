package by.nca.root.registrationOrganizations;

import utils.DriverWrapper;
import utils.LoadPage;
import utils.PageScreenShot;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class RegistrationOrganizationsScreen {

    public RegistrationOrganizationsScreen(WebDriver driver) {
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

    public static final Logger log = Logger.getLogger(RegistrationOrganizationsScreen.class);

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

    public void goBack() {
        wrapper.goBack();
        loadPage.waitForPageLoaded(wrapper.getDriver());
    }

    public Map goToBrestLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(0).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToVitebskLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(1).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToGomelLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(2).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToGrodnoLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(3).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToMinskLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(4).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToMinskRegionMainLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(5).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToMinskRegionStructureUnitsLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(6).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

    public Map goToMogilevLink() {
        map.clear();
        listOfLinks = getLinksElementsList();
        listOfLinks.get(7).click();
        loadPage.waitForPageLoaded(wrapper.getDriver());
        map.put("URL", wrapper.getCurrentUrl());
        map.put("Title", wrapper.getPageTitle());
        return map;
    }

}
