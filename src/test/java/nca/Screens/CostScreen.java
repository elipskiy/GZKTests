package nca.Screens;

import nca.Tests.SmokeTest;
import nca.Utils.DriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Created by makovskiy on 06.04.2015.
 */
public class CostScreen {
    DriverWrapper wrapper;
    public static final Logger log = Logger.getLogger(SmokeTest.class);

    public static final String TD_CLASS_XPATH = "//td[@class='limitedBandwidth']";
    public static final String OPERATION_PAGE_XPATH = "//a[@id='operations']";
    public static final String OVERALL_PAGE_XPATH = "//a[@id='corporate']";
    public static final String COMPONET_PART_PAGE_XPATH = "//a[@id='componentParts']";
    public static final String BEAUTIFICATION_PAGE_XPATH = "//a[@id='beautification']";

    CostScreen(WebDriver driver) {
        wrapper = new DriverWrapper(driver);
    }

    public String verifyTitleCostScreen() throws AWTException {
        log.info("Получаем TITLE ");
        wrapper.pressFullScreen();
        String title = wrapper.getPageTitle();
        log.info(String.format("Элемент содержит текст = %s", title));
        return title;
    }

    //******************************************************************************************************************
    public List<String> verifyTableElementsCost() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        log.info("Собираем данные в массив");
        List<String> arr = wrapper.getJSTableText();
        log.info(arr);
        return arr;
    }

    //******************************************************************************************************************
    public String verifyTitleOper() throws InterruptedException {
        wrapper.clickByXpath(OPERATION_PAGE_XPATH);
        Thread.sleep(1500);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleCom() throws InterruptedException {
        wrapper.clickByXpath(OVERALL_PAGE_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleCompPart() throws InterruptedException {
        wrapper.clickByXpath(COMPONET_PART_PAGE_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }

    //******************************************************************************************************************
    public String verifyTitleBeautification() throws InterruptedException {
        wrapper.clickByXpath(BEAUTIFICATION_PAGE_XPATH);
        Thread.sleep(2000);
        String title = wrapper.getPageTitle();
        return title;
    }
}
