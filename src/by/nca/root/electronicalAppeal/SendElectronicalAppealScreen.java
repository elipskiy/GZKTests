package by.nca.root.electronicalAppeal;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class SendElectronicalAppealScreen extends WrappedScreen {

    public SendElectronicalAppealScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String SEND_LINK = "//*[@id=\"container\"]/div/div[5]/div[4]/div/div[3]/a/font";
    private static final String TEXT_HEADER = "//*[@id=\"container\"]/div/div[5]/div[4]/div/div[1]/h1/a";
    //--------Xpath End------

    public String getSendLinkText() {
        return wrapper.getTextByXpath(SEND_LINK);
    }

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

}
