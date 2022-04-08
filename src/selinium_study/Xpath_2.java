package selinium_study;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Summer tshirt");
		
		d.findElement(By.xpath("//button[@type='submit']")).submit();
		
		Thread.sleep(4000);
	}

}
