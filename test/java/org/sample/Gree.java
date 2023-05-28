package org.sample;

import org.openqa.selenium.WebElement;

public class Gree extends BaseClass {
public static void main(String[] args) {
	browserlaunch();
urllaunch("http://www.greenstechnologys.com/");	
LoginPojo l=new LoginPojo();
WebElement cor = l.getCourse();
movecursor(cor);
WebElement jt = l.getJavatraining();
movecursor(jt);
WebElement cjava = l.getCorejava();
cjava.click();
WebElement revi = l.getReview();
String text = revi.getText();
System.out.println(text);
}
}
