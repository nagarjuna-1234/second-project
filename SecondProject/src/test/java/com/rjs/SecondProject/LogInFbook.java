package com.rjs.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInFbook extends BaseTest2 {
	@Test
public void logintest() {
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("9581484814");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("8142061866");
		//pwd.sendKeys("sf");
		WebElement submit =driver.findElement(By.xpath("//input[@value='Log In']"));
		submit.click();
		
	/*	WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println("home option:"+home.isDisplayed());
		Assert.assertTrue(home.isDisplayed());
		//logout
		//WebElement logout=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		//logout.click();
		//WebElement submitt=driver.findElement(By.xpath("(//span[.='Log Out'])[2]"));
		//submitt.click();
		 
		 */
		
		String expectedTitle="Log in to Facebook | Facebook";
		String observedTitle=driver.getTitle();
		Assert.assertEquals(observedTitle, expectedTitle);
}
}
