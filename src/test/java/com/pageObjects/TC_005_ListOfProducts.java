package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class TC_005_ListOfProducts extends BaseClass{
	
	@FindBy(xpath = "//*[text()='Blue Shoes']")
	@CacheLookup
	private WebElement BlueshoesText;
	
	@FindBy(xpath = "(//*[text()='Add to cart'])[1]")
	@CacheLookup
	private WebElement Blueshoes;
	//---------------------------------------------------------------
	@FindBy(xpath = "//*[text()='Denim Blue Jeans']")
	@CacheLookup
	private WebElement BluejeansText;
	
	@FindBy(xpath = "(//*[text()='Add to cart'])[2]")
	@CacheLookup
	private WebElement Bluejeans;
	//--------------------------------------------------------------
	@FindBy(xpath = "//*[text()='Anchor Bracelet']")
	@CacheLookup
	private WebElement BracelotText;
	
	@FindBy(xpath = "(//*[text()='Add to cart'])[4]")
	@CacheLookup
	private WebElement Bracelot;
	//-------------------------------------------------------------
	@FindBy(xpath = "Blue Tshirt")
	@CacheLookup
	private WebElement BlueTshirtText;
	
	@FindBy(xpath = "(//*[text()='Add to cart'])[5]")
	@CacheLookup
	private WebElement BlueTshirt;
	//-------------------------------------------------------------
	
	@FindBy(xpath = "//*[@class='ast-cart-menu-wrap']")
	@CacheLookup
	private WebElement click_on_the_viewcart;
	

	@FindBy(xpath = "(//*[text()='Cart'])[1]")
	@CacheLookup
	private WebElement Cart;
	
	@FindBy(xpath = "//*[@class='product-name']")
	@CacheLookup
	private List<WebElement> lov;
	
	@FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
	@CacheLookup
	private WebElement ptc;
	
	
	     //----------------PageFactory------------------
	
		public TC_005_ListOfProducts(){
			super();
			PageFactory.initElements(driver, this);
		}
		
		//--------------------------------------------
		
		public void ListOfProducts() {
			
			clickElement(Blueshoes);
			
			clickElement(Bluejeans);

			clickElement(Bracelot);
			
			clickElement(BlueTshirt);

		}
		
		public void click_on_the_ViewCart() throws Exception {
			clickinglop(click_on_the_viewcart);
		}

		public void cart_is_displayed() {
			elementisDisplayed(Cart);
		}
		
		public void printing_list_of_products() {

			for(WebElement product_price: driver.findElements(By.xpath("//*[@class='wp-block-group__inner-container']")))
			{
				System.out.println("\n"+product_price.getText()+"\n");
			}
			
		}
		
		public void click_on_the_checkout() {
			clickElement(ptc);
		}
	
}
