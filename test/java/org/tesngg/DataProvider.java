package org.tesngg;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider extends BaseClass{

	@BeforeClass
	private void bfrcls() {
		browserlaunch();

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


	@Test(dataProvider="TestData")
	private void Tc1 (String email,String pass) {
		urllaunch("https://www.facebook.com/");
		WebElement fe = driver.findElement(By.id("email"));
		
fe.sendKeys(email);
WebElement de = driver.findElement(By.id("pass"));
de.sendKeys(pass);
	}
@Test
	private void Tc2() {
	currenturl();
	}
@org.testng.annotations.DataProvider(name="TestData")
private Object[][] add() {
	return new Object[][] {
		{"seleium ","1234"},
		{"java","sql"},
		{"python","12345"}
	};
	}

}



