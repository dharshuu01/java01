package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Qusthree extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserlaunch();
		urllaunch(" https://www.instagram.com/accounts/login/?hl=en) ");
		Thread.sleep(2000);
		WebElement fe = driver.findElement(By.xpath("//input[@name='username']"));
		filltextbox(fe, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",4, 0));

		WebElement de = driver.findElement(By.xpath("//input[@name='password']"));
		filltextbox(de, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book2.xlsx", "Sheet1",4, 1));
}
} 


