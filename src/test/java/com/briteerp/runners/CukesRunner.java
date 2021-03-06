package com.briteerp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/briteerp/step_definitions",
       // dryRun = true,
//        tags = {"@pricelist, @products"}
       tags = {"@dbpricelist"}
//        tags = {"@pricelist, @db"}
)
public class CukesRunner {
}
