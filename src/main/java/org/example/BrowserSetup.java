package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetup extends BasePage{
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void setUPBrowser() {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\Resources\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\Resources\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver();


        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src\\Resources\\Driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();


        } else {
            System.out.println("browser is wrong");
        }
    }
}
