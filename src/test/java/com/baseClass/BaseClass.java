package com.baseClass;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	 @BeforeClass
	  public void setup(){
		   
		 	WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    
		    driver.get("https://askomdch.com/");
	  }  
	 //-------------------------------------------------------------------------------------------------------------------
	 
	 // Click 
	 public static void clickElement(WebElement element) {
		 try {
			   element.click(); 
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 }catch(Exception e) {
			 e.printStackTrace();
			 try {
				 WebDriverWait wait = new WebDriverWait(driver, 15);
				 wait.until(ExpectedConditions.elementToBeClickable(element));
			 } catch (Exception e2) {
				 
			 }
		 }
	 }
	 
	 //click finctionality for list of products
	 
	 public static void clickinglop(WebElement element) throws Exception {
		 Thread.sleep(3000);
		 element.click(); 
		
		
	 }
	 
	 // Is Displayed
	 public static boolean elementisDisplayed(WebElement element) {
		 boolean displayed = false;
		 try {
			 displayed = element.isDisplayed();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		return displayed;
	 }
	 
	 // Mouse Hover
	 public static void mouseOver(WebElement element) {
		 try {
			 Actions ac = new Actions(driver);
			 if(elementisDisplayed(element)) {
				 ac.moveToElement(element).build().perform();
			 }
		 }catch(Exception e){
			 e.printStackTrace();
			 try {
				 WebDriverWait wait = new WebDriverWait(driver, 15);
				 wait.until(ExpectedConditions.visibilityOf(element));
			 } catch (Exception e2) {
				 
			 }
		 }
	 }
	 
	 // Sendkeys
	 public static void Sendkeys(WebElement element, String value) {
		 try {
			 if(elementisDisplayed(element)) {
				 element.sendKeys(value);
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
			 try {
				 WebDriverWait wait = new WebDriverWait(driver, 15);
				 wait.until(ExpectedConditions.elementToBeSelected(element));
			 } catch (Exception e2) {
				 
			 }
		 }
	 }
	 
	 // Dropdown
	 public static void Dropdown(WebElement element, String value) {
		 Select s = new Select(element);
		 s.selectByVisibleText(value);
	 }
	 
	 // Get text
	 public static void GetText(WebElement element) {
		 try {
			 Thread.sleep(2000);
			 System.out.println(element.getText());
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 // Clear
	 
	 public static void Clear(WebElement element) {
		 try {
			   element.clear(); 
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 }catch(Exception e) {
			 e.printStackTrace();
			 try {
				 WebDriverWait wait = new WebDriverWait(driver, 15);
				 wait.until(ExpectedConditions.elementToBeClickable(element));
			 } catch (Exception e2) {
				 
			 }
		 }
	 }


	//-------------------------------------------------------------------------------------------------------------------
	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
