package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream MyFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
			
			int TotalRows = sheet.getLastRowNum();
			int TotalColmn = sheet.getRow(0).getLastCellNum()-1;
			
			for(int i=0;i<=TotalRows;i++)
			{
				for(int j=0;j<=TotalColmn;j++)
				{
					CellType type = sheet.getRow(i).getCell(j).getCellType();
					if(type==CellType.STRING)
					{
						String value = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+" ");
					}
					else if (type==CellType.NUMERIC) 
					{
						double value = sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(value+" ");
					}
					else if (type==CellType.BOOLEAN) 
					{
						boolean value = sheet.getRow(i).getCell(j).getBooleanCellValue();
						System.out.print(value+" ");
					}
					else if(type==CellType.BLANK)
					{
						
						sheet.getRow(i).getCell(j).setBlank();
					}
				}
				System.out.println();
			}
	}

}
