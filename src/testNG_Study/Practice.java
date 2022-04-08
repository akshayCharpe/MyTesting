package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void f1() 
  {
	  System.out.println("1st Method");
  }
  
  @Test
  public void f2()
  {
	  System.out.println("2nd Method");
	  Reporter.log("Process in Progress");
  }
  
}
