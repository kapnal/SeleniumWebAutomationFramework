package org.example.tests;

import org.example.base.CommonToAllPage;
import org.example.basetest.CommonToAllTest;
import org.example.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOM extends CommonToAllTest {

    @Test
    public void testLoginNegative(){

        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds();
    }
}
