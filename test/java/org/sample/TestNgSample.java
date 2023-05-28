package org.sample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgSample extends BaseClass {
	@BeforeClass
	private void bfrcls() {
		browserlaunch();
urllaunch("https://www.facebook.com/");
	}
	
	@Test
	private void tc1() {
	
		WebElement fe = driver.findElement(By.id("email"));
		fe.sendKeys("greens");
		
	}
	@Test
	private void tc2() {
	WebElement ge = driver.findElement(By.id("pass"));
	ge.sendKeys("1243");
	}
	@Test
	private void tc3() {
		WebElement he = driver.findElement(By.xpath("//button[@name='login']"));
		he.click();
	}
	@BeforeMethod
	private void bfrmtd() {
Date d=new Date();
System.out.println(d);

	}
	

}
