package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{
	
    //Locators
	private By registrationLink = By.xpath("//div[@class='auto cell']/ul/li/a[text()='Register']");
	private By registerHeader = By.xpath("//div[@class='reg-content right group']/h1[contains(text(),'Register')]");
	private By firstName = By.id("firstname");
	private By lastName = By.id("surname");
	private By emailText = By.id("email");
	private By email2 = By.id("email2"); 
	private By password = By.id("password");
	private By confrimpwd = By.id("password2");
	private By mobileNo = By.id("telno1");  
	private By registerBtn = By.name("registerButton"); 
	private By registrationConfirm = By.xpath("//div[@id='welcome']/p[contains(text(),'Thanks')]");
				
	//Constructor of the page class
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Page actions
	public void clickOnRegister() {
		clickOnElement(registrationLink);
	}	
	
	public String getRegisterPageHeader() {
		return getElementText(registerHeader);
	}
	
	public void enterFirstName(String username) {
		enterTextValue(firstName, username);
	}
	
	public void enterLastName(String last) {
		enterTextValue(lastName, last);
	}
	
	public void enterEmail(String email) {
		enterTextValue(emailText, email);
	}
	
	public void enterEmail2(String emailTwo) {
		enterTextValue(email2, emailTwo);
	}
	
	public void enterPassword(String pwd) {
		enterTextValue(password, pwd);
	}
	
	public void enterConfirmPassword(String cpwd) {
		enterTextValue(confrimpwd, cpwd);
	}
	
	public void enterMobileNo(String mobile) {
		enterTextValue(mobileNo, mobile);
	}
	
	public String registrationConfirmPopup() {
		return getElementText(registrationConfirm);
	}
	
	public void clickOnRegiserBtn() {
		clickOnElement(registerBtn);
	}

}
