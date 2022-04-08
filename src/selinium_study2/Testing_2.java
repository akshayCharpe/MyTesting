package selinium_study2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_2 {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://demoqa.com/alerts");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
	
		
		WebElement promtbutton = driver.findElement(By.id("promtButton"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView[true]",promtbutton);
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		
		promtbutton.click();
		
		
	}

}
