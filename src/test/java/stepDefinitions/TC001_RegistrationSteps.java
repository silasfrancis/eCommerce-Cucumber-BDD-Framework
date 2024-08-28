package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.RegisterPage;


public class TC001_RegistrationSteps {

    public WebDriver driver;
    public RegisterPage reg;

    @Given("User Launch browser")
    public void user_launch_chrome_browser() {
        reg = new RegisterPage(driver);
    }
    @When("User opens url {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();

    }
    @When("Navigate to Register from Account dropdown")
    public void navigate_to_from_dropdown() {
        reg.clickAccDrp();
        reg.clickRegister();

    }
    @Then("User fill in details for registration")
    public void user_fill_in_details_for_registration() {
        reg.inputFirstname("Francis1");
        reg.inputLastname("Silas1");
        reg.inputEmail("francis1234@gmail.com");
        reg.inputTelephone("123456789");
        reg.setPassword("francis123");
        reg.confirmPassword("francis123");
        reg.clickAgree();

    }
    @When("User click Continue")
    public void user_click() {
        reg.clickContinue();

    }
    @Then("Account confirmation page should be displayed")
    public void account_confirmation_page_should_be_displayed() {
        if(reg.account_Confirmation().isDisplayed())
        {
            Assert.assertTrue(true);
            reg.clickRegConfirm_Btn();
        }
        else{Assert.fail();}

    }

}
