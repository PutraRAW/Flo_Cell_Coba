Feature: Close Ticket

Scenario: Custom
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding seeding 1 
And Click execute create ticket
And Get ticket
And Go to menu POST run ticket
And Paste tiket in menu POST run ticket
And Click execute run ticket
And Go to menu GET progress ticket 
And Paste ticket in menu GET progress ticket
And See Progress
And Should success test running
And Go to menu instrument
And Go to menu GET last run error
And Click execute last run error
And Response body last run error
And Go to menu DELETE ticket
Then Click execute close ticket


Scenario:Close ticket after the protocol execution done
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding seeding 1 
And Click execute create ticket
And Get ticket
And Go to menu POST run ticket
And Paste tiket in menu POST run ticket
And Click execute run ticket
And Go to menu GET progress ticket 
And Paste ticket in menu GET progress ticket
And See Progress
And Should success test running
And Go to menu DELETE ticket 
Then Click execute close ticket
And Response headers close ticket
And Input koding seeding 1 
And Click execute create ticket
And Get ticket
And Clear textbox menu POST run
And Paste tiket in menu POST run ticket
And Click execute run ticket
And Clear textbox menu GET progress
And Paste ticket in menu GET progress ticket
And See Progress 2
And Should success test running
And Go to menu DELETE ticket with ticket 
And Paste ticket in menu DELETE ticket with ticket
Then Click execute close ticket with ticket
And Response headers close ticket with ticket


Scenario: Close ticket when there is no active ticket
Given Open web url rest api
And Go to menu tiket
And Go to menu DELETE ticket 
Then Click execute close ticket
And Response body close ticket
And Response headers close ticket


