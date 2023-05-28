package org.sample;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Junit2red extends BaseClass{

	
	@BeforeClass
	public static void bfrcls() {
browserlaunch();
urllaunch("https://www.redbus.in/\r\n");
}
	@Test
	public void tc1()
	{
		WebElement fe = driver.findElement(By.xpath("//input[@id='src']"));
		filltextbox(fe,"chennai");
	}
	@Test
	public void tc2()
	{
		WebElement de = driver.findElement(By.xpath("//input[@id='dest']"));
		filltextbox(de,"trichy");
	
	}
	@After
	public void aft()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	
	
	@AfterClass
	public static void aftcl() {
		browserclose();

	} 

}