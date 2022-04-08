package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
    //1.
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserID1;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	//2.
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	public void ValidateUserID()
	{
		String actualText = UserID1.getText();
		String expectedText = "DAA677";
		
		if(actualText.equals(expectedText))
		{
			System.out.println("TC is Pass.");
		}
		else
		{
			System.out.println("TC is Fail.");
		}
	}
	public void clickOnLogoutButton() throws InterruptedException
	{
		UserID1.click();
		Thread.sleep(1000);
		logOutButton.click();
	}
}
