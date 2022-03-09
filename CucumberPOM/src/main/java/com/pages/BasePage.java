package com.pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ConfigReader;

public class BasePage {
	
	private WebDriver driver;
	private Properties prop;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToURL() {
		ConfigReader configReader = new ConfigReader();
		prop = configReader.init_prop();
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public WebElement waitForElement(By element) {
		WebElement e = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.presenceOfElementLocated(element));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		  e = driver.findElement(element);
		}catch(Exception ex) {
			// report failure
			System.out.println(ex.getMessage());
		}
		return e;
	}
	
	public void clickOnElement(By element) {
		waitForElement(element).click();
	}
	public String getElementText(By element) {
		return waitForElement(element).getText();
	}
	
	public void enterTextValue(By element, String value) {
		waitForElement(element).clear();
		waitForElement(element).sendKeys(value);
	}
	
	public void pressEnterKeyAtElement(By element) {
		waitForElement(element).sendKeys(Keys.ENTER);
	}

}
