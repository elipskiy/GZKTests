package by.nca.rzo;

import by.nca.WrappedScreen;
import utils.PageScreenShot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class StatisticsResultScreen extends WrappedScreen {

    StatisticsResultScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String CRITERIA_TABLE = "//table[@class='captb']/tbody/tr/td";
    //--------Xpath End------

    public List getTableElements() {
        List list = getTextOfElements(CRITERIA_TABLE);
        list.remove(list.size() - 1);
        return list;
    }

}
