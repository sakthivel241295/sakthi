package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.exec.util.DebugUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-sakthi\\Fb\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		//get url
		

	}public static void loadurl(String e) {
		driver.get(e);
		
		

	}public static void fill(WebElement e,String value) {
		e.sendKeys(value);
		
		

	}
	public static void btnclick(WebElement e) {
		e.click();
		
		
		

	}public static String getDataFromExcel(int rowNo,int cellNo) throws IOException {
		
		String value ="null";
		File loc=new File("C:\\Users\\hp\\eclipse-sakthi\\Fb\\file\\Book1.xlsx");
		
		FileInputStream stream= new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		Row r = sheet.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		
		
		if(type==1) {
			 value = c.getStringCellValue();
		}
		else if(type==0) {
			
			
			if(DateUtil.isCellDateFormatted(c))   {
				
				  Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat si =new SimpleDateFormat();
				  value = si.format(dateCellValue);
				
			}
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			
			long l=(long)numericCellValue; 
			  value = String.valueOf(l);
			
		}
		return value;

		
		
		
		
		
		
		
		
		

	}

}
