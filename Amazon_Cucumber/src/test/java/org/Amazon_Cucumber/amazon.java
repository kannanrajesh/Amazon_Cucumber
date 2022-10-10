package org.Amazon_Cucumber;

import org.Helper.Class.Utility_File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Features",
					glue = "com.stepdef"
					
					 )
public class amazon {

	public static WebDriver driver;
	public static WebElement element; 
	
	@BeforeClass
	public static void set_Up() {
		driver = Utility_File.get_Browser("chrome");
	}

	
	
	@AfterClass
	public static void tear_Down() {
		
	}
}
