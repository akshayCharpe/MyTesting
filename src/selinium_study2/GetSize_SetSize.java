package selinium_study2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_SetSize {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Dimension windowSize = driver.manage().window().getSize();
		
		System.out.println(windowSize);
		
		Thread.sleep(2000);
		
		Dimension d=new Dimension(500, 500);
		
		driver.manage().window().setSize(d);
	}

}
