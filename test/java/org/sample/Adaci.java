package org.sample;

import org.openqa.selenium.WebElement;

public class Adaci extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	browserlaunch();
	
	urllaunch("http://adactinhotelapp.com/");
	Thread.sleep(2000);
	LoginPojo l=new LoginPojo();
	WebElement uname = l.getUname();
	uname.sendKeys("priyathanu01");
	WebElement upw = l.getUpw();
	upw.sendKeys("priyathanu");
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
Thread.sleep(2000);
WebElement od = l.getOrderid();
 String at = od.getAccessibleName();
 System.out.println(at);
}}