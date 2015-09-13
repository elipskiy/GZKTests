package by.nca.wekhfg;

import by.nca.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by eviltech on 12.09.2015.
 */
public class WekhfgNcaByTest extends BaseTest {

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
    public void reliabilityIndexJ1() throws IOException, InterruptedException {
        String expectedResult = "По ЦБД";
        IndexScreen indexScreen = (new IndexScreen(driver));
        CheckCriteriaJ1Screen checkCriteriaScreen = indexScreen.goToWekhfgNcaBy_CheckCriteriaJ1Screen();
        //selectSubject.selectNotCorrectBirth.selectBirthBefore01_01_1980.clickShowScript.selectCDB.clickShow.containsText
        checkCriteriaScreen.selectSubject();
        checkCriteriaScreen.selectNotCorrectBirth();
        checkCriteriaScreen.selectBirthBefore01_01_1980();
        Thread.sleep(200);
        checkCriteriaScreen.clickShowScript();
        Thread.sleep(200);
        checkCriteriaScreen.selectCDB();
        Thread.sleep(200);
        checkCriteriaScreen.clickShow();
        boolean result = checkCriteriaScreen.containsText(expectedResult);
        Assert.assertEquals(result, true);
    }
}
