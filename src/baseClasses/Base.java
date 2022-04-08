package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	
    protected WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		  driver=new ChromeDriver(opt);
		  driver.get("https://kite.zerodha.com/");
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
