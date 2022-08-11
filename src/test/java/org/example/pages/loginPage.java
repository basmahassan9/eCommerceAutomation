package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage() {
        PageFactory.initElements(hooks.driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginbtn;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement pass;
    @FindBy(className = "login-button")
    public WebElement Login_button;
    @FindBy(className = "ico-account")
    public WebElement account;
    @FindBy(className = "message-error")
    public WebElement errorMsg;
}
