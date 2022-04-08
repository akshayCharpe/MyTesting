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

public class ZerodhaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{

		FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String userID1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String pass= sheet.getRow(0).getCell(1).getStringCellValue();
		String pin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d=new ChromeDriver();
			
			d.get("https://kite.zerodha.com/");
			
			Thread.sleep(2000);
			
			WebElement userField = d.findElement(By.id("userid"));
			WebElement password = d.findElement(By.id("password"));
			WebElement loginButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			userField.sendKeys(userID1);
			password.sendKeys(pass);
			loginButton.click();
			
            Thread.sleep(2000);
			
			WebElement pinButton = d.findElement(By.id("pin"));
			WebElement continueButton = d.findElement(By.xpath("//button[@type='submit']"));
			
			pinButton.sendKeys(pin);
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
			d.quit();
			
	}

}
