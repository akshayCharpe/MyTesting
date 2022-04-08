package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_2 {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			List<WebElement> column= d.findElements(By.xpath("//table[@class='table-display']//tr[1]//th"));
			
			int totalcolumns =column.size();
			
			System.out.println(totalcolumns);
			
			List<WebElement> rows = d.findElements(By.xpath("//table[@class='table-display']//tr"));
			
			int totalrows=rows.size();
			
			System.out.println(totalrows);
			
			for(int i=1;i<=totalrows;i++)
			{
				for (int j=1;j<=totalcolumns;j++)
				{
					if(i==1)
					{
					     String header = d.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]//th["+j+"]")).getText();
						System.out.print(header+" ");
					}
					else {
						String data = d.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]//td["+j+"]")).getText();
						System.out.print(data+" ");
					}
				}
				
				System.out.println();
			}
			
	}

}
