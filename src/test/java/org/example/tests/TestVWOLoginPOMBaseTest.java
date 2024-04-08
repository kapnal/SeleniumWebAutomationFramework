package org.example.tests;

import org.assertj.core.api.Assertions;
import org.example.basetest.CommonToAllTest;
import org.example.pages.pageObjectModel.DashboardPage_POM;
import org.example.pages.pageObjectModel.LoginPage_POM;
import org.example.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {

    @Test(groups = {"smoke"}, priority = 1)
    public void testLoginNegative(){

        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds();

        //TestNG Assertion
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");

        // AssertJ Assertion
        Assertions.assertThat(error_msg_text).isNotNull().isNotBlank().contains(PropertyReader.readKey("error_message"));

    }

    @Test(priority = 2)
    public void testLoginPositive(){

        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        loginPagePom.loginToVWOValidCreds();
        DashboardPage_POM dashboardPagePom =loginPagePom.afterLoginVWOValidCreds();
       String expected_username = dashboardPagePom.LoggedInUserName();

        // TestNG Assertion
        Assert.assertEquals(expected_username, PropertyReader.readKey("expected_username"));

        // AssertJ
        Assertions.assertThat(expected_username).isNotNull().isNotBlank().contains(PropertyReader.readKey("expected_username"));
    }
}
