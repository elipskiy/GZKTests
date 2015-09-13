package nca.Screens.ncaBy.publicCadastralMap;

import nca.Screens.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_PublicCadastralMapScreen extends WrappedScreen {

    public NcaBy_PublicCadastralMapScreen(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return wrapper.getCurrentUrl();
    }

}
