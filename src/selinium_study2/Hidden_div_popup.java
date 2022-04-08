package selinium_study2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_popup {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement crossbutton = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		crossbutton.click();
		
		Thread.sleep(2000);
		
		WebElement cartbutton = d.findElement(By.xpath("//span[text()='Cart']"));
		
		cartbutton.click();
		
		Thread.sleep(2000);
	}

}
