package exelStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();

FileInputStream myFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
//		CellType Value1 = sheet.getRow(0).getCell(0).getCellType(); 
//		CellType Value2 = sheet.getRow(0).getCell(1).getCellType();
//		CellType Value3 = sheet.getRow(1).getCell(0).getCellType();
//		CellType Value4 = sheet.getRow(1).getCell(1).getCellType();
//		
//		System.out.println(Value1);
//		System.out.println(Value2);
//		System.out.println(Value3);
//		System.out.println(Value4);
		
		int Totalrows = sheet.getLastRowNum();
		
		short col = sheet.getRow(0).getLastCellNum();
		int Totalcol = col-1;
		
		String Test1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String Test2 = sheet.getRow(0).getCell(1).getStringCellValue();	
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Test1);
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(Test2);
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	    Thread.sleep(2000);
	    
	  
	    
		
		
		
	}

}
