package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * BaseTest is the foundational class for all test classes in the framework.
 * 
 * Purpose:
 * - Initializes and configures the WebDriver before each test (@BeforeMethod)
 * - Cleans up the browser session after each test (@AfterMethod)
 * 
 * Why use it:
 * - Centralizes setup/teardown logic so you don’t repeat code in every test class
 * - Provides a consistent WebDriver instance (protected) for all child test classes
 * - Ensures each test starts with a fresh browser and ends cleanly
 * 
 * Any test class that extends BaseTest will automatically inherit its WebDriver lifecycle.
 */

public class BaseTest {

	// Calls WebDriver using driver for all test classes that extend this one
	protected WebDriver driver;
	
	@BeforeMethod // The first thing we are running before anything else. This entire code is our before block.
	public void setUp() {
		WebDriverManager.chromedriver().setup(); // Downloads the correct ChromeDriver version automatically.
		driver = new ChromeDriver(); // Launches a new Chrome browser instance (driver object now gives you control)
		driver.manage().window().maximize();
		driver.get("https://weather.com/");
	} // This method is run before every test method in any class that extends BaseTest
	
	@AfterMethod
	public void tearDown() { // Perfect name for the function that'll turn everything off after every test.
		if (driver != null) { // If driver failed to initialize for some reason, this prevents a NullPointerException.
			driver.quit(); // Closes all browser windows/tabs and ends the WebDriver session - Frees system memory | Prevents test bleeds | Avoids zombie ChromeDriver
		}
	}	
}
