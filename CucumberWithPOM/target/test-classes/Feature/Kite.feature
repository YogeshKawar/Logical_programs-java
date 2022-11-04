Feature: To test login functionality of Zerodha
Scenario Outline: Verify Zerodha login successfully with valid data
Given Browser is open on Chrome
And User on login1 page
When User enters <UN> and <PWD>
And Click on login button
Then User navigates to login2 page and enters <PIN>
And Click on continue button
Then Verify login successfully with <USERID>

Examples:
|UN    |PWD      |PIN   |
|Dv1510|Goal@123 |959594|
