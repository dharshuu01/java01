package org.tesngg;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tng11  extends BaseClass {
	@BeforeClass
	private void bfrcls() {
		browserlaunch();
urllaunch("https://www.facebook.com/");
	}
	@BeforeMethod
	
	private void bfrmtd() {
		Date d =new Date();
		System.out.println(d);}
		@AfterMethod
		private void aftmtd() {
			Date d =new Date();
			System.out.println(d);}
		@Test(groups="smoke")
	private void Tc1() {
			WebElement fe = driver.findElement(By.id("email"));
fe.sendKeys("priya@gmailcom");
	}
		
		@Test(groups="regression")
		private void Tc2() {
			WebElement de = driver.findElement(By.id("pass"));
			de.sendKeys("1234");

		}
		@Test(groups="sanity")
		private void Tc3() {
			WebElement me = driver.findElement(By.xpath("//button[@name='login']"));
			me.click();

		}
		
		
		
}


