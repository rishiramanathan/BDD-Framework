package com.stepDefinitions;


import com.baseClass.BaseClass;
import com.pageObjects.TC_001_BlueShoes;

import io.cucumber.java.en.*;

public class TC_001_BlueShoes_Test extends BaseClass {
	TC_001_BlueShoes BS;
	
	@Given("user has opened the Application URL")
	public void user_has_opened_the_application_url() {
	setup();
	BS = new TC_001_BlueShoes(); 
	}


	@Given("user can able to see the Add to Card button on Blue Shoes and clicks that button")
	public void user_can_able_to_see_the_add_to_card_button_on_blue_shoes_and_clicks_that_button() {
	    BS.Add_To_Cart_For_BlueShoes();
	}

	@Given("user clicks on checkout page")
	public void user_clicks_on_checkout_page() throws Exception {
	    BS.checkout_page();
	}

	@Given("user can able to see the PROCEED TO CHECKOUT button and clicks that button")
	public void user_can_able_to_see_the_proceed_to_checkout_button_and_clicks_that_button() {
	    BS.Proceed_TO_Checkout();
	}

	@Then("user needs to enter all the mandatory details")
	public void user_needs_to_enter_all_the_mandatory_details() throws Exception {
	    BS.Biling_Details();
	}

	@Then("close the driver")
	public void close_the_driver() {
		tearDown();
	}

}
