package kitePOMTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class kiteTestUsingTestNGclass 
{
	
	kiteLoginPage login;
	kitePinPage pin;
	kiteHomePage home;
	WebDriver driver;
	Sheet MySheet;
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(String browserName) throws EncryptedDocumentException, IOException
	{
		Reporter.log("LaunchingBrowser",true);
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	    } 
		  else if(browserName.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "C:\\Software Testing\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				
			   driver=new FirefoxDriver();
			   
		  }
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.manage().window().maximize();
			Reporter.log("Browser Launched Sucessfully",true);
			
			FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
			MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
			login=new kiteLoginPage(driver);
			pin=new kitePinPage(driver);
			home=new kiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String USERID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		Reporter.log("Entering UserID And Password",true);
		login.enterUserId(USERID);
		login.enterPassword(PWD);
		login.clickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Entering Pin",true);
		pin.enterPin(PIN);
		pin.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Login Sucessfully",true);
	}
	
  @Test
  public void validateUserId() 
  {
	  String actualUserId = home.getActualUserID();
	  String expectedUserId = MySheet.getRow(0).getCell(3).getStringCellValue();
	  Assert.assertEquals(actualUserId, expectedUserId,"Actual And Expected Are Not Match.");
	  Reporter.log("UserID is Match,TC is Pass.",true);
	  
  }
  
  @AfterMethod
  public void logOutToKite() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("logOut Sucessfully",true);
  }
  
  @AfterClass
  public void closingBrowser()
  {
	 driver.quit(); 
  }
}
