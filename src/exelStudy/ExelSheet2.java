package exelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Dynamic coding

		FileInputStream myFile=new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int TotalRowsCount = sheet.getLastRowNum();
		System.out.println(TotalRowsCount);
		
		short colmncount = sheet.getRow(0).getLastCellNum();
		System.out.println(colmncount);
		int Totalcolmncount = colmncount-1;
		
		
		for(int i=0;i<=TotalRowsCount;i++)
		{
			for(int j=0;j<=Totalcolmncount;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}

}
