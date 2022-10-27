package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class eccelReandWR {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Windows\\workspace\\excelreadAndwright\\target\\sekar.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("IPL");
		
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell cell3 = row2.createCell(0);
		XSSFCell cell4 = row2.createCell(1);
				
		cell3.setCellValue("sekar");
		cell4.setCellValue(132);
		
		workbook.write(f1);
		workbook.close();
		
		FileInputStream f2 = new FileInputStream(f);
		XSSFSheet sheet1 = workbook.getSheet("IPL");
		

		String text1 = cell3.getStringCellValue();
		System.out.println(text1);
		
		double num1 = cell4.getNumericCellValue();
		System.out.println(num1);
		
		workbook.close();
		
		
		
	}
}
