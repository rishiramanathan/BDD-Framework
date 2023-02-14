package com.stepDefinitions;


import com.baseClass.BaseClass;
import com.pageObjects.TC_003_LoginAccount;

import io.cucumber.java.en.*;

public class TC_003_LoginAccountTest extends BaseClass{
	
	TC_003_LoginAccount la;
	
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		 la = new TC_003_LoginAccount();
		 la.click_on_the_account_section_for_login();
		 la.Enter_the_LoginEmail_andLoginPassword(string, string2);
	    
	}
		

	@Then("user needs clicks on login button")
	public void user_needs_clicks_on_login_button() {
	    la.click_on_the_login_button();
	}

	@Then("close the browser")
	public void close_the_browser() {
		tearDown();
	}

}
