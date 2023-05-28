package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ddqusnine extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		browserlaunch();
		
		urllaunch("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		WebElement fs = driver.findElement(By.xpath("//input[@name='username']"));
		filltextbox(fs,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2",1, 0, 1, "priyathanu01", "priyathanu", 1, 0));
		WebElement gs = driver.findElement(By.xpath("//input[@name='password']"));
		filltextbox(gs,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2",1, 0, 1, "priyathanu01", "priyathanu", 1, 1));
		WebElement hs = driver.findElement(By.xpath("//input[@name='login']"));
		hs.click();
		Thread.sleep(2000);
		WebElement ts = driver.findElement(By.id("location"));
		ts.click();
		Selecttext(ts, "Sydney");
		WebElement ms = driver.findElement(By.id("hotels"));
		ms.click();
		Selecttext(ms, "Hotel Sunshine");
		WebElement ns = driver.findElement(By.id("room_type"));
		ns.click();
		Selecttext(ns, "Double");
		WebElement os = driver.findElement(By.id("room_nos"));
		os.click();
		Selecttext(os, "2 - Two");
		WebElement ps = driver.findElement(By.xpath("//input[@value='Search']"));
		ps.click();
		
		Thread.sleep(2000);
		WebElement qs = driver.findElement(By.xpath("//input[@value='0']"));
		qs.click();
		WebElement rs = driver.findElement(By.xpath("//input[@value='Continue']"));
		rs.click();
		Thread.sleep(2000);
		
		WebElement us = driver.findElement(By.xpath("//input[@id='first_name']"));
		filltextbox(us,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2",2, 0, 1, "priya", "dharshini", 2, 0));
		
		WebElement vs = driver.findElement(By.xpath("//input[@id='last_name']"));
		filltextbox(vs,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2",2, 0, 1, "priya", "dharshini", 2, 1));
		WebElement ws = driver.findElement(By.xpath("//textarea[@class='txtarea']"));
		filltextbox(ws,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2",3, 0, 1, "address", "113,kanniyappan street,trichy", 3, 1));
		WebElement as = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		filltextbox(as,excelwriteadaci("C:\\Users\\\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx","book2", 4, 0, 1, "cardnumber", "12345678961234567", 4, 1));
		WebElement bs = driver.findElement(By.id("cc_type"));
		bs.click();
		Selectvalue(bs, "VISA");
		WebElement cs = driver.findElement(By.id("cc_exp_month"));
		cs.click();
		Selectvalue(cs, "3");
		WebElement ds = driver.findElement(By.id("cc_exp_year"));
		bs.click();
		Selectvalue(ds, "2012");
		
		WebElement es = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		filltextbox(es,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\fb.xlsx", "book2", 5, 0, 1," cvv", "234", 5, 1));
	WebElement ij = driver.findElement(By.xpath("//input[@type='button']"));
	ij.click();
	
	}
	
	
	
	
}
	