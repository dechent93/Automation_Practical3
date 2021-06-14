package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	

	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
		
	}
		
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickSignInButton() {
		SignIn.click();
	}
	public void enterCrenditals(String userName, String password) {
		User_Name.sendKeys(userName);
		Password.sendKeys(password);

	}
	public String getPageTitle() {
		return driver.getTitle();
	}
}