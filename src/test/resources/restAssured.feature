Feature: Verify rest assured apis

  Scenario Outline: rst_Verify status code and firstname
    Given launch "<api>"
    Then verify status code as "<stcode>"
    Then verify firstname as "<fname>"
    Examples:
    |api|stcode|fname|
    |https://reqres.in/api/users?page=2|200|Byron|



    Scenario Outline: rst_verify status and response of post request
      Given launch "<api>"
      Then verify post api status code as "<stcode>"
      Then verify new created id is genrated
      Examples:
      |api|stcode|
      |https://reqres.in/api/users|201|