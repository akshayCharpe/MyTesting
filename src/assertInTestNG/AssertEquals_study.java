package assertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_study {
  @Test
  public void AssertTest() 
  {
	  String name="VCTC";
	  String name1="VCTC1";
	  
//	  if(name.equals(name1))
//	  {
//		  System.out.println("TC is Passed");
//	  }
//	  else
//	  {
//		  System.out.println("TC is Fail");
//	  }
	  
	  Assert.assertEquals(name,name1,"String not Matching");
  }
}
