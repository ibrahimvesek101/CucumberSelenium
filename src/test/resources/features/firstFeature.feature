@login
Feature: First Feature Tests

  @smoke
  Scenario: Smoke Test 1
    Given Elimizde 5 sayısı mevcut.
    And  Elimizde 3 sayısı mevcut.
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir.

  @regression @smoke
  Scenario: Regression Test 1
    Given Elimizde 5 sayısı mevcut.
    And  Elimizde 3 sayısı mevcut.
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir.

