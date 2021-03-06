package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends Base {

//	hooks used to execute before particular tags 
//	to run hooks need to remove background from features
	@Before("@tag3")
	public void before_Scenario() {
		System.out.println("before tag3 scenario, hooks");
	}

	@After("@tag3")
	public void after_Scenario() {
		System.out.println("after tag3 scenario, hooks");
	}

	@Before("@tag1")
	public void before_tag1_Scenario() {
		System.out.println("before tag1 scenario, hooks");
	}

	@After("@tag1")
	public void after_tag1_Scenario() {
		System.out.println("after tag1 scenario, hooks");
	}

	@After("@seleniumTest")
	public void after_Seleniumtest() {
		driver.close();
	}

	@After("@smokeTest")
	public void after_smoketest() {
		driver.close();
	}
}