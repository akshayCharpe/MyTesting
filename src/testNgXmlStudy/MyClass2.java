package testNgXmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void test1() 
  {
	  Reporter.log("Test 1 Running....",true);
  }
  @Test(groups = "regression")
  public void test2() 
  {
	  Reporter.log("Test 2 Running....",true);
  }
  @Test(groups = {"regression","sanity"})
  public void test3() 
  {
	  Reporter.log("Test 3 Running....",true);
  }
  @Test
  public void test4() 
  {
	  Reporter.log("Test 4 Running....",true);
  }
  @Test
  public void test5() 
  {
	  Assert.fail();
	  Reporter.log("Test 5 Running....",true);
  }
  @Test(groups = "sanity")
  public void test6() 
  {
	  Reporter.log("Test 4 Running....",true);
  }
}
