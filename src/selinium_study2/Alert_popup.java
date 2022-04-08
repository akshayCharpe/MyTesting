package selinium_study2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demoqa.com/alerts");
		
		//d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement clickmebutton3 = d.findElement(By.id("confirmButton"));
		
		clickmebutton3.click();
		
		Thread.sleep(2000);
		
		d.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement clickbutton2 = d.findElement(By.id("timerAlertButton"));
		
		clickbutton2.click();
		
		Thread.sleep(7000);
		
		d.switchTo().alert().accept();
		
		WebElement clickbutton4 = d.findElement(By.id("promtButton"));
		
		clickbutton4.click();
		
		Alert alert = d.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.sendKeys("Akshay");
		
		Thread.sleep(2000);
		
		alert.accept();
		
		d.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		
	}
}

