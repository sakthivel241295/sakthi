package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-sakthi\\Fb\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	@AfterClass 
	public static void quitBrwser() {
		driver.quit();
		
		

	}
	@Test
	public  void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sakthi");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123113");
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		
		
		
		
		
		

	}
	@Test
	public void tc2() {
		driver.get("https://www.facebook.com/");
		//validating the attributes for email text box
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sakthi");
		Assert.assertEquals("verify url", "sakthi", user.getAttribute("value"));
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12131438");
		Assert.assertEquals("verify it", "12131438",pass.getAttribute("value") );
		WebElement btn = driver.findElement(By.id("loginbutton"));
		btn.click();
		
		
		
		
		
	
		

	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
		
		

	}@Before
	
	public void startTime() {
		Date d=new Date();
		System.out.println(d);

	}
	

}
