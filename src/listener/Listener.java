package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Your TC is Started",true);
        ITestListener.super.onTestStart(result);
	}
	 @Override
	public void onTestFailure(ITestResult result) 
	 {
		 Reporter.log("Sorry Your TC is Failed",true);
		ITestListener.super.onTestFailure(result);
	}
	 @Override
	public void onTestSuccess(ITestResult result) 
	 {
         Reporter.log("Congrats Your TC is Passed",true);
		 ITestListener.super.onTestSuccess(result);
	}
	 @Override
	public void onTestSkipped(ITestResult result) 
	 {
		 Reporter.log("Your test case is Skipped,please check",true);
		ITestListener.super.onTestSkipped(result);
	}
}
