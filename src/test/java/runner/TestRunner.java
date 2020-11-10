package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/features/Search.feature",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags={"@regression"},
        plugin = {"pretty","html:test-output"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
