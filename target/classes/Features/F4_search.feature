@smoke

  Feature: Search | user could search for product

    Scenario Outline: user search using product name
      When user enters "<product>" for product
      And user click on search button
      Then user locates "<product>" successfully
      Examples:
      | product |
      | book    |
      | laptop  |
      | nike    |

    Scenario Outline: user search using sku
      When user enters "<sku>" for product
      And user click on search button
      Then user clicks on product
      And user confirms "<sku>" for product
      Examples:
      | sku |
      | AS_551_LP |
      | NK_FRC_RS |
