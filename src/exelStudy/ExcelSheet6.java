package exelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;


public class ExcelSheet6 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream MyFile= new FileInputStream("D:\\Software_Testing\\HandledExcel.xlsx");
		org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		int TotalRows = mySheet.getLastRowNum();
		int TotalColmn = mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=TotalRows;i++)
		{
			for(int j=0;j<=TotalColmn;j++)
			{
				org.apache.poi.ss.usermodel.CellType type = mySheet.getRow(i).getCell(j).getCellType();
				if(type==org.apache.poi.ss.usermodel.CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				else if(type==org.apache.poi.ss.usermodel.CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(type==org.apache.poi.ss.usermodel.CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
		}
		
	

	}
	}


