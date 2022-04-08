package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void f() 
  {
	  String a=null;
	  String b=null;
	  boolean result = true;
	  
	  Assert.assertNull(a);
	  Assert.assertFalse(result);
	  Assert.assertEquals(a, b);
	  
  }
  @Test
  public void method()
  {
	  String s="akshay";
	  
	  Assert.assertNotNull(s);
  }
}
