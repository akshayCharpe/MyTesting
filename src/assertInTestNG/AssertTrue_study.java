package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_study {
  @Test
  public void method() 
  {
	  boolean result = true;
	  
	  Assert.assertTrue(result, "Result is False");
  }
}
