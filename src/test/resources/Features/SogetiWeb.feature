Feature: Sogeti

  @testcase1  @test
  Scenario: Verify services and automation selected
    Given user is on Sogeti landing page
    When user selects services and automation
    Then user verifies services and automation is selected

  @testcase2  @test
  Scenario: Enter data in contact Us form
    Given user is on Sogeti landing page
    When user selects services and automation
    And user scroll down to Contacts Us
    And user enters First Name, Last Name, Email, Phone, company and Message
    Then user selects country from dropdown and taps on submit

  @testcase3 @test
  Scenario: Verify Worldwide - all Country in Sogeti links are working
    Given user is on Sogeti landing page
    When user clicks on worldwide
    Then user verifies all links are working


