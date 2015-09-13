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
        screenShot = new PageScreenShot(driver);
    }

    PageScreenShot screenShot;

    //--------Xpath----------
    private static final String CRITERIA_TABLE = "//table[@class='captb']/tbody/tr/td";
    //--------Xpath End------

    public List getTableElements(String screenshotName) {
        try {
            screenShot.takeScreenShot(screenshotName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List list = getTextOfElements(CRITERIA_TABLE);
        list.remove(list.size() - 1);
        return list;
    }

}
