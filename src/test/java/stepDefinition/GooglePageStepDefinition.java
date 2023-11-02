package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDefinition {
	
	WebDriver driver;

	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.google.com");	    
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Java Tutorial");
		search.submit();	    
	}
	@Then("should display Java Result Page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search page");
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Selenium Tutorial");
		search.submit();
	}

	@Then("should display Selenium Result Page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}
	
	@When("User search Cucumber Tutorial")
	public void user_search_cucumber_tutorial() {
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Cucumber Tutorial");
		search.submit();
	}
	@Then("should display Cucumber Result Page")
	public void should_display_cucumber_result_page() {
		Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
	}
	
	@After
	public void attachScenario(Scenario scenaro) {
		if(scenaro.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			byte[] imgBytes = screen.getScreenshotAs(OutputType.BYTES);
			scenaro.attach(imgBytes, "image/png", "ScreenImage");
		}
	}

}
