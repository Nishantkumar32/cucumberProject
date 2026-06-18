package pages;

import context.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    TestContext testContext;

    public LoginPage(TestContext testContext) {
       this.testContext=testContext;
        PageFactory.initElements(testContext.getDriver(), this);
    }


    // Page elements
    @FindBy(xpath = "//*[@id='username']")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "submit")
    WebElement loginButton;


    // Page actions
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

