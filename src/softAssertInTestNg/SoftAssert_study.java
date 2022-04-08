package softAssertInTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_study 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void f() 
  {
	  String s="Pune";
	  String l="Pune";
	  
	  soft.assertNotEquals(s, l,"Strings are not Equals");
	  
	  soft.assertNotNull(l,"l is Null");
	  
	  soft.assertAll();
	  
  }
  @Test
  public void f1() 
  {
	  String s="Pune";
	  String l="Pune";
  
	  soft.assertEquals(s, l);
	  soft.assertAll();
  }
}
