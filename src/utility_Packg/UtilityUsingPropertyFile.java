package utility_Packg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUsingPropertyFile 
{
	public static void takeScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\TC"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Screenshot taken for Tc"+TCID,true);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\First Program\\PropertyFile");
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}


	

}
