package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class followUsStepDef {
    homePage home = new homePage();


    @When("user clicks on {string} icon")
    public void userClicksOnIcon(String icon) throws InterruptedException {
        home.IconBtn(icon).click();
        Thread.sleep(2000);
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expectedURL) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(hooks.driver.getWindowHandles());
        if (tabs.size() > 1) {
            hooks.driver.switchTo().window(tabs.get(1));
            Thread.sleep(1000);
        }
        Assert.assertEquals(hooks.driver.getCurrentUrl(), expectedURL, "wrong URL");

    }


}
