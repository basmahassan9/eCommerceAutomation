package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

import static org.example.stepDefinitions.hooks.driver;

public class searchStepDef {

    homePage home = new homePage();

    @And("user click on search button")
    public void userClickOnSearchButton() {
        home.searchBtn.click();
    }


    @When("user enters {string} for product")
    public void userEntersName(String product) {
        home.searchBar.sendKeys(product);
    }

    @Then("user locates {string} successfully")
    public void userLocatesItemsRelatedToSearchSuccessfully(String product) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="), "wrong URL");
        int count = home.productval().size();


        String val[] = new String[count];
        for (int i = 0; i < count; i++) {
            val[i] = home.productval().get(i).getText().toLowerCase(Locale.ROOT);
            Assert.assertTrue(val[i].contains(product), "wrong text");
        }

        soft.assertAll();
    }


    @Then("user clicks on product")
    public void userClicksOnProduct() {
        home.productval().get(0).click();
    }

    @And("user confirms {string} for product")
    public void userConfirmsForProduct(String product) {

        Assert.assertTrue(home.skuValue().getText().contains(product), "wrong product sku");
    }
}
