Feature: Login Feature
  Background:
    Given user in Amazon Homepage
    And user click on Account & list section

  @test
  Scenario: User should be able to login with valid email and valid password
    And user enter valid email address
    And user click on continue button
    And user enter valid password
    When user clicks on Sign in button
    Then the user should be able to login successfully