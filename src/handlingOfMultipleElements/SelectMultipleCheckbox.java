package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckbox {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@type='checkbox']"));
		
		List<WebElement> inputs = d.findElements(By.tagName("input"));
		
		for(WebElement w:checkboxes)
		{
			w.click();
			Thread.sleep(1000);
		}
		
		for(WebElement w:checkboxes)
		{
			w.click();
			Thread.sleep(1000);
		}
		
		for(WebElement w:inputs)
		{
			System.out.println(w.getText());
		}
		
		
	}

}
