package zerodhaUsingPOM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{

		FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
//		String value1 = sheet.getRow(0).getCell(0).getStringCellValue();
//		String value2 = sheet.getRow(0).getCell(1).getStringCellValue();
//		String value3 = sheet.getRow(0).getCell(2).getStringCellValue();
//		String value4 = sheet.getRow(0).getCell(3).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("start-maximized");
		  WebDriver driver=new ChromeDriver(opt);
			
			driver.get("https://kite.zerodha.com/");
			
			Thread.sleep(1000);
			
			kiteLoginPage k1=new kiteLoginPage(driver);
			k1.sendUserId(sheet.getRow(0).getCell(0).getStringCellValue());
			k1.sendPassword(sheet.getRow(0).getCell(1).getStringCellValue());
			k1.clickLoginButton();
			
			Thread.sleep(1000);
			KitePinPage k2=new KitePinPage(driver);
			k2.sendPin(sheet.getRow(0).getCell(2).getStringCellValue());
			k2.clickContinueButton();
			
			Thread.sleep(1000);
			KiteHomePage k3=new KiteHomePage(driver);
			k3.validateUserId(sheet.getRow(0).getCell(3).getStringCellValue());
			k3.clickOnLogoutButton();
			
			driver.quit();
			
			
	}

}
