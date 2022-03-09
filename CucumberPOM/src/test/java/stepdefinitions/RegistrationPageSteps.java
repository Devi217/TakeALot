package stepdefinitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import com.pages.RegistrationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationPageSteps {
	
	private RegistrationPage registerPage = new RegistrationPage(DriverFactory.getDriver());
	
	@Given("user naviagtes to Takealot website")
	public void user_is_on_takealot_page() throws InterruptedException {
		registerPage.navigateToURL();
		
	}
	
	@When("user clicks on Register link")
	public void user_clicks_on_register_link() throws InterruptedException {
		registerPage.clickOnRegister();
	}
	
	@Then("Registration page is displayed successfully")
	public void register_title_display() {
		String title = registerPage.getRegisterPageHeader();
		Assert.assertEquals("Register", title);
	}
	@When("user provides all required details")
	public void user_enters_details(DataTable credTable) {

		List<Map<String, String>> credList = credTable.asMaps();
		String firstName = credList.get(0).get("FirstName");
		String lastName = credList.get(0).get("LastName");
		String email = credList.get(0).get("Email");
		String email2 = credList.get(0).get("RetypeEmail");
		String pwd = credList.get(0).get("Password");
		String confirmpwd = credList.get(0).get("RetypePassword");
		String mobileNo = credList.get(0).get("MobileNumber");

		registerPage.enterFirstName(firstName);
		registerPage.enterLastName(lastName);
		registerPage.enterEmail(email);
		registerPage.enterEmail2(email2);
		registerPage.enterPassword(pwd);
		registerPage.enterConfirmPassword(confirmpwd);
		registerPage.enterMobileNo(mobileNo);
	}
	
	@When("user clicks on Register button")	
	public void user_clicks_on_register_button() throws InterruptedException {
		registerPage.clickOnRegiserBtn();
		}
	
	@Then("user is susscessfuly Registered")	
	public void registration_confirmation_message() {
		String message = "Thanks for registering with us, we reckon this is the start of a beautiful relationship.";
		String  title = registerPage.registrationConfirmPopup();
		Assert.assertEquals(message, title);
	}
}


