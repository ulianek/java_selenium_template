package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class FirstTest extends BaseTest{

    private static Timestamp timestamp;

    @Test
    public void firstExampleTest() throws Exception {

        // Create a new instance of the Firefox driver

        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        Thread.sleep(1000);

        // Close the driver
        driver.quit();

    }

}