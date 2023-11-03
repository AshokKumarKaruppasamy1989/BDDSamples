@PhaseThree
Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new Deals
Given User is logged in
When User create a new deals

@RegressionTest
Scenario: View a Deals
Given User is logged in
When User view deals details

Scenario: Delete a Deals
Given User is logged in
When User delete a deals