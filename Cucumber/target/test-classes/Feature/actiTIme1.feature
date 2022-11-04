Feature: To test login functionality
Scenario Outline: Verify user get logged in successfully with valid data
Given Browser gets open
And User is on login page
When User enters valid <UN> and <PWD>
And Click on login button
Then User should get navigated to homepage
Examples:
|UN		|PWD		|
|admin|manager|