@PhaseOne
Feature: Tasks CRUD Management

@SmokeTest @RegressionTest
Scenario: Create a new Contacts
Given User is logged in
When User create a new contacts

@RegressionTest
Scenario: View a Contacts
Given User is logged in
When User view contact details

Scenario: Delete a Contacts
Given User is logged in
When User delete a contacts