@smoke
  Feature: follow us | user checks all social media links
   Scenario: user opens facebook tab
     When user clicks on "facebook" icon
      Then "https://www.facebook.com/nopCommerce" is opened in new tab


    Scenario: user opens twitter tab
     When user clicks on "twitter" icon
     Then "https://twitter.com/nopCommerce" is opened in new tab

    Scenario: user opens rss tab
      When user clicks on "rss" icon
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

    Scenario: user opens youtube tab
      When user clicks on "youtube" icon
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab