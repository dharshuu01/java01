package org.sample;

import org.openqa.selenium.WebElement;

public class Pom  extends BaseClass{
public static void main(String[] args) {
	browserlaunch();
urllaunch("https://www.facebook.com/");
	LoginPojo l=new LoginPojo();
WebElement text = l.getTxtemail();
text.sendKeys("greens");
WebElement txtpass = l.getTxtpass();
txtpass.sendKeys("12345");
WebElement btnlogin = l.getBtnlogin();
btnlogin.click();
}
}