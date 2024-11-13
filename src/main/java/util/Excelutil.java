package util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelutil {
	public static String getCellValue(String x1,String sheet,int r,int c) {
		 try {
			 FileInputStream fi = new FileInputStream(x1);
			 
			 XSSFWorkbook wb = new XSSFWorkbook(fi);
			 XSSFCell cell = wb.getSheet(sheet).getRow(r).getCell(c);
			 
			 
			 if(cell.getCellType()==CellType.STRING) {
				 return cell.getStringCellValue();
			 }
			 else
			 {
				 return cell.getRawValue();
			 }
		 }
		 catch(Exception e) {
			 return "";
		 }
		}


		public static int getRowCount(String x1, String sheet) {
			try {
				//file f= new file(x1);
				FileInputStream fi = new FileInputStream(x1);
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				return wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e) {
				return 0;
				
		 }
		}
		public static int getCellcount(String x1, String sheet,int r) {
			try {
				//File f=new file(x1)
				FileInputStream fi = new FileInputStream(x1);
				XSSFWorkbook wb = new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getRow(r).getLastCellNum();
			
			}
		catch(Exception e) {
			return 0;
		}

}
}
