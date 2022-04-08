package selinium_study2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_popup {

	public static void main(String[] args) throws InterruptedException 
	{

       System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(3000);
		
		d.findElement(By.name("NewWindow")).click();
		
		Set<String> AllwindowsId = d.getWindowHandles();
		
		//System.out.println(AllwindowsId);
		
		Iterator<String>it=AllwindowsId.iterator();
		
		String mainpageId = it.next();
		String childpageId = it.next();
		
		d.switchTo().window(childpageId);
		
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Akshay");
		
		Thread.sleep(4000);
		
		d.switchTo().window(mainpageId);
		
		d.manage().window().maximize();
		
		d.findElement(By.name("NewTab")).click();
		
		Thread.sleep(5000);
		
		d.quit();
	}

}
