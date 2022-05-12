package basic_progrm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println(allLinks.size());      //It will give no of links on webpage
			
			for(int i=0;i<=allLinks.size();i++)
			{
				//by using href attribute we can get URL of required link
				WebElement element = allLinks.get(i);
				String url = element.getAttribute("href");  //it will give exact link of "a" tag
				
				//create the object of URL class and pass url as argument
				URL u=new URL(url);
				
				//create object of HttpURLConnection class and type cast object of url.
				//this class is used to check the link is connecting on target page or not without clicking
				HttpURLConnection http=(HttpURLConnection)u.openConnection();
				//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				
				//Establish Connection
				http.connect();
				
				int resCode=http.getResponseCode();     //Return response code if it is Above 400 link=Broken
				
				if(resCode>=400)
				{
					System.out.println(u+" = is Broken Link");
				}
				else 
				{
					System.out.println(u+" = is Valid Link");
				}
						
			}
	}
}
