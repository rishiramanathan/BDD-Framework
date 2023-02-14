@First_Product
Feature: Place an order
      
    @Regression_for_BlueShoes      
    Scenario: Use Cash on delivery to place the order
 		Given user has opened the Application URL
 		And user can able to see the Add to Card button on Blue Shoes and clicks that button
 		And user clicks on checkout page
 		And user can able to see the PROCEED TO CHECKOUT button and clicks that button
 		Then user needs to enter all the mandatory details
 		Then close the driver
 		
 		 
 		
    
   