@tag
Feature: Being in debt

	@tag1
  Scenario: My credit card
    Given User signed up for my credit card
    And have a crazy high APR
    When User makes any purchase
    Then Customer available balance will dramtically decrease
    And purchase will be charged with the 75% APR
    
	@tag2
  Scenario: My amazing housing program
    Given User signs a house
    And They dont read the small print
    When User receives first bill
    Then User realizes the morgage is high
