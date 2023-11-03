@PhaseTwo
Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new Tasks
Given User is logged in
When User create a new tasks

@RegressionTest
Scenario: View a Tasks
Given User is logged in
When User view tasks details

Scenario: Delete a Tasks
Given User is logged in
When User delete a tasks