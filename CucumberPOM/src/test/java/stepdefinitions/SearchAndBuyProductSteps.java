package stepdefinitions;

import org.junit.Assert;

import com.pages.ScenarioContext;
import com.pages.SearchAndBuyProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAndBuyProductSteps {
	
	private SearchAndBuyProductPage searchAndBuyProductPage = new SearchAndBuyProductPage(DriverFactory.getDriver());
	private ScenarioContext scenarioContext = new ScenarioContext();
	private int count = 0;
	
	@When("user searches for {string}")
	public void searches_watches(String item) throws InterruptedException {
		searchAndBuyProductPage.enterSearchItem(item);
		scenarioContext.setContext(Integer.toString(count), item);
		count++;
		searchAndBuyProductPage.pressEnterKey();		
	}
	
	@When("user adds {string} to cart")
	public void add_items_to_cart(String item) throws InterruptedException {
		searchAndBuyProductPage.addItemToCart(item);
		
	}
	
	@When("user clicks on cart button")
	public void click_cart_button() throws InterruptedException {
		searchAndBuyProductPage.clickCartButton();		
	}
	
	@Then("user selected items are displayed successfully")
	public void cart_items_display() {
		for (int i = count-1; i > 0; i--) {
			String productname = searchAndBuyProductPage.findCartItem(scenarioContext.getContext(Integer.toString(i)));
			Assert.assertEquals(scenarioContext.getContext(Integer.toString(i)), productname);
		}
	}
	
}
