package org.tesngg;

import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.LoginPojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fbpom extends LoginPojo{
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
@Test
private void tc1() {
	s=new SoftAssert();
	LoginPojo l=new LoginPojo();
	WebElement t2 = l.getTxtemail();
	
t2.sendKeys("greens");
s.assertEquals("greenss", t2.getAttribute("value"), "check");
}


@Test
private void tc2() {
	LoginPojo l=new LoginPojo();
	WebElement t3 = l.getTxtpass();
	
t3.sendKeys("1234");
s.assertTrue(true);
}
@Test
private void tc3() {
	LoginPojo l=new LoginPojo();
	WebElement t4 = l.getBtnlogin();
	t4.click();
}
}