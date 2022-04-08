package selinium_study2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(20,-100)");
	}

}
