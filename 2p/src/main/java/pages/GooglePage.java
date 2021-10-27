package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageBase
{
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@jsaction='paste:puy29d;']")
	WebElement SerchBox ; 

	@FindBy(xpath = "(//input[@value='بحث Google‏'])[2]")
	WebElement srBtn ; 
	
	

	
	public void DoSearch(String Text) 
	{
		setTextElementText(SerchBox, Text);
		SerchBox.submit();
	}

}
