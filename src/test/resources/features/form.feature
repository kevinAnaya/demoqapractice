Feature: From

  Scenario: Form practice
    Given the user open a web page
    When the user enter the credential
      | name      | lastname  | email           | mobile | subjects | address  |
      | kevintest | davidtest | kdavid@test.com | 123    | English  | monteria |
    Then the user can see the page wiht the register