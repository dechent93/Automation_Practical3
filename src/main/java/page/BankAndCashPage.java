package page;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import util.BrowserFactory;

public class BankAndCashPage extends BasePage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a")
	WebElement Bank_And_Cash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement New_Account;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Account_Title;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Inital_Balance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement Account_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement Contact_Person;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement Submit_Button;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']")
	WebElement Success_Verfication;

	public void clickonBankAndCash() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bank & Cash")));
		Bank_And_Cash.click();

	}

	public void clickonNewAccount() {
		New_Account.click();
	}

	String enteredName;

	public void fillInAccount(String Account) {
		enteredName = "Dechen" + generateNumber(999);
		Account_Title.sendKeys(enteredName);

	}

	public void fillInDescription(String description) {
		Description.sendKeys("Savings");
	}

	public void fillInInitalBalance(String initalBalance) {
		Inital_Balance.sendKeys("10000");
	}

	public void fillInAccountNumber(String accountNumber) {
		Account_Number.sendKeys("ACC82883");
	}

	public void fillInInContactPerson(String contact) {
		Contact_Person.sendKeys("Dechen Tshering");
	}

	public void fillInIniContactPerson(String phone) {
		Phone.sendKeys("72287327");
	}

	public void clickSubmitButton() {
		Submit_Button.click();
	}

	public void verifyAccountCreatedSuccessfully() {
		waitForElement(driver, 3, Success_Verfication);
		Assert.assertEquals(Success_Verfication.getText(), "×\n" + "Account Created Successfully",
				"×\n" + "Account Created Successfully");
		
//		BrowserFactory.tearDown();

		
	}
}
