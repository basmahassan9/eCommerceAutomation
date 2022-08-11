package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class hoverStepDef {
    homePage home = new homePage();
    public int catIndex;

    @When("user hovers over category")
    public void userHoversOver() throws InterruptedException {
        Actions action = new Actions(hooks.driver);
        int count = home.categoriesMenu().size();
        int max = count - 1;
        int min = 0;
        int range = max - min + 1;
        catIndex = (int) (Math.random() * range) + min;
        WebElement cat = home.categoriesMenu().get(catIndex);
        action.moveToElement(cat).perform();
        Thread.sleep(2000);
    }

    @Then("random subcategory is selected")
    public void random_subcategory() {
        List<WebElement> subs = home.subCategoriesMenu(catIndex);
        int count = subs.size();
        System.out.println(count);
        int max = count - 1;
        int min = 0;
        int range = max - min + 1;
        int subIndex = (int) (Math.random() * range) + min;
        String subTitle = subs.get(subIndex).getText().toLowerCase().trim();
        subs.get(subIndex).click();
        String actual = home.pageTitle.getText().toLowerCase().trim();
        Assert.assertEquals(actual, subTitle, "wrong title");
    }


}
