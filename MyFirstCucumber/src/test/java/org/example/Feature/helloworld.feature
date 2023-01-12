@hello_world
Feature: Greeting Everybody Hello World
  Scenario: Default Greeting
    Given I am running this test
    When All plugins are installed properly
    Then A Hello World greeting is an output
    And The last line is Hi World
  Scenario: Another Greeting able to use the same step definition
    Given I am running this test
    When All plugins are installed properly
    Then A Hello World greeting is an output
    And The last line is Hello World