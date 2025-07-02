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

	public void fillName(String name) {

		txtMyName.sendKeys(name);

	}

	public void email(String email) {

		txtEmail.sendKeys(email);

	}

	public void confirmMail(String cEmail) {
		txtConfirmEmail.sendKeys(cEmail);

	}

	public void password(String pass) {

		txtPassword.sendKeys(pass);

	}

	public void confirmPassowrd(String cPass) {

		txtConfirmPassword.sendKeys(cPass);

	}

	public void phoneNum(String number) {
		txtPhnNumber.sendKeys(number);

	}

	public void clickCreate() {
		createAcct.click();
	
	
	/*WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	myWait.until(ExpectedConditions.elementToBeClickable(createAcct)).click();
	
	*/
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
