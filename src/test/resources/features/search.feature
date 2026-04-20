Feature: Search

Scenario: Search Product
  Given user is on homepage
  When user searches for "Selenium"
  Then results should be displayed