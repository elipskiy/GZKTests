package by.nca.pr;

import by.nca.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class PrNcaByTest extends BaseTest {

    @BeforeMethod()
    public void getNewDriver()	{
        getDriver();
        nullErrors();
    }

    @AfterMethod
    public void closeBrowser()	{
        driver.quit();
    }

    @Test(priority = 1)
    public void cadastralCostLangRB_SearchByCadastralParcelNum() throws IOException, InterruptedException {

        IndexScreen indexScreen = (new IndexScreen(driver));
        indexScreen.scrollDownToIsolatedRoom();
        indexScreen.selectIsolatedRoom();
        indexScreen.clickSettelments();
        indexScreen.clickBrestskaya();
        indexScreen.clickBaranovichi();
        indexScreen.insertDateTransactionOf();
        indexScreen.insertDateTransactionTo();
        indexScreen.scrollDownToFindBtn();
        //TODO: This is total bullshit
        Thread.sleep(4000);
        indexScreen.clickFindBtn();
        indexScreen.scrollUpToShowBtn();
        Thread.sleep(500);
        indexScreen.clickShowBtn();
        indexScreen.insertUsername();
        indexScreen.insertPassword();
        indexScreen.clickEnter();
        Thread.sleep(500);
        indexScreen.closeAlertWindow();
        indexScreen.scrollDownToFindBtn();
        indexScreen.clickFindBtn();
        indexScreen.scrollUpToShowBtn();
        indexScreen.clickShowBtn();
        //Assert.assertEquals(actualResult, true);
    }
}
