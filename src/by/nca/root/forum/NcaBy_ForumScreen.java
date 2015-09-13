package by.nca.root.forum;

import by.nca.WrappedScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by mugi4_000 on 10.09.2015.
 */
public class NcaBy_ForumScreen extends WrappedScreen {

    public NcaBy_ForumScreen(WebDriver driver) {
        super(driver);
    }

    //--------Xpath----------
    private static final String TEXT_HEADER = "//tbody/tr[1]/td/strong";
    private static final String TEXT_FORUM = "//table[2]/tbody/tr/td/table[1]/tbody/tr/td[1]/span[2]/a";
    //--------Xpath End------

    public String getTextHeader() {
        return wrapper.getTextByXpath(TEXT_HEADER);
    }

    public String getForumText() {
        return wrapper.getTextByXpath(TEXT_FORUM);
    }

}
