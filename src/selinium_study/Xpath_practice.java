package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		

		WebElement username = d.findElement(By.id("email"));
		
		username.sendKeys("akshay.charpe@yahoo.in");
		
		WebElement password = d.findElement(By.name("pass"));
		
		password.sendKeys("8149696419");
		
		Thread.sleep(3000);
		
		password.clear();
		
		Thread.sleep(3000);
		
		password.sendKeys("akshay@2504");
		
		d.findElement(By.tagName("button")).click();

}
}
