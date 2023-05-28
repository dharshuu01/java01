package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
@Before
public void bef()
{
	System.out.println("bef scenario..");
	WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
}
@After
private void aftr() {
	browserclose();

}

}


