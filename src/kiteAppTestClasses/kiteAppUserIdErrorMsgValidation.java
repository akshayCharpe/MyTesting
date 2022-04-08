package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base;
import kitePOMTestNG.kiteLoginPage;
import utility_Packg.Utility;

public class kiteAppUserIdErrorMsgValidation extends Base
{
	kiteLoginPage login;
  @BeforeClass
  public void launchingBrowser() 
  {
	  launchBrowser();
	 
	login=new kiteLoginPage(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.enterPassword(Utility.readDataFrmExcelSheet(0, 1));
	  login.clickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateErrorMsg() throws EncryptedDocumentException, IOException
  {
	  String expectedUserIdErrorMsg = Utility.readDataFrmExcelSheet(0, 4);
	  String actualUserIdErrorMsg = login.getUserIdErrorMsg();
	  Assert.assertEquals(expectedUserIdErrorMsg, actualUserIdErrorMsg,"ErrorMsg Not Matching.");
	  Reporter.log("Validate successfull",true);
	  Utility.takeScreenShot(driver, 444);
  }
  
  @AfterClass
  public void closingBrowser()
  {
	  driver.quit();
  }
  
}
