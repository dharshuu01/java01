package org.step;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.BaseClass;
import org.sample.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination extends BaseClass {
	WebDriver driver;
	static LoginPojo l;
	@Given("user have to launch facebook application through chrome browser")
	public void user_have_to_launch_facebook_application_through_chrome_browser() {
	 
	}

@When("user have to enter invalid and invalid password to run")
public void user_have_to_enter_invalid_and_invalid_password_to_run() throws IOException {
	WebElement fe = driver.findElement(By.id("email"));
	filltextbox(fe, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book1.xlsx", "sheet1", 1, 1));
	WebElement de = driver.findElement(By.id("pass"));
	filltextbox(de, excelread("C:\\Users\\HP\\eclipse-workspace\\MavenProjec\\ExternalFiles\\Book1.xlsx", "Sheet1",2, 1));
}



	@When("user have to enter invalid and valid password")
	public void user_have_to_enter_invalid_and_valid_password() {
		LoginPojo l=new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		txtemail.sendKeys("Greens123");
		WebElement txtpass = l.getTxtpass();
		txtpass.sendKeys("1234");
	}

	@When("user have to click Login button")
	public void user_have_to_click_Login_button() {
		LoginPojo l=new LoginPojo();
		WebElement btnlogin = l.getBtnlogin();
		btnlogin.click();
	}

	@Then("user to reach the invalid credential page")
	public void user_to_reach_the_invalid_credential_page() {
	  String url = driver.getCurrentUrl();
	  if (url.contains("privacy_mutation_token")) {
		System.out.println("user in invalid credential page");
	} else {

	System.out.println("user in valid credential page");}
	}

@When("user have to enter {string} and valid {string}")
public void user_have_to_enter_and_valid(String username, String password) {
	LoginPojo l=new LoginPojo();
	WebElement txtemail = l.getTxtemail();
	txtemail.sendKeys(username);
	WebElement txtpass = l.getTxtpass();
	txtpass.sendKeys(password);
}

	@When("user have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
		LoginPojo l=new LoginPojo();
		WebElement frgt = l.getFrgt();
		frgt.click();
	  	}

	@When("user have to give a username")
	public void user_have_to_give_a_username() {
		LoginPojo l=new LoginPojo();
		WebElement srch1 = l.getSrch1();
		srch1.sendKeys("dharshuu01");
	}

	@Then("user click the search button")
	public void user_click_the_search_button() {
		LoginPojo l=new LoginPojo();
		WebElement srch2 = l.getSrch2();
		srch2.click();
	}
	@When("user have to click create new acc and fill details")
	public void user_have_to_click_create_new_acc_and_fill_details() throws InterruptedException {
		 l=new LoginPojo();
		 WebElement ca = l.getCreatenewacc();
		 ca.click();
		 Thread.sleep(1000);
		WebElement frstname = l.getFrstname();
		frstname.sendKeys("priya");
		WebElement surname = l.getSurname();
		surname.sendKeys("dharshini");
		WebElement mblnum = l.getMblnum();
		mblnum.sendKeys("8220929435");
		WebElement p= l.getPassword();
		p.sendKeys("fjfi");
		WebElement ds = l.getDateselect();
		Selectvalue(ds, "12");
		Thread.sleep(1000);
		WebElement ms = l.getMonthselect();
	Selecttext(ms, "Jun");
	Thread.sleep(1000);
	WebElement ys = l.getYearselect();
	Selectvalue(ys, "1994");
		WebElement f = l.getFemale();
		f.click();
		
	}

	@When("user have to click sign up")
	public void user_have_to_click_sign_up() {
		 l=new LoginPojo();
		WebElement su = l.getSignup();
		su.click();
	}

}
