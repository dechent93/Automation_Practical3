package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackground {
	
	WebDriver driver;

	public WhiteBackground(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using ="//button[@onclick=\"myFunctionWhite()\"]")
	WebElement White_Background;

	public void clickOnSetWhiteBackground() {
		White_Background.click();
	}

}

