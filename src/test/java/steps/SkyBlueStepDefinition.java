package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBlueBackground;
import page.WhiteBackground;
import util.BrowserFactory;

public class SkyBlueStepDefinition {

	WebDriver driver;
	SkyBlueBackground skyBlueBackgroundPage;
	WhiteBackground WhiteBackgroundPage;

	@Before
	public void init() {
		driver = BrowserFactory.init();
		skyBlueBackgroundPage = PageFactory.initElements(driver, SkyBlueBackground.class);
		WhiteBackgroundPage = PageFactory.initElements(driver, WhiteBackground.class);

	}
	@Given("^User will be able to Set SkyBlue Background$")
	public void user_will_be_able_to_Set_SkyBlue_Background() {
		
	}
	
	@When("^User clicks on the Set SkyBlue Background button$")
	public void user_clicks_on_the_Set_SkyBlue_Background_button() {
		skyBlueBackgroundPage.clickOnSetSkyBlueBackground();
		
	}
	
	@Then("^Background color will change to Sky Blue$")
	public void background_color_will_change_to_Sky_Blue() {
		
	}
	
	@Given("^User will be able to Set White Background$")
		public void user_will_be_able_to_Set_White_Background() {
			
	}
		
	@When("^User clicks on the Set White Background button$")
		public void user_clicks_on_the_Set_White_Background_button() {
			WhiteBackgroundPage.clickOnSetWhiteBackground();
			
	}
		
	@Then("^Background color will change to White$")
		public void background_color_will_change_to_White() throws IOException {
		BrowserFactory.takeScreenshotatEndofTest(driver);

		
	}	

}


