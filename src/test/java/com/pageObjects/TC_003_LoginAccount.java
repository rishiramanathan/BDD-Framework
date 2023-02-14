package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;


public class TC_003_LoginAccount extends BaseClass {
	
	@FindBy (xpath = "(//*[text()='Account'])[1]")
	@CacheLookup
	private WebElement Click_on_the_Account_forlogin;
	
	@FindBy (xpath = "//*[@id='username']")
	@CacheLookup
	private WebElement Enter_the_Login_Username;
	
	@FindBy (xpath = "//*[@id='password']")
	@CacheLookup
	private WebElement Enter_the_Login_Password;
	
	@FindBy (xpath = "//*[text()='Log in']")
	@CacheLookup
	private WebElement Login;
	
	
	
	
	//----------------PageFactory------------------
	
			public TC_003_LoginAccount(){
				super();
				PageFactory.initElements(driver, this);
			}
			
			//--------------------------------------------
			
	public void click_on_the_account_section_for_login() {
				
		clickElement(Click_on_the_Account_forlogin);
	}
	
	public void Enter_the_LoginEmail_andLoginPassword(String EmailAddress, String loginpassword) {
		Sendkeys(Enter_the_Login_Username, EmailAddress);
		Sendkeys(Enter_the_Login_Password, loginpassword);
	}
	
	public void click_on_the_login_button() {
		clickElement(Login);
	}
	

}
