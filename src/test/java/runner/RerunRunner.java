package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target\\failedscenarios.txt", 
glue = "stepDefinition", 
monochrome = true

)

public class RerunRunner extends AbstractTestNGCucumberTests {

}
