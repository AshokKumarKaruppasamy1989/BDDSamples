package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources//features//AutomationToolSearch.feature",
//tags = "@PhaseOne",
//tags = "@SmokeTest and @RegressionTest",
//tags = "@SanityTest",
		glue = "stepDefinition", monochrome = true, plugin = { "pretty", "html:target//Htmlreport.html",
				"json:target//Jsonreport.json" })

public class AutomationToolSearchRunner extends AbstractTestNGCucumberTests {

}
