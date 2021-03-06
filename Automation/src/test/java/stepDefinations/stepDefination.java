package stepDefinations;

import java.util.List;

import org.testng.Assert;

import Cucumber.Automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;

public class stepDefination extends Base {

	CheckOutPage cp;

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate the browser");
	}

	@When("^browser is trigged$")
	public void browser_is_trigged() throws Throwable {
		System.out.println("browser is trigged");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("check if browser is started");
	}

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.println("Given");
	}

	@When("^I complete action with \"([^\"]*)\"$")
	public void i_complete_action_with_something(String strArg1) throws Throwable {
		System.out.println("When with " + strArg1);
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		System.out.println("Then");
	}

	@And("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		System.out.println("And");
	}

	@And("^some other action$")
	public void some_other_action() throws Throwable {
		System.out.println("And");
	}

	@And("^yet another action$")
	public void yet_another_action() throws Throwable {
		System.out.println("And");
	}

	@And("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		System.out.println("And");
	}

	@Given("^I want to write a step with name (.+)$") // code for values
	public void i_want_to_write_a_step_with_name(String name) throws Throwable {
		System.out.println(name);
	}

	@When("^I check for the (.+) in step$")
	public void i_check_for_the_in_step(String value) throws Throwable {
		System.out.println(value);

	}

	@Then("^I verify the (.+) in step$")
	public void i_verify_the_in_step(String status) throws Throwable {
		System.out.println(status);

	}

	@Given("^user is on signup page$")
	public void user_is_on_signup_page() throws Throwable {

	}

	@When("^user signup with following details$") // code for datadriven table
	public void user_signup_with_following_details(DataTable data) throws Throwable { // all the data stored in data
																						// object
		// data is stored in rows and columns (index)
		List<List<String>> obj = data.asLists(); // to get/retrieve the list of data in data object
		// get(0).get(0) means first row, first column, index starts with 0
		String firstName = obj.get(0).get(0); // firstName will be stored in firstname object
		String lastName = obj.get(0).get(1); // lastName will be stored in lastName object
		String email = obj.get(0).get(2); // email will be stored in email object
		String address = obj.get(0).get(3); // address will be stored in address object
		String zipcode = obj.get(0).get(4); // zipcode will be stored in zipcode object

		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(address);
		System.out.println(zipcode);
	}

	@Then("^verify selected (.+) items are displayed in checkout page$")
	public void verify_selected_items_are_displayed_in_checkout_page(String vedgetable) throws Throwable {

		cp = new CheckOutPage(driver);

		Assert.assertTrue(cp.getProductName().getText().contains(vedgetable));
	}

}