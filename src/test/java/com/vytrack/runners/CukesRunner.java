package com.vytrack.runners;
// used to run the feature file using Junit to run test feature file
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-cucumber-reports"
        },
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}