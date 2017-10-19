@Before
Feature: Login
@Login 
	Scenario: Logging with a wrong credentials
	Given User is on Main Page
	When User clicks on Sign In button
	And User provides email "sadqf@gmail.com" and password "Test123"
	And User clicks the continue button
	Then The error message should be displayed