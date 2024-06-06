package org.example.basetest;

import io.qameta.allure.Allure;
import org.example.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;


public class CommonToAllTest {

    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start

    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }


}
