Feature: Register

  Background:
    Given I am on homepage

  @smoke @sanity @regression
  Scenario: Verify user should navigate to register page successfully
    When I click on register link
    Then I should be able to navigate to Register page showing "Register" text

  @sanity @regression
  Scenario: Verify that first name, last name, email, password and confirm password fields are mandatory
    When I click on register link
    And I click on register button
    Then I should be able to see error messages at mandatory fields

  @regression
  Scenario: Verify that user should create account successfully
    When I click on register link
    And I select gender as "Female"
    And I enter first name as "Gaurav"
    And I enter last name as "Patel"
    And I select day as "10"
    And I select month as "March"
    And I select year as "1990"
    And I enter new email "abc123@abc.com"
    And I enter password as "abcd1234#"
    And I enter confirm password as "abcd1234#"
    And I click on register button
    Then I should be registered successfully with message "Your registration completed"
