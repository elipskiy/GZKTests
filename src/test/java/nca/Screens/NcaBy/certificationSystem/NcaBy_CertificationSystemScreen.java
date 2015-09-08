package nca.Screens.NcaBy.certificationSystem;

import nca.Screens.WrappedScreen;
import nca.Utils.DriverWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mugi4_000 on 08.09.2015.
 */
public class NcaBy_CertificationSystemScreen extends WrappedScreen {

    public NcaBy_CertificationSystemScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String TEXT_PARAGRAPHS = "//tbody/tr/td[1]/b";
    //--------Xpath End------

    public List<String> getTextParagraphs() {
        return getTextParagraphsUnified(TEXT_PARAGRAPHS);
    }
}
