package by.nca.root.databaseStatistics;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_DatabaseStatisticsScreen extends WrappedScreen {

    public NcaBy_DatabaseStatisticsScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String TEXT_HEADER = "//*[@id=\"contentFrame\"]/table/tbody/tr/td/p/strong";
    //--------Xpath End------

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

}
