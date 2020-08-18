package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/features",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
