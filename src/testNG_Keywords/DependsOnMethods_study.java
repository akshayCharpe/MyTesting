package testNG_Keywords;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class DependsOnMethods_study 
{

	@Test(dependsOnMethods = {"c"})
	public void a()
	{
		Reporter.log("Method 1...",true);
	}
	@Test(timeOut = 500)
	public void c() throws InterruptedException
	{
		Thread.sleep(1000);
		Reporter.log("Method 3...",true);
	}
	@Test
	public void b()
	{
		Reporter.log("Method 2...",true);
	}
	
}
