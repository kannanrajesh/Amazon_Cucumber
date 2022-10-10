package org.Helper.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Return_Orders_Pom {

	

	public Amazon_Return_Orders_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	private WebDriver driver;
	@FindBy(xpath = "//div[@id=\"nav-tools\"]/a[4]")
	private WebElement returnsorder;//click
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getReturnsorder() {
		return returnsorder;
	}
	public WebElement getOrder() {
		return orders;
	}
	@FindBy(xpath = "//li[@class='page-tabs__tab page-tabs__tab--selected']")
	private WebElement orders;//clicl
	
}
