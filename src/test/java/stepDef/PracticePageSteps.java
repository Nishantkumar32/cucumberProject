package stepDef;


import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AfterLoginPage;

public class PracticePageSteps {

    WebDriver driver;
    AfterLoginPage afterLoginPage;
    TestContext testContext;

    public PracticePageSteps(TestContext testContext) {
       this.testContext=testContext;
        System.out.println(testContext);
        afterLoginPage= new AfterLoginPage(testContext);
    }

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {

        // Initialize WebDriver (Chrome example)

    }

    @When("user clicks on link")
    public void user_clicks_on_link() {
        afterLoginPage.clickLogin();
        ;
    }

    @And("{string} link is displayed")
    public void link_is_displayed(String linkText) {

    }

    @Then("user should be navigated to the Test Exceptions page")
    public void user_should_be_navigated_to_the_test_exceptions_page() {

        driver.quit();
    }
}
