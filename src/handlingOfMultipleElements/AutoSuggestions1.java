package handlingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions1 {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone 13 pro Max");
			
			d.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(2000);
			
		//	String ratings = d.findElement(By.xpath("(//span[contains(text(),'Ratings')])[2]")).getText();
			
			String ratings1 = d.findElement(By.xpath("((//div[@class='gUuXy-'])[2]//span)[2]")).getText();
			
			System.out.println(ratings1);
	}

}
