package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGetData {
	
	private static XSSFWorkbook excelWorkbook;
	private static XSSFSheet excelSheet;
	
	public static void setExcelFile(String path, String sheetName) {
		
		try {
			FileInputStream fis = new FileInputStream(path);
			excelWorkbook = new XSSFWorkbook(fis);
			excelSheet = excelWorkbook.getSheet(sheetName);			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
	}
	
	public static String[][] getTestData(String tableName) {
		
		String[][] testData = null;
		
		// Get the data
		XSSFCell[] boundaryCells = findCells(tableName);
		XSSFCell startCell = boundaryCells[0];
		XSSFCell endCell = boundaryCells[1];
		
		int startRow = startCell.getRowIndex() + 1;
		int endRow = endCell.getRowIndex() - 1;
		int startCol = startCell.getColumnIndex() + 1;
		int endCol = endCell.getColumnIndex() - 1;
		
		testData = new String[endRow - startRow + 1][endCol - startCol + 1];
		
		for(int i=startRow; i<endRow + 1; i++) {
			for(int j=startCol; j<endCol +1; j++) {
				testData[i-startRow][j-startCol] = excelSheet.getRow(i).getCell(j).getStringCellValue();
			}
		}	
		
		// return the data
		return testData;
	}
	
	private static XSSFCell[] findCells(String tableName) {
		String position = "Found";
		XSSFCell[] cells = new XSSFCell[2];
		
		for(Row row : excelSheet) {
			for(Cell cell :  row) {
				if(tableName.equalsIgnoreCase(cell.getStringCellValue())) {
					if(position.equalsIgnoreCase("Found")) {
						cells[0] = (XSSFCell) cell;
						position = "AlreadyFound";
					} else {
						cells[1] = (XSSFCell) cell;
					}
				}
			}
		}
		return cells;
		
		
		
		
		
		
		
		
		
		
	}
	

}
