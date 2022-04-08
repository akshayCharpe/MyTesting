package practiceAll;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Child_popup {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//WebElement optionbutton = driver.findElement(By.id("checkBoxOption2"));
		
		WebElement ref = driver.findElement(By.name("enter-name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView[true];",ref);
		
		Thread.sleep(2000);
		
		ref.sendKeys("Akshay");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String ran = RandomString.make(2);
		
		File dest=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\img"+ran+".png");
		
		FileHandler.copy(src, dest);
		
	}
}
