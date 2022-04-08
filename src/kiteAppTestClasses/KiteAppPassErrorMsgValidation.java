package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import kitePOMTestNG.kiteLoginPage;
import utility_Packg.Utility;

public class KiteAppPassErrorMsgValidation extends Base
{
	kiteLoginPage login;
	@BeforeClass
	public void launchingBrowser()
	{
		launchBrowser();
		Reporter.log("Launching Browser",true);
		login=new kiteLoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		Reporter.log("Login to KiteApp",true);
		login.enterUserId(Utility.readDataFrmExcelSheet(0, 0));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  @Test
  public void validatePassErrorMsg() throws EncryptedDocumentException, IOException 
  {
	 String actualPassErrorMsg = login.getPassErrorMsg();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 String expectedPassErrorMsg = Utility.readDataFrmExcelSheet(1, 0);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Assert.assertEquals(actualPassErrorMsg,expectedPassErrorMsg,"Error Msg Are Matching.");
	  Utility.takeScreenShot(driver, 100);
	  Reporter.log("Password Error Msg is Matched",true);
  }
  @AfterClass
  public void closingBrowser()
  {
	  driver.quit();
  }
}
