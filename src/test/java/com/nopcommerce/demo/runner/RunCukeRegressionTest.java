package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //-----content root path for features directory
        glue = "com/nopcommerce/demo/steps", //-----source root path for steps package
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@regression",
        dryRun = false
)

public class RunCukeRegressionTest extends AbstractTestNGCucumberTests {
}