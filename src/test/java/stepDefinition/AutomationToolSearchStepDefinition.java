package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationToolSearchStepDefinition {
	
	@BeforeAll
	public static void readPropertyInputFile() {
		System.out.println(">>Reading property file");
	}
	
	@AfterAll
	public static void closeAllOpenedBrowser() {
		System.out.println(">>Close the all opened browsers");
	}
	
	@Before
	public static void launchBrowser() {
		System.out.println(">>Launch the browser");
	}
	
	@After
	public static void closeBrowser() {
		System.out.println(">>Close the browser");	
	}

	@Given("user launch the web page")
	public void user_launch_the_web_page() {
		System.out.println(">>User launched the web page");
	}

	@When("user search the selenium in page")
	public void user_search_the_selenium_in_page() {
		System.out.println(">>User search the selenium in page");
	}

	@Then("verify the selenium page title")
	public void verify_the_selenium_page_title() {
		System.out.println(">>User verified the selenium page title");
	}

	@When("user search the cypress in page")
	public void user_search_the_cypress_in_page() {
		System.out.println(">>User search the cypress in page");
	}

	@Then("verify the cypress page title")
	public void verify_the_cypress_page_title() {
		System.out.println(">>User verified the cypress page title");
	}

	@When("user search the uft in page")
	public void user_search_the_uft_in_page() {
		System.out.println(">>User search the uft in page");
	}

	@Then("verify the uft page title")
	public void verify_the_uft_page_title() {
		System.out.println(">>User verified the uft page title");
	}

	@When("user search the SpringBoot in page")
	public void user_search_the_spring_boot_in_page() {
		System.out.println(">>User search the SpringBoot in page");
	}

	@Then("verify the SpringBoot page title")
	public void verify_the_spring_boot_page_title() {
		System.out.println(">>User verified the SpringBoot page title");
	}
}
