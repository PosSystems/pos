package com.pos.system.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	private WebDriver driver = null;

	@Given("^user has identified as cashier$")
	public void user_has_identified_as_cashier() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// throw new PendingException();
	}

	@When("^cashier opens the cash area the first time a day$")
	public void cashier_opens_the_cash_area_the_first_time_a_day() throws Throwable {
		driver.get("http://localhost:8080/system/faces/pos.xhtml");
		throw new PendingException();
	}

	@Then("^show dialog \"([^\"]*)\"$")
	public void show_dialog(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^cashier has counted the amount of cash box$")
	public void cashier_has_counted_the_amount_of_cash_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^cashier filled the dialog with counted amount$")
	public void cashier_filled_the_dialog_with_counted_amount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^clicked \"([^\"]*)\"$")
	public void clicked(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^close opening entry$")
	public void close_opening_entry() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^show \"([^\"]*)\"$")
	public void show(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^user has identified as manager$")
	public void user_has_identified_as_manager() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^manager click on \"([^\"]*)\"$")
	public void manager_click_on(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^cashier clicks on \"([^\"]*)\"$")
	public void cashier_clicks_on(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^close \"([^\"]*)\"$")
	public void close(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^return to typing in amount again$")
	public void return_to_typing_in_amount_again() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^change the existing product group information:$")
	public void change_the_existing_product_group_information(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@When("^manager click \"([^\"]*)\"$")
	public void manager_click(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^save changes in database$")
	public void save_changes_in_database() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^redirect to \"([^\"]*)\"$")
	public void redirect_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^do not save changes in database$")
	public void do_not_save_changes_in_database() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^fill in the following:$")
	public void fill_in_the_following(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^save new group in database$")
	public void save_new_group_in_database() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^do not save new group in database$")
	public void do_not_save_new_group_in_database() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	/*
	 * @Given("^user has chrome running$") public void user_has_chrome_running()
	 * throws Throwable { driver = new ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 * 
	 * @When("^user navigates to hompepage$") public void
	 * user_navigates_to_hompepage() throws Throwable {
	 * driver.get("http://localhost:8080/system/"); }
	 * 
	 * @Then("^message contains Hello world!$") public void
	 * message_contains_Hello_world() throws Throwable { if
	 * (driver.getPageSource().contains("Hello world!")) { driver.quit();
	 * return; } driver.quit(); throw new Throwable(); }
	 * 
	 * @Given("^user has Firefox running$") public void
	 * user_has_Firefox_running() throws Throwable { driver = new
	 * FirefoxDriver(); driver.manage().timeouts().implicitlyWait(10,
	 * TimeUnit.SECONDS); }
	 */

}
