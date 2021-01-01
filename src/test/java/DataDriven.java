import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("E:\\qa\\Datademo.xlsx"); 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println(sheetCount);
		for(int i=0;i<sheetCount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();// sheet is a collection of row
				Row firstrow =rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();// row is a collection of data
				
				while(ce.hasNext())
				{
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
				{
					
				}
			}
		}
	}

	}

	}


