package io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {

	
	public void ReadExcelExample() 
	{
		try {
			String strPath =  System.getProperty("user.dir");
			
			FileInputStream file = new FileInputStream(new File(strPath + "\\files\\Read Data.xlsx"));
			
			//Get the workbook instance for XLS file
			XSSFWorkbook book = new XSSFWorkbook(file);
			
			//Get first sheet from the workbook
			XSSFSheet sheet = book.getSheetAt(0);
			System.out.println(sheet);
			
			//Get sheet name
			System.out.println(book.getSheetName(0));
		
			//Get iterator to all the rows in current sheet 
			Iterator<Row> rowIterator = sheet.iterator();
			
			//Get iterator to all cells of current row 
			Iterator<Cell> cellIterator = ((Row) rowIterator).cellIterator();
			
					
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ReadExcelTest read = new ReadExcelTest();
		read.ReadExcelExample();

	}

}
