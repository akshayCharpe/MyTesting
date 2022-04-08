package handlingOfMultipleElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToatalLinksInPage {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> totalLinks = d.findElements(By.tagName("a"));
		
		System.out.println(totalLinks.size());
		
		Iterator<WebElement> it = totalLinks.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("==================");
		
		for(WebElement w:totalLinks)
		{
			System.out.println(w.getText());
		}
	}

}
