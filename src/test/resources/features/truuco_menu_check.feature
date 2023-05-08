@wip
Feature: Default

  Scenario: Check Leistungen page of truuco.de
    When user is on the truuco Page
    And user accept Cookies
    And user click Menu Button
    And user click Leistungen Button
    Then check user on the Leistungen page

  Scenario: Check ueber-uns of truuco.de
    When user is on the truuco Page
    And user accept Cookies
    And user click Menu Button
    And user click ueber_uns Button
    Then check user on the ueber-uns page

  Scenario: Check jobs of truuco.de
    When user is on the truuco Page
    And user accept Cookies
    And user click Menu Button
    And user click jobs Button
    Then check user on the jobs page





