package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Qustwo extends BaseClass {
		public static void main(String[] args) throws IOException {
			browserlaunch();
			urllaunch(" https://www.redbus.in/ ");
			
			WebElement fe = driver.findElement(By.id("src"));
			filltextbox(fe, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",1, 3));

			WebElement de = driver.findElement(By.id("dest"));
			filltextbox(de, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",1, 4));
}
}