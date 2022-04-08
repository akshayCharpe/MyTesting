package zerodhaUsingPOM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage 
{
	//1.
@FindBy(id = "userid")private WebElement userID;
@FindBy(id = "password")private WebElement password;
@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;

//2.
public kiteLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//3.
public void sendUserId(String userid)
{
	userID.sendKeys(userid);
}
public void sendPassword(String pass)
{
	password.sendKeys(pass);
}
public void clickLoginButton()
{
	loginButton.click();
}
}
