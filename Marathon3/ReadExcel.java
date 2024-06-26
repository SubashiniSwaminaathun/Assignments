package Marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData() throws IOException {
		
	
	XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateOppurtunity.xlsx");
	
	XSSFSheet sh=wb.getSheet("Sheet1");
	
	int row = sh.getLastRowNum();
	//System.out.println(row);
	
	short col = sh.getRow(0).getLastCellNum();
	//System.out.println(col);
	
	String [][] data=new String[row][col];
			
	for (int i = 1; i <=row; i++) {
		XSSFRow r = sh.getRow(i);
		for(int j=0;j<col;j++) {
			XSSFCell c = r.getCell(j);
			String val = c.getStringCellValue();
			data[i-1][j]=val;
		}
		
		
	}
	return data;
	
	}

}
