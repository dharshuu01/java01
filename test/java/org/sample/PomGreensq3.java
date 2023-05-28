package org.sample;

import org.openqa.selenium.WebElement;

public class PomGreensq3 extends BaseClass{
public static void main(String[] args) throws InterruptedException {

	
	browserlaunch();
	urllaunch("http://www.greenstechnologys.com/");
	LoginPojo l=new LoginPojo();
	WebElement cer = l.getCert();
	cer.click();
	Thread.sleep(2000);
	WebElement cnt = l.getCntnt();
	cnt.click();
	WebElement testi = l.getTestimonal();
	String text = testi.getText();
	System.out.println(text);
	
}
}
