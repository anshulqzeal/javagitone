Feature: Login

Scenario: Valid Login
  Given user is on login page
  When user enters username "tomsmith" and password "SuperSecretPassword!"
  Then user should be logged in

Scenario: Invalid Login
  Given user is on login page
  When user enters username "tomsmith" and password "wrong"
  Then error message should be displayed