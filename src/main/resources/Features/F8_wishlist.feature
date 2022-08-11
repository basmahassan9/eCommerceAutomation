@smoke
Feature: wishlist | user adds item to wishlist
  Scenario: user adds item to wishlist
    When user adds htc phone to wishlist
    Then item is added to wishlist message is displayed


  Scenario: user adds item to wishlist
    When user adds htc phone to wishlist
    And user clicks on wishlist tab
    Then its verified that an item is in wishlist