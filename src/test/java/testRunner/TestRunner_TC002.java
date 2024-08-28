package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//Features/login.feature"},
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:report/htmlreport.html"},
        tags= "@sanity or @functional")

public class TestRunner_TC002 extends AbstractTestNGCucumberTests {
}
