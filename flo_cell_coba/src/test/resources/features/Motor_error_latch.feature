Feature: Motor Error Latch Simulation Mode

@run1 
Scenario: Open WinSCP and Mock Hardware
When Minimize
And Open WinSCP
And Connect Putty IP 48
And Using Software 65
And Simulation mode
And Setting screen putty
And Open folder mock hardware
And Setting screen mock hardware

@run2
Scenario: Flo Mock Hardware ActuatorHardBrake When Pick Tip (Simulation Mode)
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
And Restart putty simulation mode
And Preparation

@run3
Scenario: Flo Mock Hardware ActuatorEncoderError When Dispense (Simulation Mode)
When Set error ActuatorEncoderError when Dispense
And Init mock hardware
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
And Restart putty simulation mode
And Preparation

@run4
Scenario: Flo Mock Hardware ActuatorUnknownError When Pick Tip (Simulation Mode)
When Set error ActuatorUnknownError when Pick Tip
And Init mock hardware
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
And Restart putty simulation mode
And Preparation


@run5
Scenario: Flo Mock Hardware ActuatorDisabled When Aspirate (Simulation Mode)
When Set error ActuatorDisabled when Aspirate
And Init mock hardware
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
And Restart putty simulation mode
And Preparation

#Scenario: Flo Mock Hardware ActuatorHardBrake When Align Pick Tip (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorHardBrake When Align Aspirate (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorHardBrake When Aspirate (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorHardBrake When Align Dispense (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorHardBrake When Dispense (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorHardBrake When Mixing (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorIlegalPos When Aspirate (Simulation Mode)
#Scenario: Flo Mock Hardware ActuatorAborted When Aspirate (Simulation Mode)
