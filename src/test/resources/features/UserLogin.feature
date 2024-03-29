Feature: User Login


#Scenario: Valid Login
#Given User is on Login Page
#When User enter "tomsmith" and "SuperSecretPassword!"
#Then should display success message

Scenario: Valid Login
Given User is on Login Page
When User enter credentials
| username | password |
| tomsmith | SuperSecretPassword! |
Then should display success message

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enter "<username>" and "<password>"
#Then should display success message

#Examples:
#| username | password |
#| tomsmith | SuperSecretPassword! |
#| testuser1 | welcome123 |
#| testuser2 | welcome123 |