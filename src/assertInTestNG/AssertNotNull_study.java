package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull_study {
  @Test
  public void f() 
  {
	  String demo="Akshay";
	  
	  Assert.assertNotNull(demo, "String is null");
  }
}
