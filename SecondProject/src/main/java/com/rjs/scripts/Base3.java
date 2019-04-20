package com.rjs.scripts;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base3 {
	WebDriver driver;
	@BeforeMethod
public void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:www.google.com/");
	
}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
