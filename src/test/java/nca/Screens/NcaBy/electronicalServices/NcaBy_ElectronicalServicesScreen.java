package nca.Screens.ncaBy.electronicalServices;

import nca.Screens.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_ElectronicalServicesScreen extends WrappedScreen {

    public NcaBy_ElectronicalServicesScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String TEXT_HEADER = "//*[@id=\"container\"]/div/div[5]/div[4]/div/div[1]/h1/a";
    //--------Xpath End------

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

}
