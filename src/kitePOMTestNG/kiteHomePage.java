package kitePOMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage 
{

	@FindBy(xpath = "//span[@class='user-id']")private WebElement userId1;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	public kiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID()
	{
		String actualUserId=userId1.getText();
		return actualUserId;
		//we will verify using Asserts so not using if else statement
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		userId1.click();
		Thread.sleep(1000);
		logOutButton.click();
	}
	
}
