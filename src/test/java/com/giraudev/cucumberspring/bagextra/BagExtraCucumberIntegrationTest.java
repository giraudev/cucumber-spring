package com.giraudev.cucumberspring.bagextra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/bagextra",
    plugin = {"pretty", "html:target/cucumber/bagextra"},
    extraGlue = "com.giraudev.cucumberspring.bagcommons")
public class BagExtraCucumberIntegrationTest {
}
