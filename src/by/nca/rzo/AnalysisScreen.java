package by.nca.rzo;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mugi4_000 on 14.09.2015.
 */
public class AnalysisScreen extends WrappedScreen {

    AnalysisScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String ANALYZABLE_INDICATIORS          = "//*[@id='accordion']/div[2]/a/h2";
    private static final String RENT_LOSES                      = "//*[@id='analysis_facts3']";
    private static final String ANALYZE_BUTTON                  = "//input[@type='submit']";
    //--------Xpath End------

    public StatisticsResultScreen getAnalysis() {
        WebDriverWait wait = new WebDriverWait(wrapper.getDriver(), 10);
        wrapper.scrollDown(ANALYZABLE_INDICATIORS);
        wrapper.clickByXpath(ANALYZABLE_INDICATIORS);
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        wrapper.scrollDown(RENT_LOSES);
        wrapper.clickByXpath(RENT_LOSES);
        wrapper.scrollDown(ANALYZE_BUTTON);
        wrapper.clickByXpath(ANALYZE_BUTTON);
        return new StatisticsResultScreen(wrapper.getDriver());
    }

}
