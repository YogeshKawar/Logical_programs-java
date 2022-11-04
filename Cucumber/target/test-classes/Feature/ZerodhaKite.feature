Feature: To verify successful login on https://kite.zerodha.com/
Scenario Outline: Verify user gets logged in with valid data
Given Enter url in browser
And Login page gets open
When User enters <UN> and <PWD> and <PIN>
Then User should get navigated on homepage

Examples:
|UN    |PWD      |PIN   |
|DPG458|Amol@1234|171992|

Examples:
|UN    |PWD      |PIN   |
|Dv1510|Goal@123 |959594|