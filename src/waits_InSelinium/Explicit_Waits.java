package waits_InSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waits {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/?gclid=CjwKCAjw_tWRBhAwEiwALxFPoRaXiQhhAv7B37PlRjVGi_2pWsd9pe0zWmaa9aNJ3Gs07JIkugdAHhoCMxMQAvD_BwE");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobNo.sendKeys("9999999999");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(getOtpButton));
		getOtpButton.click();
		
		driver.quit();
		
		
		}

}
