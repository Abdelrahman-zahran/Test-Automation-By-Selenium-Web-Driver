package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetPage extends PageBase{

	public TheInternetPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(.,'File Upload')]")
	WebElement FULink;
	
	@FindBy(xpath = "//a[@href='/dynamic_loading']")
	WebElement DyLoLink;
	
	
	public void ClickOnUploadLink() {
		
		clickButton(FULink);
	}
	
	public void ClickOnDynamicLoadingLink() {
		
		clickButton(DyLoLink);
	}

}
