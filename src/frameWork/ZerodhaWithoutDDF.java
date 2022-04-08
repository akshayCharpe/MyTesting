package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://kite.zerodha.com/");
			
			Thread.sleep(2000);
			
			WebElement userField = d.findElement(By.id("userid"));
			WebElement password = d.findElement(By.id("password"));
			WebElement loginButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			userField.sendKeys("DAA677");
			password.sendKeys("Velocity@123");
			loginButton.click();
			
			Thread.sleep(2000);
			
			WebElement pinButton = d.findElement(By.id("pin"));
			WebElement continueButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			pinButton.sendKeys("866918");
			continueButton.click();
			
			Thread.sleep(2000);
			
			WebElement userID = d.findElement(By.xpath("//span[@class='user-id']"));
			String actualText = userID.getText();
			String expectedText = "DAA677";
			
			if(actualText.equals(expectedText))
			{
				System.out.println("Text is Matching, TC is Pass");
			}
			else {
				System.out.println("Text is not Matching, TC is Fail");
			}
			
			userID.click();
			Thread.sleep(2000);
			WebElement logoutButton = d.findElement(By.xpath("//a[@target='_self']"));
			logoutButton.click();
	}

}
