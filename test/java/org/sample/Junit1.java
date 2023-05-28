package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class Junit1 extends BaseClass{

	
	@BeforeClass
	public static void bfrcls() {
browserlaunch();
urllaunch("https://www.facebook.com/");
}
	@Test
	public void tc1()
	{
		LoginPojo l=new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		txtemail.sendKeys("greens");
	}
	@Test
	public void tc2()
	{
		LoginPojo l=new LoginPojo();
		WebElement txt = l.getTxtpass();
		txt.sendKeys("1234");
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
