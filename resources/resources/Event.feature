#Author: ridhotadjudin@gmail.com

@tag
Feature: Create New Event

  @tag1
  Scenario Outline: Create new event with data
    Given User at Main Activity
    When User tap add button
    And User tap create new event button
    And User go to New Event Activity
    And User input <eventname> and <eventplace>
    And User input <companies> and <phone>
    And User choose encounter type and prevention type
    And User input <notes>
    Then User save new event
    And User back to Main Activity

    Examples: 
      | eventname | eventplace | companies | phone | notes 	|
      | name1 		| place1 	   | barudaks1 | 08212 | notes1 |
      | name2 		| place2     | barudaks2 | 09456 | notes2 |
