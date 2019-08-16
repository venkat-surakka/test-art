package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//page factory--- object repository
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'sign up')")
	WebElement signin;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	
	
	//Initializing the page objects
	public LoginPage() {
	PageFactory.initElements(driver, this);	
	}
	
	
	
	
	//actions
	public String ValidateLoginPageTitle() {
		 return driver.getTitle();
		 	 }
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
	