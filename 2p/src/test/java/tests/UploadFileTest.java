package tests;

import org.testng.annotations.Test;

import pages.FileUploadPage;
import pages.TheInternetPage;

public class UploadFileTest extends TestBase{
	
	
	TheInternetPage TIPObject;
	FileUploadPage FUPObject;
	
	@Test
	public void UploadFileMethod() {
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		TIPObject = new TheInternetPage(driver);
		TIPObject.ClickOnUploadLink();
		FUPObject = new FileUploadPage(driver);
		FUPObject.VerifyUploadFile();
		
		
	}

}
