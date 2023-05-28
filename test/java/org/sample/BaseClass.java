package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.swing.Action;
import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	protected static WebDriver driver;
	static Actions a;
public static void browserlaunch() {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();

}
public static void browserlaunchchrome() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();

}
public static void browserlaunchfrfox() {
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
}
public static void browserclose() {
	driver.close();
}
public static String pagetitle() {
String title = driver.getTitle();
return title;

}
public static void currenturl() {
driver.getCurrentUrl();

}
public static void urllaunch(String url) {
	driver.get(url);

}
public static void filltextbox(WebElement web,String value) {
web.sendKeys(value);

}
public static void DateandTime()
{
Date d=new Date();
System.out.println(d);
}
public static void buttonclick(WebElement web) {
	web.click();
}
public static void existtext(WebElement web) {
	String text = web.getText();
	System.out.println(text);

}
public static String retrivetext(WebElement web  ,String value) {
	String txt = web.getAttribute("value");
	System.out.println(txt);
return value;
	
	
}
public static void movecursor(WebElement web) {
	Actions a=new Actions(driver);
	a.moveToElement(web).perform();
	

}
public static void dragdrop(WebElement source,WebElement target) {
a.dragAndDrop(source, target).perform();

}
public static void  rightclick(WebElement element) {
	a.contextClick(element).perform();
	
}
public static void doubleclick(WebElement ref) {
	a.doubleClick(ref).perform();

}
public static void shiftkey(WebElement ref,String value) {
a.keyDown(ref,Keys.SHIFT).sendKeys(ref, value).keyUp(ref,Keys.SHIFT).build().perform();

}

public static void paste() throws AWTException {

Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);


}



public static void screenshot(String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\Image\\"+name+".png");
FileUtils.copyFile(src, dest);
}

public static void jssendkey(String command,WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+command+"')", ref);
	

}
public static void jsclick(WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", ref);
	

}
public static void jsgetattribute(WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("return arguments[0].getAttribute('value')", ref);
	
}
public static void jsscrollintoview(WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoVIew(true)", ref);
}
public static  void alertok() {
	Alert a = driver.switchTo().alert();
	a.accept();
	
}
public static  void alertcancel() {
	Alert a = driver.switchTo().alert();
	a.dismiss();
}
public static  void alertsendkey(String value ) {
	Alert a = driver.switchTo().alert();
	a.sendKeys(value);
}
public static  void alertgettext() {
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println();
}
public static Object parentwindowid() {
	String windowHandle = driver.getWindowHandle();
	return parentwindowid();

}
public static void allwindowid(String Id) {
	 driver.switchTo().window( Id );
	
	

}
public static void Select(WebElement ref,int index ) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.selectByIndex(index);

}
public static void Selecttext(WebElement ref,String text) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.selectByVisibleText(text);

}
public static void Selectvalue(WebElement ref,String value) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.selectByValue(value);

}
public static void checkmultiple(WebElement ref) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
boolean text = s.isMultiple();
System.out.println(text);
}
public static void getalloptions(WebElement ref) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
List<WebElement> opt = s.getOptions();
for (WebElement itr : opt) {
	System.out.println(itr.getText());
}
}
public static void getselectedoption(WebElement ref1)
{
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref1);
List<WebElement> opti = s.getAllSelectedOptions();
for (WebElement itr : opti) {
	System.out.println(itr.getText());
}
}


public static void getfirstselected(WebElement ref1)
{
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref1);
WebElement option = s.getFirstSelectedOption();
System.out.println(option.getText());
}

public static void deSelect(WebElement ref,int index ) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.deselectByIndex(index);

}
public static void deSelecttext(WebElement ref,String text) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.deselectByVisibleText(text);

}
public static void deSelectvalue(WebElement ref,String value) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.deselectByValue(value);

}

public static void deSelectvalue(WebElement ref) {
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ref);
s.deselectAll();


}
public static String excelread(String pathvalue,String name,int rownum,int cellnum) throws IOException {
	File f=new File(pathvalue);
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet sh = w.getSheet(name);
	Row r = sh.getRow(rownum);
	Cell c= r.getCell(cellnum);
	String s="";
	int Type = c.getCellType();
	if (Type==1) {
		s = c.getStringCellValue();
		 }
	else if (DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd MMMMM yyyy");
		 s = sim.format(d);
		
		
	}
	else {
		double da = c.getNumericCellValue();
		long l=(long)da;
		s=String.valueOf(l);
	}
	
return s;

}
public static String excelwrite(String pathvalue,String sheetname,int rownum,int cellnum) throws IOException {
	File f=new File(pathvalue);
	Workbook w=new XSSFWorkbook();
	Sheet sh = w.createSheet(sheetname);
	Row R = sh.createRow(1);
	Cell c2 = R.createCell(0);
	Cell c1 = R.createCell(1);
	Row R1 = sh.createRow(2);
	c2.setCellValue("username");
	c1.setCellValue("password");
	Cell c3 = R1.createCell(0);
	Cell c4 = R1.createCell(1);
	c3.setCellValue("priya");
	c4.setCellValue("1234");
	Row r1 = sh.getRow(rownum);
	Cell c = r1.getCell(cellnum);
	String s="";
	int Type = c.getCellType();
	if (Type==1) {
		s = c.getStringCellValue();
		 }
	else if (DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd MMMMM yyyy");
		 s = sim.format(d);
		
		
	}
	else {
		double da = c.getNumericCellValue();
		long l=(long)da;
		s=String.valueOf(l);
	}

	
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	return s;
	

}

public static String excelwriteadaci(String pathvalue,String sheetname,int row,int cell1,int cell2,String i,String j ,int rownum,int cellnum) throws IOException {
	File f=new File(pathvalue);
Workbook w=new XSSFWorkbook();
	Sheet sh = w.createSheet(sheetname);
	Row R = sh.createRow(row);
	Cell c2 = R.createCell(cell1);
	Cell c1 = R.createCell(cell2);
	
	c2.setCellValue(i);
	c1.setCellValue(j);
	
	Row r1 = sh.getRow(rownum);
	Cell c= r1.getCell(cellnum);

	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	 String s="";
	int Type = c.getCellType();
	if (Type==1) {
		s = c.getStringCellValue();
		 }
	else if (DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd MMMMM yyyy");
		 s = sim.format(d);
		
		
	}
	else {
		double da = c.getNumericCellValue();
		long l=(long)da;
		s=String.valueOf(l);
	}

	
	return s;
	

}
public static String excelwrite1(String pathvalue,String sheetname,int rownum,int cellnum,String set) throws IOException {
	File f=new File(pathvalue);
	Workbook w=new XSSFWorkbook();
	Sheet sh = w.createSheet(sheetname);
	Row R = sh.createRow(1);
	Cell c2 = R.createCell(0);
	Cell c1 = R.createCell(1);
	Row R1 = sh.createRow(2);
	c2.setCellValue(set);
	
	Row r1 = sh.getRow(rownum);
	Cell c = r1.getCell(cellnum);
	String s="";
	int Type = c.getCellType();
	if (Type==1) {
		s = c.getStringCellValue();
		 }
	else if (DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd MMMMM yyyy");
		 s = sim.format(d);
		
		
	}
	else {
		double da = c.getNumericCellValue();
		long l=(long)da;
		s=String.valueOf(l);
	}

	
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	return s;
	

}
public static String excelwrite2(String pathvalue,String sheetname,int row,int cell1,int cell2,String i,String j ) throws IOException {
	File f=new File(pathvalue);
Workbook w=new XSSFWorkbook();
	Sheet sh = w.createSheet(sheetname);
	Row R = sh.createRow(row);
	Cell c2 = R.createCell(cell1);
	Cell c1 = R.createCell(cell2);
	
	c2.setCellValue(i);
	c1.setCellValue(j);
	


	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	return j;
}

}


