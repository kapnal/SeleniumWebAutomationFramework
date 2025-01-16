package org.example.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }


    public static void init(){
        if(driver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--guest");
//            edgeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }
    }

    public static void down(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
