package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/features",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
