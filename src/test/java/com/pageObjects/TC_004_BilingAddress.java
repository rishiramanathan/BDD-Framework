package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;


public class TC_004_BilingAddress extends BaseClass {
	
	
	@FindBy (xpath = "//*[text()='Addresses']")
	@CacheLookup
	private WebElement Address;
	
	@FindBy (xpath = "(//*[text()='Add'])[1]")
	@CacheLookup
	private WebElement Add;
	
	//----------------PageFactory------------------
	
	public TC_004_BilingAddress(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------------------------
	
	
	public void Click_on_the_Address() {
		clickElement(Address);
	}
	
	public void Click_on_the_Add() {
		clickElement(Add);
	}

}
