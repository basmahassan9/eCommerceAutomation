package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class currencyStepDef {
    homePage home = new homePage();

    @When("user chooses euro currency")
    public void chooseCurrency() {
        Select currobj = new Select(home.currency);
        currobj.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        System.out.println("done");

    }

    @Then("featured products are in euro")
    public void featuredProductsAreInEuro() {
        String[] curr = new String[4];
        for (int i = 0; i < 4; i++) {
            curr[i] = home.currencyVal().get(i).getText();
            Assert.assertTrue(curr[i].contains("€"), "wrong currency text");
        }

    }
}
