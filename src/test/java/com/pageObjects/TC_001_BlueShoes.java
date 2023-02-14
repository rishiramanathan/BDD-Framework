package com.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.utilities.ReadConfig;


     
public class TC_001_BlueShoes extends BaseClass {
	
	
@FindBy (xpath = "(//*[text()='Add to cart'])[1]")
@CacheLookup
private WebElement Add_To_Card_For_BlueShoes;

@FindBy (xpath = "(//*[@class='ast-cart-menu-wrap'])[1]")
@CacheLookup
private WebElement check_out;

@FindBy (xpath = "//*[@class='checkout-button button alt wc-forward']")
@CacheLookup
private WebElement proceed_To_checkout;

@FindBy (xpath = "//*[@name='billing_first_name']")
@CacheLookup
private WebElement firstname;

@FindBy (xpath = "//*[@name='billing_last_name']")
@CacheLookup
private WebElement lastname;

// This is for normal dropdown --------------------
@FindBy (xpath = "//*[@id='select2-billing_country-container']")
@CacheLookup
private WebElement click_on_the_country;

@FindBy (xpath = "(//*[text()='India'])[3]")
@CacheLookup
private WebElement Country_India;
//---------------------------------------------

@FindBy(xpath = "//*[@name='billing_address_1']")
@CacheLookup
private WebElement Street_address;

@FindBy (xpath = "//*[@name='billing_city']")
@CacheLookup
private WebElement Town;

@FindBy (xpath = "//*[@name='billing_postcode']")
@CacheLookup
private WebElement zipcode;

@FindBy(xpath = "//*[@name='billing_email']")
@CacheLookup
private WebElement email_address;

// Normal dropdown for the State Option----------------------------------
@FindBy(xpath = "//*[@id='select2-billing_state-container']")
@CacheLookup
private WebElement click_on_the_State;


@FindBy(xpath = "//*[text()='Tamil Nadu']")
@CacheLookup
private WebElement choose_TamilNadu;

@FindBy(xpath = "//*[@value='cod']")
@CacheLookup
private WebElement Cash_On_Delivery;

@FindBy (xpath = "//*[text()='Place order']")
@CacheLookup
private WebElement Place_order;



	
	//----------------PageFactory------------------
	
	public TC_001_BlueShoes(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------------------------
	public ReadConfig readconfig = new ReadConfig();

public void Add_To_Cart_For_BlueShoes() {
	elementisDisplayed(Add_To_Card_For_BlueShoes);
	clickElement(Add_To_Card_For_BlueShoes);
}

public void checkout_page() throws Exception {
	Thread.sleep(2000);
	clickElement(check_out);
}

public void Proceed_TO_Checkout() {
	elementisDisplayed(proceed_To_checkout);
	clickElement(proceed_To_checkout);
}

public void Biling_Details() throws Exception {
	Sendkeys(firstname, readconfig.getFirstname());
	Sendkeys(lastname, readconfig.getLastname());
	clickElement(click_on_the_country);
	clickElement(Country_India);
	Sendkeys(Street_address, readconfig.getAddress());
	Sendkeys(Town, readconfig.getTown());
	
	Sendkeys(zipcode, readconfig.getZipCode());

//---------------------------------------------
	clickElement(choose_TamilNadu);
	Thread.sleep(2000);
////----------------------------------------------
	Sendkeys(email_address, readconfig.getEmail());
	clickElement(Cash_On_Delivery);
	clickElement(Place_order);	
}

	
}
