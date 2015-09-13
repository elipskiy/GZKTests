package nca.Screens.rzoNcaBy;

import nca.Screens.WrappedScreen;
import nca.Utils.PageScreenShot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;

/**
 * Created by mugi4_000 on 13.09.2015.
 */
public class RzoNcaBy_StatisticsResult extends WrappedScreen {

    RzoNcaBy_StatisticsResult(WebDriver driver) {
        super(driver);
        screenShot = new PageScreenShot(driver);
    }

    PageScreenShot screenShot;

    //--------Xpath----------
    private static final String CRITERIA_TABLE = "//table[@class='captb']/tbody/tr/td";
    //--------Xpath End------

    public List getTableElements() {
        try {
            screenShot.takeScreenShot("rzo.nca.by_Общая статистика: общие параметры_case_1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List list = getTextOfElements(CRITERIA_TABLE);
        list.remove(list.size() - 1);
        return list;
    }

}
