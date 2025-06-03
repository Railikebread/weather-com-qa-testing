package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * ElementUtil is a helper class that simplifies common Selenium interactions.
 * 
 * Purpose:
 * - Centralizes repetitive element interactions like click, type, getText, etc.
 * - Adds built-in waits so tests are more stable and less flaky
 * 
 * Why use it:
 * - Cleaner test code
 * - Reusable methods reduce maintenance
 * - Safer interactions through smart waits
 */

public class ElementUtil {
	
	private WebDriver driver;
	 // Constructor initializes the driver instance for use in all utility methods
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	// Waits for an element to be visible before interacting with it.
	public WebElement waitForElementVisible(By locator, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	 /* Core utility method: waits for an element to be visible and returns it.
	 Great for use inside other methods (like click, sendKeys, etc.) */
	}
	
    // Clicks on an element after waiting for it to be visible
	public void doClick(By locator) {
		waitForElementVisible(locator, 10).click();
	// Short and safe. You don’t want flaky clicks due to invisible elements — this waits first.	
	} 
	
	// Clears the input field and types the given value
	public void doSendKeys(By locator, String value) {
		WebElement ele = waitForElementVisible(locator, 10);
		ele.clear();
		ele.sendKeys(value);
	}
	// Smart sendKeys: Clears any pre-filled input to avoid issues. Simple, predictable, and safe.
	
    // Gets the visible text from an element
	public String doGetText(By locator) {
		return waitForElementVisible(locator, 10).getText();
	}
	// Useful for assertions. For example: Assert.assertEquals(elementUtil.doGetText(header), "Welcome");
	
	// Returns true if the element is displayed on the page
	public boolean isElementDisplayed(By locator) {
		return waitForElementVisible(locator, 10).isDisplayed();
	}
	// Great for Validation checks.
	
	public WebElement waitForElementClickable(By locator, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
