package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"org.example.stepDefinitions"},
        tags = "@smoke",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
        }
)


public class run extends AbstractTestNGCucumberTests {

}
