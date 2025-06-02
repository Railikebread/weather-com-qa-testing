package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.WeatherHomePage;

public class WeatherSearchTest extends BaseTest {
	
	@Test
	public void searchWeatherByCityTest() throws InterruptedException {
		WeatherHomePage homePage = new WeatherHomePage(driver);
		String title = homePage.getHomePageTitle();
		Assert.assertTrue(title.contains("Weather"), "Home page title is incorrect.");
		
		Thread.sleep(3000);
		homePage.searchForCity("New York");
		homePage.clickFirstSearchResult();
		
		String locationHeader = homePage.getSelectedLocationHeader();
		Assert.assertTrue(locationHeader.contains("New York"), "Location header does not match searched city." );
	}

}
