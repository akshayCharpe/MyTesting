package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException 
	{

		  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
				
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			WebElement loginButton = driver.findElement(By.name("login"));
			
			Actions act=new Actions(driver);
			
			act.contextClick(loginButton).perform();
			
			for(int i=1;i<=10;i++)
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
				
				Thread.sleep(300);
			}
			
			act.sendKeys(Keys.ENTER).perform();
	}

}
