package org.step;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
private void jvmReportgene(String jsonpath) {
	
	File f =new File("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\AllReport\\JvmReport");

	Configuration c=new Configuration(f, "FACEBOOK APPLICATION");
	c.addClassifications("platform", "windows");
	c.addClassifications("sprint", "123");
	c.addClassifications("JDK version", "1.8");
	
	java.util.List<String> l=new ArrayList<String>();
	l.add(jsonpath);
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
}
}
