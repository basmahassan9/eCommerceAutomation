package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {
    public static WebDriver driver = null;

    @Before
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "F:\\&&TESTING\\FWD\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
