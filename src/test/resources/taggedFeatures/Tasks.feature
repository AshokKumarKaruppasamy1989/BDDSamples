@PhaseTwo
Feature: Tasks CRUD Management

Background:
Given User is logged in
When User enters credentials
Then should be navigated to dashboard page

@SmokeTest
Scenario: Create a new Tasks
When User create a new tasks

@RegressionTest
Scenario: View a Tasks
When User view tasks details

@RegressionTest
Scenario: Delete a Tasks
When User delete a tasks