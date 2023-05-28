package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Samplepass extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserlaunch();
		urllaunch(" https://www.facebook.com/ ");
		
		WebElement fe = driver.findElement(By.id("email"));
		filltextbox(fe, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",4, 0));

		WebElement de = driver.findElement(By.id("pass"));
		filltextbox(de, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",4, 1));
	}
}
