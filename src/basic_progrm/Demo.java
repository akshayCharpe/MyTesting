package basic_progrm;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement list1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		
		Thread.sleep(2000);
		
		Select s=new Select(list1);
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement list3 = driver.findElement(By.xpath(("(//select[@class='col-lg-3'])[3]")));
		
		Thread.sleep(2000);
		
		Select s1=new Select(list3);
		
		System.out.println(s1.isMultiple());
		
	}

}
