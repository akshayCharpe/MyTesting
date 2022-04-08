package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void validateUserId() 
  {
	  Reporter.log("Running Test",true);
  }
  @Test
  public void sampleTest()
  {
	  Reporter.log("Running Sample Test",true);
  }
  @Test
  public void addFunds()
  {
	  Reporter.log("Adding Funds",true);
  }
  
  @BeforeMethod
  public void loginToKite()
  {
	  Reporter.log("2.Logging In...",true);

  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("1.Launching Browser",true);
  }
  
  @AfterMethod
  public void logOutKite()
  {
	  Reporter.log("3.Logging Out...",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("4.Closing Browser",true);
  }
}
