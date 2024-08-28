package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//Features/prices.feature"},
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:report/htmlreport.html"},
        tags= "@regression")

public class TestRunner_TC004 extends AbstractTestNGCucumberTests {
}
