package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.example.stepDefinitions.hooks.driver;

public class loginStepDef {

    loginPage login = new loginPage();

    @Given("user go to login page")
    public void goToLoginPage() {
        login.loginbtn.click();
    }

    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void userLoginWithAnd(String email, String pass) {

        login.email.sendKeys(email);
        login.pass.sendKeys(pass);

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {

        login.Login_button.click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();

        soft.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "wrong URL");
        soft.assertTrue(login.account.isDisplayed(), "tab not displayed");
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.errorMsg.getText().contains("Login was unsuccessful"), "wrong error message ");
        String col = login.errorMsg.getCssValue("color");
        soft.assertEquals(col, "rgba(228, 67, 75, 1)", "colors don't match");
        soft.assertAll();
    }

    @When("user login with valid data")
    public void userLoginWithValidData() throws IOException {
        String mail = ConfigurationReader.get("email");
        login.email.sendKeys(mail);
        login.pass.sendKeys("P@ssw0rd");
    }
}
