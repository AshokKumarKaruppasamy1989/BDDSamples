package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources//taggedFeatures//", 
//tags = "@SmokeTest",
//tags = "@RegressionTest",
//tags = "@SmokeTest and @RegressionTest",
//tags = "@SmokeTest or @RegressionTest",
tags = "@PhaseTwo",
//tags = "@PhaseTwo and @RegressionTest or @PhaseTwo and @SmokeTest",
//tags = "@PhaseThree and not @RegressionTest",
glue = "stepDefinition", 
monochrome = true,
//dryRun = true,
plugin = {"pretty"
		}
)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
