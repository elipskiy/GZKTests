package utils;

import com.codeborne.selenide.ex.ElementNotFound;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertNotNull;

//import java.awt.event.WindowEvent;


/**
 * Created by eviltechnology on 25.10.2014.
 */
public class DriverWrapper {
    public static final Logger log = Logger.getLogger(DriverWrapper.class);
    private WebDriver driver;
    private WebDriverWait wait;

    public static final String HTTP_ADDRESS = "http://nka_rh:8080/signin.html";

    public DriverWrapper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public WebDriver getDriver() {
        return driver;
    }

    //******************************************************************************************************************
    public WebElement findByXpath(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        return element;
    }

    //******************************************************************************************************************
    public void elemNotNull(String xpath){
       WebElement element = driver.findElement(By.xpath(xpath));
        try {
            assertNotNull(element);
        }
        catch (ElementNotFound e) {
            log.info("Элемент не найден");
        }
    }

    //******************************************************************************************************************
    public List<WebElement> findElementsByXpath(String xpath){
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        return elements;
    }

    //******************************************************************************************************************
    public void findByTagName(String xpath){
        WebElement element = driver.findElement(By.tagName(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
    }

    //******************************************************************************************************************
    public List<WebElement> findByTagsNames(String xpath){
        List<WebElement> elements = driver.findElements(By.tagName(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        return elements;
    }

    //******************************************************************************************************************
    public void clickByXpath(String xpath){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.click();
        log.info(String.format("Клик по xpath = %s ", xpath));
    }



    //******************************************************************************************************************
    public void clickByXpath(String xpath, int timeout){
        WebElement element = driver.findElement(By.xpath(xpath));//добавить ожидание
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.click();
    }

    //******************************************************************************************************************
    public void sendKeysByXpath(String xpath, String text ) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.sendKeys(text);
        log.info(String.format("Вводим текст = %s c  xpath = %s1 ", text, xpath));
    }

    //******************************************************************************************************************
    public void clear (String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.clear();
        log.info(String.format("Очищаем поле "));
    }

    //******************************************************************************************************************
    public void closeAlertWindow(){
        //Actions action = new Actions(driver);
        //action.sendKeys();
        driver.switchTo().alert().accept();


    }
    //******************************************************************************************************************
    public boolean isSelectedByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        boolean result = element.isSelected();
        log.info(String.format("Элемент c  xpath = %s является выбранным:%s1 ", xpath, result));
        return result;
    }

    //******************************************************************************************************************
    public boolean isEnable(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        boolean result = element.isEnabled();
        log.info(String.format("Элемент c  xpath = %s является выбранным:%s1 ", xpath, result));
        return result;
    }

    //******************************************************************************************************************
    public String getTextByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        String result = element.getText();
        log.info(String.format("Элемент c  xpath = %s содержит текст: %s", xpath, result));
        return result.trim();
    }

    //******************************************************************************************************************
    public String getPageTitle(){
        String pageTitle = driver.getTitle().trim();
        log.info(String.format("Title страницы = %s", pageTitle));
        return pageTitle;

    }

    //******************************************************************************************************************
    public String getPagelink(String text){
        WebElement element = driver.findElement(By.linkText(text));
        log.info(String.format("Элемент по тексту = %s найден", text));
        String result = element.getText();
        log.info(String.format("Элемени содержит текст = %s", text));
        return result;
    }

    //******************************************************************************************************************
    public String getAttributeNameByXpath(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        String result = element.getAttribute("name");
        log.info(String.format("Элемени содержит текст = %s", result));
        return result;
    }

    //******************************************************************************************************************
    public String getAttributeValueByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        String result = element.getAttribute("value");
        log.info(String.format("Элемени содержит текст = %s", result));
        return result;
    }

    //******************************************************************************************************************
    public String getCurrentUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }

    //******************************************************************************************************************
    public void goBack() {
        driver.navigate().back();
    }

    //******************************************************************************************************************
    public void selectFromDropdown(String xpath, String optionText) {
        Select select = new Select(findByXpath(xpath));
        log.info("Элемент по xpath = " + xpath + " найден");
        //select.deselectAll();
        select.selectByVisibleText(optionText);
        log.info("Установил значение элемента по xpath = " + xpath + " на " + optionText);
    }

    //******************************************************************************************************************
    public void pressEnter(String xpath ) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);

    }

    //******************************************************************************************************************
    public boolean containText(String text) {
        boolean element = driver.getPageSource().contains(text);
        return element;
    }

    //******************************************************************************************************************
    public void doubleClick(String text) {
        Actions action = new Actions(driver);
        WebElement element=driver.findElement(By.xpath(text));
        action.doubleClick(element).perform();
    }

    //******************************************************************************************************************
    public void pressDownOnly() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
    }

    //******************************************************************************************************************
    public void pressEscOnly() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    //******************************************************************************************************************
    public void pressUpOnly() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
    }

    //******************************************************************************************************************
    public void pressDownEnter(String xpath ) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.sendKeys(Keys.DOWN, Keys.ENTER);

    }

    //******************************************************************************************************************
    public void pressOnlyEnter(String xpath ) {
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.sendKeys(Keys.ENTER);
    }

    //******************************************************************************************************************
    public void pressEnterOnly() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    //******************************************************************************************************************
    public void pressESC(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        log.info(String.format("Элемент по xpath = %s найден", xpath));
        element.sendKeys(Keys.ESCAPE);
    }

    public void robotESC() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    //******************************************************************************************************************
    public void pressFullScreen() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_UP);
    }

    //******************************************************************************************************************
    public void pressNoFullScreen() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_DOWN);
    }

    //******************************************************************************************************************
    public void scrollDown(String xpath)  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();"
                    , element);


    }

    //******************************************************************************************************************
    public void closeDialog(String script)  {
        //WebElement element = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor)driver).executeScript(script);
    }

    //******************************************************************************************************************
    public String getJSText()  {
        String n = (String) ((JavascriptExecutor)driver).executeScript("return $(':contains(\"Индивидуальный гараж\")','#myJstree').last().text();");
        return n;
    }

    //******************************************************************************************************************
    public List<String> getJSTableText()  {
        List<String> arr = (List) ((JavascriptExecutor)driver).executeScript("var tabl = $('#shapeParameters').children()[0];" +
                "var arr = $('.limitedBandwidth', tabl);var nameArr = [];for(var i=0; i<arr.length;i++){nameArr.push($(arr[i]).text())}return nameArr;");
        return arr;
    }

    //******************************************************************************************************************
    public void jqExecute(String script)  {
        ((JavascriptExecutor)getDriver()).executeScript(script);
    }
    //******************************************************************************************************************
    
    //******************************************************************************************************************
    public String jqReturnStringExecute(String script)  {
       String s = (String)((JavascriptExecutor) getDriver()).executeScript(script);
        return s;
    }
    //******************************************************************************************************************

    //******************************************************************************************************************
    public long jqReturnExecute(String script)  {
        long n =  (long)((JavascriptExecutor)getDriver()).executeScript(script);
        return n;
    }
    //******************************************************************************************************************
    public boolean jqReturnBooleanExecute(String script)  {
        boolean n =  (boolean)((JavascriptExecutor)getDriver()).executeScript(script);
        return n;
    }
    //******************************************************************************************************************
    public  void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public void addFile() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    //******************************************************************************************************************


    //******************************************************************************************************************
    public void pressDownButon() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }



    //Методы
    //******************GetTabFocus*************************************************************************************
    public void GetTabFocus() {

        String base = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        set.remove(base);
        driver.close();
        assert set.size() == 1;
        driver.switchTo().window((String) set.toArray()[0]);

        //close the window and sitch back to the base tab
        //driver.close();
        //driver.switchTo().window(base);
    }

    //***********closeTab***********************************************************************************************
    public void closeTab(){
        driver.close();
    }

    //*****setURL*******************************************************************************************************
    public void setURL(String xpath){
        driver.get(xpath);
    }

    //*****OPEN NEW TAB*************************************************************************************************
    public void trigger(String script, WebElement element) {
        ((JavascriptExecutor)driver).executeScript(script, element);
    }

    public Object trigger(String script) {
        return ((JavascriptExecutor)driver).executeScript(script);
    }

    public void openTab(String url) {
        String script = "var d=document,a=d.createElement('a');a.target='_blank';a.href='%s';a.innerHTML='.';d.body.appendChild(a);return a";
        Object element = trigger(String.format(script, url));
        if (element instanceof WebElement) {
            WebElement anchor = (WebElement) element; anchor.click();
            trigger("var a=arguments[0];a.parentNode.removeChild(a);", anchor);
        } else {

            throw new JavaScriptException(element, "Unable to open tab", 1);
        }
    }

    //******************************************************************************************************************

    //************Open and Switch Tabs
    public void openNewWindow(String url)  {
        ((JavascriptExecutor) getDriver()).executeScript("window.open(arguments[0])", url);
    }

    public void switchWindow(int numberOfWindow) {
        String handle = driver.getWindowHandles().toArray()[numberOfWindow].toString();
        driver.switchTo().window(handle);
    }

    //************Open and Switch Tabs End

    //************Wating status
    public void waitStatus_0(String getStatus) {
        long status = jqReturnExecute(getStatus);
        Date date = new Date();
        Date date2 = new Date();
        while (status == 1 && (date.getTime() + 90000 > date2.getTime())) {
            status = jqReturnExecute(getStatus);
            date2 = new Date();
        }
        log.info("Ожидаем, когда статус станет 0: " + status);
    }

    public void waitStatus_1(String getStatus) {
        long status = jqReturnExecute(getStatus);
        Date date = new Date();
        Date date2 = new Date();
        while (status == 0 && (date.getTime() + 90000 > date2.getTime())) {
            status = jqReturnExecute(getStatus);
            date2 = new Date();
        }
        log.info("Ожидаем, когда статус станет 0: " + status);
    }

    public void switchFrame(WebElement name) {
        driver.switchTo().frame(name);
    }
    //************Wating status *****End*****

    //************JSON

    public JsonElement getJson(){
        Object response = ((JavascriptExecutor) driver).executeAsyncScript(
                "var callback = arguments[arguments.length - 1];" +
                        "var xhr = new XMLHttpRequest();" +
                        "xhr.open('GET', '/resource/data.json', true);" +
                        "xhr.onreadystatechange = function() {" +
                        "  if (xhr.readyState == 4) {" +
                        "    callback(xhr.responseText);" +
                        "  }" +
                        "};" +
                        "xhr.send();");
        JsonElement json = new JsonParser().parse((String) response);
        log.info(json);
        return json;
    }

}
