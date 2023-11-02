package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDefinition {
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/login");	    
	}
	@When("User enter {string} and {string}")
	public void user_enter_and(String strUser, String strPwd) {
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click(); 
	}
	@Then("should display success message")
	public void should_display_success_message() {
		boolean success = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(success);
	   
	}

}
