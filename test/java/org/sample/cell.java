package org.sample;

import java.io.IOException;

public class cell extends BaseClass
{
	public static void main(String[] args) throws IOException {
		browserlaunch();
		urllaunch("https://www.facebook.com/");
		
		String t1 = excelwrite2("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\parra.xlsx", "book1", 0, 0, 1, "username", "password");
		System.out.println(t1);
		excelwrite2("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\parr.xlsx", "book2", 1, 0, 1, "perita", "1234");
	
	
	}
	
	
	
	
	
}