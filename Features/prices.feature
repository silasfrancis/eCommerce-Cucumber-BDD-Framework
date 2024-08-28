Feature: Prices

  @regression
  Scenario Outline: Comparing expected prices and actual prices
    Given User launch browser
    When User opens URL "https://awesomeqa.com/ui/"
    Then click on search box and input "<item_name>"
    And click search button
    And compare "<item_name>" and displayed item name
    And compare "<price>" and price displayed

    Examples:
    | item_name | price |
    | iMac      | $122.00 Ex Tax: $100.00 |
    | Samsung SyncMaster 941BW | $242.00 Ex Tax: $200.00 |
    |HTC Touch HD              |	$122.00 Ex Tax: $100.00 |
    | iPhone |	$123.20 Ex Tax: $101.00|




