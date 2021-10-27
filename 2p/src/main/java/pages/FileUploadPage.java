package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends PageBase{

	public FileUploadPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="file-upload")
	WebElement ChooseFileBtn;
	
	@FindBy(id="file-submit")
	WebElement UploadBtn;
	
	@FindBy(id="uploaded-files")
	WebElement uploadedFiles;
	
	public void VerifyUploadFile(){
		clickButton(ChooseFileBtn);
		String imageName = "MicrosoftTeams-image (11).png";
		String imagePath = System.getProperty("user.dir")+"/Uploads/"+imageName;	
		setTextElementText(ChooseFileBtn, imagePath);
		clickButton(UploadBtn);
		Assert.assertEquals(imageName, uploadedFiles.getText());
		 
    }
}
