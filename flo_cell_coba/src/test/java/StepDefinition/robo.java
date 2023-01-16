package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class robo extends variable {

    @When ("Minimize")
    public void Close_VsCode() throws AWTException, InterruptedException {

        Robot bot = new Robot();
        Thread.sleep(5000);
        bot.keyPress(KeyEvent.VK_WINDOWS);bot.keyPress(KeyEvent.VK_M); 
        bot.keyRelease(KeyEvent.VK_WINDOWS);bot.keyRelease(KeyEvent.VK_M);
        
    }

    @And ("Open WinSCP")
    public void Open_WinSCP() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        int WinSCP = InputEvent.BUTTON1_DOWN_MASK;

        bot.keyPress(KeyEvent.VK_W);
        bot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        bot.keyPress(KeyEvent.VK_4);
        bot.keyPress(KeyEvent.VK_8);
        bot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        String myString = "einstein13";
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);

        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_CONTROL);  
        bot.keyRelease(KeyEvent.VK_V); 
        bot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        bot.keyPress(KeyEvent.VK_ALT);bot.keyPress(KeyEvent.VK_SPACE);bot.keyPress(KeyEvent.VK_X);  
        bot.keyRelease(KeyEvent.VK_ALT);bot.keyRelease(KeyEvent.VK_SPACE);bot.keyRelease(KeyEvent.VK_X);
        Thread.sleep(2000);

        //Tarik layar
        bot.mouseMove(600, 0);
        bot.mousePress(WinSCP);
        bot.mouseMove(1365, 400);
        bot.mouseRelease(WinSCP);
        Thread.sleep(2000);

        //click pojok
        bot.mouseMove(940, 16);
        bot.mousePress(WinSCP);
        bot.mouseRelease(WinSCP); 
        Thread.sleep(2000); 

    }

    @And ("Connect Putty IP 48")
    public void Connect_Putty_IP_48() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        //menu terminal
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_P);
        bot.keyRelease(KeyEvent.VK_CONTROL);  
        bot.keyRelease(KeyEvent.VK_P);
        Thread.sleep(2000);

        bot.keyPress(KeyEvent.VK_E);
        bot.keyPress(KeyEvent.VK_I);
        bot.keyPress(KeyEvent.VK_N);
        bot.keyPress(KeyEvent.VK_S);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_E);
        bot.keyPress(KeyEvent.VK_I);
        bot.keyPress(KeyEvent.VK_N);
        bot.keyPress(KeyEvent.VK_1);
        bot.keyPress(KeyEvent.VK_3);
        bot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        bot.keyPress(KeyEvent.VK_WINDOWS);bot.keyPress(KeyEvent.VK_UP);
        bot.keyRelease(KeyEvent.VK_WINDOWS);bot.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(2000);

    }

    @And ("Using Software 65")
    public void Using_Software_65() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_C);bot.keyPress(KeyEvent.VK_D);
        bot.keyPress(KeyEvent.VK_SPACE);

        bot.keyPress(KeyEvent.VK_SLASH);bot.keyPress(KeyEvent.VK_O);bot.keyPress(KeyEvent.VK_P);bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_SLASH);bot.keyPress(KeyEvent.VK_F);bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_SLASH);bot.keyPress(KeyEvent.VK_2);bot.keyPress(KeyEvent.VK_TAB);bot.keyPress(KeyEvent.VK_5);
        bot.keyPress(KeyEvent.VK_ENTER);
    }

    @And ("Using Software WET")
    public void Using_Software_WET() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_C);bot.keyPress(KeyEvent.VK_D);
        bot.keyPress(KeyEvent.VK_SPACE);

        bot.keyPress(KeyEvent.VK_SLASH);bot.keyPress(KeyEvent.VK_O);bot.keyPress(KeyEvent.VK_P);bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_SLASH);bot.keyPress(KeyEvent.VK_F);bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_SLASH); bot.keyPress(KeyEvent.VK_SHIFT);bot.keyPress(KeyEvent.VK_W);bot.keyRelease(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_ENTER);
    }

    @And ("Simulation mode")
    public void Simulation_mode() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        //sudo ./FloWebServer
        bot.keyPress(KeyEvent.VK_S);bot.keyPress(KeyEvent.VK_U);bot.keyPress(KeyEvent.VK_D);bot.keyPress(KeyEvent.VK_O);
        bot.keyPress(KeyEvent.VK_SPACE);

        bot.keyPress(KeyEvent.VK_PERIOD);
        bot.keyPress(KeyEvent.VK_SLASH);
        bot.keyPress(KeyEvent.VK_SHIFT);bot.keyPress(KeyEvent.VK_F);bot.keyRelease(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_L);
        bot.keyPress(KeyEvent.VK_O);
        bot.keyPress(KeyEvent.VK_SHIFT);bot.keyPress(KeyEvent.VK_W);bot.keyRelease(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_E);
        bot.keyPress(KeyEvent.VK_B);
        bot.keyPress(KeyEvent.VK_SHIFT);bot.keyPress(KeyEvent.VK_S);bot.keyRelease(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_E);
        bot.keyPress(KeyEvent.VK_R);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyPress(KeyEvent.VK_E);
        bot.keyPress(KeyEvent.VK_R);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.delay(10000); 
      
    }

    @And ("Cek status flo")
    public void Cek_Status_flo() throws AWTException, InterruptedException{

        Robot bot = new Robot();
        
        //sudo systemctl status flo-webserver.service
        bot.keyPress(KeyEvent.VK_S);bot.keyPress(KeyEvent.VK_U);bot.keyPress(KeyEvent.VK_D);bot.keyPress(KeyEvent.VK_O);
        bot.keyPress(KeyEvent.VK_SPACE);

        bot.keyPress(KeyEvent.VK_S);
        bot.keyPress(KeyEvent.VK_Y);
        bot.keyPress(KeyEvent.VK_S);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_C);
        bot.keyPress(KeyEvent.VK_TAB);

        bot.keyPress(KeyEvent.VK_S);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_A);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyPress(KeyEvent.VK_TAB);

        bot.keyPress(KeyEvent.VK_F);
        bot.keyPress(KeyEvent.VK_L);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_W);
        bot.keyPress(KeyEvent.VK_TAB);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.delay(5000);  
      
    }

    @And ("Setting screen putty")
    public void Setting_screen() throws AWTException, InterruptedException{

        Thread.sleep(1000);
        Robot robot = new Robot();
        int Setting_screen = InputEvent.BUTTON1_DOWN_MASK;

        robot.mouseMove(600, 0);
        robot.mousePress(Setting_screen);
        robot.mouseMove(1365, 400);
        robot.mouseRelease(Setting_screen);
        Thread.sleep(1000);

        robot.mouseMove(0, 0);
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen); 
        Thread.sleep(2000); 
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen); 
        Thread.sleep(2000);

    }

    
    @And ("Open folder mock hardware")
    public void Open_folder_mock_hardware() throws AWTException, InterruptedException{
     
        //Robot bot = null;
        Robot bot1 = new Robot();

        int mock_hardware = InputEvent.BUTTON1_DOWN_MASK;

        bot1.keyPress(KeyEvent.VK_1);
        bot1.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        bot1.keyPress(KeyEvent.VK_P);
        bot1.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        bot1.keyPress(KeyEvent.VK_ALT);bot1.keyPress(KeyEvent.VK_SPACE);bot1.keyPress(KeyEvent.VK_X);  
        bot1.keyRelease(KeyEvent.VK_ALT);bot1.keyRelease(KeyEvent.VK_SPACE);bot1.keyRelease(KeyEvent.VK_X);

        bot1.mouseMove(330, 188);
        Thread.sleep(1000);
        bot1.mousePress(mock_hardware);
        bot1.mouseRelease(mock_hardware); 
        bot1.mousePress(mock_hardware);
        bot1.mouseRelease(mock_hardware);
        Thread.sleep(10000);
       

        bot1.keyPress(KeyEvent.VK_ALT);bot1.keyPress(KeyEvent.VK_SPACE);bot1.keyPress(KeyEvent.VK_X);  
        bot1.keyRelease(KeyEvent.VK_ALT);bot1.keyRelease(KeyEvent.VK_SPACE);bot1.keyRelease(KeyEvent.VK_X);
           
    }

    
    @And ("Setting screen mock hardware")
    public void Setting_screen_mock_hardware() throws AWTException, InterruptedException{

        Thread.sleep(1000);
        Robot robot = new Robot();
        int Setting_screen = InputEvent.BUTTON1_DOWN_MASK;

        robot.mouseMove(600, 0);
        robot.mousePress(Setting_screen);
        robot.mouseMove(0, 400);
        robot.mouseRelease(Setting_screen);

        robot.mouseMove(1339, 9);
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen);
        Thread.sleep(3000);
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen); 
        Thread.sleep(3000);
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen); 

        Thread.sleep(2000);
        robot.mouseMove(1041, 10);
        robot.mousePress(Setting_screen);
        robot.mouseRelease(Setting_screen); 
        Thread.sleep(20000);

    }


    @And ("Init mock hardware")
    public void Init_mock_hardware() throws AWTException, InterruptedException{
     
        //Robot bot = null;
        Robot bot2 = new Robot();

        //init
        int Initmock_hardware = InputEvent.BUTTON1_DOWN_MASK;
        bot2.mouseMove(79, 38);
        Thread.sleep(1000);
        bot2.mousePress(Initmock_hardware);
        bot2.mouseRelease(Initmock_hardware); 

    }

    @When ("Set error ActuatorHardBrake when Pick Tip")
    public void Set_error_ActuatorHardBrake_when_Pick_Tip() throws AWTException, InterruptedException{

         //Robot bot = null;
         Robot bot3 = new Robot();

         //Pipette Task Type
         int Setmock_hardware = InputEvent.BUTTON1_DOWN_MASK;
         bot3.mouseMove(153, 152);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware); 
         Thread.sleep(1000);
         //Pick Tip
         bot3.mouseWheel(5);
         Thread.sleep(1000);
         bot3.mouseMove(28, 306);
         Thread.sleep(3000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //Protocol Error Code
         bot3.mouseMove(153, 205);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //ActuatorHardBrake
         Thread.sleep(1000);
         bot3.mouseWheel(-15);
         Thread.sleep(2000);
         bot3.mouseMove(45, 376);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);

    }

    @When ("Set error ActuatorDisabled when Aspirate")
    public void Set_error_ActuatorDisabled_when_Aspirate() throws AWTException, InterruptedException{

         //Robot bot = null;
         Robot bot3 = new Robot();

         //Pipette Task Type
         int Setmock_hardware = InputEvent.BUTTON1_DOWN_MASK;
         bot3.mouseMove(153, 152);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware); 
         Thread.sleep(2000);
         //Aspirate
         bot3.mouseWheel(-15);
         Thread.sleep(2000);
         bot3.mouseMove(25, 245);
         Thread.sleep(4000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         Thread.sleep(2000);
         //Protocol Error Code
         bot3.mouseMove(153, 205);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //ActuatorDisabled
         Thread.sleep(1000);
         bot3.mouseWheel(-15);
         Thread.sleep(2000);
         bot3.mouseMove(38, 280);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);

    }

    @When ("Set error ActuatorEncoderError when Dispense")
    public void Set_error_ActuatorEncoderError_when_Dispense() throws AWTException, InterruptedException{

         //Robot bot = null;
         Robot bot3 = new Robot();

         //Pipette Task Type
         int Setmock_hardware = InputEvent.BUTTON1_DOWN_MASK;
         bot3.mouseMove(153, 152);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware); 
         Thread.sleep(2000);
         //Dispense
         bot3.mouseWheel(-15);
         Thread.sleep(1000);
         bot3.mouseMove(24, 260);
         Thread.sleep(4000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //Protocol Error Code
         bot3.mouseMove(153, 205);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //ActuatorEncoderError
         Thread.sleep(1000);
         bot3.mouseWheel(-15);
         Thread.sleep(2000);
         bot3.mouseMove(40, 330);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);

    }

    @When ("Set error ActuatorUnknownError when Pick Tip")
    public void Set_error_ActuatorUnknownError_when_Pick_Tip() throws AWTException, InterruptedException{

         //Robot bot = null;
         Robot bot3 = new Robot();

         //Pipette Task Type
         int Setmock_hardware = InputEvent.BUTTON1_DOWN_MASK;
         bot3.mouseMove(153, 152);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware); 
         Thread.sleep(2000);
         //Pick Tip
         bot3.mouseWheel(5);
         Thread.sleep(1000);
         bot3.mouseMove(28, 306);
         Thread.sleep(4000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //Protocol Error Code
         bot3.mouseMove(153, 205);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);
         //ActuatorUnknownError
         Thread.sleep(1000);
         bot3.mouseWheel(-6);
         Thread.sleep(2000);
         bot3.mouseMove(50, 232);
         Thread.sleep(1000);
         bot3.mousePress(Setmock_hardware);
         bot3.mouseRelease(Setmock_hardware);

    }

    @And ("Set error ActuatorHardBrake when Align Pick Tip")
    public void Set_error_ActuatorHardBrake_when_Align_Pick_Tip() throws AWTException, InterruptedException{
    
    } 

    @And ("Set error ActuatorHardBrake when Align Aspirate") 
    public void Set_error_ActuatorHardBrake_when_Align_Aspirate() throws AWTException, InterruptedException{
    
    }

    @And ("Set error ActuatorHardBrake when Aspirate")
    public void Set_error_ActuatorHardBrake_when_Aspirate() throws AWTException, InterruptedException{
        
    }

    @And ("Set error ActuatorHardBrake when Align Dispense") 
    public void Set_error_ActuatorHardBrake_when_Align_Dispense() throws AWTException, InterruptedException{

    }

    @And ("Set error ActuatorHardBrake when Dispense")
    public void Set_error_ActuatorHardBrake_when_Dispense() throws AWTException, InterruptedException{
        
    }

    @And ("Set error ActuatorHardBrake when Mixing") 
    public void Set_error_ActuatorHardBrake_when_Mixing() throws AWTException, InterruptedException{

    }    

    @And ("Set error ActuatorIlegalPos when Aspirate") 
    public void Set_error_ActuatorIlegalPos_when_Aspirate() throws AWTException, InterruptedException{
    
    }

    @And ("Set error ActuatorAborted when Aspirate") 
    public void Set_error_ActuatorAborted_when_Aspirate() throws AWTException, InterruptedException{

    }    
    
    @And ("Set mocked hardware")
    public void Set_mocked_hardware() throws AWTException, InterruptedException{
     
        Robot bot3 = new Robot();
        int Setmock_hardware = InputEvent.BUTTON1_DOWN_MASK;

        //Set Mocked Error
        bot3.mouseMove(240, 230);
        Thread.sleep(1000);
        bot3.mousePress(Setmock_hardware);
        bot3.mouseRelease(Setmock_hardware);

    }

    @And ("Clear mocked hardware")
    public void Clear_mocked_hardware() throws AWTException, InterruptedException{
     
        //Robot bot = null;
        Robot bot4 = new Robot();
        int Clear_mocked = InputEvent.BUTTON1_DOWN_MASK;
    
        //Clear
        bot4.mouseMove(411, 238);
        Thread.sleep(1000);
        bot4.mousePress(Clear_mocked);
        bot4.mouseRelease(Clear_mocked);

    }

    @And ("Deinit")
    public void Deinit() throws AWTException, InterruptedException{
     
        //Robot bot = null;
        Robot bot4 = new Robot();
        int Deinit = InputEvent.BUTTON1_DOWN_MASK;
    
        //Clear
        bot4.mouseMove(243, 49);
        Thread.sleep(1000);
        bot4.mousePress(Deinit);
        bot4.mouseRelease(Deinit);

    }

    @And ("Restart putty simulation mode")
    public void Restart_putty_simulation_mode()throws AWTException, InterruptedException{

        //Robot bot = null;
        Robot bot4 = new Robot();
        int Restart_putty = InputEvent.BUTTON1_DOWN_MASK;
    
        //Control C
        bot4.mouseMove(1071, 371);
        Thread.sleep(1000);
        bot4.mousePress(Restart_putty);
        bot4.mouseRelease(Restart_putty);
        bot4.keyPress(KeyEvent.VK_CONTROL);bot4.keyPress(KeyEvent.VK_C); 
        bot4.keyRelease(KeyEvent.VK_CONTROL);bot4.keyRelease(KeyEvent.VK_C);
        Thread.sleep(10000);

        //sudo ./FloWebServer
        bot4.keyPress(KeyEvent.VK_S);bot4.keyPress(KeyEvent.VK_U);bot4.keyPress(KeyEvent.VK_D);bot4.keyPress(KeyEvent.VK_O);
        bot4.keyPress(KeyEvent.VK_SPACE);

        bot4.keyPress(KeyEvent.VK_PERIOD);
        bot4.keyPress(KeyEvent.VK_SLASH);
        bot4.keyPress(KeyEvent.VK_SHIFT);bot4.keyPress(KeyEvent.VK_F);bot4.keyRelease(KeyEvent.VK_SHIFT);
        bot4.keyPress(KeyEvent.VK_L);
        bot4.keyPress(KeyEvent.VK_O);
        bot4.keyPress(KeyEvent.VK_SHIFT);bot4.keyPress(KeyEvent.VK_W);bot4.keyRelease(KeyEvent.VK_SHIFT);
        bot4.keyPress(KeyEvent.VK_E);
        bot4.keyPress(KeyEvent.VK_B);
        bot4.keyPress(KeyEvent.VK_SHIFT);bot4.keyPress(KeyEvent.VK_S);bot4.keyRelease(KeyEvent.VK_SHIFT);
        bot4.keyPress(KeyEvent.VK_E);
        bot4.keyPress(KeyEvent.VK_R);
        bot4.keyPress(KeyEvent.VK_V);
        bot4.keyPress(KeyEvent.VK_E);
        bot4.keyPress(KeyEvent.VK_R);
        bot4.keyPress(KeyEvent.VK_ENTER);
       
    }

    @And ("Preparation")
    public void Preparation() throws AWTException, InterruptedException{
        Robot bot5 = new Robot();
        bot5.delay(50000);  
    }

    @And ("Restart putty flo")
    public void Restart_putty_flo() throws AWTException, InterruptedException{
     
        //Robot bot = null;
        Robot bot4 = new Robot();
        int Restart_putty = InputEvent.BUTTON1_DOWN_MASK;
    
        //Control C
        bot4.mouseMove(1071, 371);
        Thread.sleep(1000);
        bot4.mousePress(Restart_putty);
        bot4.mouseRelease(Restart_putty);
        bot4.keyPress(KeyEvent.VK_CONTROL);bot4.keyPress(KeyEvent.VK_C); 
        bot4.keyRelease(KeyEvent.VK_CONTROL);bot4.keyRelease(KeyEvent.VK_C);
        Thread.sleep(10000);

        //sudo systemctl restart flo-webserver.service
        bot4.keyPress(KeyEvent.VK_S);bot4.keyPress(KeyEvent.VK_U);bot4.keyPress(KeyEvent.VK_D);bot4.keyPress(KeyEvent.VK_O);
        bot4.keyPress(KeyEvent.VK_SPACE);

        bot4.keyPress(KeyEvent.VK_S);
        bot4.keyPress(KeyEvent.VK_Y);
        bot4.keyPress(KeyEvent.VK_S);
        bot4.keyPress(KeyEvent.VK_T);
        bot4.keyPress(KeyEvent.VK_TAB);
        bot4.keyPress(KeyEvent.VK_C);
        bot4.keyPress(KeyEvent.VK_TAB);

        bot4.keyPress(KeyEvent.VK_R);
        bot4.keyPress(KeyEvent.VK_E);
        bot4.keyPress(KeyEvent.VK_S);
        bot4.keyPress(KeyEvent.VK_T);
        bot4.keyPress(KeyEvent.VK_TAB);

        bot4.keyPress(KeyEvent.VK_F);
        bot4.keyPress(KeyEvent.VK_L);
        bot4.keyPress(KeyEvent.VK_TAB);
        bot4.keyPress(KeyEvent.VK_W);
        bot4.keyPress(KeyEvent.VK_TAB);
        bot4.keyPress(KeyEvent.VK_ENTER);
        bot4.delay(10000);  

    }

    // @And ("Close program")
    // public void Close_program() throws AWTException, InterruptedException{
     
    //     //Robot bot = null;
    //     Robot bot5 = new Robot();
    
    //     Thread.sleep(2000);
    //     bot5.keyPress(KeyEvent.VK_ALT);
    //     bot5.keyPress(KeyEvent.VK_F4);
    //     bot5.keyRelease(KeyEvent.VK_ALT);bot5.keyRelease(KeyEvent.VK_F4);

    // }

   






    

    
}
