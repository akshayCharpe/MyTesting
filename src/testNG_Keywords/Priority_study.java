package testNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Priority_study {
  @Test(priority = 2)
  public void b() 
  {
	  Reporter.log("TC2 Running...",true);
  }
  @Test(priority = 3)
  public void a()
  {
	  Reporter.log("TC1 Running...",true);
  }
  @Test(priority = 1)
  public void c()
  {
	  Reporter.log("TC3 Running...",true);
  }
  @Test(priority = 2)
  public void d()
  {
	  Reporter.log("TC4 Running...",true); 
  }
  @Test(priority = -2)
  public void e()
  {
	  Reporter.log("TC5 Running...",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before exe.",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After exe.",true); 
  }

}
