package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserId();
		login.sendPassword();
		login.clickLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage HomePage=new KiteHomePage(driver);
		HomePage.ValidateUserID();
		HomePage.clickOnLogoutButton();
		
		Thread.sleep(1000);
		driver.quit();
	}

}
