package stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
	//using scenario outline
	@When("User enter {string} and {string}")
	public void user_enter_and(String strUser, String strPwd) {
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click(); 
	}
	//using datatable as List
//	@When("User enter credentials")
//	public void user_enter_credentials(DataTable userdata) {
//		List<List<String>> data = userdata.asLists();
//		String strUser = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();	    
//	}
	//using datatable as Maps
		@When("User enter credentials")
		public void user_enter_credentials(DataTable userdata) {
			List<Map<String, String>> data = userdata.asMaps();
			String strUser = data.get(0).get("username");
			String strPwd = data.get(0).get("password");
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
