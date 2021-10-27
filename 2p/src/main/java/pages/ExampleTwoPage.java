package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ExampleTwoPage extends PageBase{
	
	public WebDriver driver ;

	public ExampleTwoPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[contains(.,'Start')]")
	WebElement StartBtn;
	
	@FindBy(xpath = "//h4[contains(.,'Hello World!')]")
	WebElement DisplayedText;
	
	public void ClickOnStart() {
		clickButton(StartBtn);
	}
	
	public void VerifyTextDisplayed() {
		
		Assert.assertEquals("Hello World!", DisplayedText.getText());
	}

}
