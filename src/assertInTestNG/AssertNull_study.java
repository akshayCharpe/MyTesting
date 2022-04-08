package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_study {
  @Test
  public void f() 
  {
	  String demo="Akshay";
	  
	  Assert.assertNull(demo, "String is not null");
  }
}
