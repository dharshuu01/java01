package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\excelsheet.xlsx");
	
FileInputStream fin=new FileInputStream(f);
	
Workbook w=new XSSFWorkbook(fin);
Sheet s = w.getSheet("sheet1");
Row r = s.getRow(3);
Cell cel= r.getCell(3);
System.out.println(cel);
	
	
	
	
	
}
}
