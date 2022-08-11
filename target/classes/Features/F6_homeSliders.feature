@smoke
  Feature: slider | check 2 home sliders
    Scenario: user click on nokia slider
      When user clicks on nokia slider image
      Then user is directed to "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: user clicks on iphone slider
      When user clicks on Iphone slider image
      Then user is directed to "https://demo.nopcommerce.com/iphone-6"
