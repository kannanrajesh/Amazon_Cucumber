package org.Helper.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Payment_Page_Pom {
	private WebDriver driver;

	public Amazon_Payment_Page_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
