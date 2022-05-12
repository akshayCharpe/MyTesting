package selinium_study2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> it = allWindows.iterator();
		String mainPage = it.next();
		String child1 = it.next();
		
		driver.switchTo().window(child1);
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String text = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]")).getText();
	
		driver.switchTo().window(mainPage);
	 WebElement inputField = driver.findElement(By.xpath("//input[@name='q']"));
	 inputField.sendKeys(text);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 inputField.click();
	}

}
