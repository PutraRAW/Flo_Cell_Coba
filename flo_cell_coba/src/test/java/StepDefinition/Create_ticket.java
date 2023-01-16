package StepDefinition;

import PageObjectModel.Page_restapi;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.Page_controlpanel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Create_ticket extends variable{
  
//CONTROL PANEL--------------------------------------------------------
@Given ("Open web url control panel")
    public void Open_web_url_control_panel() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        createTicketStep_Controlpanel = new Page_controlpanel(driver);
        createTicketStep_Controlpanel.Goto_ControlPanel();

    }

@When ("Login username and password")
    public void Login_username_and_password(){

        createTicketStep_Controlpanel.Enter_UsernamePassword();

    }

@And ("Click button MANUAL MODE")
    public void Click_button_MANUAL_MODE(){

        createTicketStep_Controlpanel.Click_ButtonMANUALMODE();

    }

//RESTAPI------------------------------------------------------------------
@And ("Response body create ticket")
    public void Response_body_create_ticket() throws InterruptedException{

        createTicketStep_Restapi = new Page_restapi(driver); 
        createTicketStep_Restapi.Get_ResponseBodyTicket();

    }

@And ("Open new tab to Restapi")
    public void Enter_new_tab_to_Restapi() throws InterruptedException{

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);

    }


}
