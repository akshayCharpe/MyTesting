package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	@Parameters("browserName")
  @Test
  public void CrossBrowser(String browserName)
  {
		WebDriver driver;
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
		   driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.close();
	  }
	  else if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Software Testing\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
		   driver=new FirefoxDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.close();
	  }
  }
}
