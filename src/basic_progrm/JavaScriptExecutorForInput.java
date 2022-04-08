package basic_progrm;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorForInput {

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/#loggedout");
			
			JavascriptExecutor j = (JavascriptExecutor)driver;
			
			j.executeScript("document.getElementById('userid').value='Akshay'");
	}

}
