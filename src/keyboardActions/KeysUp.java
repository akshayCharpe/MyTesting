package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUp {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement createAccButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		Actions ac=new Actions(driver);
		
	//	ac.click(createAccButton).perform();    //By Using Mouse
		
		ac.moveToElement(createAccButton).click().build().perform();  //By Using Mouse
		
		Thread.sleep(3000);
		
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		
		ac.click(firstNameField).keyDown(Keys.SHIFT).sendKeys("Akshay").build().perform(); //By Using KeyBoard
		
		Thread.sleep(3000);
		
		WebElement dayButton = driver.findElement(By.id("day"));
		
		ac.click(dayButton).perform();            // By Using Mouse
		
		for(int i=1;i<=21;i++)
		{
		ac.keyDown(Keys.ARROW_DOWN).perform();   //By Using KeyBoard
	
		Thread.sleep(300);
		}
		
//		for(int j=1;j<=21;j++)
//		{
//			ac.sendKeys(Keys.ARROW_UP).perform(); //By Using KeyBoard
//			Thread.sleep(200);
//		}
		
		ac.sendKeys(Keys.ENTER).perform();     //By Using KeyBoard


	}

}
