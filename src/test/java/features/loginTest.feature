
Feature: Login Test
@LoginFirefox
Scenario: Logging with a wrong credentials on Firefox
Given The http://automationpractice.com/index.php website is open
When User clicks on the Sign Up button
And User provides wrong email and/or password
Then Login will fail
@LoginChrome
Scenario: Logging with a wrong credentials on Chrome
Given The http://automationpractice.com/index.php website is openChrome
When User clicks on the Sign Up buttonChrome
And User provides wrong email and/or passwordChrome
Then Login will failChrome


