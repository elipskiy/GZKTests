package nca.Tests;

import nca.Screens.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class GzkNcaByTest extends BaseTest {

    @Test(priority = 1)
    public void FindByAddress() throws IOException {

        String name = "Monitoring";
        String key = "ghEvT45!as";
        GzkNcaBy_IndexScreen indexScreen = (new GzkNcaBy_IndexScreen(driver));
        indexScreen.clickFindByAddressRadioBtn();
        GzkNcaBy_RegionScreen regionScreen = indexScreen.goToGzkNcaBy_RegionScreen();
        regionScreen.selectMinskRegion();
        GzkNcaBy_DistrictScreen districtScreen = regionScreen.goToGzkNcaBy_DistrictScreen();
        districtScreen.selectMinskDistrict();
        GzkNcaBy_LocalityScreen localityScreen = districtScreen.goToGzkNcaBy_LocalityScreen();
        localityScreen.selectMinskLocality();
        GzkNcaBy_ObjectRealtyScreen objectRealtyScreen = localityScreen.goToGzkNcaBy_ObjectRealtyScreen();
        objectRealtyScreen.selectStreet();
        objectRealtyScreen.inputHouseNumber();
        GzkNcaBy_SearchResultScreen searchResultScreen = objectRealtyScreen.goToGzkNcaBy_SearchResultScreen();
        searchResultScreen.selectKrasnozvezdnijResult();
        searchResultScreen.scrollToCopyingBtn();
        GzkNcaBy_CopyingScreen copyingScreen = searchResultScreen.goToGzkNcaBy_CopyingScreen();
        copyingScreen.login(name, key);
        //No testResult ->
    }

    @Test(priority = 2)
    public void FindByCadastralNumber() throws IOException {

        String name = "Monitoring";
        String key = "ghEvT45!as";

        String osato = "5000000000";
        String blockNum = "08";
        String parcelNum = "000952";

        GzkNcaBy_IndexScreen indexScreen = (new GzkNcaBy_IndexScreen(driver));
        indexScreen.clickFindByCadastralRadioBtn();
        GzkNcaBy_SearchByCadastralNumScreen searchByCadastralNumScreen = indexScreen.goToGzkNcaBy_SearchByCadastralNum();
        searchByCadastralNumScreen.insertOsato(osato);
        searchByCadastralNumScreen.insertBlockNum(blockNum);
        searchByCadastralNumScreen.insertParcelNum(parcelNum);
        GzkNcaBy_SearchResultScreen searchResultScreen = searchByCadastralNumScreen.goToGzkNcaBy_SearchResultScreen();
        GzkNcaBy_CopyingScreen copyingScreen = searchResultScreen.goToGzkNcaBy_CopyingScreen();
        copyingScreen.login(name,key);
        //No testResult ->
    }

    @Test(priority = 3)
    public void FindByInvNumber() throws IOException {

        String name = "Monitoring";
        String key = "ghEvT45!as";

        String orgCode = "500";
        String invNum = "6247";

        GzkNcaBy_IndexScreen indexScreen = (new GzkNcaBy_IndexScreen(driver));
        indexScreen.clickFindByInvNumRadioBtn();
        GzkNcaBy_SearchByInvNumScreen searchByInvNumScreen = indexScreen.goToGzkNcaBy_SearchByInvNumScreen();
        searchByInvNumScreen.insertOrgCode(orgCode);
        searchByInvNumScreen.selectTypeInC();
        searchByInvNumScreen.insertInvNum(invNum);
        GzkNcaBy_SearchResultScreen searchResultScreen = searchByInvNumScreen.goToGzkNcaBy_SearchResultScreen();
        GzkNcaBy_CopyingScreen copyingScreen = searchResultScreen.goToGzkNcaBy_CopyingScreen();
        copyingScreen.login(name,key);
        //No testResult ->

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
