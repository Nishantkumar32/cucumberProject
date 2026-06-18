package stepDef;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    //AfterLoginPage afterLoginPage;
    private final TestContext testContext;
    /*private String username;
    private String password;
    private boolean isSubmitted;
    private boolean isRedirected;
    private String successMessage;
    private boolean logoutVisible;*/
    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        System.out.println(testContext);
        loginPage = new LoginPage(testContext);
        //afterLoginPage= new AfterLoginPage(testContext);

    }

    @Given("user navigates to the login page")
    public void login() {
        driver = testContext.getDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        // driverProvider.getdriver("edge");

    }


    @When("user enters username {string}")
    public void user_enters_username(String uname) {
//  this.username = uname;
        loginPage.enterUsername(uname);
    }

    @And("user enters password {string}")
    public void user_enters_password(String pwd) {

        //this.password = pwd;
        loginPage.enterPassword(pwd);
    }

    @And("user clicks on Submit button")
    public void user_clicks_on_submit_button() {


        loginPage.clickLogin();
        // afterLoginPage.clickLogin();

    }

    @Then(" user is on the homepage")
    public void user_should_be_redirected_to_the_success_page() {

    }

    @And("success message should be displayed")
    public void success_message_should_be_displayed() {

    }

    @And("Logout button should be visible")
    public void logout_button_should_be_visible() {

    }
}





