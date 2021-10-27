package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResults extends PageBase {

	public GoogleResults(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(@aria-label,'Page 3')]")
	WebElement RsltLink;
	
	public String getTextFromSearchResults(int result){
		String TextResult = RsltLink.getText();
        
        return TextResult;
    }

}
