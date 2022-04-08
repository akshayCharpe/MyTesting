package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_listbox {

	public static void main(String[] args) throws InterruptedException 
	{


        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.name("cars"));
		
		Select s=new Select(textbox);
		
		boolean result = s.isMultiple();
		
		if(result)
		{
		
		s.selectByVisibleText("Opel");
		
		Thread.sleep(3000);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		s.selectByValue("audi");
		
		Thread.sleep(4000);
		
		s.deselectByVisibleText("Opel");
		
		Thread.sleep(3000);
		
		s.deselectByIndex(1);
		
		Thread.sleep(3000);
		
		s.deselectByValue("audi");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		}
	}

}
