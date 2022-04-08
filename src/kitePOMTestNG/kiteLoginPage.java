package kitePOMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage {

	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	@FindBy(xpath = "//span[contains(text(),'User ID should be')]")private WebElement userIDErrorMsg;
	@FindBy(xpath = "//span[contains(text(),'Password should be minimum')]")private WebElement passErrorMsg;
	
	public kiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String userid)
	{
		userID.sendKeys(userid);
	}
	
	public void enterPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public String getUserIdErrorMsg()
	{
		String actualUserID=userIDErrorMsg.getText();
		return actualUserID;
	}
	public String getPassErrorMsg()
	{
		String actualPassErrorMsg = passErrorMsg.getText();
		return actualPassErrorMsg;
	}

}
