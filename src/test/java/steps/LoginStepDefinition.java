package steps;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankAndCashPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinition {
	
	WebDriver driver;
	LoginPage loginPage;


	public void init() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() {
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username(String username)   {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password(String password)  {
		loginPage.enterPassword(password);

	}
	@When("^User clicks on logIn button$")
	public void user_clicks_on_logIn_button() {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on the Dashboard page$")
	public void user_should_land_on_the_Dashboard_page() throws IOException {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}


}
