package by.nca.rzo;

import by.nca.WrappedScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class SearchScreen extends WrappedScreen {

    SearchScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String PROPERTY_RESTRICTIONS_SELECT    = "//*[@id='right_kind']";
    private static final String PROPERTY_PURPOSE_SELECT         = "//*[@id='function_kind']";
    private static final String SEARCH_BUTTON                   = "//input[@type='submit']";

    private static final String PROPERTY_COST_BUTTON            = "//*[@id='accordion']/div[2]/a/h2";
    private static final String CURRENCY_SELECT                 = "//*[@id='total_cost']";
    private static final String MARKET_PRICE_CHECKBOX           = "//*[@id='cost_kind1']";
    private static final String FUTURE_USE_MARKET_PRICE         = "//*[@id='cost_kind2']";

    private static final String ESTIMATION_METHODS_BUTTON       = "//*[@id='accordion']/div[3]/a/h2";
    private static final String ALLOCATION_METHOD_CHECKBOX      = "//*[@id='calculation_method55']";

    private static final String ADDITIONAL_DATA_BUTTON          = "//*[@id='accordion']/div[4]/a/h2";
    private static final String OTHER_SITES_CHECKBOX            = "//*[@id='multi_facts4']";
    private static final String OTHER_SITES_FROM                = "//*[@id='multi_min_facts4']";
    private static final String OTHER_SITES_TO                  = "//*[@id='multi_max_facts4']";

    private static final String COMMON_SEARCH_PARAMETERS_BUTTON = "//*[@id='accordion']/div[5]/a/h2";
    private static final String COMMON_SEARCH_DATE_FROM         = "//*[@id='v1']";
    private static final String COMMON_SEARCH_DATE_TO           = "//*[@id='v2']";

    //--------Xpath End------

    public StatisticsResultScreen getSearchResults(String propertyRestictions, String propertyPurpose) {
        wrapper.selectFromDropdown(PROPERTY_RESTRICTIONS_SELECT, propertyRestictions);
        wrapper.selectFromDropdown(PROPERTY_PURPOSE_SELECT, propertyPurpose);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getPropertyCost(String currency) {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PROPERTY_COST_BUTTON)));
        wrapper.clickByXpath(PROPERTY_COST_BUTTON);
        wrapper.scrollDown(CURRENCY_SELECT);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CURRENCY_SELECT)));
        wrapper.selectFromDropdown(CURRENCY_SELECT, currency);
        wrapper.clickByXpath(MARKET_PRICE_CHECKBOX);
        wrapper.clickByXpath(FUTURE_USE_MARKET_PRICE);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getEstimationMethods() {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        wrapper.scrollDown(ESTIMATION_METHODS_BUTTON);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ESTIMATION_METHODS_BUTTON)));
        wrapper.clickByXpath(ESTIMATION_METHODS_BUTTON);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wrapper.scrollDown(ALLOCATION_METHOD_CHECKBOX);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ALLOCATION_METHOD_CHECKBOX)));
        wrapper.clickByXpath(ALLOCATION_METHOD_CHECKBOX);
        wrapper.scrollDown(SEARCH_BUTTON);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON)));
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getAdditionalData(String from, String to) {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        wrapper.scrollDown(ADDITIONAL_DATA_BUTTON);

        wrapper.clickByXpath(ADDITIONAL_DATA_BUTTON);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wrapper.scrollDown(OTHER_SITES_CHECKBOX);
        wrapper.clickByXpath(OTHER_SITES_CHECKBOX);
        wrapper.scrollDown(OTHER_SITES_FROM);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OTHER_SITES_FROM)));
        wrapper.sendKeysByXpath(OTHER_SITES_FROM, from);
        wrapper.sendKeysByXpath(OTHER_SITES_TO, to);
        wrapper.scrollDown(SEARCH_BUTTON);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON)));
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getCommonSearchParameters(String from, String to) {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        wrapper.scrollDown(COMMON_SEARCH_PARAMETERS_BUTTON);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(COMMON_SEARCH_PARAMETERS_BUTTON)));
        wrapper.clickByXpath(COMMON_SEARCH_PARAMETERS_BUTTON);
        wrapper.scrollDown(COMMON_SEARCH_DATE_FROM);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(COMMON_SEARCH_DATE_FROM)));
        wrapper.sendKeysByXpath(COMMON_SEARCH_DATE_FROM, from);
        wrapper.sendKeysByXpath(COMMON_SEARCH_DATE_TO, to);
        wrapper.scrollDown(SEARCH_BUTTON);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

}
