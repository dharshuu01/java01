package org.sample;

import org.openqa.selenium.WebElement;

public class Greens extends BaseClass {
	
		public static void main(String[] args) {
			browserlaunch();
		urllaunch("http://www.greenstechnologys.com/");	
		LoginPojo l=new LoginPojo();
		WebElement contact = l.getContactus();
		contact.click();
		WebElement javas = l.getJava();
		String text = javas.getText();
		System.out.println(text);
		WebElement cor = l.getCor();
		String text2 = cor.getText();
		System.out.println(text2);
}
}