package com.cybertek.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cybertek/step_defs",
        tags="@wip",
        dryRun= false

)

public class CukesRunner {


}
