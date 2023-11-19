package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AdminstrationPage;
import pages.LoginPage;

public class SD01_LoginTestSteps extends TestBase {
    LoginPage loginPage = new LoginPage(driver);
    AdminstrationPage adminstrationPage = new AdminstrationPage(driver);
    @Given("user is in login page")
    public void user_is_in_login_page() {
        loginPage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"Log in - WinjiGo");
    }
    @When("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        loginPage.enterValidUsernameField(username);
        loginPage.enterPasswordField(password);
    }


    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }
    @Then("user login successfully")
    public void user_login_successfully() {
        Assert.assertEquals(adminstrationPage.getPageTitle(),"Institute Management");
    }



}
