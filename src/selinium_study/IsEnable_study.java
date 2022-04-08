package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_study {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/?gclid=Cj0KCQiA09eQBhCxARIsAAYRiykZfx8QvDYwJESVanHE4xw7mnVbIpKAe8KI1-KZuRN0LkOpUWK2XIMaAigoEALw_wcB");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(3000);
		
	//	System.out.println(driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled());
		
	 WebElement GetOtpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	 
	 boolean result = GetOtpbutton.isEnabled();
		
		//System.out.println("getOtp button status is "+result);
		
		if(result)
		{
			System.out.println("Button is enabled");
			
		}
		else
		{
		 driver.findElement(By.id("mobileNumber")).sendKeys("9765415609");
		 
		 Thread.sleep(3000);
		 
		 GetOtpbutton.click();
		 
		 System.out.println("click on Button");
			
		}
		
		
	}

}
