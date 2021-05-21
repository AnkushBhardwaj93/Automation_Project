Feature: Verify Mobile app using appium

  Scenario Outline: mob_Verify the title of page
    Given application is launched
    Then click on continue on firstpage
    Then click Ok on notification
    Then verify page title

    Examples:
    ||
    ||

  Scenario Outline: mob_Verify user able to click on Display Toast
    Given application is launched
    Then click on continue on firstpage
    Then click Ok on notification
    Then click on Display a Toast
    Then verify Toast text

    Examples:
      ||
      ||

  Scenario Outline: mob_Verify user able to click on Display pop-up Window
    Given application is launched
    Then click on continue on firstpage
    Then click Ok on notification
    Then click on pop-up button
    Then click on Dismiss

    Examples:
      ||
      ||


  Scenario Outline: mob_Verify user able to click on Progress Bar
    Given application is launched
    Then click on continue on firstpage
    Then click Ok on notification
    Then click on progress Bar
    Then click on Dismiss

    Examples:
      ||
      ||

  Scenario Outline: mob_Verify user able to click on unhandled Exception
    Given application is launched
    Then click on continue on firstpage
    Then click Ok on notification
    Then click on unhandled Exception
    Then verify page title

    Examples:
      ||
      ||


