package nca.Screens.NcaBy;

import nca.Screens.NcaBy.about.NcaBy_AboutCompanyScreen;
import nca.Screens.NcaBy.certificationSystem.NcaBy_CertificationSystemScreen;
import nca.Screens.NcaBy.databaseStatistics.NcaBy_DatabaseStatisticsScreen;
import nca.Screens.NcaBy.electronicalAppeal.NcaBy_SendElectronicalAppealScreen;
import nca.Screens.NcaBy.electronicalInteraction.NcaBy_ElectronicalInteractionScreen;
import nca.Screens.NcaBy.electronicalServices.NcaBy_ElectronicalServicesScreen;
import nca.Screens.NcaBy.forum.NcaBy_ForumScreen;
import nca.Screens.NcaBy.publicCadastralMap.NcaBy_PublicCadastralMapScreen;
import nca.Screens.NcaBy.registrationOrganizations.NcaBy_RegistrationOrganizationsScreen;
import nca.Screens.NcaBy.streetNames.NcaBy_StreetNamesScreen;
import nca.Screens.NcaBy.supportLine.NcaBy_SupportLineScreen;
import nca.Screens.NcaBy.taxesBase.NcaBy_LandTaxesBaseScreen;
import nca.Utils.DriverWrapper;
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
    private static final String CERTIFICATION_SYSTEM_LINK = "//a[@href='http://esa.nca.by']";
    private static final String FORUM_LINK = "//a[@href='/_modules/_cforum/phpbb/index.php']";
    private static final String ELECTRONICAL_APPEAL_LINK = "//b/a[@href='http://nca.by/rus/internetpriemnaya/electronobr/']";
    private static final String BASE_STATISTICS_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[7]/a";
    private static final String ELECTRONICAL_SERVICES_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[9]/a";
    private static final String PUBLIC_CADASTRAL_MAP = "//*[@id=\"container\"]/div/div[3]/div[3]/div[11]/a";
    private static final String STREET_NAMES_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[13]/a";
    private static final String LAND_TAXES_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[15]/a";
    private static final String ELECTRONICAL_INTERACTION_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[17]/a";
    private static final String SUPPORT_LINK = "//*[@id=\"container\"]/div/div[3]/div[3]/div[19]/a";

    //--------Xpath End------

    public NcaBy_AboutCompanyScreen goToNcaBy_AboutCompany() {
        driver.findElement(By.xpath(ABOUT_COMPANY_LINK)).click();
        return new NcaBy_AboutCompanyScreen(driver);
    }

    public NcaBy_RegistrationOrganizationsScreen goToNcaBy_RegistrationOrganizations() {
        driver.findElement(By.xpath(REGISTRATION_ORGANIZATIONS_LINK)).click();
        return new NcaBy_RegistrationOrganizationsScreen(driver);
    }

    public NcaBy_CertificationSystemScreen goToNcaBy_CertificationScreen() {
        driver.findElement(By.xpath(CERTIFICATION_SYSTEM_LINK)).click();
        return new NcaBy_CertificationSystemScreen(driver);
    }

    public NcaBy_ForumScreen goToNcaBy_ForumScreen() {
        driver.findElement(By.xpath(FORUM_LINK)).click();
        return new NcaBy_ForumScreen(driver);
    }

    public NcaBy_SendElectronicalAppealScreen goToNcaBy_ElectronicalAppealScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_APPEAL_LINK)).click();
        new DriverWrapper(driver).switchWindow(1);
        return new NcaBy_SendElectronicalAppealScreen(driver);
    }

    public NcaBy_DatabaseStatisticsScreen goToNcaBy_DatabaseStatisticsScreen() {
        driver.findElement(By.xpath(BASE_STATISTICS_LINK)).click();
        return new NcaBy_DatabaseStatisticsScreen(driver);
    }

    public NcaBy_ElectronicalServicesScreen goToNcaBy_ElectronicalServicesScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_SERVICES_LINK)).click();
        return new NcaBy_ElectronicalServicesScreen(driver);
    }

    public NcaBy_PublicCadastralMapScreen goToNcaBy_PublicCadastralMapScreen() {
        driver.findElement(By.xpath(PUBLIC_CADASTRAL_MAP)).click();
        return new NcaBy_PublicCadastralMapScreen(driver);
    }

//    public NcaBy_StreetNamesScreen goToNcaBy_StreetNamesScreen() {
//        driver.findElement(By.xpath(STREET_NAMES_LINK)).click();
//        return new NcaBy_StreetNamesScreen(driver);
//    }
//
//    public NcaBy_LandTaxesBaseScreen goToNcaBy_LandTaxesBaseScreen() {
//        driver.findElement(By.xpath(LAND_TAXES_LINK)).click();
//        return new NcaBy_LandTaxesBaseScreen(driver);
//    }
//
//    public NcaBy_ElectronicalInteractionScreen goToNcaBy_ElectronicalInteractionScreen() {
//        driver.findElement(By.xpath(ELECTRONICAL_INTERACTION_LINK)).click();
//        return new NcaBy_ElectronicalInteractionScreen(driver);
//    }
//
//    public NcaBy_SupportLineScreen goToNcaBy_SupportLineScreen() {
//        driver.findElement(By.xpath(SUPPORT_LINK)).click();
//        return new NcaBy_SupportLineScreen(driver);
//    }

}
