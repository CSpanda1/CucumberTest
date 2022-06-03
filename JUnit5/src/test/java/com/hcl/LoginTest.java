package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		String url = "https://www.lambdatest.com";
		driver.get(url);
	}

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	    driver.findElement(By.linkText("Login")).click(); 
	}
	
	@When("User fills email with {string}")
	public void user_fills_email_with(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}
	
	@When("User fills password with {string}")
	public void user_fills_password_with(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("login-button")).click();
		sleep(4000);
	}

	@Then("Login is successful")
	public void login_is_successful() {
		String expectedUrl = "https://accounts.lambdatest.com/dashboard";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Login failed"); 
	}

	@Then("Login is unsuccessful")
	public void login_is_unsuccessful() {
	    WebElement errorMessage = driver.findElement(By.cssSelector(".error-mass.text-red-80.text-size-10.tracking-custom.xxl\\:text-size-11.xxxl\\:text-size-12"));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible");
	}
	
	@Then("User should see {string}")
	public void user_should_see(String string) {
		WebElement successMessage = driver.findElement(By.cssSelector(".flex.flex-row.font-semibold.ml-120.pt-72.text-size-24"));
		String expectedMessage = "Hi there";
		String actualMessage = successMessage.getText();
		Assert.assertTrue(actualMessage.contains(expectedMessage), "Login failed");
	}

	@Then("User should also see Logout Button")
	public void user_should_also_see_logout_button() {
		driver.findElement(By.id("profile__dropdown")).click();
		sleep(1500);
		WebElement logoutButton = driver.findElement(By.id("app__logout"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Logout button is not visible");
		logoutButton.click();
		sleep(2000);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
