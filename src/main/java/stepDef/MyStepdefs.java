package stepDef;

import context.TestContext;
import invoker.DriverProvider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
 /*private String username;
 private String password;
 private boolean isSubmitted;
 private boolean isRedirected;
 private String successMessage;
 private boolean logoutVisible;*/
 WebDriver driver;
 LoginPage loginPage;
private final TestContext testContext;
 public MyStepdefs(TestContext testContext) {
  this.testContext = testContext;
  loginPage = new LoginPage(driver);

 }

 @Given("user navigates to the login page")
 public void login() {

  DriverProvider driverProvider = new DriverProvider();
  driver = driverProvider.getdriver("chrome");
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

 }

 @Then("user should be redirected to the success page")
 public void user_should_be_redirected_to_the_success_page() {

 }

 @And("success message should be displayed")
 public void success_message_should_be_displayed() {

 }

 @And("Logout button should be visible")
 public void logout_button_should_be_visible() {

 }
}





