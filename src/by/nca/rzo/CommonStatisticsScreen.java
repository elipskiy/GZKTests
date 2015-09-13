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
public class CommonStatisticsScreen extends WrappedScreen {

    public CommonStatisticsScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String ESTIMATION_OBJECT_SELECT      = "//select[@id='static_object']";
    private static final String ESTIMATION_DATE_FROM          = "//input[@id='static_v1']";
    private static final String ESTIMATION_DATE_TILL          = "//input[@id='static_v2']";
    private static final String CITY_SELECT                   = "//select[@id='static_zone']";
    private static final String SEARCH_BUTTON                 = "//input[@name='serch']";

    private static final String ESTIMATION_METHODS_BUTTON     = "//*[@id='accordion']/div[2]/a/h2";
    private static final String MARKET_INCOME_METHOD_CHECKBOX = "//input[@id='static_valution_kind2']";
    //--------Xpath End------

    public StatisticsResultScreen getStatistics(String estimationObject, String from, String till, String city) {
        wrapper.selectFromDropdown(ESTIMATION_OBJECT_SELECT, estimationObject);
        wrapper.sendKeysByXpath(ESTIMATION_DATE_FROM, from);
        wrapper.sendKeysByXpath(ESTIMATION_DATE_TILL, till);
        wrapper.selectFromDropdown(CITY_SELECT, city);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

    public StatisticsResultScreen getEvaluationMethodStatistics(String checkboxName) {
        wrapper.clickByXpath(ESTIMATION_METHODS_BUTTON);
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        WebElement checkbox = wait.until(ExpectedConditions.visibilityOf(wrapper.findByXpath(MARKET_INCOME_METHOD_CHECKBOX)));
        checkbox.click();
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON)));
        searchButton.click();
        return new StatisticsResultScreen(wrapper.getDriver());
    }

}
