Feature: Application Login

Scenario: Verify Home page after login
Given User is on login page
When User logs in with Credentials
Then Home page is displayed