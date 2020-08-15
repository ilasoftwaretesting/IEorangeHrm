package org.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.URL;

public class Utils extends BasePage {
    private static PolicyUtils.IO FileUtils;


    //to click on elements
    public static void ClickOnElement(By by) {
        driver.findElement(by).click();
    }

    // to enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //to get text from element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //to select from droplist by visible text
    public static void SelectByVisibleText(By by, String name) {
        // new Select(driver.findElement(by)).selectByVisibleText(name);

    }

    // to creat timestamp to use in email
    public static String timeStamp() {
        DateFormat format = new SimpleDateFormat("DDMMYYMMSS");
        return format.format(new Date());
    }

    //to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void waitForElementToBevisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //to wait for a element to be display
    public static void waitForElementToBeDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }


    // to select from droplist by index
    public static void selectByIndex(By by, int numb) {
        //new Select(driver.findElement(by)).selectByIndex(numb);
    }

    //to clear text
    public static void clearText(By by) {
        driver.findElement(by).clear();
    }

    //To open a URL in the current browser instance
    public static void get() {
        driver.get("URL");
    }

    // To check if the URL is correct
    public static void getcurrentUrl() {
        driver.getCurrentUrl();
    }

    //Various string opertons like contains () to ascertain the preesence of the specified string value
    public static void getPageSource() {
        driver.getPageSource().contains("String to find");

    }

    //To get page title in the selenium webdriver
    public static void gettitle() {
        driver.getTitle();
    }

    //To check whether the element is enabled or disabled in the selenium webdriver
    public static void enabled() {
        driver.findElement(By.xpath("")).isEnabled();
    }

    //To submit a web form or registration form
    public static void submit(By by) {
        driver.findElement(by).submit();
    }

    //to varify if an eliment is actually present in the webpage
    public static void size(By by) {
        driver.findElement(by).getSize();

    }

    // due to server issues or network delays
    public static void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
    }

    //From expected condition to wait explicitly till an alert appears.
    public static void Webdriverwait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = (WebElement) wait.until(ExpectedConditions.alertIsPresent());
    }

    // to navigate between the URLs
    public static void navigate() {
        driver.navigate().to("");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //How to take screenshot and store as a file format
    public void TakeScreenshoot (){
        // File Src  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // try {
        //now copy screenshot and save the file in loction
        // FileUtils.copyFile(Src,new File("src/ScreenShot/error.png"));}
        // catch (IOException e) {
        //System.out.println(e.getMessage());
        //  }

    }

    //move to element from the action class simulate mouse hover effect
    public static void moveelement() {
        Actions actions = new Actions(driver);
        WebElement mousehover = driver.findElement(By.xpath(""));
        actions.moveToElement(mousehover);
        actions.perform();
    }

    // dragAndDrop from action class to drag an element and drop it on another element
    public static void dragAndDrop() {
        WebElement sourceLocator = driver.findElement(By.xpath(""));
        WebElement destinationLocator = driver.findElement(By.xpath(""));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
    }

    // switch to accept and dismiss and sendkeys methods from alert class to switch to popup alert and handle them
    public static void popup() {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("");
        alert.accept();
        //alert.dismiss(); can be used to dosmiss the alert
    }

    //to get WindowHandle multiple windows in selenium
    //public static void MultipleWindows (){
    //String handle = driver.getWindowHandle();
    //Set<String> handle = driver.getWindowHandle();
    //driver.switchTo().window(String.valueOf(handle));}
    //}

    //to get connection from driverManager to start Database connection
    public static void Connection() throws SQLException {
        DriverManager.getConnection(URL, "", "");
        //to connect to database we have to use Credintial

    }
    // POI to read from the excel files
    // public static void ImportExcelfiles(){
    //Workbook workbook = WorkbookFactory.create(new fileinputStream(file));
    //Sheet sheet = workbook.getSheetAt(0);
    //}
// Assertion are used to compare the expected and actual results pass or fail of a test is
// usually decided from the result of assertions. different type of assert are used in automation.
//public static void Asserts (By by, String name){
//Assert.assertEquals( "");
//Assert.assertNotEquals("");
//Assert.assertTrue(<0);
//Assert.assertFalse(<0);
//}

//this commands are used at the end of every automation program
//public static void closeandquit(){
//WebDriver driver;
//driver.close();
//driver.quit();

    //}

}

