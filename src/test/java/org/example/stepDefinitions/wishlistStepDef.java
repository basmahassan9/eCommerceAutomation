package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class wishlistStepDef {
    homePage home = new homePage();

    @When("user adds htc phone to wishlist")
    public void addItemToWishlist() {
        home.wishlistBTn().click();

    }

    @And("user clicks on wishlist tab")
    public void userClicksOnWishlistTab() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(home.wishlistTab));
        home.wishlistTab.click();
        Thread.sleep(2000);
    }

    @Then("item is added to wishlist message is displayed")
    public void itemIsAddedToWishlistMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        String color = Color.fromString(home.msgBkgrnd().getCssValue("background-color")).asHex();
        soft.assertEquals(color, "#4bb07a", "wrong color ");
        soft.assertEquals(home.msgTxt().getText(), "The product has been added to your wishlist", "wrong message");

        soft.assertAll();


    }

    @Then("its verified that an item is in wishlist")
    public void itsVerifiedThatItemIsInWishlist() {

        int qty = Integer.parseInt(home.qty.getDomAttribute("value"));
        Assert.assertTrue(qty > 0, "item is not added to wishlist");
    }


}
