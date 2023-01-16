package StepDefinition;

import PageObjectModel.Page_restapi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Close_ticket extends variable{

    @And ("Response body close ticket")
    public void Response_body_close_ticket() throws InterruptedException{

        closeTicketStep_Restapi = new Page_restapi(driver); 
        closeTicketStep_Restapi.Get_ResponseBodyCloseTicket();

    }

    @And ("Response headers close ticket")
    public void Response_body_headers_ticket() throws InterruptedException{

        closeTicketStep_Restapi.Get_ResponseHeadersCloseTicket();
    }

    @And ("Go to menu DELETE ticket with ticket")
    public void Go_to_menu_DELETE_ticket_with_ticket(){

        closeTicketStep_Restapi = new Page_restapi(driver); 
        closeTicketStep_Restapi.Click_MenuDELETETicket_WithTicket();

    }

    @And ("Paste ticket in menu DELETE ticket with ticket")
    public void Paste_tiket_in_menu_DELETE_ticket_with_ticket(){

        closeTicketStep_Restapi.Paste_TicketinMenuDELETECloseTicket_WithTicket();

    }

    @Then ("Click execute close ticket with ticket")
    public void Click_execute_close_ticket_with_ticket(){

        closeTicketStep_Restapi.Click_ExecuteCloseTicket_WithTicket();

    }

    @And ("Response headers close ticket with ticket")
    public void Response_headers_close_ticket_with_ticket() throws InterruptedException{

        closeTicketStep_Restapi.Get_ResponseHeadersCloseTicket_WithTicket();

    }
    
}
