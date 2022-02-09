Feature: Creation an Account

  @UserCreation
  Scenario: TC1 User can create an account
    When Launch browser
    Then Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    Then  Click on 'Signup / Login' button
    Then Verify 'New User Signup!' is visible
    And Enter name and email address
    Then Click 'Signup' button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    Then Select checkbox Sign up for our newsletter!
    Then Select checkbox Receive special offers from our partners!
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that Logged in as username is visible
    Then Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button
    Then capture the screenshot