@PhaseOne
Feature: Google search page

@SmokeTest @RegressionTest
Scenario: search selenium in google page
Given user launch the web page
When user search the selenium in page
Then verify the selenium page title

@RegressionTest
Scenario: search cypress in google page
Given user launch the web page
When user search the cypress in page
Then verify the cypress page title

@RegressionTest
Scenario: search uft in google page
Given user launch the web page
When user search the uft in page
Then verify the uft page title

@SanityTest
Scenario: search SpringBoot in google page
Given user launch the web page
When user search the SpringBoot in page
Then verify the SpringBoot page title

