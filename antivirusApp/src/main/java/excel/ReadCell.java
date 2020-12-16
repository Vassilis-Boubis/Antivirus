package excel;

//reading value of a particular cell  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCell {
	
	public static void main(String[] args) {
		ReadCell rc = new ReadCell(); // object of the class
//reading the value of 2nd row and 2nd column 
		double vOutput = rc.ReadCellData(0, 3);
		System.out.println(vOutput); 
	}
//method defined for reading a cell  
	public double ReadCellData(int vRow, int vColumn) {
		double value = 0; // variable for storing the cell value
		Workbook wb = null; // initialize Workbook null
		try {
//reading data from a file in the form of bytes  
			FileInputStream fis = new FileInputStream(
					"Data1.xlsx");
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Sheet sheet = wb.getSheetAt(0); // getting the XSSFSheet object at given index
		Row row = sheet.getRow(vRow); // returns the logical row
		
		try {
		Cell cell = row.getCell(vColumn); // getting the cell representing the given column
		value = cell.getNumericCellValue(); // getting cell value
		} catch (NullPointerException e2) {
			return 0.0;
			
		}
		return value; // returns the cell value
	}
}