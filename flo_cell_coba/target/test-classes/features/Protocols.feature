Feature: Protocols

Scenario: Run Flo Seeding 1 well to 1 daughter plate
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

Scenario: Run Flo Seeding 1 well to 2 daughter plate
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding seeding 2
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

Scenario: Cell counting
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding cell counting
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

Scenario: Harvesting
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding harvesting
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

Scenario: Formulate media
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding formulate media
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



