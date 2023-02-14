Feature: Biling account fuctionality

Scenario Outline: Login into the account
	Given user has opened the Application URL
	When user enters "<EmailAddress>" and "<loginpassword>"
	Then user needs clicks on login button
	When user clicks on Address
	And user needs to click on Add button
	Then users needs to enter all the mandatory details and click on Save Address button
	Then close the driver
	
	Examples:
  | EmailAddress           | loginpassword |
  | rishi789@gmail.com     | rishi789      |