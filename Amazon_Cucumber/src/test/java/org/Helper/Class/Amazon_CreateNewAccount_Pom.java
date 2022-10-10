package org.Helper.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CreateNewAccount_Pom {


public Amazon_CreateNewAccount_Pom(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
private WebDriver driver;
@FindBy(xpath = "//div[@id='nav-flyout-ya-newCust']/a")
private WebElement starthere;//click
@FindBy(xpath = "//input[@id='ap_customer_name']")
private WebElement 	newname;
@FindBy(xpath = "//input[@id='ap_phone_number']")
private WebElement mobilenumber;
@FindBy(xpath = "//input[@id='ap_email']")
private WebElement mailid;

@FindBy(xpath = "//input[@id='ap_password']")
private WebElement password;
@FindBy(xpath ="//input[@id='continue']")
private WebElement continuebtn;//click
public WebDriver getDriver() {
	return driver;
}
public WebElement getStarthere() {
	return starthere;
}
public WebElement getNewname() {
	return newname;
}
public WebElement getMobilenumber() {
	return mobilenumber;
}
public WebElement getMailid() {
	return mailid;
}
public WebElement getPassword() {
	return password;
}
public WebElement getContinuebtn() {
	return continuebtn;
}



}
