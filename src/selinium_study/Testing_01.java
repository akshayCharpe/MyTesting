package selinium_study;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Testing_01 {

	

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(3000);
		
		d.findElement(By.id("opentab")).click();
		
		Thread.sleep(3000);
		
		Set<String> AllIds = d.getWindowHandles();
		
		Iterator<String>rep=AllIds.iterator();  // pointing to -1
		String mainId = rep.next();             // pointing to  0 location
		String childId = rep.next();            // pointing to  1 location
		
		d.switchTo().window(childId);
		
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement velImg = d.findElement(By.xpath("//img[@src='https://vctcpune.com/wp-content/uploads/2020/05/velocity-log-2.jpg']"));
		
		velImg.click();
		
		d.switchTo().window(mainId);
		
		
	}

}
