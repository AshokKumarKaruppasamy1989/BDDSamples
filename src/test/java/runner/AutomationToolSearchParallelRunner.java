package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources//features",
//tags = "@PhaseOne",
//tags = "@SmokeTest and @RegressionTest",
//tags = "@SanityTest",
glue = "stepDefinition",
monochrome = true,
plugin = {"pretty",
		"html:target//Htmlreport.html",
		"json:target//Jsonreport.json"})

public class AutomationToolSearchParallelRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
