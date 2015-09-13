package nca.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import vl.nca.by.*;

import java.io.IOException;

/**
 * Created by eviltech on 05.09.2015.
 */
public class VlNcaByTest extends BaseTest {
    @Test(priority = 1)
    public void cadastralCostLangRB_SearchByCadastralParcelNum() throws IOException, InterruptedException {

        String num1 = "5000000000";
        String num2 = "08";
        String num3 = "000952";
        String cadastralNum = "500000000008000952";

        IndexScreen indexScreen = (new IndexScreen(driver));
        CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectCadasralNumberParcel();
        CadastralNumberParcelLangScreen cadastralNumberParcelLangScreen = cadastralCostLangRBScreen.goToVlNcaBy_CadastralNumberParcelLangScreen();
        cadastralNumberParcelLangScreen.insertNum(num1, num2, num3);
        DescriptionParcelScreen descriptionParcelScreen = cadastralNumberParcelLangScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 2)
    public void cadastralCostLangRB_SearchByLocalityAddress() throws IOException, InterruptedException{

        String cadastralNum = "500000000008000952";

        IndexScreen indexScreen = (new IndexScreen(driver));
        CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectLocalityAddress();
        DistrictScreen districtScreen = cadastralCostLangRBScreen.goToVlNcaBy_DistrictScreen();
        districtScreen.selectMinsk();
        ExactAddressScreen exactAddressScreen = districtScreen.goToVlNcaBy_ExactAddressScreen();
        exactAddressScreen.selectKrasnozvezdnij();
        exactAddressScreen.insertHouseNum();
        ParcelScreen parcelScreen = exactAddressScreen.goToVlNcaBy_ParcelScreen();
        parcelScreen.selectParcel();
        DescriptionParcelScreen descriptionParcelScreen = parcelScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 3)
    public void cadastralCostLangRB_SearchByLocalityZoneNumber() throws IOException, InterruptedException{

        String zoneNumber = "22";

        IndexScreen indexScreen = (new IndexScreen(driver));
        CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectLocalityZoneNum();
        CityScreen cityScreen = cadastralCostLangRBScreen.goToVlNcaBy_CityScreen();
        cityScreen.selectMinsk();
        LocalityZoneNumberScreen localityZoneNumberScreen = cityScreen.goToVlNcaBy_LocalityZoneNumber();
        localityZoneNumberScreen.selectZoneNum();
        DescriptionParcelScreen descriptionParcelScreen = localityZoneNumberScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(zoneNumber);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 4)
    public void cadastralCostLangRB_SearchByGardenerNamePartnership() throws IOException, InterruptedException{
        String brestskayaStreet = "Брестская";

        IndexScreen indexScreen = (new IndexScreen(driver));
        CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectGardenerPartnerShip();
        DistrictScreen districtScreen = cadastralCostLangRBScreen.goToVlNcaBy_DistrictScreen();
        districtScreen.selectBaranovichyDistrict();
        GardenerPartnershipScreen gardenerPartnershipScreen = districtScreen.goToVlNcaBy_GardenerPartnershipScreen();
        gardenerPartnershipScreen.selectStAviatorGardener();
        DescriptionParcelScreen descriptionParcelScreen = gardenerPartnershipScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(brestskayaStreet);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 5)
    public void cadastralCostLangRB_SearchByAreasOutsideSettlements() throws IOException, InterruptedException{
        log.info("Кадастровая стоимость земель Республики Беларусь: По территориям вне населенных пунктов, \n" +
                "садоводческих товариществ, дачного \n" +
                "строительства");
        String velikolykskij = "Великолукский с/с";

        IndexScreen indexScreen = (new IndexScreen(driver));
        CadastralCostLangRBScreen cadastralCostLangRBScreen = indexScreen.goToVlNcaBy_CadastralCostLangRBScreen();
        cadastralCostLangRBScreen.selectAreasOutsideSettlements();
        DistrictScreen districtScreen = cadastralCostLangRBScreen.goToVlNcaBy_DistrictScreen();
        districtScreen.selectBaranovichyDistrict();
        AreasOutsideSettlementsScreen areasOutsideSettlementsScreen = districtScreen.goToVlNcaBy_AreasOutsideSettlementsScreen();
        areasOutsideSettlementsScreen.selectVelikolykskij();
        DescriptionParcelScreen descriptionParcelScreen = areasOutsideSettlementsScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(velikolykskij);

        Assert.assertEquals(actualResult, true);
    }

    /*@Test(priority = 6)
    public void testTes() throws IOException, InterruptedException{

    }*/

    @Test(priority = 7)
    public void taxBaseOfLandTax_SearchByCadastralParcelNum()throws IOException, InterruptedException{

        String num1 = "5000000000";
        String num2 = "08";
        String num3 = "000952";
        String cadastralNum = "500000000008000952";

        IndexScreen indexScreen = (new IndexScreen(driver));
        TaxBaseOfLandTax taxBaseOfLandTax = indexScreen.goToVlNcaBy_TaxBaseOfLandTax();
        taxBaseOfLandTax.selectCadasralNumberParcel();
        CadastralNumberParcelLangScreen cadastralNumberParcelLangScreen = taxBaseOfLandTax.goToVlNcaBy_CadastralNumberParcelLangScreen();
        cadastralNumberParcelLangScreen.insertNum(num1, num2, num3);
        DescriptionParcelScreen descriptionParcelScreen = cadastralNumberParcelLangScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 8)
    public void taxBaseOfLandTax_SearchByLocalityAddress() throws IOException, InterruptedException{

        String cadastralNum = "500000000008000952";

        IndexScreen indexScreen = (new IndexScreen(driver));
        TaxBaseOfLandTax taxBaseOfLandTax = indexScreen.goToVlNcaBy_TaxBaseOfLandTax();
        taxBaseOfLandTax.selectLocalityAddress();
        DistrictScreen districtScreen = taxBaseOfLandTax.goToVlNcaBy_DistrictScreen();
        districtScreen.selectMinsk();
        ExactAddressScreen exactAddressScreen = districtScreen.goToVlNcaBy_ExactAddressScreen();
        exactAddressScreen.selectKrasnozvezdnij();
        exactAddressScreen.insertHouseNum();
        ParcelScreen parcelScreen = exactAddressScreen.goToVlNcaBy_ParcelScreen();
        parcelScreen.selectParcel();
        DescriptionParcelScreen descriptionParcelScreen = parcelScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(cadastralNum);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 9)
    public void taxBaseOfLandTax_SearchByLocalityZoneNumber() throws IOException, InterruptedException{

        String zoneNumber = "22";

        IndexScreen indexScreen = (new IndexScreen(driver));
        TaxBaseOfLandTax taxBaseOfLandTax = indexScreen.goToVlNcaBy_TaxBaseOfLandTax();
        taxBaseOfLandTax.selectLocalityZoneNum();
        CityScreen cityScreen = taxBaseOfLandTax.goToVlNcaBy_CityScreen();
        cityScreen.selectMinsk();
        LocalityZoneNumberScreen localityZoneNumberScreen = cityScreen.goToVlNcaBy_LocalityZoneNumber();
        localityZoneNumberScreen.selectZoneNum();
        DescriptionParcelScreen descriptionParcelScreen = localityZoneNumberScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(zoneNumber);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 10)
    public void taxBaseOfLandTax_SearchByGardenerNamePartnership() throws IOException, InterruptedException{
        String brestskayaStreet = "Брестская";

        IndexScreen indexScreen = (new IndexScreen(driver));
        TaxBaseOfLandTax taxBaseOfLandTax = indexScreen.goToVlNcaBy_TaxBaseOfLandTax();
        taxBaseOfLandTax.selectGardenerPartnerShip();
        DistrictScreen districtScreen = taxBaseOfLandTax.goToVlNcaBy_DistrictScreen();
        districtScreen.selectBaranovichyDistrict();
        GardenerPartnershipScreen gardenerPartnershipScreen = districtScreen.goToVlNcaBy_GardenerPartnershipScreen();
        gardenerPartnershipScreen.selectStAviatorGardener();
        DescriptionParcelScreen descriptionParcelScreen = gardenerPartnershipScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(brestskayaStreet);

        Assert.assertEquals(actualResult, true);
    }

    @Test(priority = 11)
    public void taxBaseOfLandTax_SearchByAreasOutsideSettlements() throws IOException, InterruptedException{
        log.info("Кадастровая стоимость земель Республики Беларусь: По территориям вне населенных пунктов, \n" +
                "садоводческих товариществ, дачного \n" +
                "строительства");
        String velikolykskij = "Великолукский с/с";

        IndexScreen indexScreen = (new IndexScreen(driver));
        TaxBaseOfLandTax taxBaseOfLandTax = indexScreen.goToVlNcaBy_TaxBaseOfLandTax();
        taxBaseOfLandTax.selectAreasOutsideSettlements();
        DistrictScreen districtScreen = taxBaseOfLandTax.goToVlNcaBy_DistrictScreen();
        districtScreen.selectBaranovichyDistrict();
        AreasOutsideSettlementsScreen areasOutsideSettlementsScreen = districtScreen.goToVlNcaBy_AreasOutsideSettlementsScreen();
        areasOutsideSettlementsScreen.selectVelikolykskij();
        DescriptionParcelScreen descriptionParcelScreen = areasOutsideSettlementsScreen.goToVlNcaBy_DescriptionParcelScreen();
        Thread.sleep(5000);
        boolean actualResult = descriptionParcelScreen.containsVal(velikolykskij);

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
