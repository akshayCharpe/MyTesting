package zerodhaUsingPOM_DDF;

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
		public void validateUserId(String userid)
		{
			String actualText = UserID1.getText();
			String expectedText = userid;
			
			if(actualText.equals(expectedText))
			{
				System.out.println("UserId is Match TC is Pass");
			}
			else
			{
				System.out.println("UserId is not Match TC is Fail");
			}
		}
		public void clickOnLogoutButton() throws InterruptedException
		{
			UserID1.click();
			Thread.sleep(1000);
			logOutButton.click();
		}
}
