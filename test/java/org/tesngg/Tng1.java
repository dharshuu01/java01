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

import junit.framework.Assert;

public class Tng1 extends BaseClass{
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
		WebElement fe = driver.findElement(By.id("email"));
		fe.sendKeys("greens");
Assert.assertEquals("greens", fe.getAttribute("value"));
WebElement de = driver.findElement(By.id("pass"));
de.sendKeys("123456");
	
}
	@Test
	private void Tc2() {
		String title = pagetitle();
		System.out.println(title);
		org.testng.Assert.assertTrue(title.contains("book"), "check the title");
		}
}