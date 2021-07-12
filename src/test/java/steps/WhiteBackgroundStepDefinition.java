package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WhiteBackground;
import util.BrowserFactory;

public class WhiteBackgroundStepDefinition {
	
	WebDriver driver;
	WhiteBackground WhiteBackgroundPage;

	@Before
	public void init() {
		driver = BrowserFactory.init();

	}
	@Given("^User would be able to Set White Background$")
	public void user_would_be_able_to_Set_SkyBlue_Background() {
		
	}
	
	@When("^User click on the Set White Background button$")
	public void user_click_on_the_Set_SkyBlue_Background_button() {
		WhiteBackgroundPage.clickOnSetWhiteBackground();
		
	}
	
	@Then("^Background colour will change to Sky Blue$")
	public void background_colour_will_change_to_Sky_Blue() {
		
	


	}

}

