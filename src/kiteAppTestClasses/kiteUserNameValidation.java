package kiteAppTestClasses;

import org.testng.annotations.Test;

import baseClasses.Base;
import kitePOMTestNG.kiteHomePage;
import kitePOMTestNG.kiteLoginPage;
import kitePOMTestNG.kitePinPage;
import utility_Packg.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class kiteUserNameValidation extends Base 
{
 
	kiteLoginPage login;
	kitePinPage pin;
	kiteHomePage home;
	
  @BeforeClass
  public void browserLaunch() 
  {
	  launchBrowser();
	  login =new kiteLoginPage(driver);
	  pin =new kitePinPage(driver);
	  home=new kiteHomePage(driver);
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.enterUserId(Utility.readDataFrmExcelSheet(0, 0));
	  login.enterPassword(Utility.readDataFrmExcelSheet(0, 1));
	  login.clickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.enterPin(Utility.readDataFrmExcelSheet(0, 2));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  String actualUserID = home.getActualUserID();
	  String expectedUserID = Utility.readDataFrmExcelSheet(0, 3);
	  Assert.assertEquals(actualUserID, expectedUserID,"ActualUserId & ExpectedUserId Are Not Matching");
	  Utility.takeScreenShot(driver, 10);
	  Reporter.log("Validation Susccessfull",true);
  }
  @AfterMethod
  public void logOutToKiteApp() throws InterruptedException
  {
	  home.clickOnLogoutButton();
  }
  @AfterClass
  public void closingBrowser()
  {
	  closeBrowser();
  }

}
