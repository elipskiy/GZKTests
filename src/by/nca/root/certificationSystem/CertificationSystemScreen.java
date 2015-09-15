package by.nca.root.certificationSystem;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by mugi4_000 on 08.09.2015.
 */
public class CertificationSystemScreen extends WrappedScreen {

    public CertificationSystemScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String TEXT_PARAGRAPHS = "//tbody/tr/td[1]/b";
    //--------Xpath End------

    public List<String> getTextParagraphs() {
        return getTextOfElements(TEXT_PARAGRAPHS);
    }
}
