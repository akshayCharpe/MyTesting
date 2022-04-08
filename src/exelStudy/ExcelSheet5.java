package exelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet5 {

	public static void main(String[] args) throws InterruptedException, Exception 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			WebElement Field1 = driver.findElement(By.xpath("//input[@id='email']"));
			WebElement Field2 = driver.findElement(By.xpath("//input[@id='pass']"));
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			
			FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
			Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
			
			CellType Type1 = sheet.getRow(0).getCell(0).getCellType();
			CellType Type2 = sheet.getRow(0).getCell(1).getCellType();
			
//			System.out.println(value1);
//			System.out.println(value2);
			
			String value1 = sheet.getRow(0).getCell(0).getStringCellValue();
			String value2 = sheet.getRow(0).getCell(1).getStringCellValue();
			
			int TotalRows = sheet.getLastRowNum();
			short TotalColmn = sheet.getRow(0).getLastCellNum();
			Thread.sleep(2000);
			
			for(int i=0;i<=TotalRows;i++)
			{
				for(int j=0;j<=TotalColmn;j++)
				{
					if(j==0)
					{
						Field1.sendKeys(value1);
						Thread.sleep(3000);
					}
					else
					{
						Field2.sendKeys(value2);
						Thread.sleep(2000);
						login.click();
						break;
					}
				}
			}
	}

}
