Feature: Abort Ticket

Scenario: Abort while scan deck
Given Open web url rest api
And Go to menu tiket
And Go to menu POST create ticket
And Input koding seeding 1 
And Click execute create ticket
And Get ticket
And Go to menu POST run ticket
And Paste tiket in menu POST run ticket
And Click execute run ticket
And Go to menu POST abort ticket
And Paste tiket in menu POST abort ticket
And Click execute abort ticket
And Go to menu DELETE ticket
Then Click execute close ticket

Scenario: Flo Mock Hardware ActuatorHardBrake When Pick Tip (Flo System)
When Minimize
And Open WinSCP
And Connect Putty IP 48
And Using Software WET
And Cek status flo 
And Setting screen putty
And Open folder mock hardware
And Setting screen mock hardware
And Init mock hardware
When Set error ActuatorHardBrake when Pick Tip
And Set mocked hardware
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
And See progress mocked
And Go to menu instrument
And Go to menu GET last run error
And Click execute last run error
And Response body last run error
And Go to menu DELETE ticket
Then Click execute close ticket
Then Close driver
And Clear mocked hardware
And Deinit
And Restart putty flo

