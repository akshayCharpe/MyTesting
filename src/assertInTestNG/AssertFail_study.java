package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail_study {
  @Test
  public void f() 
  {
	  String a=null;
	  String b="Akshay";
	 
	  Assert.assertNull(a, "String is not null");
	  System.out.println("String is null");
	  Assert.assertNotNull(b, "String is null");
	  System.out.println("String is not null");
	  Assert.fail();
	  
  }
}
