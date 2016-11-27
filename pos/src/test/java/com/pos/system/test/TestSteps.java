package com.pos.system.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	private WebDriver driver = null;
	
	@Given("^user has chrome running$")
	public void user_has_chrome_running() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user navigates to hompepage$")
	public void user_navigates_to_hompepage() throws Throwable {
		driver.get("http://localhost:8080/system/");
	}

	@Then("^message contains Hello world!$")
	public void message_contains_Hello_world() throws Throwable {
		if (driver.getPageSource().contains("Hello world!")) {
			driver.quit();
			return;
		}
		throw new Throwable();
	}

	@Given("^user has Firefox running$")
	public void user_has_Firefox_running() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
