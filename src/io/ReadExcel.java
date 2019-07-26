package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void ReadExcelData(String strFilePath, String strSheetName) throws IOException
	{
		File excelFile = new File(strFilePath);
		FileInputStream fis = new FileInputStream(excelFile);

		// we create an XSSF Workbook object for our XLSX Excel File
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println("No of Sheets : " + workbook.getNumberOfSheets());
		System.out.println(workbook.getSheetName(1));
		// wXSSFSheete get first sheet
		XSSFSheet sheet = workbook.getSheet(strSheetName);
		System.out.println(sheet.getSheetName()); //Sheet name
		System.out.println("Last row found in sheet : " + strSheetName + " is " + sheet.getLastRowNum());

		// we iterate on rows
		Iterator<Row> rowIt = sheet.iterator();

		while(rowIt.hasNext()) {
			Row row = rowIt.next();

			// iterate on cells for the current row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.print(cell.toString() + ">");
			}

			System.out.println();
		}

		workbook.close();
		fis.close();
	}


	public static void main(String[] args) throws IOException {

		ReadExcel read = new ReadExcel();
		String strFilepath = System.getProperty("user.dir");
		read.ReadExcelData(strFilepath + "\\files\\Data.xlsx", "EmployeeDetails");

	}

}
