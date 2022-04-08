package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_test {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.google.com/search?q=flipkart&oq=flp&aqs=chrome.2.69i57j46i199i291i512j0i10i131i433j0i457i512j0i402j0i512j0i10i433j0i512l2.2574j0j7&sourceid=chrome&ie=UTF-8");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[contains(@title,'Search for products,')]")).sendKeys("Headphones");
		
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		dr.quit();
	}

}
