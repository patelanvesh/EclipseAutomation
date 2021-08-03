package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinations")
public class TestRunnerTestNg extends AbstractTestNGCucumberTests{ 	//extends used to execute in testNG
	
	
}