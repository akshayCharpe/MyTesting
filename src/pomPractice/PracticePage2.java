package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticePage2 {

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		ChromeOptions version = opt.addArguments("version");
		WebDriver driver=new ChromeDriver(opt);
		
		System.out.println(version);
		
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		PracticePage p=new PracticePage(driver);
		p.listBoxValue();
		
	}

}
