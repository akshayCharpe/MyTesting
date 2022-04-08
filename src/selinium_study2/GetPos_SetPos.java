package selinium_study2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPos_SetPos {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		Point windowposition = driver.manage().window().getPosition();
		
		System.out.println(windowposition);
		
		Thread.sleep(2000);
		
		Point p=new Point(100, 200);
		
		driver.manage().window().setPosition(p);
	}

}
