package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DdQus5 extends BaseClass {
public static void main(String[] args) throws IOException {
	browserlaunch();
	urllaunch(" https://www.facebook.com/");
	WebElement fe = driver.findElement(By.id("email"));
	filltextbox(fe, excelwrite("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\pree.xlsx", "book1", 2, 0));
	WebElement de = driver.findElement(By.id("pass"));
	filltextbox(de, excelwrite("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\pree.xlsx", "book1", 2, 1));
driver.findElement(By.xpath("//button[@name='login']")).click();

}

}
