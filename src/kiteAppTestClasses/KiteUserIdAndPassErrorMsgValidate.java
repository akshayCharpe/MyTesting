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
import kiteAppPomClasses.kiteLoginPage;
import utility_Packg.Utility;

public class KiteUserIdAndPassErrorMsgValidate extends Base
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
	public void loginToKiteApp()
	{
		Reporter.log("Login To KiteApp",true);
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  @Test
  public void validateErrorMsg() throws EncryptedDocumentException, IOException 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String actualUserIdErrorMsg = login.getUserIdErrorMsg();
	  String expectedUserIdErrorMsg = Utility.readDataFrmExcelSheet(0, 4);
	  String actualPassErrorMsg = login.getPassErrorMsg();
	  String expectedPassErrorMsg = Utility.readDataFrmExcelSheet(1, 0);
	  
	  Assert.assertEquals(actualUserIdErrorMsg, expectedUserIdErrorMsg,"UserID ErrorMsg Not Matching");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Assert.assertEquals(actualPassErrorMsg, expectedPassErrorMsg,"Password ErrorMsg Not Matching");
	  
	  Reporter.log("Validation Successfull",true);
	  
	  Utility.takeScreenShot(driver,90);
  }
  @AfterClass
  public void closingBrowser()
  {
	  driver.quit();
  }
}
