package nca.Screens.NcaBy.streetNames;

import nca.Screens.WrappedScreen;
import nca.Utils.LoadPage;
import nca.Utils.PageScreenShot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_StreetNamesScreen extends WrappedScreen {

    public NcaBy_StreetNamesScreen(WebDriver driver) {
        super(driver);
        screenShot = new PageScreenShot(driver);
        loadPage = new LoadPage();
    }

    PageScreenShot screenShot;
    LoadPage loadPage;

    //--------Xpath----------
    private static final String TEXT_HEADER = "//*[@id=\"container\"]/div/div[5]/div[4]/div/div[1]/h1/a";
    private static final String ELEMENTS_PAGE_LINK = "//*[@id=\"container\"]/div/div[5]/div[4]/div/p[1]/a";
    private static final String RECOMENDATIONS_PAGE_LINK = "//*[@id=\"container\"]/div/div[5]/div[4]/div/p[3]/a";

    private static final String RECOMENDATIONS_TEXT_HEADER = "//*[@id=\"container\"]/div/div[5]/div[4]/div/div[1]/h1/a[2]";
    //--------Xpath End------

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

    public Map<String, String> goToElementsPage() {
        Map<String, String> map = new HashMap<>();
        try {
            wrapper.clickByXpath(ELEMENTS_PAGE_LINK);
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("gzk.nca.by/streets.php_case_9");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            wrapper.goBack();
            loadPage.waitForPageLoaded(wrapper.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }

    public Map<String, String> goToRecommendationsPage() {
        Map<String, String> map = new HashMap<>();
        try {
            wrapper.clickByXpath(RECOMENDATIONS_PAGE_LINK);
            loadPage.waitForPageLoaded(wrapper.getDriver());
            screenShot.takeScreenShot("nca.by/---/naming_streets/rekomendacii_po_naimenovaniyu_case_9");
            map.put("URL", wrapper.getCurrentUrl());
            map.put("Title", wrapper.getPageTitle());
            map.put("Header", wrapper.getTextByXpath(RECOMENDATIONS_TEXT_HEADER));
            wrapper.goBack();
            loadPage.waitForPageLoaded(wrapper.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return map;
        }
    }


}
