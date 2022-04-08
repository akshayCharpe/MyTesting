package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Software Testing\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
  }
}
