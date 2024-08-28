package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//Features/searchAndAddtoCart.feature"},
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:report/htmlreport.html"},
        tags= "@sanity or @functional")

public class TestRunner_TC003 extends AbstractTestNGCucumberTests {
}
