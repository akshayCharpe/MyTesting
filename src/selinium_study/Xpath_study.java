package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xpath_study {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458755421%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D7976623756526195997%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9299869%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DCj0KCQiAu62QBhC7ARIsALXijXQmILQHTjfnM-G8Hu2GtfWF6TEHzb2IlgRrV9N5ZLRwiuex7tVkbJ4aAoPLEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Akshay@1234");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
