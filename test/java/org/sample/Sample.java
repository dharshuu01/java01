package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	browserlaunch();
	urllaunch("https://www.facebook.com/");
	Thread.sleep(2000);
	screenshot("fb");
//	WebElement ts = driver.findElement(By.id("email"));
//filltextbox(ts, "greens");
//shiftkey(ts," greens");
//	WebElement ps = driver.findElement(By.name("pass"));
//	filltextbox(ps, "1234");
	//WebElement ms = driver.findElement(By.name("login"));
//	buttonclick(ms);
	//WebElement ks = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
//existtext(ks);
//WebElement ns = driver.findElement(By.id("email"));
//filltextbox(ns, "greens");
//retrivetext(ns)
	//Thread.sleep(2000);
	
//	WebElement ms = driver.findElement(By.xpath("//div[@title='Courses']"));
	//movecursor(ms);
}
}
