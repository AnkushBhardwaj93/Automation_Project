Feature: Verify actions on jquery website

  Scenario: web_Verify User is able to drag and drop a element
    Given User Navigated to Draggable Interaction Page
    When User perform drag and drop
    Then element drag and drop wworked


  Scenario: web_Verify user can click on item1, item 3, item7
    Given User Navigated to Selectable Interaction Page
    When User Selected items
    Then item should get selected



  Scenario: web_verify user can select  control group options
    Given User Navigated to controlGroup Interaction Page
    When User select group items
    Then group items should get selected