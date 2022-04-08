package baseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utility_Packg.UtilityUsingPropertyFile;

public class BaseUsingPropertyFile 
{

	 protected WebDriver driver;
		public void launchBrowser() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			  driver=new ChromeDriver(opt);
			  driver.get(UtilityUsingPropertyFile.getDataFromPropertyFile("URL"));
			  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
			  driver.manage().window().maximize();
			  Reporter.log("Browser Launch Successfully");
		}
		
		public void closeBrowser()
		{
			driver.quit();
			Reporter.log("Browser Close Successfully");
		}
}
