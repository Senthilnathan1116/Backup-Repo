package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String args[]) throws Exception{
		XSSFWorkbook wb = new XSSFWorkbook("./Data/Test Data.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		XSSFRow row;
		for(int i=0;i<ws.getLastRowNum();i++) {
			row = ws.getRow(i);
			XSSFCell cell;
			for(int j=0;j<row.getLastCellNum();j++) {
				cell = row.getCell(j);
				System.out.print(cell.getStringCellValue().toString()+ "  ");
			}
			System.out.println();
		}
	}
}