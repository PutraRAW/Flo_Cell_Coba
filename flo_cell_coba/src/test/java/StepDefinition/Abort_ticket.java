package StepDefinition;

import PageObjectModel.Page_restapi;
import io.cucumber.java.en.And;

public class Abort_ticket extends variable {
    
    
    @And("Go to menu POST abort ticket")
    public void Go_to_menu_POST_run_ticket() throws InterruptedException {

        abortTicketStep_Restapi = new Page_restapi(driver); 
        abortTicketStep_Restapi.Click_MenuPOSTAbortTicket();
    }

    @And("Paste tiket in menu POST abort ticket")
    public void Paste_tiket_in_menu_POST_run_ticket() {

        abortTicketStep_Restapi.Paste_TicketinMenuPOSTAbortTicket();

    }

    @And("Click execute abort ticket")
    public void Click_execute_run_ticket() {

        abortTicketStep_Restapi.Click_ExecuteAbortTicket();

    }
    
    @And ("Response body abort ticket")
    public void Response_body_abort_ticket() throws InterruptedException{

       abortTicketStep_Restapi.Get_ResponseBodyAbortTicket();

    }

}
