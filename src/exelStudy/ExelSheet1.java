package exelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream myFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		String value1 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Excel value1 is "+value1);
		
		double value2 = sheet.getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println("Excel value1 is "+value2);
	}

}
