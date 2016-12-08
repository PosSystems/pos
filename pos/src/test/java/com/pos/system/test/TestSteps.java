package com.pos.system.test;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int timeout = 30;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		// driver = new MarionetteDriver(capabilities);
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@Given("^user has identified as cashier$")
	public void user_has_identified_as_cashier() throws Throwable {
		throw new PendingException();
	}

	@When("^cashier opens the cash area the first time a day$")
	public void cashier_opens_the_cash_area_the_first_time_a_day() throws Throwable {
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

	@Given("^cashier is on the cash area site$")
	public void cashier_is_on_the_cash_area_site() throws Throwable {
		driver.get((baseUrl + "system/faces/pos.xhtml"));
	}

	@When("^cashier clicks on a product group button$")
	public void cashier_clicks_on_a_product_group_button() throws Throwable {
		driver.findElement(By.id("cash:j_idt20:2:j_idt21")).click();
	}

	@When("^cashier enters (\\d+)\\.(\\d+) in the opened dialog$")
	public void cashier_enters_in_the_opened_dialog(int arg1, int arg2) throws Throwable {
		driver.findElement(By.id("j_idt32:priceInput")).clear();
		driver.findElement(By.id("j_idt32:priceInput")).sendKeys("10.0");
		driver.findElement(By.id("j_idt32:j_idt34")).click();
	}

	@Then("^the article is shown in the list with the price of (\\d+)\\.(\\d+)$")
	public void the_article_is_shown_in_the_lis_with_the_price_of(int arg1, int arg2) throws Throwable {
		if ("Speicherkarten".equals(driver.findElement(By.id("cash:j_idt24:0:j_idt28")).getText())) {
			if ("10.0".equals(driver.findElement(By.id("cash:j_idt24:0:j_idt30")).getText())) {
				return;
			}
		}
		throw new Throwable();
	}

	@Given("^cashier has entered price for product group$")
	public void cashier_has_entered_price_for_product_group() throws Throwable {
		cashier_is_on_the_cash_area_site();
		cashier_clicks_on_a_product_group_button();
		cashier_enters_in_the_opened_dialog(10, 0);
		the_article_is_shown_in_the_lis_with_the_price_of(10, 0);
	}

	@When("^cashier clicks on payment button$")
	public void cashier_clicks_on_payment_button() throws Throwable {
		driver.findElement(By.id("cash:j_idt23")).click();
	}

	@Then("^a dialog containing the difference in payment appears$")
	public void a_dialog_containing_the_difference_in_payment_appears() throws Throwable {
		driver.findElement(By.id("frmDlgDrawback:j_idt45")).click();
	}

	@When("^cashier enters (\\d+)\\.(\\d+) in the payment dialog$")
	public void cashier_enters_in_the_payment_dialog(int arg1, int arg2) throws Throwable {
		driver.findElement(By.id("frmDlgPayment:givenInput")).clear();
		driver.findElement(By.id("frmDlgPayment:givenInput")).sendKeys("10.0");
		driver.findElement(By.id("frmDlgPayment:j_idt40")).click();
	}

	@Then("^the article is removed from the list$")
	public void the_article_is_removed_from_the_list() throws Throwable {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		boolean isEmpty = driver.findElements(By.id("cash:j_idt24:0:j_idt28")).isEmpty();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		if (isEmpty) {
			return;
		}
		throw new Throwable();
	}
}
