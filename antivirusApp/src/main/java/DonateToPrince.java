public class DonateToPrince {


	// with these methods you can access the data from an Excel Sheet
	// you need to import the .jar files


	public double ReadCellDataN(int vRow, int vColumn) throws IOException { // Numerical
		double value = 0; // variable for storing the cell value
		FileInputStream fis = new FileInputStream(
				new File("/Users/dimitrispapakyriakopoylos/Desktop/COVID-19 data.xlsx")); //set the file path so you can access the .xlsx file in Maven
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // indicates which sheet you access (in this case the first one
		Row row = sheet.getRow(vRow); // returns the logical row
		Cell cell = row.getCell(vColumn); // getting the cell representing the given column
		value = cell.getNumericCellValue(); // getting cell value
		wb.close();
		return value; // returns the cell value
	}

	public String ReadCellDataS(int vRow, int vColumn) throws IOException { // String
		String value = null; // variable for storing the cell value
		FileInputStream fis = new FileInputStream(
				new File("/Users/dimitrispapakyriakopoylos/Desktop/COVID-19 data.xlsx")); // same as above comment for file path
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(vRow); // returns the logical row
		Cell cell = row.getCell(vColumn); // getting the cell representing the given column
		value = cell.getStringCellValue(); // getting cell value
		wb.close();
		return value; // returns the cell value
	}
