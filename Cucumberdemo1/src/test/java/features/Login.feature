Feature: Application Login

@MobileTest
Scenario: Home Page default Login
Given user is on NetBanking landing page
When user login into application with "jin" and password "1234"
Then Home page is populated
And cards displayed are "true"
@RegTest @SmokeTest
Scenario: Home Page default Login
Given user is on NetBanking landing page
When user login into application with "john" and password "345"
Then Home page is populated
And cards displayed are "false"
@SanityTest
Scenario: Home Page default Login
Given user is on NetBanking landing page
When user signup with below details
|swati |mare|swatimare@gmail.com|India|324556|
Then Home page is populated
And cards displayed are "false"

@SmokeTest
Scenario Outline: Home Page default Login
Given user is on NetBanking landing page
When user login in to application with <Username> and <Password>
Then Home page is populated
And cards displayed are "true"

Examples:
|Username|Password|
|user1 |pass1|
|user2 |pass2|