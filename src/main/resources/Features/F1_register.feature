@smoke
Feature: register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user selects gender
    And user enters valid data
    And user enters date of birth
    And user enters email
    And user fills password fields
    And user click on register
    Then success message is displayed