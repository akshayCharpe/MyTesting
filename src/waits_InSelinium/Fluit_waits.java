package waits_InSelinium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluit_waits {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/?gclid=CjwKCAjw_tWRBhAwEiwALxFPoRaXiQhhAv7B37PlRjVGi_2pWsd9pe0zWmaa9aNJ3Gs07JIkugdAHhoCMxMQAvD_BwE");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobNo.sendKeys("9999999999");
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(2000))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		getOtpButton.click();
	}

}
