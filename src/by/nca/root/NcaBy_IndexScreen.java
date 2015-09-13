package by.nca.root;

import by.nca.root.certificationSystem.NcaBy_CertificationSystemScreen;
import by.nca.root.electronicalAppeal.NcaBy_SendElectronicalAppealScreen;
import by.nca.root.forum.NcaBy_ForumScreen;
import by.nca.root.publicCadastralMap.NcaBy_PublicCadastralMapScreen;
import by.nca.IndexScreen;
import by.nca.root.about.NcaBy_AboutCompanyScreen;
import by.nca.root.databaseStatistics.NcaBy_DatabaseStatisticsScreen;
import by.nca.root.electronicalInteraction.NcaBy_ElectronicalInteractionScreen;
import by.nca.root.electronicalServices.NcaBy_ElectronicalServicesScreen;
import by.nca.root.registrationOrganizations.NcaBy_RegistrationOrganizationsScreen;
import by.nca.root.streetNames.NcaBy_StreetNamesScreen;
import by.nca.root.supportLine.NcaBy_SupportLineScreen;
import by.nca.root.taxesBase.NcaBy_LandTaxesBaseScreen;
import utils.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class NcaBy_IndexScreen extends IndexScreen {

    private static final String MAIN_PAGE_URL = "http://nca.by/";

    public NcaBy_IndexScreen(WebDriver driver) {
        super(driver, MAIN_PAGE_URL);
    }

    //--------Xpath----------
    private static final String ABOUT_COMPANY_LINK              = "//a[@href='/rus/about/']";
    private static final String REGISTRATION_ORGANIZATIONS_LINK = "//a[@href='/rus/org/']";
    private static final String CERTIFICATION_SYSTEM_LINK       = "//a[@href='http://esa.nca.by']";
    private static final String FORUM_LINK                      = "//a[@href='/_modules/_cforum/phpbb/index.php']";
    private static final String ELECTRONICAL_APPEAL_LINK        = "//b/a[@href='http://nca.by/rus/internetpriemnaya/electronobr/']";
    private static final String BASE_STATISTICS_LINK            = "//*[@id=\"container\"]/div/div[3]/div[3]/div[7]/a";
    private static final String ELECTRONICAL_SERVICES_LINK      = "//*[@id=\"container\"]/div/div[3]/div[3]/div[9]/a";
    private static final String PUBLIC_CADASTRAL_MAP            = "//*[@id=\"container\"]/div/div[3]/div[3]/div[11]/a";
    private static final String STREET_NAMES_LINK               = "//*[@id=\"container\"]/div/div[3]/div[3]/div[13]/a";
    private static final String LAND_TAXES_LINK                 = "//*[@id=\"container\"]/div/div[3]/div[3]/div[15]/a";
    private static final String ELECTRONICAL_INTERACTION_LINK   = "//*[@id=\"container\"]/div/div[3]/div[3]/div[17]/a";
    private static final String SUPPORT_LINK                    = "//*[@id=\"container\"]/div/div[3]/div[3]/div[19]/a";

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

    public NcaBy_StreetNamesScreen goToNcaBy_StreetNamesScreen() {
        driver.findElement(By.xpath(STREET_NAMES_LINK)).click();
        return new NcaBy_StreetNamesScreen(driver);
    }

    public NcaBy_LandTaxesBaseScreen goToNcaBy_LandTaxesBaseScreen() {
        driver.findElement(By.xpath(LAND_TAXES_LINK)).click();
        return new NcaBy_LandTaxesBaseScreen(driver);
    }

    public NcaBy_ElectronicalInteractionScreen goToNcaBy_ElectronicalInteractionScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_INTERACTION_LINK)).click();
        return new NcaBy_ElectronicalInteractionScreen(driver);
    }

    public NcaBy_SupportLineScreen goToNcaBy_SupportLineScreen() {
        driver.findElement(By.xpath(SUPPORT_LINK)).click();
        return new NcaBy_SupportLineScreen(driver);
    }

}
