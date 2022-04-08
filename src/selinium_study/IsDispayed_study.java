package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispayed_study {

	public static void main(String[] args) throws InterruptedException 
	{


        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		boolean result = textbox.isDisplayed();
		
		System.out.println("Textbox is displayed, status is "+result);
		
		System.out.println("click on hide button");
		
		Thread.sleep(3000);
		
		WebElement showbutton = driver.findElement(By.id("hide-textbox"));
		
		showbutton.click();
		
		boolean result1 = textbox.isDisplayed();
		
		System.out.println("Textbox is displayed, status is "+result1);
	}

}
