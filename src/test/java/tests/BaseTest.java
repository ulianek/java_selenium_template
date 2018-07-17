package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver = null;

    private static void init() {
        driver = new ChromeDriver();
    }


    @BeforeClass
    public static void beforeClass() {
        init();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        try {
            driver.quit();
        } catch (Exception e) {

        }
    }
}
