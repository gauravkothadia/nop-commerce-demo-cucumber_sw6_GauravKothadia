Feature: Computer Page Features
  User able to select the product to shopping cart.

  Background:
    Given I am on homepage

  @smoke @sanity @regression
  Scenario: Verify user should be able to navigate computer page successfully
    When I click on "Computer" tab
    Then I should be navigated to computer page displaying heading as "Computers"

  @sanity @regression
  Scenario: Verify user should navigate to Desktop page successfully
    When I click on "Computer" tab
    And I click on "Desktop" link
    Then I should be navigated to Desktop page displaying heading as "Desktops"

  @regression
  Scenario Outline: Verify user should build your own computer and add to cart successfully
    When I click on "Computer" tab
    And I click on "Desktop" link
    And I click on product name Build your own computer
    And I select the processor as "<processor>"
    And I select the RAM as "<ram>"
    And I select the HDD as "<hdd>"
    And I select the OS as "<os>"
    And I select the software as "<software>"
    And I click on Add to card button
    Then I should see successful message as "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Home [+$50.00]          | Total Commander [+$5.00]   |