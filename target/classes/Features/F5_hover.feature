@smoke
  Feature: hover | user can hover over categories and select a random subcategory
    Scenario: user selects category
      When user hovers over category
      Then random subcategory is selected
