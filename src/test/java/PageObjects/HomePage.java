package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		super(driver);

	}
	
	//locators 
	
	@FindBy(xpath="//button[@id='customer-button']")
	 WebElement lnkMyAccount;
	
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement clkRegister;
	
	
	
	
	//
	
	
	public void clickMyAccount() {
		
		
		lnkMyAccount.click();
		
	}
	
	public void clickRegister() {
		
		
		clkRegister.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
