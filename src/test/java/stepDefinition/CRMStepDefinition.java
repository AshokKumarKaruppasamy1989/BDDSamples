package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMStepDefinition {
	
//	@BeforeAll
//	public static void launchBrowser() {
//		System.out.println("Launch browser....");
//	}
	
//	@AfterAll
//	public static void closeBrowser() {
//		System.out.println("Close browser....");
//	}
	
//	>>> Tagged Hooks or Conditional Hooks <<<
//	@Before("@SmokeTest")
//	public static void chromeLaunchBrowser() {
//		System.out.println("Launch Chrome browser....");
//	}
	
//	@Before("@RegressionTest")
//	public static void edgeLaunchBrowser() {
//		System.out.println("Launch Edge browser....");
//	}
	
//	Ordering Hooks
//	@Before(order=2)
//	public static void launchBrowser() {
//		System.out.println("Launch browser....");
//	}
//	
//	@Before(order=1)
//	public static void readFromPropertyFile() {
//		System.out.println("Reading from property....");
//	}
//	
//	@Before(order=3)
//	public static void launchDB() {
//		System.out.println("Launch DB....");
//	}
	
//	>>> Tagged Ordering Hooks <<<
//	@Before(value = "@SmokeTest", order=2)
	public static void launchChromeBrowser() {
		System.out.println("Launch Chrome browser....");
	}
	
//	@Before(value = "@SmokeTest", order=1)
	public static void readFromPropertyFileStaging() {
		System.out.println("Reading from Staging property....");
	}

//	@Before(value = "@RegressionTest", order=2)
	public static void launchEdgeBrowser() {
		System.out.println("Launch Edge browser....");
	}
	
//	@Before(value = "@RegressionTest", order=1)
	public static void readFromPropertyFileTest() {
		System.out.println("Reading from TestingEnv property....");
	}
	
	
//	@After
//	public static void closeBrowser() {
//		System.out.println("Close browser....");
//	}
	
//	@BeforeStep
//	public static void launchBrowser() {
//		System.out.println("Launch browser....");
//	}
	
//	@AfterStep
//	public static void closeBrowser() {
//		System.out.println("Close browser....");
//	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}
	@When("User enters credentials")
	public void user_enters_credentials() {
		System.out.println("User enters the credentials");
	}
	@Then("should be navigated to dashboard page")
	public void should_be_navigated_to_dashboard_page() {
		System.out.println("Shoud display the dashbaord page");
	}
	@When("User create a new contacts")
	public void user_create_a_new_contacts() {
	   System.out.println("User created a new contact");
	}
	@When("User view contact details")
	public void user_view_contact_details() {
	   System.out.println("user viewed the contact details");
	}
	@When("User delete a contacts")
	public void user_delete_a_contacts() {
	    System.out.println("User deleted the contact");
	}
	@When("User create a new deals")
	public void user_create_a_new_deals() {
	    System.out.println("User created a new deal");
	}
	@When("User view deals details")
	public void user_view_deals_details() {
	    System.out.println("User viewed the deal details");
	}
	@When("User delete a deals")
	public void user_delete_a_deals() {
	    System.out.println("User deleted the deal");
	}
	@When("User create a new tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User created a new task");
	}
	@When("User view tasks details")
	public void user_view_tasks_details() {
		System.out.println("User viewed the task details");
	}
	@When("User delete a tasks")
	public void user_delete_a_tasks() {
		System.out.println("User deleted the task");
	}
}
