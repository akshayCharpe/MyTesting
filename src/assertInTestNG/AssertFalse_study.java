package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse_study {
  @Test
  public void methods() 
  {
	  boolean result = true;
	  
	  Assert.assertFalse(result, "Result is True");
  }
}
