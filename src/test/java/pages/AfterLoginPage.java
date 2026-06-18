package pages;

import context.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLoginPage {
    TestContext testContext;
    @FindBy(xpath = "//*[@id=\"menu-item-20\"]/a")
    WebElement PracticeLink;
    @FindBy(xpath = "//*[@id=\"menu-item-20\"]/a")
    WebElement ExceptionsLink;

    public AfterLoginPage(TestContext testContext) {
        this.testContext = testContext;
        PageFactory.initElements(testContext.getDriver(), this);
    }

    public void clickLogin() {
        PracticeLink.click();
    }

    public void clickExceptions() {
        ExceptionsLink.click();
    }
}
