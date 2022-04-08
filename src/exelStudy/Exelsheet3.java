package exelStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelsheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

        FileInputStream myFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		
		Workbook value = WorkbookFactory.create(myFile);
		
		Sheet sheet = value.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		
		Cell colmn = row.getCell(0);
		
		String vlaue2 = colmn.getStringCellValue();
		
	}

}
