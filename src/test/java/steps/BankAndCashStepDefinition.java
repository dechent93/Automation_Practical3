package steps;

import java.io.IOException;
import java.util.Random;

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

public class BankAndCashStepDefinition {

	WebDriver driver;
	BankAndCashPage bankAndCash;
	LoginPage loginPage;

	@Before
	public void init() {
		driver = BrowserFactory.startBrowser();
		bankAndCash = PageFactory.initElements(driver, BankAndCashPage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}
	@Given("^User will be able to login on ibilling website$")
	public void User_will_be_able_to_login_on_ibilling_website() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}
	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String username)   {
		loginPage.enterUserName(username);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String password)  {
		loginPage.enterPassword(password);
	}
	@When ("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_username_and_password(String username, String password) {
		loginPage.enterCrenditals(username, password);
	}

	@When("^User clicks on SignIn button$")
	public void user_clicks_on_SignIn_button() {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on the dashboard page$")
	public void user_should_land_on_the_dashboard_page() throws IOException {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("^User clicks on Bank and Cash$")
	public void user_clicks_on_Bank_and_Cash() {
		bankAndCash.clickonBankAndCash();
	}

	@When("^User clicks on New Account$")
	public void user_clicks_on_New_Account() {
		bankAndCash.clickonNewAccount();
	
	}
	@When("^User fills the form entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fills_the_form_entering_and_and_and_and_and(String AccountTitle, String Description,
			String InitalBalance, String AccountNumber, String ContactPerson, String Phone) throws Throwable {
		bankAndCash.fillInAccount(AccountTitle);
		bankAndCash.fillInDescription(Description);
		bankAndCash.fillInInitalBalance(InitalBalance);
		bankAndCash.fillInAccountNumber(AccountNumber);
		bankAndCash.fillInInContactPerson(ContactPerson);
		bankAndCash.fillInIniContactPerson(Phone);
	}

	@Then("^User should clicks on submit button$")
	public void user_should_clicks_on_submit_button() {
		bankAndCash.clickSubmitButton();
	}
	@Then("^User is able to verify the Account was created successfully$")
	public void user_is_able_to_verify_the_Account_was_created_successfully() throws IOException {
		bankAndCash.verifyAccountCreatedSuccessfully();
		BrowserFactory.takeScreenshotatEndofTest(driver);
	}

}
