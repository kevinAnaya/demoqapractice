Feature: From

  Scenario: Form practice
    Given the user open a web page
    When the user enter the credential
      | name      | lastname  | email           | mobile        |  address  |
      | kevintest | davidtest | kdavid@test.com | 1234567897    |  monteria |
    Then the user can see the page wiht the register