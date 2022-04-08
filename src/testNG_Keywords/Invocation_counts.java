package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_counts 
{
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 Running...",true);
  }
  @Test(invocationCount = 3	)
  public void TC1()
  {
	  Reporter.log("TC1 Running...",true);
  }
  @BeforeMethod
  public void before()
  {
	  Reporter.log("Before Method",true);
  }
  @AfterMethod
  public void after()
  {
	  Reporter.log("After Method",true);
  }
}
