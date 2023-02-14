package com.stepDefinitions;




import com.pageObjects.TC_002_Account;

import io.cucumber.java.en.*;

public class TC_002_Account_Test {
	
	TC_002_Account acc;
	
	@When("user enters the Username, Email and Password")
	public void user_enters_the_username_email_and_password() {
	    acc = new TC_002_Account();
	    acc.click_on_the_account_section();
	    acc.Enter_the_Details_For_Register();
	}


	@Then("user clicks on Register button")
	public void user_clicks_on_register_button() {
	    acc.click_on_the_account_register_button();
	}

	@Then("user can able to see the dashboard")
	public void user_can_able_to_see_the_dashboard() {
	    acc.Check_the_Dashboard();
	}

}
