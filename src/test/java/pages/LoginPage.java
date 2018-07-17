package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    private static final String loggedUserPanelLocator = "//span[contains(@class, 'user-info')]";
    private static final String dropdownButtonLocator = "//i[@class='ace-icon fa fa-caret-down']"; //xpath
    private static final String logoutButtonLocator = "//a[@href='/admin/auth/logout']"; //xpath

    @FindBy(xpath = loggedUserPanelLocator)
    WebElement loggedUserPanel;
    @FindBy (xpath = dropdownButtonLocator)
    WebElement dropdownButton;
    @FindBy (xpath = logoutButtonLocator)
    WebElement logoutButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
