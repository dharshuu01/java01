

  Feature: To validate the login functionality of facebook application

Scenario Outline:
:To validate the login invalid username and valid password
Given user have to launch facebook application through chrome browser
When user have to enter "<username>" and valid "<password>"
And user have to click Login button
Then  user to reach the invalid credential page
  

    Examples: 
      | username  | password| 
      | priya|     535 |
      | vini |     790 | 
      |fijo  | 345|