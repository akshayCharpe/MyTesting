package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
    //1. variable declaration-->WebElement
	@FindBy(id = "userid") private WebElement userId;
	@FindBy(id = "password") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	//2. use constructor-->public
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods which works on data members
	public void sendUserId()
	{
		userId.sendKeys("DAA677");
	}
	public void sendPassword()
	{
		Password.sendKeys("Velocity@123");
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
