Feature: Update profie

	Scenario: Use calculator
	Given User navigates to the calculator page
	When User enters 1
	And User adds 1
	And User subtracts 1
	And User multiplies by 2
	And User divided by 2
	And User presses enter
	Then Return value is 1
