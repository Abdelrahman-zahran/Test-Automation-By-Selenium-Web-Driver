package tests;

import org.testng.annotations.Test;

import pages.DynamicallyLoadedPage;
import pages.ExampleTwoPage;
import pages.TheInternetPage;

public class DynamicLoadingTest extends TestBase{
	
	TheInternetPage TIPObject;
	DynamicallyLoadedPage DLPObject;
	ExampleTwoPage ETPObject;
	
	@Test
	public void VerifyTextDisplayedCorrect() {
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		TIPObject = new TheInternetPage(driver);
		TIPObject.ClickOnDynamicLoadingLink();
		DLPObject = new DynamicallyLoadedPage(driver);
		DLPObject.ClickOnExampleTwo();
		ETPObject = new ExampleTwoPage(driver);
		ETPObject.ClickOnStart();
		ETPObject.VerifyTextDisplayed();
		
		
	}
	

}
