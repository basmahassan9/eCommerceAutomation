package org.example.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.io.IOException;


public class registerStepDef {

    registerPage reg = new registerPage();

    @Given("user go to register page")
    public void RegisterPage() {
        reg.registerBtn.click();

    }


    @When("user selects gender")
    public void userSelectsGender() {
        reg.femalebtn.click();
    }

    @And("user enters valid data")
    public void userEntersValidData() {
        reg.firstName.sendKeys("automation");
        reg.lastName.sendKeys("tester");
    }

    @And("user enters date of birth")
    public void userEntersDateOfBirth() {
        Select dayobj = new Select(reg.DateOfBirthDay);
        dayobj.selectByValue("1");
        Select monthobj = new Select(reg.DateOfBirthMonth);
        monthobj.selectByValue("2");
        Select yearobj = new Select(reg.DateOfBirthYear);
        yearobj.selectByValue("2000");
    }

    @And("user enters email")
    public void userEnters() throws IOException {
        Faker fake = new Faker();
        String mail = fake.internet().safeEmailAddress();

        ConfigurationReader.set("email", mail);
        reg.email.sendKeys(mail);


    }

    @And("user fills password fields")
    public void userFillsPasswordFields() {
        reg.pass.sendKeys("P@ssw0rd");
        reg.confPass.sendKeys("P@ssw0rd");
    }

    @And("user click on register")
    public void userClickOnRegister() {
        reg.register_button.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        String actual = reg.res.getText();
        String expected = "Your registration completed";
        soft.assertTrue(actual.contains(expected), "text doesn't match");
        String col = reg.res.getCssValue("color");
        System.out.println("colour= " + col);
        soft.assertEquals(col, "rgba(76, 177, 124, 1)", "colors don't match");
        soft.assertAll();
    }


}
