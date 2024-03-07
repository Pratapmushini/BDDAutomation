package com.sauseDemo.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauseDemo.page.Login_Page;

import io.cucumber.java.en.*;

public class SauseLoginStepDef {
	// global variable declaration
	WebDriver driver; // calling web driver to perform browser actions 
	// declare page object model objects
	Login_Page LP;
	
	
	@Given("Launch the login page")
	public void launch_the_login_page() {
	  driver=new ChromeDriver(); // Driver initialized 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.get("https://www.saucedemo.com/v1/");
	    
	}

	@When("enter {string} and {string}")
	public void enter_and(String username, String password) {
		//page obj model
		LP=new Login_Page(driver);
		LP.Enter_username(username);
		LP.Enter_password(password);
					
	
	}

	@And("click on login button")
	public void click_on_login_button() {
		LP=new Login_Page(driver);
		LP.Click_Loginbutton();
	
	}

	@Then("Successfully launch the Sause home page")
	public void successfully_launch_the_sause_home_page() {
		driver.close();
		driver.quit();
		System.out.println("User is Successfully landed on Home page");
	}

}
