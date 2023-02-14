package com.stepDefinitions;



import com.pageObjects.TC_004_BilingAddress;

import io.cucumber.java.en.*;

public class TC_004_BilingAddressTest {
	
	TC_004_BilingAddress ba;
	
	@When("user clicks on Address")
	public void user_clicks_on_address() {
	   ba = new TC_004_BilingAddress();
	   ba.Click_on_the_Address();
	}

	@When("user needs to click on Add button")
	public void user_needs_to_click_on_add_button() {
	    ba.Click_on_the_Add();
	}

	@Then("users needs to enter all the mandatory details and click on Save Address button")
	public void users_needs_to_enter_all_the_mandatory_details_and_click_on_save_address_button() {
	    
	}

}
