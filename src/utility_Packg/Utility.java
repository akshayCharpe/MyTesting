package utility_Packg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{

	static org.apache.poi.ss.usermodel.Sheet MySheet;
	public static String readDataFrmExcelSheet(int rowIndex, int colmIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		String value = MySheet.getRow(rowIndex).getCell(colmIndex).getStringCellValue();
		return value;
	}
	
	public static void takeScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software_Testing\\AUTOMATION\\Automation\\Screenshots\\TC"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Screenshot taken for Tc"+TCID,true);
	}
}
