package by.nca.root;

import by.nca.root.certificationSystem.CertificationSystemScreen;
import by.nca.root.electronicalAppeal.SendElectronicalAppealScreen;
import by.nca.root.forum.ForumScreen;
import by.nca.root.publicCadastralMap.PublicCadastralMapScreen;
import by.nca.BaseIndexScreen;
import by.nca.root.about.AboutCompanyScreen;
import by.nca.root.databaseStatistics.DatabaseStatisticsScreen;
import by.nca.root.electronicalInteraction.ElectronicalInteractionScreen;
import by.nca.root.electronicalServices.ElectronicalServicesScreen;
import by.nca.root.registrationOrganizations.RegistrationOrganizationsScreen;
import by.nca.root.streetNames.StreetNamesScreen;
import by.nca.root.supportLine.SupportLineScreen;
import by.nca.root.taxesBase.LandTaxesBaseScreen;
import utils.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 06.09.2015.
 */
public class IndexScreen extends BaseIndexScreen {

    private static final String MAIN_PAGE_URL = "http://nca.by/";

    public IndexScreen(WebDriver driver) {
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

    public AboutCompanyScreen goToNcaBy_AboutCompany() {
        driver.findElement(By.xpath(ABOUT_COMPANY_LINK)).click();
        return new AboutCompanyScreen(driver);
    }

    public RegistrationOrganizationsScreen goToNcaBy_RegistrationOrganizations() {
        driver.findElement(By.xpath(REGISTRATION_ORGANIZATIONS_LINK)).click();
        return new RegistrationOrganizationsScreen(driver);
    }

    public CertificationSystemScreen goToNcaBy_CertificationScreen() {
        driver.findElement(By.xpath(CERTIFICATION_SYSTEM_LINK)).click();
        return new CertificationSystemScreen(driver);
    }

    public ForumScreen goToNcaBy_ForumScreen() {
        driver.findElement(By.xpath(FORUM_LINK)).click();
        return new ForumScreen(driver);
    }

    public SendElectronicalAppealScreen goToNcaBy_ElectronicalAppealScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_APPEAL_LINK)).click();
        new DriverWrapper(driver).switchWindow(1);
        return new SendElectronicalAppealScreen(driver);
    }

    public DatabaseStatisticsScreen goToNcaBy_DatabaseStatisticsScreen() {
        driver.findElement(By.xpath(BASE_STATISTICS_LINK)).click();
        return new DatabaseStatisticsScreen(driver);
    }

    public ElectronicalServicesScreen goToNcaBy_ElectronicalServicesScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_SERVICES_LINK)).click();
        return new ElectronicalServicesScreen(driver);
    }

    public PublicCadastralMapScreen goToNcaBy_PublicCadastralMapScreen() {
        driver.findElement(By.xpath(PUBLIC_CADASTRAL_MAP)).click();
        return new PublicCadastralMapScreen(driver);
    }

    public StreetNamesScreen goToNcaBy_StreetNamesScreen() {
        driver.findElement(By.xpath(STREET_NAMES_LINK)).click();
        return new StreetNamesScreen(driver);
    }

    public LandTaxesBaseScreen goToNcaBy_LandTaxesBaseScreen() {
        driver.findElement(By.xpath(LAND_TAXES_LINK)).click();
        return new LandTaxesBaseScreen(driver);
    }

    public ElectronicalInteractionScreen goToNcaBy_ElectronicalInteractionScreen() {
        driver.findElement(By.xpath(ELECTRONICAL_INTERACTION_LINK)).click();
        return new ElectronicalInteractionScreen(driver);
    }

    public SupportLineScreen goToNcaBy_SupportLineScreen() {
        driver.findElement(By.xpath(SUPPORT_LINK)).click();
        return new SupportLineScreen(driver);
    }

}
