
Feature: Login Profile

	Scenario: Sucessful login
	Given User navigates to home page
	And User navigates to login page
	When User fills email with "dakotatobar27@yahoo.com"
	And User fills password with "Cucumber#159"
	And User clicks the login button
	Then Login is successful
	And User should see "Hi there"
  And User should also see Logout Button

	Scenario: Failed login
	Given User navigates to home page
	And User navigates to login page
	When User fills email with "dakotatobar27@yahoo.com"
	And User fills password with "Cucumber#158"
	And User clicks the login button
	Then Login is unsuccessful
