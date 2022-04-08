package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals_study {
  @Test
  public void f() 
  {
	  String name="VCTC";
	  String name1="VCTC";
	  
	  Assert.assertNotEquals(name, name1, " is matching");
  }
}
