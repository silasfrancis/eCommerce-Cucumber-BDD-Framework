package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class TC003_SearchAndAddToCart extends BaseClass{

    @Then("click on search box")
    public void click_on_search_box() {
        search.searchProduct("iPhone");

    }
    @Then("click search button")
    public void click_search_button() {
        search.clickSearchbtn();

    }

    @When("user add product to cart")
    public void user_add_product_to_cart() {
        add.clickAdd();

    }
    @Then("confirmation alert should be displayed")
    public void confirmation_alert_should_be_displayed() {
        if(add.Confirmation_alert().isDisplayed())
        {
            Assert.assertTrue(true);
        }
        else{Assert.fail();}

    }
    @Then("click on shopping cart icon")
    public void click_on_shopping_cart_icon() {
        add.clickShoppingcart();

    }
    @Then("confirm product in shopping cart")
    public void confirm_product_in_shopping_cart() throws InterruptedException {
        driver.navigate().refresh();
        boolean iphone_confirm = add.confrimProductInCart(1, "iPhone");
        if(iphone_confirm)
        {
            Assert.assertTrue(true);
        }

    }
    @When("user removes product from shopping cart")
    public void user_removes_product_from_shopping_cart() {
        add.removeProductFromCart(1);

    }
    @Then("confirm shopping cart is empty")
    public void confirm_shopping_cart_is_empty() {
        driver.navigate().refresh();
        if(add.confirmShoppingCartISEmpty().isDisplayed())
        {
            Assert.assertTrue(true);
        }

    }



}
