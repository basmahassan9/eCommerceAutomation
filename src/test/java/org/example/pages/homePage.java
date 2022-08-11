package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homePage {
    public homePage() {
        PageFactory.initElements(hooks.driver, this);
    }

    @FindBy(id = "customerCurrency")
    public WebElement currency;


    public List<WebElement> currencyVal() {
        return hooks.driver.findElements(By.className("actual-price"));

    }

    @FindBy(id = "small-searchterms")
    public WebElement searchBar;
    @FindBy(className = "search-box-button")
    public WebElement searchBtn;

    public List<WebElement> productval() {
        return hooks.driver.findElements(By.className("product-title"));

    }

    public WebElement skuValue() {
        return hooks.driver.findElement(By.xpath("//span[contains(@id, 'sku')]"));
    }

    public List<WebElement> categoriesMenu() {
        return hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu notmobile\"]//li[.//ul]"));

    }

    public List<WebElement> subCategoriesMenu(int index) {
        WebElement cat = categoriesMenu().get(index);

        return cat.findElements(By.tagName("li"));

    }

    @FindBy(xpath = "//div[@class=\"page-title\"]/h1")
    public WebElement pageTitle;


    @FindBy(xpath = "//div[@id=\"nivo-slider\"]/a[1]")
    public WebElement NokiaSlider;

    @FindBy(xpath = "//div[@class=\"nivo-controlNav\"]/a[2]")
    public WebElement IphoneBtn;


    @FindBy(xpath = "//div[@id=\"nivo-slider\"]/a[2]")
    public WebElement IphoneSlider;

    public WebElement IconBtn(String cl) {
        return hooks.driver.findElement(By.className(cl));
    }

    public WebElement wishlistBTn() {
        return hooks.driver.findElements(By.className("add-to-wishlist-button")).get(2);
    }

    public WebElement msgBkgrnd() {
        return hooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/div"));
    }

    public WebElement msgTxt() {
        return hooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/div/p"));
    }

    @FindBy(className = "ico-wishlist")
    public WebElement wishlistTab;

    @FindBy(className = "qty-input")
    public WebElement qty;

}
