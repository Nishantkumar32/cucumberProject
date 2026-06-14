package pages;

import context.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLoginPage {
    WebDriver driver;
    TestContext testContext;
    public AfterLoginPage(TestContext testContext) {
        this.testContext=testContext;

        PageFactory.initElements(testContext.getDriver(), this);
        this.driver= testContext.getDriver();
    }
    @FindBy(xpath = "(//*[contains(text(),'Practice')])[3]")
    WebElement PracticeLink;
    public void clickLogin() {
        PracticeLink.click();
    }
    @FindBy(xpath="//*[contains(text(),'Test Exceptions')]")
    WebElement ExceptionsLink;

    public void clickExceptions()
    {
        ExceptionsLink.click();
    }
}
