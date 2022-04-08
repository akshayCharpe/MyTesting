package selinium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Iframe_study {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		  System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.manage().window().maximize();
			
			File srcshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String value = RandomString.make(3);
			
			File Dest1=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\pic"+value+".png");
			
			FileHandler.copy(srcshot1, Dest1);
			
			
			Thread.sleep(2000);
			
			driver.switchTo().frame("courses-iframe");
			
			driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();	
			
			Thread.sleep(4000);
			
			File srcshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
			File Dest=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\pic"+value+".png");
			
			FileHandler.copy(srcshot, Dest);
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			
			WebElement textf = driver.findElement(By.xpath("//input[@list='mah-district']"));
			
			textf.sendKeys("Amravati");
			
			}

}
