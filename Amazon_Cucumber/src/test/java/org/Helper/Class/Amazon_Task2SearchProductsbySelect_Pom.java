package org.Helper.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Task2SearchProductsbySelect_Pom {
		public Amazon_Task2SearchProductsbySelect_Pom(WebDriver driver3) {
			this.driver=driver3;
			PageFactory.initElements(driver,this);
		}
	public WebDriver driver;
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	private WebElement selectAll;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchtextbox;
	
	@FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//div[@class='a-section aok-relative s-image-fixed-height'][1]")
	private WebElement clickimage;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	private WebElement buynowbtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getClickimage() {
		return clickimage;
	}
	public WebElement getSelectAll() {
		return selectAll;
	}

	public WebElement getBuynowbtn() {
		return buynowbtn;
	}
	
}
