package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contain {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
//		d.get("https://vctcpune.com/selenium/practice.html#");
//		d.manage().window().maximize();
//		
//		d.findElement(By.xpath("//a[contains(text(),'Center')]")).click();  //contain with text()
//		
//		Thread.sleep(5000);
		
	//	d.get("https://vctcpune.com/selenium/practice.html#");
//		
 //    	d.manage().window().maximize();
//		
//		d.findElement(By.xpath("//a[contains(text(),'ME')]")).click();
//		
//		Thread.sleep(4000);
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
     	d.findElement(By.xpath("//input[contains(@placeholder,'or phone number')]")).sendKeys("Akshay");
     	
     	Thread.sleep(5000);
		
		
	}

}
