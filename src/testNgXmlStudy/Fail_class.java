package testNgXmlStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail_class {
  @Test
  public void a() 
  {
  
	  Reporter.log("Running 1 Script...",true);
  }
  @Test
  public void b() throws InterruptedException 
  {
  
	  Reporter.log("Running 2 Script...",true);
  }
  @Test
  public void c() 
  {
	  Assert.fail();
	  Reporter.log("Running 3 Script...",true);
  }
  @Test
  public void d() 
  {
  
	  Reporter.log("Running 4 Script...",true);
  }
}
