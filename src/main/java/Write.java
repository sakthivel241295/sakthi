import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws IOException {
		File lc= new File("C:\\Users\\hp\\eclipse-sakthi\\Fb\\file\\Book1234.xlsx");
		FileInputStream li=new FileInputStream(lc);
		Workbook w=new XSSFWorkbook(li);
		Sheet createSheet = w.getSheet("sheet0");
		Row ri = createSheet.getRow(7);
		Cell di = ri.getCell(7);
		String dii = di.getStringCellValue();
		if(dii.equals("sakthi")) {
			di.setCellValue("velu");
		}
		FileOutputStream p=new FileOutputStream(lc);
w.write(p);
System.out.println("wrote successfully");
		
		
	}

}

