package selinium_study2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio3']"));
		 
		 Thread.sleep(3000);
		 
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 
		 j.executeScript("arguments[0].scrollIntoView[true]",radiobutton);
		 
		 Thread.sleep(3000);
		 
		 radiobutton.click();
		 
		 
	}

}
