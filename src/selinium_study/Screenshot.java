package selinium_study;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String randomvalue = RandomString.make(3);
			
			File dest=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\img"+randomvalue+".png");
			
			org.openqa.selenium.io.FileHandler.copy(src, dest);
			
	}

}
