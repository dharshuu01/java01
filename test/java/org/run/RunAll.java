package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\src\\test\\resources\\FeatureFile\\reglogin.feature",glue="org.step"
,dryRun=false,plugin= {"html:C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\AllReport\\HtmlReport","json:C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\AllReport\\JesonReport\\fb.json","junit:C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\AllReport\\JunitReport\\face.xml"})
public class RunAll {
	
	
}
