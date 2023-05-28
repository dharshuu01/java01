

Feature: To validate the registration and login functionality of facebook application

  Scenario: to validate the login invalid username and invalid password
Given user have to launch facebook application through chrome browser
When user have to enter invalid and valid password 
And user have to click Login button 
Then  user to reach the invalid credential page


 Scenario: to register and fill the details that facebook app wants
Given user have to launch facebook application through chrome browser
When user have to click create new acc and fill details 
And user have to click sign up
Then  user to reach the invalid credential page
