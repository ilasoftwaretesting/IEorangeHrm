package org.example;

import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();
    // to creat timestamp to use in email
    public static String timeStamp() {
        DateFormat format = new SimpleDateFormat("DDMMYYMMSS");
        return format.format(new Date());
    }
    private By _enterUsername = By.id("txtUsername");
    private By _enterPassword = By.id("txtPassword");
    private By _clickLoginbutton = By.id("btnLogin");

    public void enterUsername(String username)  {
        enterText(_enterUsername,(username));
    }
    public void enterPassword(String password){
        enterText(_enterPassword,(password));
    }
    public void clickonloginButton() {
        ClickOnElement(_clickLoginbutton);

    }
    }
