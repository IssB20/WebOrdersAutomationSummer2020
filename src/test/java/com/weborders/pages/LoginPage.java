package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement usernameElement;

    @FindBy( id="ctl00_MainContent_password")
    private WebElement passwordElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(){
        String username = ConfigurationReader.getProperties("username");
        String password = ConfigurationReader.getProperties("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);
    }
}
