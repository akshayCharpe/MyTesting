package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling {

	public static void main(String[] args) throws InterruptedException 
	{


        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement dropdownbox = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(dropdownbox);
		
		s.selectByVisibleText("Option2");
		
		Thread.sleep(3000);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		s.selectByValue("option3");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
