package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//input[@name='username']")));
	
	
	WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//input[@name='password']")));
	
	WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//button[@type='submit']")));
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
}