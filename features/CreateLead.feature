Feature: CreateLead functionality of Leaftaps application
Background:
Given Launch the browser
And Load the URL

Scenario Outline: Create multiple Leads

And Enter username as Demosalesmanager
And Enter password as crmsfa
When Click the login button
Then It should navigate to next page

When Click CRMSFA link
And Click Leads button
And Click Create Lead button

Given ENter company name as <company>
And Enter firstname as <fname>
And Enter lastname as <lname>

When Click Submit button
Then Lead should be created

Examples:
|company|fname|lname|
|Testleaf|Vineeth|R|
|QEagle|Hari|R|

