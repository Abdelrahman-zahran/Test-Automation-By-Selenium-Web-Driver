package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicallyLoadedPage extends PageBase{
	
	

	public DynamicallyLoadedPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[@href='/dynamic_loading/2']")
	WebElement EX2Link;
	
	
	public void ClickOnExampleTwo() {
		clickButton(EX2Link);
	}

}
