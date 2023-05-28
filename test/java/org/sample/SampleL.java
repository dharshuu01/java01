package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleL {
	public static String excelwriteadaci(String pathvalue,String sheetname,int row,int cell1,int cell2,String i,String j ,int rownum,int cellnum) throws IOException {
		File f=new File(pathvalue);
	FileInputStream fin= new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sh = w.createSheet(sheetname);
		Row R = sh.createRow(row);
		Cell c2 = R.createCell(cell1);
		Cell c1 = R.createCell(cell2);
		
		c2.setCellValue(i);
		c1.setCellValue(j);
		
		Row r1 = sh.getRow(rownum);
		Cell c= r1.getCell(cellnum);
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

	}


}
