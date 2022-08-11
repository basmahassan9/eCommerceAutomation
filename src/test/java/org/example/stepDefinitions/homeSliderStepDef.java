package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.testng.Assert;

public class homeSliderStepDef {
    homePage home = new homePage();

    @When("user clicks on nokia slider image")
    public void ClickOnNokiaSlider() {
        home.NokiaSlider.click();
    }

    @Then("user is directed to {string}")
    public void userIsDirectedTo(String ExpectedURL) {
        Assert.assertEquals(ExpectedURL, hooks.driver.getCurrentUrl(), "wrong URL");
    }

    @When("user clicks on Iphone slider image")
    public void userClicksOnIphoneSliderImage() {
        home.IphoneBtn.click();
        home.IphoneSlider.click();
    }
}
