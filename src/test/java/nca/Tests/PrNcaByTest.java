package nca.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pr.nca.by.IndexScreen;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class PrNcaByTest extends BaseTest {

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


    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @AfterTest
    public static void CC(){
        driver.quit();
    }
}
