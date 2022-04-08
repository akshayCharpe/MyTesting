package selinium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_use {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		//d.manage().window().maximize();
		
	//	System.out.println(d.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
		
		WebElement webeleme = d.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people')]"));
		
		String Actualtext = webeleme.getText();
		
		System.out.println(Actualtext);
		
//		String Expectedtext = "Facebook helps you connect and the people in your life.";
		
//		if(Actualtext.equals(Expectedtext))
//		{
//			System.out.println("TC is passed.");
//		}
//		else
//		{
//			System.out.println("TC is fail.");
//		}
		
	}

}
