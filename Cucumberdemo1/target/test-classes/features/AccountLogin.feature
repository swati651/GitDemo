Feature: Application Login
@SanityTest
Scenario: Home Page default Login
Given user is on NetBanking landing page
When user login into application with "jin" and password "1234"
Then Home page is populated
And cards displayed are "true"

