package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchAndBuyProductPage extends BasePage {
	
	//Locators
	private By searchInput = By.xpath("//div[contains(@class,'search-group')]//input[@name='search']");
	private By cartButton = By.xpath("//div//button[contains(@class, 'mini-cart-button dark-green')]");
//	private By lastCartItem = By.xpath("//div[contains(@class,'cart-item')]//h3[text()='Polaroid PA86 Fit Active Watch - Pink']");
//	private By firstCartItem = By.xpath("//div[contains(@class,'cart-item')]//h3[text()='Garmin Forerunner 245 Smartwatch - Slate']");
	
		
	//Constructor of the page class
	public SearchAndBuyProductPage(WebDriver driver) {
		super(driver);
	}
	
	//Page actions
	public void enterSearchItem(String searchItem) {
		enterTextValue(searchInput, searchItem);
	}
	
	public void pressEnterKey() {
		pressEnterKeyAtElement(searchInput);
	}
	public void addItemToCart(String item) {
		String webitem = "//div//a[contains(@href,'" + item + "')]/..//button[contains(@class,'add-to-cart')]";
		By cartItem = By.xpath(webitem);
		clickOnElement(cartItem);
	}
	public void clickCartButton() {
		clickOnElement(cartButton);
	}
	
	public String findCartItem(String item) {
		String webitem = "//div[contains(@class,'cart-item')]//h3[text()='" + item + "']";
		By cartItem = By.xpath(webitem);
		return getElementText(cartItem);
	}

}
