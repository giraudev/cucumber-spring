package com.giraudev.cucumberspring.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
    plugin = {"pretty", "html:target/cucumber/bagbasics"},
    extraGlue = "com.giraudev.cucumberspring")
public class BagCucumberIntegrationTest {
}
