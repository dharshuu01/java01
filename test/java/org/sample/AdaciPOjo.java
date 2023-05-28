package org.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdaciPOjo extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		browserlaunch();
		
		urllaunch("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		LoginPojo l=new LoginPojo();
		WebElement uname = l.getUname();
		filltextbox(uname,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2",1, 0, 1, "priyathanu01", "priyathanu", 1, 0));
		WebElement upw = l.getUpw();
		filltextbox(upw,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2",1, 0, 1, "priyathanu01", "priyathanu", 1, 1));
		WebElement log = l.getClicklog();
	log.click();
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
	WebElement fn = l.getFname();
	filltextbox(fn,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2",2, 0, 1, "priya", "dharshini", 2, 0));
	
	WebElement ln = l.getLname();
	filltextbox(ln,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2",2, 0, 1, "priya", "dharshini", 2, 1));
	WebElement add = l.getAddress();
	filltextbox(add,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2",3, 0, 1, "address", "113,kanniyappan street,trichy", 3, 1));
	WebElement cn = l.getCardnumber();
	filltextbox(cn,excelwriteadaci("C:\\Users\\\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx","book2", 4, 0, 1, "cardnumber", "12345678961234567", 4, 1));
	WebElement v = l.getVisa();
	Selectvalue(v, "VISA");
	WebElement m = l.getMnth();
	Selectvalue(m, "3");
	WebElement yr = l.getYr();
	Selectvalue(yr, "2012");
	WebElement cvv = l.getCvv();
	filltextbox(cvv,excelwriteadaci("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\mn.xlsx", "book2", 5, 0, 1," cvv", "234", 5, 1));
	WebElement bn = l.getbooknum();
	bn.click();
	Thread.sleep(2000);
	WebElement od = l.getOrderid();
String text = od.getText();
	}}


