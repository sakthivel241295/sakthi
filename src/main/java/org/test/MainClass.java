package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends Baseclass {
	public static void main(String[] args) throws IOException, Exception {
		 launchChromeBrowser();
		 loadurl("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		 fill(username,getDataFromExcel(2,0));
		 Thread.sleep(2000);
		 WebElement pass = driver.findElement(By.id("pass"));
		 fill(pass, getDataFromExcel(3, 0));
		 WebElement btn = driver.findElement(By.id("loginbutton"));
		 btnclick(btn);

		 
		
	}

}
