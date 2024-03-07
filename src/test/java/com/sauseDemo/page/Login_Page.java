package com.sauseDemo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page { 
	
	WebDriver driver;  // global variable 
	
	@FindBy(how=How.ID, using="user-name")  
	WebElement username_filed;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password_field;
	
	
	@FindBy(how=How.XPATH, using="//input[@type='submit']")
	WebElement Loginbutton;
	
	// Create constructor
	public Login_Page(WebDriver driver) //local variable 
	{
		this.driver=driver; // Global and Local drivers are same 
		PageFactory.initElements(driver, this); // initialize 3  web elements
			
	}
	
	// Creating  user name method for above
	public void Enter_username(String UN)
	{
		username_filed.sendKeys(UN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Enter_password(String PS)
	{
		password_field.sendKeys(PS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Click_Loginbutton()
	{
		Loginbutton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
