package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources//features//UserLogin.feature", 
glue = "stepDefinition", 
monochrome = true,
dryRun = false,
plugin = {"pretty", 
		"html:target\\HtmlReport.html",
//		"rerun:target\\failedscenarios.txt"
//		"usage:target\\UsageReport",
//		"json:target\\JsonReport.json",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
)

public class GooglePageRunner extends AbstractTestNGCucumberTests {

}
