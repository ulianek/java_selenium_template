package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public String Url;
    public WebDriver Driver;
    public WebDriverWait Waiter;

    public BasePage(WebDriver driver)
    {
        this.Driver = driver;
        Waiter =  new WebDriverWait(driver,10);
    }

    public void Navigate()
    {
        Driver.navigate().to(Url);
    }

    public void ClickOn(By locator){
        Waiter.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void TypeOn(By locator, String text){
        Waiter.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public WebElement WaitAndGetElement(By locator){
        return Waiter.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
