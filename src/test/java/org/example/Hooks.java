package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hooks  extends BasePage {
    BrowserSetup browserSetup = new BrowserSetup();
    LoadProp loadProp = new LoadProp();
    static String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());


    @Before

    public void openBrowser() {
        browserSetup.setUPBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After

    public void closeBrowser() {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,new File("src\\ScreenShot.png"));

        }
        catch (IOException e){
            e.printStackTrace();

        }

        //driver.close();{
    }

}

