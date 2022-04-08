package selinium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium_1st {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("");
		
		driver.manage().window().maximize();
		
		
		
		driver.navigate().to("https://meet.google.com/cnm-mfvt-hiz");
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		
		String Url=driver.getCurrentUrl();
		System.out.println("Url is "+Url);
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		//driver.manage().window().minimize();
		
	
		
	
		
	}

}
