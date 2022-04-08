package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut_study 
{
  @Test
  public void a() 
  {
	  Reporter.log("Method 1....",true);
  }
  @Test(timeOut = 1000)
  public void b() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Method 2....",true);
  }
  @Test(timeOut = 2000)
  public void c() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Method 3....",true);
  }
  @BeforeMethod
  public void before()
  {
	  Reporter.log("Before Method....",true);
  }
  @AfterMethod
  public void after()
  {
	  Reporter.log("After Method....",true);
  }
}
