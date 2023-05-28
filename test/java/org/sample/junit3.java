package org.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class junit3 extends BaseClass{

	@BeforeClass
	public static void bfrcls() 
	{
browserlaunch();
urllaunch("http://www.adactin.com/HotelApp/");
}
	@Test
	public void tc1()
	{
		LoginPojo l=new LoginPojo();
		WebElement uname = l.getUname();
		uname.sendKeys("priyathanu01");
		WebElement upw = l.getUpw();
		upw.sendKeys("priyathanu");
		WebElement log = l.getClicklog();
	log.click();
	}
	@Test
	public void tc2() throws InterruptedException

	{
		Thread.sleep(2000);
		LoginPojo l=new LoginPojo();
		WebElement loc = l.getLocation();
	Selecttext(loc, "Sydney");
	WebElement hotles = l.getHotles();
	Selecttext(hotles, "Hotel Sunshine");
	WebElement rt = l.getRoomtype();
	Selecttext(rt, "Double");
	WebElement rn = l.getRoomno();
	Selecttext(rn, "2 - Two");
	WebElement se = l.getSearch();
	se.click();
	WebElement val = l.getVal();
	val.click();
	WebElement contin = l.getContin();
	contin.click();
	
	}


	@Test
	public void tc4() throws InterruptedException
	{
		Thread.sleep(2000);
		LoginPojo l=new LoginPojo();
		WebElement fn = l.getFname();
		fn.sendKeys("priya");
		WebElement ln = l.getLname();
		ln.sendKeys("dharshini");
		WebElement add = l.getAddress();
		add.sendKeys("113,kanistreet,trichy");
		WebElement cn = l.getCardnumber();
		cn.sendKeys("1234567876543245");
		WebElement v = l.getVisa();
		Selectvalue(v, "VISA");
		WebElement m = l.getMnth();
		Selectvalue(m, "3");
		WebElement yr = l.getYr();
		Selectvalue(yr, "2012");
		WebElement cvv = l.getCvv();
		cvv.sendKeys("123");
		WebElement bn = l.getbooknum();
		bn.click();
		
		
	}
	
	@Test
	public void tc5() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		LoginPojo l=new LoginPojo();
		WebElement oi = l.getOrderid();
		String txt = retrivetext(oi, "value");
		System.out.println(txt);
excelwrite1("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\lp.xlsx", "book", 1, 1,txt);
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

