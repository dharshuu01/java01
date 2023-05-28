package org.tesngg;

import java.util.Date;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class TestngPara extends BaseClass{

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

@org.testng.annotations.Parameters({"username","password"})
	@Test
	private void Tc1 (String email,String pass) {
		WebElement fe = driver.findElement(By.id("email"));
		
fe.sendKeys(email);
WebElement de = driver.findElement(By.id("pass"));
de.sendKeys(pass);
	}
@Test
	private void Tc2() {
	currenturl();
	}
}
