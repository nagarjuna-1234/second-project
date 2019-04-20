package com.rjs.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPaytm  extends BaseTest{
	@Test

	public void test() {
		WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("paytm login");
	WebElement enter=driver.findElement(By.xpath("//input[@name='btnK'or@aria-label='Google Search']"));
	enter.click();
	
 
}
}