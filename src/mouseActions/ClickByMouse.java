package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickByMouse {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option3']"));
		
		Actions ac= new Actions(driver);
		
		ac.click(checkbox).perform();
		
		ac.moveToElement(checkbox).click().build().perform();
	}

}
