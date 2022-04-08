package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotation_1 {
  @Test
  public void a3() 
  {
	Reporter.log("Running Script 1",true);  
  }
  @Test
  public void b1()
  {
	  Reporter.log("Running Script 2",true);
  }
  @Test
  public void c2()
  {
	  Reporter.log("Running Script 3",true); 
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Logging in...",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("LogOut...",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Launching Browser",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("Closing Browser",true);
  }

}
