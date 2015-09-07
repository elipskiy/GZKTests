package nca.Screens.NcaBy;

import nca.Screens.NcaBy.about.NcaBy_AboutCompanyScreen;
import nca.Screens.NcaBy.registrationOrganizations.NcaBy_RegistrationOrganizationsScreen;
import nca.Utils.LoadPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class NcaBy_IndexScreen {

    public WebDriver driver;
    public static final Logger log = Logger.getLogger(NcaBy_IndexScreen.class);
    private static final String MAIN_PAGE_URL = "http://nca.by/";

    public NcaBy_IndexScreen(WebDriver driver) throws IOException {
        this.driver = driver;
        driver.get(MAIN_PAGE_URL);
        new LoadPage().waitForPageLoaded(driver);
        driver.manage().window().maximize();
    }

    //--------Xpath----------
    private static final String ABOUT_COMPANY_LINK = "//a[@href='/rus/about/']";
    private static final String REGISTRATION_ORGANIZATIONS_LINK = "//a[@href='/rus/org/']";
    //--------Xpath End------

    public NcaBy_AboutCompanyScreen goToNcaBy_AboutCompany(){
        driver.findElement(By.xpath(ABOUT_COMPANY_LINK)).click();
        return new NcaBy_AboutCompanyScreen(driver);
    }

    public NcaBy_RegistrationOrganizationsScreen goToNcaBy_RegistrationOrganizations(){
        driver.findElement(By.xpath(REGISTRATION_ORGANIZATIONS_LINK)).click();
        return new NcaBy_RegistrationOrganizationsScreen(driver);
    }

}
