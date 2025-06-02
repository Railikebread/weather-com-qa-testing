package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtil;



/**
 * WeatherHomePage represents the homepage of Weather.com.
 * 
 * Purpose:
 * - Wraps homepage structure and behaviors in reusable methods
 * - Enables test classes to interact with UI through clean, readable code
 */

public class WeatherHomePage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
    // driver is the WebDriver session passed from BaseTest & elementUtil is your helper class — it will handle clicks, typing, waits, etc.
	
	// ==== Locators ====
	private By searchInputField = By.id("headerSearch_LocationSearch_input");
	private By searchDropdownFirstResult = By.xpath("//div[starts-with(@id,'headerSearch_LocationSearch_listbox')]/div/div/a");
	private By locationHeader = By.xpath("//h1[contains(@class,'CurrentConditions--location')]");

	// ==== Constructor ====
	public WeatherHomePage(WebDriver driver) {
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
	// Takes the webDriver and initializes to elementUtil. This way, every method in this class can use Util.					
	}
	
	// Returns the current page title. Good for verifying we are on the correct page
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	  
     /** Types a location into the search input field. @param cityName The name of the location to search for. **/
    public void searchForCity(String cityName) {
        elementUtil.doSendKeys(searchInputField, cityName);
    }
    
    /** Clicks on the first dropdown result that appears after entering a location **/
    public void clickFirstSearchResult() {
    	elementUtil.doClick(searchDropdownFirstResult);
    }
    
    /** After selecting a city, this returns the header test that shows the current location **/
    public String getSelectedLocationHeader() {
    	return elementUtil.doGetText(locationHeader);
    }
}
