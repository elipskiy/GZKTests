package by.nca.rzo;

import by.nca.WrappedScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class SearchScreen extends WrappedScreen {

    SearchScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String PROPERTY_RESTRICTIONS_SELECT  = "//*[@id='right_kind']";
    private static final String PROPERTY_PURPOSE_SELECT       = "//*[@id='function_kind']";
    private static final String SEARCH_BUTTON                 = "//input[@type='submit']";

    private static final String PROPERTY_COST_BUTTON          = "//*[@id='accordion']/div[2]/a/h2";
    private static final String CURRENCY_SELECT               = "//*[@id='total_cost']";
    private static final String MARKET_PRICE_CHECKBOX         = "//*[@id='cost_kind1']";
    private static final String FUTURE_USE_MARKET_PRICE       = "//*[@id='cost_kind2']";
    //--------Xpath End------

    public StatisticsResultScreen getSearchResults(String propertyRestictions, String propertyPurpose) {
        wrapper.selectFromDropdown(PROPERTY_RESTRICTIONS_SELECT, propertyRestictions);
        wrapper.selectFromDropdown(PROPERTY_PURPOSE_SELECT, propertyPurpose);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getPropertyCost(String currency) {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PROPERTY_COST_BUTTON)));
        wrapper.clickByXpath(PROPERTY_COST_BUTTON);
        wrapper.scrollDown(CURRENCY_SELECT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CURRENCY_SELECT)));
        wrapper.selectFromDropdown(CURRENCY_SELECT, currency);
        wrapper.clickByXpath(MARKET_PRICE_CHECKBOX);
        wrapper.clickByXpath(FUTURE_USE_MARKET_PRICE);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

}
