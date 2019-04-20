 package com.rjs.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
	@Test
	public void logoutTest() {
	
	WebElement userName=driver.findElement(By.name("uid"));
	userName.sendKeys("mngr181783");
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.sendKeys("EvupujE");
	WebElement submit=driver.findElement(By.name("btnLogin"));
	submit.click();
	//a[text()='Log out'] 
	
	WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
	logout.click();
	
	String expectedTitlelogout="Guru99 Bank Manager HomePage";
	String observedTitlelogout = driver.getTitle();
	Assert.assertEquals(observedTitlelogout, expectedTitlelogout);
	

}
}
