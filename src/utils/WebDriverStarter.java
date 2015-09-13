package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import com.codeborne.selenide.WebDriverRunner;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/**
 * Created by Evil on 27.09.2014.
 */
public class WebDriverStarter implements WebDriver {
    private static ChromeDriverService service;
    private static WebDriver driver;
    final static String PATH_TO_CHROMEDRIVER = "src//test//resources//chromedriver.exe";

    public WebDriverStarter() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(PATH_TO_CHROMEDRIVER))
                .usingAnyFreePort()
                .build();
        service.start();
        driver = new ChromeDriver(service);
        WebDriverRunner.setWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() throws IOException {
        if(driver == null) {
            new WebDriverStarter();
        }
        return driver;
    }

    @Override
    public void get(String s) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
