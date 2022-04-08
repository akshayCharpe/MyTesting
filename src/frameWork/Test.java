package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{

		FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String userId = sheet.getRow(0).getCell(0).getStringCellValue();
		String pass = sheet.getRow(0).getCell(1).getStringCellValue();
		String pin = sheet.getRow(0).getCell(2).getStringCellValue();
		String name = sheet.getRow(0).getCell(3).getStringCellValue();
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d=new ChromeDriver();
			
			d.get("https://kite.zerodha.com/");
			d.manage().window().maximize();
			
			WebElement userField = d.findElement(By.id("userid"));
			WebElement password = d.findElement(By.id("password"));
			WebElement loginButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			userField.sendKeys(userId);
			password.sendKeys(pass);
			loginButton.click();
			
            Thread.sleep(2000);
            
            WebElement pinButton = d.findElement(By.id("pin"));
			WebElement continueButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			pinButton.sendKeys(pin);
			continueButton.click();
			
			Thread.sleep(2000);
			
			WebElement username = d.findElement(By.xpath("//span[@class='nickname']"));
			String actualText = username.getText();
			System.out.println(actualText);
			
			if(actualText.equals(name))
			{
				System.out.println("TC is Pass");
			}
			else
			{
				System.out.println("TC is Fail");
			}
			
			d.quit();
			
	}

}
