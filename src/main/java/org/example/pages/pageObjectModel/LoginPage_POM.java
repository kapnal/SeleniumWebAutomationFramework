package org.example.pages.pageObjectModel;

import org.example.base.CommonToAllPage;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAllPage {
    WebDriver driver;
    public LoginPage_POM() {

       super();
    }

    //  Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");


    // Page Actions

    public String loginToVWOInvalidCreds() {

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,"admin");
        clickElement(signButton);

        presenceOfElement(error_message);
        visibilityOfElement(error_message);
        return getElement(error_message).getText();

    }

    public void loginToVWOValidCreds() {

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);

        //Dashboard page
    }

    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }

}
