package com.rjs.SecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.get("http://demo.guru99.com/V4/");
	}
	@AfterMethod
	public void tearDown() {
	driver.close();
	}
}
