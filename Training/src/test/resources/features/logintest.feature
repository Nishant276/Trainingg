Feature: Login Functionality
Scenario: Login with valid credentials

Given Navigate to Home
When user enter username and password
Then user logged in successfully
@sanity
Scenario: The one where the user change some of the data and place the order 
Given Larry has register into testmeapp 
When Larry increase the headphone quantity by 2
And  continue for checkout
And change the shipping address to a address as "Pune"
Then the product should be delivered to the new address