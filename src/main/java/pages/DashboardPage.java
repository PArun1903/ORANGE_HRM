package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement userDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.className("oxd-userdropdown-name")));


    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isWelcomeMessageDisplayed() {
        return userDropdown.isDisplayed();
    }
}