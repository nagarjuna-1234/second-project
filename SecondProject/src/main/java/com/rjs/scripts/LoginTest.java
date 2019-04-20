package com.rjs.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void testLogin() {
		
		WebElement userName=driver.findElement(By.name("uid"));
		userName.sendKeys("mngr181783");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("EvupujE");
		WebElement submit=driver.findElement(By.name("btnLogin"));
		submit.click();
		
		String expectedTitle="Guru99 Bank Manager HomePage";
		String observedTitle = driver.getTitle();
		Assert.assertEquals(observedTitle, expectedTitle);
		
		
		
		
		
	}
	
	
	
	}


