Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Background:
    Given I am on homepage

  @smoke @sanity @regression
  Scenario: User should navigate to login page successfully
    When I click on login link
    Then I should navigate to login page successfully

  @sanity @regression
  Scenario Outline: Verify error message while using invalid credentials
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "prime123"
    And I click on login button
    Then I should login successfully

  @regression
  Scenario: Verify that user should be able to logout successfully
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "prime123"
    And I click on login button
    And I click on logout link
    Then I should be able to logout successfully
