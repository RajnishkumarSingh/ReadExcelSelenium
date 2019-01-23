Feature: Login feature
Background:
Given The login url of the demo app

Scenario Outline: A value for demo Web Shop

When user enters <username> as username
And User enters <pwd> as password
And clicks on login
Then user is <result>

Examples:
|username|password|result|
|askmail@email.com|abc123|valid|
|askmail29@gmail.com|abc123|invalid|