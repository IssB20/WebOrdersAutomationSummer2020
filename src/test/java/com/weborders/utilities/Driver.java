package com.weborders.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){ }

    public static WebDriver getDriver(){
        if (driver==null){

        }
        return driver;
    }
}


