Feature: Validate SauseLogin page

Scenario Outline: Verify the Sause home page after login successfully

Given Launch the login page
When enter "<username>" and "<password>"
And click on login button
Then Successfully launch the Sause home page

Examples:

|username     |password|
|standard_user|secret_sauce|
