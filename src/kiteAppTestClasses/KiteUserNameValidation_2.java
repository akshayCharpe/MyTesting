package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseUsingPropertyFile;
import kitePOMTestNG.kiteHomePage;
import kitePOMTestNG.kiteLoginPage;
import kitePOMTestNG.kitePinPage;
import utility_Packg.UtilityUsingPropertyFile;

public class KiteUserNameValidation_2 extends BaseUsingPropertyFile
{
	kiteLoginPage login;
	kitePinPage pin;
	kiteHomePage home;
	int TCID;
  @BeforeClass
  public void browserLaunch() throws IOException 
  {
	  launchBrowser();
	  login =new kiteLoginPage(driver);
	  pin =new kitePinPage(driver);
	  home=new kiteHomePage(driver);
  }
  @BeforeMethod
  public void loginToKiteApp() throws IOException
  {
	  login.enterUserId(UtilityUsingPropertyFile.getDataFromPropertyFile("UN"));
	  login.enterPassword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
	  login.clickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserName() throws IOException 
  {
	  String actualUserId = home.getActualUserID();
	  String expectedUserId = UtilityUsingPropertyFile.getDataFromPropertyFile("UN");
	  Assert.fail();
	  Assert.assertEquals(actualUserId, expectedUserId,"UserId is Wrong");
	  //UtilityUsingPropertyFile.takeScreenShot(driver, 100);
  }
  @AfterMethod
  public void logOutToKiteApp(ITestResult result) throws InterruptedException, IOException
  {
	  if(result.getStatus()==result.FAILURE)
	  {
		  UtilityUsingPropertyFile.takeScreenShot(driver, TCID);
	  }
	  else
	  {
		  Reporter.log("TC is Passed",true);
	  }
	  home.clickOnLogoutButton();
  }
  @AfterClass
  public void closingBrowser()
  {
	  closeBrowser();
  }
  
}
