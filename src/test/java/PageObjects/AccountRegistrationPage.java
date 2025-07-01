package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends Basepage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	// locators

	@FindBy(xpath = "//input[@id='fullName']")
	WebElement txtMyName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='confirm-email']")
	WebElement txtConfirmEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='confirm-password']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement txtPhnNumber;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createAcct;

	// actions<ethod

	public void fillName() {

		txtMyName.sendKeys("vasu");

	}

	public void email() {

		txtEmail.sendKeys("vasu@gmail.com");

	}

	public void confirmMail() {
		txtConfirmEmail.sendKeys("vasu@gmail.com");

	}

	public void password() {

		txtPassword.sendKeys("Vasu123");

	}

	public void confirmPassowrd() {

		txtConfirmPassword.sendKeys("Vasu123");

	}

	public void phoneNum() {
		txtPhnNumber.sendKeys("9894261711");

	}

	public void clickCreate() {
		//createAcct.click();
	
	
	WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	myWait.until(ExpectedConditions.elementToBeClickable(createAcct)).click();
	
	
	
	
	}
	
	
	
}
