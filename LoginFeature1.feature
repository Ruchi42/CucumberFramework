
Feature: Login
  Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
     When User clicks on Logout link
     Then Page Title should be shown as "Your store. Login"
     And close browser

  