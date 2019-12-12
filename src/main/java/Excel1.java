import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {
	public static void main(String[] args) throws IOException {
	//	System.setProperty("webdriver.chrome.driver", "");
		//WebDriver driver=new ChromeDriver();
   File excel = new File("C:\\Users\\hp\\eclipse-sakthi\\Fb\\file\\Book1.xlsx");
   FileInputStream s=new FileInputStream(excel);
   Workbook w=new XSSFWorkbook(s);
  Sheet t = w.getSheet("sheet1");
 
 
 //iterate
 for (int i = 0; i < t.getPhysicalNumberOfRows(); i++) {
	Row r = t.getRow(i);
	for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
		Cell r1 = r.getCell(j);
		int k = r1.getCellType();
		//1==1
		if(k==1) {
			String stringCellValue = r1.getStringCellValue();
			System.out.println(stringCellValue);
		}
		//0==0
	else if (k==0) {
			//numeric and date//outer if
			//to check whether the cell is a date r numeric 
			if(DateUtil.isCellDateFormatted(r1)) {
			Date dateCellValue = r1.getDateCellValue();
			
			
	

			
			
			//converting date into string
			SimpleDateFormat si=new SimpleDateFormat("dd-MMM-yy");
			String format = si.format(dateCellValue);
			System.out.println(format);
			
			
		}
	}
			else {
				//numeric
				double numericCellValue = r1.getNumericCellValue();
				//converting double into long
				
				//typecasting
				long l=(long)numericCellValue;
				//converting long into string
				String v = String.valueOf(l);
				System.out.println(v);
			}
		}
	}
		
			}
		
		
	
		
		
	}
	

  
	



