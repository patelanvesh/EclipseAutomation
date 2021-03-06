package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.Assert;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

	HomePage h;

	@Given("^user is on Greencart landing page$")
	public void user_is_on_greencart_landing_page() throws Throwable {
		driver = Base.getDriver();

	}

	@Then("^(.+) results are displayed$")
	public void something_results_are_displayed(String strArg1) throws Throwable {
		Assert.assertTrue(h.getProductName().getText().contains(strArg1));

	}

	@And("^added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

	}

	@And("^user proceed to checkout page for purchase$")
	public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	}

	@When("^user searched for (.+) vedgetable$")
	public void user_searched_for_vedgetables(String vedgetable) throws Throwable {
		h = new HomePage(driver);
		h.getSearch().sendKeys(vedgetable);
		Thread.sleep(2000);
	}

}
