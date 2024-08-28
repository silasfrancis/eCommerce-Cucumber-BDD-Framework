package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObjects.LoginPage;


public class TC002_LoginSteps extends BaseClass{

    @Given("User launch browser")
    public void user_launch_chrome_browser() {
        lp = new LoginPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("Navigate to Login from Account dropdown")
    public void navigate_to_login_from_account_dropdown() {
        lp.clickAccDrp();
        lp.clickLogin();

    }

    @Then("user inputs username: {string} and password {string}")
    public void user_inputs_username_and_password(String username, String password) {
        lp.inputEmail(username);
        lp.inputPassword(password);

    }

    @When("User proceeds to Login")
    public void user_proceeds_to_login() {
        lp.proceedLogin();
// add alert for invalid details
    }

    @Then("A page showing {string} should be displayed")
    public void a_page_showing_should_be_displayed(String string) {
        if(lp.loginConfirm().getText().equals(string))
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }

    }

    @Then("User Logout")
    public void user_logout() {
        lp.logOut();

    }

    @Then("Logout Confirmation should be displayed")
    public void logout_confirmation_should_be_displayed() {
        if(lp.logoutConfirm().isDisplayed())
        {
            lp.continuetoHompage();
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }
    }



}