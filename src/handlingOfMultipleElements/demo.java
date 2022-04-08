package handlingOfMultipleElements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		FileInputStream myFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		
		WorkbookFactory.create(myFile).getSheet(null)
		
			
	}

}
