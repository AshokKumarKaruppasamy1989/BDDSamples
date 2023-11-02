Feature: User Login

Scenario: Valid Login
Given User is on Login Page
When User enter "tomsmith" and "SuperSecretPassword!"
Then should display success message 