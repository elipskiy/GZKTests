package by.nca.rzo;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class RzoNcaBy_CommonStatistics extends WrappedScreen {

    public RzoNcaBy_CommonStatistics(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String ESTIMATION_OBJECT_SELECT = "//select[@id='static_object']";
    private static final String ESTIMATION_DATE_FROM     = "//input[@id='static_v1']";
    private static final String ESTIMATION_DATE_TILL     = "//input[@id='static_v2']";
    private static final String CITY_SELECT              = "//select[@id='static_zone']";
    private static final String SEARCH_BUTTON            = "//div[4]/input";
    //--------Xpath End------

    public RzoNcaBy_StatisticsResult getStatistics(String estimationObject, String from, String till, String city) {
        wrapper.selectFromDropdown(ESTIMATION_OBJECT_SELECT, estimationObject);
        wrapper.sendKeysByXpath(ESTIMATION_DATE_FROM, from);
        wrapper.sendKeysByXpath(ESTIMATION_DATE_TILL, till);
        wrapper.selectFromDropdown(CITY_SELECT, city);
        wrapper.clickByXpath(SEARCH_BUTTON);
        return new RzoNcaBy_StatisticsResult(wrapper.getDriver());
    }

}
