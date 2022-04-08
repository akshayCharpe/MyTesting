package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{

       System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	//	driver.manage().window().maximize();
		
		 WebElement radio = driver.findElement(By.xpath("(//input[(@name='radio')])[3]"));
		 
		 Thread.sleep(3000);
		
		boolean radiocheckbox = radio.isSelected();
	
	//	System.out.println(radiocheckbox);
		
		if(radiocheckbox)
	    {
			System.out.println("checkbox is already click");
		}
		else
		{
			System.out.println("checkbox is not click, click on checkbox");
			radio.click();
			
			boolean radiocheckbox2 = radio.isSelected();
			
			System.out.println("radio checkbox selected,status is "+radiocheckbox2);
			
			
		}
		
		
		
		
		
	}

}
