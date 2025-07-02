package testcase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;

public class TC01_AccounRegister {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myprotein.co.in/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {

	}

	@Test

	public void homePage() {

		HomePage hp = new HomePage(driver);
		hp.handleCookieBanner();
		hp.clickMyAccount();
		hp.clickRegister();

		AccountRegistrationPage ac = new AccountRegistrationPage(driver);

		ac.fillName(randomString().toLowerCase());

		String mail = randomStringMail().toLowerCase();

		ac.email(mail + "@gmail.com");
		ac.confirmMail(mail + "@gmail.com");

		String pass = randomStringPass();
		ac.password(pass);
		ac.confirmPassowrd(pass);
		ac.phoneNum(randomNumber());
		ac.clickCreate();

	}

	public String randomString() {

		String randomAlphabetic = RandomStringUtils.randomAlphabetic(6);
		return randomAlphabetic;

	}

	public String randomStringMail() {

		String randommail = RandomStringUtils.randomAlphabetic(5);

		return randommail;

	}

	public String randomStringPass() {

		String randomPass = RandomStringUtils.randomAlphanumeric(10);
		return randomPass;

	}

	public String randomNumber() {

		String randomNumeric = RandomStringUtils.randomNumeric(10);
		return randomNumeric;

	}

}
