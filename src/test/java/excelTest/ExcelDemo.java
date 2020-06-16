package excelTest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilities.Constants;

public class ExcelDemo {
	
	

	public static void main(String[] args) {
		XSSFWorkbook excelWBook;
		XSSFSheet excelSheet;
		XSSFCell cell;
		
		
		String sheetName = "Test1";
		
	
		try {
			FileInputStream fis = new FileInputStream(Constants.excelPath);
			excelWBook = new XSSFWorkbook(fis);
			excelSheet = excelWBook.getSheet(sheetName);
			
			cell = excelSheet.getRow(0).getCell(0);
			String cellData = cell.getStringCellValue();
			System.out.println(cellData);			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
