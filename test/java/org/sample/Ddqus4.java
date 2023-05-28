package org.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ddqus4 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\pree.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sh = w.createSheet("Book3");
		Row r = sh.createRow(1);
		Cell c = r.createCell(0);
		Cell c1 = r.createCell(1);
		Row r1 = sh.createRow(2);
		c.setCellValue("username");
		c1.setCellValue("password");
		Cell c3 = r1.createCell(0);
		Cell c4 = r1.createCell(1);
		c3.setCellValue("priya");
		c4.setCellValue("1234");
		
		
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		

}
}