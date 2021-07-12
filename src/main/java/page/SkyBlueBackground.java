package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackground {
	
	WebDriver driver;

		public SkyBlueBackground(WebDriver driver) {
			this.driver = driver;

		}

		@FindBy(how = How.XPATH, using ="//button[@onclick=\"myFunctionSky()\"]")
		WebElement SkyBlue_Background;
	
		public void clickOnSetSkyBlueBackground() {
			SkyBlue_Background.click();
		}

}
