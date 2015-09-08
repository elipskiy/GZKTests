package nca.Tests;

import nca.Screens.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class VlNcaByTest extends BaseTest {
    @Test(priority = 1)
    public void CadastralCostLangRB_SearchByCadastralParcelNum() throws IOException, InterruptedException {

        String num1 = "5000000000";
        String num2 = "08";
        String num3 = "000952";
        String cadastralNum = "500000000008000952";

        VlNcaBy_IndexScreen indexScreen = (new VlNcaBy_IndexScreen(driver));
        VlNcaBy_CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectCadasralNumberParcel();
        VlNcaBy_CadastralNumberParcelLangScreen cadastralNumberParcelLangScreen = cadastralCostLangRBScreen.goToVlNcaBy_CadastralNumberParcelLangScreen();
        cadastralNumberParcelLangScreen.insertNum(num1, num2, num3);
        VlNcaBy_DescriptionParcelScreen descriptionParcelScreen = cadastralNumberParcelLangScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 2)
    public void CadastralCostLangRB_SearchByLocalityAddress() throws IOException, InterruptedException{

        String cadastralNum = "500000000008000952";

        VlNcaBy_IndexScreen indexScreen = (new VlNcaBy_IndexScreen(driver));
        VlNcaBy_CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectLocalityAddress();
        VlNcaBy_DistrictScreen districtScreen = cadastralCostLangRBScreen.goToVlNcaBy_DistrictScreen();
        districtScreen.selectMinsk();
        VlNcaBy_ExactAddressScreen exactAddressScreen = districtScreen.goToVlNcaBy_ExactAddressScreen();
        exactAddressScreen.selectKrasnozvezdnij();
        exactAddressScreen.insertHouseNum();
        VlNcaBy_ParcelScreen parcelScreen = exactAddressScreen.goToVlNcaBy_ParcelScreen();
        parcelScreen.selectParcel();
        VlNcaBy_DescriptionParcelScreen descriptionParcelScreen = parcelScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 3)
    public void CadastralCostLangRB_SearchByLocalityZoneNumber() throws IOException, InterruptedException{

        String zoneNumber = "22";

        VlNcaBy_IndexScreen indexScreen = (new VlNcaBy_IndexScreen(driver));
        VlNcaBy_CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectLocalityZoneNum();
        VlNcaBy_CityScreen cityScreen = cadastralCostLangRBScreen.goToVlNcaBy_CityScreen();
        cityScreen.selectMinsk();
        VlNcaBy_LocalityZoneNumberScreen localityZoneNumberScreen = cityScreen.goToVlNcaBy_LocalityZoneNumber();
        localityZoneNumberScreen.selectZoneNum();
        VlNcaBy_DescriptionParcelScreen descriptionParcelScreen = localityZoneNumberScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(zoneNumber);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 0)
    public void CadastralCostLangRB_ByGardenerNamePartnership() throws IOException, InterruptedException{

        String brestskaya = "Брестская";

        VlNcaBy_IndexScreen indexScreen = (new VlNcaBy_IndexScreen(driver));
        VlNcaBy_CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectGardenerPartnerShip();
        VlNcaBy_DistrictScreen districtScreen = cadastralCostLangRBScreen.goToVlNcaBy_DistrictScreen();
        districtScreen.selectBaranovichyDistrict();
        VlNcaBy_GardenerPartnershipScreen gardenerPartnershipScreen = districtScreen.goToVlNcaBy_GardenerPartnershipScreen();
        gardenerPartnershipScreen.selectStAviatorGardener();
        VlNcaBy_DescriptionParcelScreen descriptionParcelScreen = gardenerPartnershipScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(brestskaya);

        Assert.assertEquals(actualResult, true);

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
