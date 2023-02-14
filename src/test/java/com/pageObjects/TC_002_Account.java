package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autogenerate.GenerateTestData;
import com.baseClass.BaseClass;



public class TC_002_Account extends BaseClass {
	
@FindBy (xpath = "(//*[text()='Account'])[1]")
@CacheLookup
private WebElement Click_on_the_Account;
	
@FindBy (css = "input#reg_username")
@CacheLookup
private WebElement Username;
	
@FindBy (xpath = "//input[@name='email']")
@CacheLookup
private WebElement Email_address;

@FindBy(xpath = "//input[@id='reg_password']")
@CacheLookup
private WebElement Password_register;

@FindBy (xpath = "//button[@name='register']")
@CacheLookup
private WebElement Account_Register_button;

@FindBy (xpath = "//*[text()='shipping and billing addresses']")
@CacheLookup
private WebElement Dashboard;


	    //----------------PageFactory------------------
	
		public TC_002_Account(){
			super();
			PageFactory.initElements(driver, this);
		}
		
		//--------------------------------------------
		
	GenerateTestData gtd = new GenerateTestData();

		
	public void click_on_the_account_section() {
		
		clickElement(Click_on_the_Account);
	}
		
	public void Enter_the_Details_For_Register() {
		Sendkeys(Username,gtd.Name());
 		Sendkeys(Email_address, gtd.Email());
		Sendkeys(Password_register, gtd.Password_for_Register());
		
	}
	
	public void click_on_the_account_register_button() {
		clickElement(Account_Register_button);
	}
	
	
	public void Check_the_Dashboard() {
		elementisDisplayed(Dashboard);
	}

	
	
	
	
}
