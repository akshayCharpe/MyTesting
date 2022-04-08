package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNG {
@Test
public void first()
{
	System.out.println("First Method");
	Reporter.log("Transaction is processing.");
}
@Test
public void second()
{
	System.out.println("Second Method");
	Reporter.log("Transaction Completed");
}
@Test
public void third()
{
	System.out.println("Third Method");
}
}
