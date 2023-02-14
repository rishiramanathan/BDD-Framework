package com.stepDefinitions;

import com.baseClass.BaseClass;
import com.pageObjects.TC_005_ListOfProducts;

import io.cucumber.java.en.*;

public class TC_005_ListOfProductsTest extends BaseClass{
	
	TC_005_ListOfProducts lop;
	
	@Given("user has selected multiple products")
	public void user_has_selected_multiple_products() {
		lop = new TC_005_ListOfProducts();
		lop.ListOfProducts();
	}

	@When("user click on View Cart")
	public void user_click_on_view_cart() throws Exception {
	   lop.click_on_the_ViewCart();
	}

	@Then("system should navigated to Cart section")
	public void system_should_navigated_to_cart_section() {
	    lop.cart_is_displayed();
	}

	@Then("user  should be able to see all the selected products")
	public void user_should_be_able_to_see_all_the_selected_products() {
		 lop.printing_list_of_products();
		
	}

	@Then("user click on proceed to checkout")
	public void user_click_on_proceed_to_checkout() {
	    lop.click_on_the_checkout();
	}



}
