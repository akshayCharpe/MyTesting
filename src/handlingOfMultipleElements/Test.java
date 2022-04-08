package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
	//	List<WebElement> links = d.findElements(By.tagName("a"));
		
	    WebElement searchbox = d.findElement(By.xpath("//input[@role='combobox']"));
	    
	    Thread.sleep(2000);
	    
		searchbox.sendKeys("honda amaze");
		Thread.sleep(2000);
		
		List<WebElement> suggestionlist = d.findElements(By.xpath("//ul//li"));
		
		 Thread.sleep(2000);
		
		for(WebElement w:suggestionlist)
		{
			String s=w.getText();
			if(s.equals("honda amaze"))
			{
				w.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Images']")).click();
		
//		Thread.sleep(2000);
//		
//		d.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[26]")).click();
	}

}
