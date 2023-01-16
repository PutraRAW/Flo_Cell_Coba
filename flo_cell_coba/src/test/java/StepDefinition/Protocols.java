package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.Page_restapi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.time.Duration;

public class Protocols extends variable {

    // @Before // ini fungsi hooks
    // public void browserSetup() {
    //     System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    //     driver = new ChromeDriver();
    //     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //     driver.manage().window().maximize();

    // }

    // @After // ini fungsi hooks
    // public void teardown() throws InterruptedException {
    //     Thread.sleep(7000);
    //     // driver.close();
    //     // driver.quit();
    // }

    @Given("Open web url rest api")
    public void open_web_url_rest_api() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

       protocolsStep_Restapi = new Page_restapi(driver);
       protocolsStep_Restapi.Goto_RestApi();

    }

    @And("Go to menu tiket")
    public void Go_to_menu_tiket() throws InterruptedException {

        protocolsStep_Restapi.Click_MenuTiket();
        Thread.sleep(2000);

    }

    @And("Go to menu POST create ticket")
    public void Go_to_menu_POST_create_ticket() {

        protocolsStep_Restapi.Click_MenuPOSTCreateTicket();

    }

    @And("Input koding seeding 1")
    public void Input_koding_seeding_1() throws IOException {

        protocolsStep_Restapi.Input_CodingCellSeeding1Plate(); 

    }

    @And("Input koding seeding 2")
    public void Input_koding_seeding_2() throws IOException {

    protocolsStep_Restapi.Input_CodingCellSeeding2Plates();

    }

    @And("Input koding cell counting")
    public void Input_koding_cell_counting() throws IOException {

        protocolsStep_Restapi.Input_CodingCellCounting();

    }

    @And("Input koding harvesting")
    public void Input_koding_harvesting() throws IOException {

        protocolsStep_Restapi.Input_CodingHarvesting();

    }

    @And("Input koding formulate media")
    public void Input_koding_formulate_media() throws IOException {

        protocolsStep_Restapi.Input_CodingFormulateMedia();

    }

    @And("Click execute create ticket")
    public void Click_execute_create_ticket() throws InterruptedException {

        protocolsStep_Restapi.Click_ExecuteCreateTicket();
        Thread.sleep(4000);
    }

    @And("Get ticket")
    public void Get_ticket() throws InterruptedException {

        protocolsStep_Restapi.Get_Ticket();

    }

    @And("Go to menu POST run ticket")
    public void Go_to_menu_POST_run_ticket() throws InterruptedException {

        protocolsStep_Restapi.Click_MenuPOSTRunTicket();
    }

    @And ("Clear textbox menu POST run")
    public void Clear_textbox_menu_POST_run(){

        protocolsStep_Restapi.Clear_TextBox_MenuRun();

    }

    @And("Paste tiket in menu POST run ticket")
    public void Paste_tiket_in_menu_POST_run_ticket() {

        protocolsStep_Restapi.Paste_TiketinMenuPOSTRunTicket();

    }

    @And("Click execute run ticket")
    public void Click_execute_run_ticket() {

        protocolsStep_Restapi.Click_ExecuteRunTicket();

    }

    @And("Go to menu GET progress ticket")
    public void Go_to_menu_GET_progress_ticket() throws InterruptedException {

        protocolsStep_Restapi.Click_MenuGETProgressTicket();

    }

    @And("Clear textbox menu GET progress")
    public void Clear_textbox_menu_GET_progress(){

        protocolsStep_Restapi.Clear_TextBox_MenuProgress();

    }

    @And("Paste ticket in menu GET progress ticket")
    public void Paste_ticket_in_menu_GET_progress_ticket() {

        protocolsStep_Restapi.Paste_TicketinMenuGETProgressTicket();

    }

    @And("See Progress")
    public void Execute_Progress() throws InterruptedException {

        protocolsStep_Restapi.Click_Execute1Progress();
        protocolsStep_Restapi.Click_Execute2AndStatusProgress();
        protocolsStep_Restapi.Get_StatusComplete();

    }

    @And("See Progress 2")
    public void Execute_Progress_2() throws InterruptedException {

        protocolsStep_Restapi.Click_Execute2AndStatusProgress();
        protocolsStep_Restapi.Get_StatusComplete();

    }

    @And("See progress mocked")
    public void  See_Progress_Mocked() throws InterruptedException{

        protocolsStep_Restapi.Click_Execute1Progress();
        protocolsStep_Restapi.Click_Execute2AndStatusProgress_mocked();
        protocolsStep_Restapi.Get_ResponseBodyProgress_mocked();
        
    }

    @And("Response body progress")
    public void Response_body_progress() throws InterruptedException{

        protocolsStep_Restapi.Get_ResponseBodyProgress();

    }

    @And("Should success test running")
    public void Should_success_test_running() {

        System.out.println("Process is Complete!!!");

    }

    @And("Go to menu DELETE ticket")
    public void Go_to_menu_DELETE_ticket() {

        protocolsStep_Restapi.Click_MenuDELETETicket();

    }

    @Then("Click execute close ticket")
    public void Click_execute_close_tiket() throws InterruptedException {

         Thread.sleep(2000);
        protocolsStep_Restapi.Click_ExecuteCloseTicket();

    }

    @And ("Go to menu instrument")
    public void Go_to_menu_instrument(){

        protocolsStep_Restapi.Click_MenuInstrument();

    }

    @And ("Go to menu GET last run error")
    public void Go_to_menu_GET_last_run_error(){

        protocolsStep_Restapi.Click_MenuGETLastRunError();

    }

    @And ("Click execute last run error")
    public void Click_execute_last_run_error(){

        protocolsStep_Restapi.Click_ExecuteLastRunError();

    }

    @And ("Response body last run error")
    public void Response_body_last_run_error() throws InterruptedException{

        protocolsStep_Restapi.Get_ResponseBodyLastRunError();

    }

 @Then ("Close driver")
 public void Close_driver() throws InterruptedException{

    Thread.sleep(2000);
    driver.close();
    driver.quit();
 }

}
