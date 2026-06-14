package stepDef;



import context.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.AfterLoginPage;
import pages.LoginPage;

public class PracticePageSteps {

    WebDriver driver;
   AfterLoginPage afterLoginPage;
    private final TestContext testContext;

    public PracticePageSteps(TestContext testContext) {
        this.testContext = testContext;
        afterLoginPage= new AfterLoginPage(testContext);
    }

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        // Initialize WebDriver (Chrome example)

    }

    @When("user clicks on {string} link")
    public void user_clicks_on_link(String linkText) {
afterLoginPage.clickLogin();;
    }

    @And("{string} link is displayed")
    public void link_is_displayed(String linkText) {

    }

    @And("user clicks on {string} link")
    public void user_clicks_on_test_exceptions_link(String linkText) {
afterLoginPage.clickLogin();
    }

    @Then("user should be navigated to the Test Exceptions page")
    public void user_should_be_navigated_to_the_test_exceptions_page() {

        driver.quit();
    }
}
