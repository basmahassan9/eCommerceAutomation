package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {



    public registerPage() {
        PageFactory.initElements(hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerBtn;
    @FindBy(id = "gender-female")
    public WebElement femalebtn;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement DateOfBirthDay;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement DateOfBirthMonth;
    @FindBy(name = "DateOfBirthYear")
    public WebElement DateOfBirthYear;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement pass;
    @FindBy(id = "ConfirmPassword")
    public WebElement confPass;
    @FindBy(id = "register-button")
    public WebElement register_button;
    @FindBy(className = "result")
    public WebElement res;

}
