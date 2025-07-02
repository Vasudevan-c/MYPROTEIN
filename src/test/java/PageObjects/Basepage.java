package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	WebDriver driver;
	public Basepage (WebDriver driver ) {
		
		this.driver=driver ;
		PageFactory.initElements(driver,this );
		
		
		
		
	}
	
	
	public void handleCookieBanner() {
		try {
			WebElement acceptCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
			if (acceptCookies.isDisplayed()) {
				acceptCookies.click();
				Thread.sleep(1000); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
