package org.stepdef;

import org.Amazon_Cucumber.amazon;
import org.Helper.Class.Utility_File;
import org.openqa.selenium.WebDriver;

import com.Object.Manager.Page_Object_ManagerAmazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDef extends Utility_File {
	public static WebDriver driver = amazon.driver;
	public static Page_Object_ManagerAmazon manager = new Page_Object_ManagerAmazon(driver);


	@Given("User Launch The Browser")
	public void user_launch_the_browser() {
		get_Browser("https://www.amazon.in/");
	}
	@When("user Type The Product Name In SearchBox")
	public void user_type_the_product_name_in_search_box() {
		send_keys(manager.getSelectproducts().getSearchtextbox(),"iphone 14 256 product(red)" );
	}
	@When("user Click The Search Button")
	public void user_click_the_search_button() {
		click(manager.getSelectproducts().getSearchbtn());
	}
	@When("user Click The Model Of Product And Navigate To Product Details Page")
	public void user_click_the_model_of_product_and_navigate_to_product_details_page() {
		click(manager.getSelectproducts().getClickimage());
	}



	



	
}
