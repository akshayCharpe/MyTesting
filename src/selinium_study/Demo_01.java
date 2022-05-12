package selinium_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_01 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("incognito");
		opt.addArguments("disable-popup-blocking");
		 WebDriver driver=new ChromeDriver(opt);
		 
		 driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 
		 driver.manage().window().maximize();
		 
		// WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		 
		 Actions ac=new Actions(driver);
		 
//		 WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
//		 
//		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		 
//		 ac.moveToElement(rightClickButton).contextClick().build().perform();
//          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//          
         driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
         
         driver.findElement(By.xpath("//span[text()='Close']")).click();
//		 WebElement clickQuit = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[@class='context-menu-item context-menu-icon context-menu-icon-quit context-menu-visible']"));
//		 
//	 
//		 for(int i=1;i<=6;i++)
//		 {
//     	 ac.keyDown(Keys.ARROW_DOWN);
//		 }
//		 ac.click().perform();
//		// driver.close();
		 
	}

}
