package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
public String readStringData(String sheetName,int row,int col) 
		throws Exception
{
	File f=new File(Constants.FILEPATH);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetName).getRow(row)
			.getCell(col).getStringCellValue();
	return data;
}
public double readNumericData(String sheetName,int row,int col)
		throws Exception
{
	File f=new File(Constants.FILEPATH);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=WorkbookFactory.create(fis);
	double data=wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	return data;
}
}
