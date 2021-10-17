Feature: search and place order for vegetables


Scenario: Search for items and validate results
Given  user is on Greencart landing page
When user searched for Cucumber vegetable
Then "Cucumber" results are displayed 



Scenario Outline: Search for items and then move to checkout page
Given  user is on Greencart landing page
When user searched for <Name> vegetable
And item to added to cart
And User proceeded to check out page for purchase
Then Verify selected <Name> items are displayed in check out page

Examples:
|Name|
|Brinjal|
|Brocolli|

@SeleniumTest
Scenario Outline: Search for items and then move to checkout page
Given  user is on Greencart landing page
When user searched for <Name> vegetable
And item to added to cart
And User proceeded to check out page for purchase
Then Verify selected <Name> items are displayed in check out page
Then click on place order and proceed
Then Order placed successfully
 
 Examples:
|Name|
|Brocolli|



