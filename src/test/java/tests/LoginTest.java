package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage = new LoginPage(driver);
	}

	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		dashboardPage = new DashboardPage(driver);
		Assert.assertTrue(dashboardPage.isWelcomeMessageDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
