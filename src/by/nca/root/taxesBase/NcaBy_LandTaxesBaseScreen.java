package by.nca.root.taxesBase;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_LandTaxesBaseScreen extends WrappedScreen {

    public NcaBy_LandTaxesBaseScreen(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return wrapper.getCurrentUrl();
    }

}
