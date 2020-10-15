Feature: Search Functionality



@Senity
Scenario: Verify Login

Given launc "<URL>"
Then Click on Signin Link
Then Click on Signin Button
Then Enter UserPass and click login
Then Verify user login successfully 


@Jahan
Scenario: Verify search result

Given launc "<URL>"
Then Type product name
Then Click search
Then Verify Search result



