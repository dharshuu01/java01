package org.tesngg;

import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Tsng extends BaseClass{
	
SoftAssert s;
	@BeforeClass
	private void bfrcls() {
		browserlaunch();
urllaunch("https://www.facebook.com/");
	}

	@BeforeMethod
	
	private void bfrmtd() {
		Date d =new Date();
		System.out.println(d);
	
	}
	@AfterMethod
	private void aftmtd() {
		Date d =new Date();
		System.out.println(d);}
	@Test
	private void Tc1() {
		s=new SoftAssert();
	
		WebElement fe = driver.findElement(By.id("email"));
		fe.sendKeys("greens");
s.assertEquals("greenss", fe.getAttribute("value"), "check");
WebElement de = driver.findElement(By.id("pass"));
de.sendKeys("123456");
s.assertAll();
	
}
	@Test
	private void Tc2() {
		String title = pagetitle();
		System.out.println(title);
s.assertTrue(title.contains("book"));;		
		}
}