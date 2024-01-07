Feature: Amazon order page

Background:
Given a register user exists
Given user is on amazon login page 
When user enter user name
And user enter password
And user clicks on login button
Then user navigates to order page

Scenario: Check Previous order details
When user clicks on Previous order link
Then user checks the previous order page

Scenario: Check Cancelled order details
When user clicks on Cancelled order link
Then user checks the Cancelled order page

Scenario: Check open order details
When user clicks on open order link
Then user checks the open order page