package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BasePage {

	// Clicking on the ADMIN Button
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement admin = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//a[@class=\"oxd-main-menu-item active\"]")));

	WebElement job = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//li[@class=\"--active oxd-topbar-body-nav-tab --parent\"]")));

	WebElement jobTitleOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-link\"])[1]")));

	WebElement Add = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")));

	WebElement jobTitleField= wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")));

	WebElement jobDescriptionField = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//textarea[@placeholder=\"Type description here\"]")));

	WebElement browse = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//div[@class=\"oxd-file-button\"]")));

	WebElement note = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//textarea[@placeholder=\"Add note\"]")));

	WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@type=\"submit\"]")));

	public AdminPage(WebDriver driver) {
		super(driver);
	}

	public void addJobTitle(String title, String desc) {
		admin.click();
		// Click on the Job option
		job.click();
		// Click on the "Job Titles" option
		jobTitleOption.click();
		// Send keys to job title field
		jobTitleField.sendKeys(title);
		// SEND keys to jobDescription field
		jobDescriptionField.sendKeys(desc);
		// Send Keys for the note field
		note.sendKeys("Note");
		//click on save button
		save.click();
	}





}


