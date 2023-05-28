package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Taskone {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book1.xlsx");
	
	FileInputStream fin=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fin);
	Sheet sh = w.getSheet("Sheet1");
	
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
	Row r = sh.getRow(i);
	for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		int type = c.getCellType();
		
	if(type==1)
	{
		
		String scv = c.getStringCellValue();
		System.out.println(scv);
		
	}
	else
	{
		double ncv = c.getNumericCellValue();
		long l=(long)ncv;
		String v = String.valueOf(1);
		System.out.println(v);
	}
	}
	
	
	
}

	
	
	
	
	
}
}
