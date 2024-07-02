
Feature:Bank test

  @sanity @smoke
  Scenario: Bank Manager Should Add Customer Successfully
    Given I am on homepage
    When I click on Bank Manger login tab
    And I click on Add customer tab
    And enter FirstName
    And enter LastName
    And enter PostCode
    And I click on Add customer button
    Then I verify message Customer added
    And I click on ok button on popup

  @smoke @regression
  Scenario: Bank Manager Should Open Account Successfully
    Given I am on homepage
    When I click on Bank Manger login tab
    And I click on Open account tab
    And Search customer that created in first test
    And select currency
    And click on process
    Then I verify message Account created
    And I click on ok button on popup

  @regression
  Scenario: Customer Should Login And Logout Suceessfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    Then I verify LogOut tab is displayed
    And I click on LogOut
    Then verify Your Name text is displayed

  @sanity
  Scenario: Customer Should Deposit Money Successfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    And click on Deposit
    And enter amount one hundred
    And click on Deposit button
    Then I verify Deposit successful

  @sanity
  Scenario: Customer Should Withdraw Money Successfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    And click on Withdraw
    And enter amount
    And click on Withdraw button

    Then I verify Transction successful

