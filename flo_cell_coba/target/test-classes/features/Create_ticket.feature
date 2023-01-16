
Feature: Create Ticket


    Scenario: Create ticket
        Given Open web url rest api
        And Go to menu tiket
        And Go to menu POST create ticket
        And Input koding seeding 1
        And Click execute create ticket
        And Response body create ticket
        And Go to menu DELETE ticket
        Then Click execute close tiket


    Scenario: Create tiket when the system is busy (running protocol)
        Given Open web url rest api
        And Go to menu tiket
        And Go to menu POST create ticket
        And Input koding seeding 1
        And Click execute create ticket
        And Response body create ticket
        And Get ticket
        And Go to menu POST run ticket
        And Paste tiket in menu POST run ticket
        And Click execute run ticket
        And Input koding seeding 1
        And Click execute create ticket
        And Response body create ticket
        And Go to menu DELETE ticket
        Then Click execute close tiket


    Scenario: Create ticket when the system is on manual mode
        Given Open web url control panel
        When Login username and password
        And Click button MANUAL MODE
        And Open new tab to Restapi
        Given Open web url rest api
        And Go to menu tiket
        And Go to menu POST create ticket
        And Input koding seeding 1
        And Click execute create ticket
        And Response body create ticket
        And Go to menu DELETE ticket
        Then Click execute close tiket


    Scenario:Create ticket when the previous ticket not close yet 
        Given Open web url rest api
        And Go to menu tiket
        And Go to menu POST create ticket
        And Input koding seeding 1
        And Click execute create ticket
        And Response body create ticket
        And Click execute create ticket
        And Response body create ticket
        And Go to menu DELETE ticket
        Then Click execute close tiket



