package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://vctcpune.com/selenium/practice.html");
			
			List<WebElement> headers = d.findElements(By.xpath("//table[@id='product']//th"));
			
			for(WebElement w:headers)
			{
				System.out.print(w.getText()+" || ");
			}
			
			System.out.println();
//			List<WebElement> singlerow = d.findElements(By.xpath("(//table[@id='product']//tr)[2]"));
//			
//			for(WebElement w:singlerow)
//			{
//				System.out.println(w.getText()+" || ");
//			}
			
			List<WebElement> rows = d.findElements(By.xpath("(//table[@id='product']//tr)"));
			
			for(WebElement w:rows)
			{
				System.out.println(w.getText());
			}
	}

}
