package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
public LoginPojo() {
PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement txtemail;
@FindBy(id="pass")
private WebElement txtpass;
@FindBy(xpath="//button[@name='login']")
private WebElement btnlogin;
public WebElement getTxtemail() {
	return txtemail;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
@FindBy(xpath="//a[text()='Certifications']")
private WebElement cert;
@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")
private WebElement cntnt;
@FindBy(xpath="//p[@style='line-height:20px;']")
private WebElement testimonal;
public WebElement getCert() {
	return cert;
}
public WebElement getCntnt() {
	return cntnt;
}
public WebElement getTestimonal() {
	return testimonal;
}

@FindBy(xpath="//a[text()='COURSES']")
private WebElement course;

@FindBy(xpath="//span[text()='Java Training']")
private WebElement javatraining;
@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement corejava;
@FindBy(xpath="//p[contains(text(),'looking out')]")
private WebElement review;
public WebElement getCourse() {
	return course;
}
public WebElement getJavatraining() {
	return javatraining;
}
public WebElement getCorejava() {
	return corejava;
}
public WebElement getReview() {
	return review;
}
@FindBy(xpath="//a[text()='CONTACT US']")
private WebElement contactus;

@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
private WebElement java;
@FindBy(xpath="//div[@class='col-md-6 col-sm-6 left-side']")
private WebElement cor;
public WebElement getContactus() {
	return contactus;
}
public WebElement getJava() {
	return java;
}
public WebElement getCor() {
	return cor;
}
@FindBy(xpath="//input[@name='username']")
private WebElement uname;
@FindBy(xpath="//input[@name='password']")
private WebElement upw;
@FindBy(xpath="//input[@name='login']")
private WebElement clicklog;
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotles;
@FindBy(id="room_type")
private WebElement roomtype ;

@FindBy(id="room_nos")
private WebElement roomno;

@FindBy(xpath="//input[@value='Search']")
private WebElement search;
@FindBy(xpath="//input[@value='0']")
private WebElement val;


@FindBy(xpath="//input[@value='Continue']")
private WebElement contin;
@FindBy(xpath="//input[@id='first_name']")
private WebElement fname;

@FindBy(xpath="//input[@id='last_name']")
private WebElement lname;


@FindBy(xpath="//textarea[@class='txtarea']")
private WebElement address;
@FindBy(xpath="(//input[@class='reg_input'])[3]")
private WebElement cardnumber;

@FindBy(id="cc_type")
private WebElement visa;
@FindBy(id="cc_exp_month")
private WebElement mnth;
@FindBy(id="cc_exp_year")
private WebElement yr;

@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvv;

@FindBy(xpath="//input[@id='book_now']")
private WebElement booknum;
@FindBy(xpath="(//td[@align='right'])[17]")
private WebElement orderid;
public WebElement getUname() {
	return uname;
}
public WebElement getUpw() {
	return upw;
}
public WebElement getClicklog() {
	return clicklog;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotles() {
	return hotles;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getSearch() {
	return search;
}
public WebElement getVal() {
	return val;
}
public WebElement getContin() {
	return contin;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardnumber() {
	return cardnumber;
}
public WebElement getVisa() {
	return visa;
}
public WebElement getMnth() {
	return mnth;
}
public WebElement getYr() {
	return yr;
}
public WebElement getCvv() {
	return cvv;
	
}
public WebElement getbooknum() {
	return booknum;
}

public WebElement getOrderid() {
	return orderid;
}
@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement frgt;
@FindBy(xpath="//input[@type='text']")
private WebElement srch1;
@FindBy(xpath="//button[@name='did_submit']")
private WebElement srch2;
public WebElement getFrgt() {
	return frgt;
}

public WebElement getSrch1() {
	return srch1;
}

public WebElement getSrch2() {
	return srch2;
}
@FindBy(xpath="//a[text()='Create new account']")
private WebElement createnewacc;

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement frstname;
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement surname;
@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement mblnum;
@FindBy(xpath="(//input[@type='password'])[2]")
private WebElement password;
@FindBy(xpath="//select[@name='birthday_day']")
private WebElement dateselect;
@FindBy(xpath="//select[@name='birthday_month']")
private WebElement monthselect;
@FindBy(xpath="//select[@name='birthday_year']")
private WebElement yearselect;
@FindBy(xpath="//input[@type='radio']")
private WebElement female;
@FindBy(xpath="//button[text()='Sign Up']")
private WebElement signup;
public WebElement getFrstname() {
	return frstname;
}

public WebElement getSurname() {
	return surname;
}

public WebElement getBooknum() {
	return booknum;
}
public WebElement getCreatenewacc() {
	return createnewacc;
}
public WebElement getMblnum() {
	return mblnum;
}
public WebElement getPassword() {
	return password;
}
public WebElement getDateselect() {
	return dateselect;
}

public WebElement getMonthselect() {
	return monthselect;
}


public WebElement getYearselect() {
	return yearselect;
}

public WebElement getFemale() {
	return female;
}

public WebElement getSignup() {
	return signup;
}


}
