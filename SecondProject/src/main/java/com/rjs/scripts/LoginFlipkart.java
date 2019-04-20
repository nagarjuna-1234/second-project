package com.rjs.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginFlipkart extends BaseTest{
	@Test
	public void testlogin() {
		WebElement username=driver.findElement(By.name("q"));
		username.sendKeys("Flipkart");
		WebElement enter=driver.findElement(By.xpath("//input[@name='btnK']"));
		enter.click();
		WebElement pass=driver.findElement(By.xpath("//a[text()='Sign in']"));
		pass.click();
		
		
	}

}
