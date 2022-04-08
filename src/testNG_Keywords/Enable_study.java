package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Enable_study {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC Method 1...",true);
  }
  @Test(enabled = false)
  public void TC2()
  {
	  Reporter.log("TC Method 2...",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before Method...",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After Method...",true);
  }

}
