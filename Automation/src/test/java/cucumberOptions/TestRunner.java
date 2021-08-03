package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //openwith used to execute in Junit
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",
		stepNotifications = true,
		tags="@smokeTest",
//		tags ="@tag3 or @tag1 or tag2",
//		dryRun=true,
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"}) //to generate reports
//tags is used to execute only particular tags what we mentioned
//"not @tag" is used to run except that tag other tags should run	
// if a scenario has two tags we need to use "@tag1 and @tag2"

public class TestRunner{
	
}