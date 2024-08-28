package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC004_Prices extends BaseClass{

    @Then("click on search box and input {string}")
    public void clickOnSearchBoxAndInput(String itemName) {
        WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        if(searchbox.isDisplayed()) {
            search.searchProduct(itemName);
            search.clickSearchbtn();
        }
    }

    @Then("compare {string} and displayed item name")
    public void compareAndDisplayedItemName(String itemNAme) {
        WebElement act_productname = expicitWait(By.xpath("//div[@class='product-thumb']//div[2]//div//h4"));
        if(act_productname.getText().equals(itemNAme))
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }
    }

    @Then("compare {string} and price displayed")
    public void compareAndPriceDisplayed(String prices) {
        WebElement act_price = expicitWait(By.xpath("//div[@class='product-thumb']//div[2]//div//p[2]"));

        if(act_price.getText().equals(prices))
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }
    }
}
