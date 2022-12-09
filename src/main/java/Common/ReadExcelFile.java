package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception   {
		
       File file = new File(C:\Users\welcome\eclipse-workspace-selenium\selenium-automation\src\main\resources\Excel file.xlsx);
       
       FileInputStream fis = new FileInputStream(file);
      
       XSSFWorkbook excelWBook = new XSSFWorkbook(fis);
       
       XSSFSheet sheet = excelWBook.getSheet("Sheet1");
       
       XSSFRow row = sheet.getRow(1);
       
       XSSFCell cell = row.getCell(1);
       
       System.out.println(cell.getStringCellValue());
	}

}
