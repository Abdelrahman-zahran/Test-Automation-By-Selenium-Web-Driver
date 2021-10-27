package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GooglePage;
import pages.GoogleResults;

public class SearchTest extends TestBase
{

	

	
	GooglePage searchObject ; 
	GoogleResults RsltObject;
	

	@Test
	public void UserCanSearch() 
	{
		driver.navigate().to("https://www.google.com/ncr");
		searchObject = new GooglePage(driver); 
		searchObject.DoSearch("selenium webdriver");
		Assert.assertTrue(RsltObject.getTextFromSearchResults(3).contains("What is Selenium WebDriver?"));
	}

	
}
