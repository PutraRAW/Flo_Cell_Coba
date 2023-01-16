package PageObjectModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_restapi{

    WebDriver driver;
   
    By btn_menu_ticket = By.xpath ("//div[contains(@class,'opblock-tag-section')]//h3[.='Ticket']");

    By btn_create_ticket = By.xpath ("//div[contains(text(),'Creates a new ticket')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_ticket = By.xpath ("//div[contains(text(),'Creates a new ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By txtbox_menu_ticket = By.className("body-param__text");
    By btn_execute_ticket = By.xpath( "//div[contains(text(),'Creates a new ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//button[text()='Execute']");
    By Get_response_body_ticket = By.xpath ("//div[contains(text(),'Creates a new ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//div[contains(@class,'responses-inner')]//table[contains(@class,'responses-table live-responses-table')]//div[contains(@class,'highlight-code')]//pre[contains(@class,'microlight')]");
    By Get_ticket = By.xpath( "//*[@id='operations-Ticket-Ticket_Create']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre/code/span[5]");

    By btn_menu_run = By.xpath("//div[contains(text(),'Runs a Flo')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_run = By.xpath("//div[contains(text(),'Runs a Flo')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By txtbox_menu_run = By.xpath("//*[@id='operations-Ticket-Ticket_Run']/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input");
    By btn_execute_run = By.xpath("//div[contains(text(),'Runs a Flo')]/ancestor::div[contains(@id,'operations-Ticket')]//button[text()='Execute']");

    By btn_menu_abort = By.xpath("//div[contains(text(),'Aborts currently running')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_abort = By.xpath("//div[contains(text(),'Aborts currently running')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By txtbox_menu_abort = By.xpath("//*[@id='operations-Ticket-Ticket_Abort']/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input");
    By btn_execute_abort = By.xpath("//div[contains(text(),'Aborts currently running')]/ancestor::div[contains(@id,'operations-Ticket')]//button[text()='Execute']");
    By Get_response_body_abortticket = By.xpath("//div[contains(text(),'Aborts currently running')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response body')]//div[contains(@class,'highlight-code')]//pre[contains(@class,'microlight')]//code[contains(@class,'language-json')]");

    By btn_menu_progress = By.xpath("//div[contains(.,'/api/v1.1/tickets/{id}/progress')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_progress = By.xpath("//div[contains(.,'/api/v1.1/tickets/{id}/progress')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By txtbox_menu_progress = By.xpath("//*[@id='operations-Ticket-Ticket_GetProgress']/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input");
    By btn_execute1_progress = By.xpath("//div[contains(.,'/api/v1.1/tickets/{id}/progress')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Execute']");
    By btn_execute2_progress = By.xpath("//div[contains(.,'/api/v1.1/tickets/{id}/progress')]/ancestor::div[contains(@id,'operations-Ticket')]//button[.='Execute']");
    By txt_statusinfo_progress = By.xpath("//*[@id='operations-Ticket-Ticket_GetProgress']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre");
    By txt_inprogress_progress = By.xpath("//*[@id='operations-Ticket-Ticket_GetProgress']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre/code/span[18]");
    By txt_statuscomplete_progress = By.xpath("//*[@id='operations-Ticket-Ticket_GetProgress']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre/code");
    By txt_status_mocked_progress = By.xpath("//*[@id='operations-Ticket-Ticket_GetProgress']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre/code/span[52]");
    By Get_response_body_progress = By.xpath("//div[contains(text(),'progress')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response body')]//pre[contains(@class,'microlight')]");
    By Get_response_body_progress_mocked = By.xpath("//div[contains(.,'/api/v1.1/tickets/{id}/progress')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response body')]//pre[contains(@class,'microlight')]");

    By btn_menu_close = By.xpath("//div[contains(text(),'closes any active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_close = By.xpath("//div[contains(text(),'closes any active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By btn_execute_close = By.xpath("//div[contains(text(),'closes any active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Execute']");
    By Get_response_body_closeticket = By.xpath ("//div[contains(text(),'closes any active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response body')]//pre[contains(@class,'microlight')]");
    By Get_response_headers_closeticket = By.xpath ("//div[contains(text(),'closes any active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response headers')]//pre[contains(@class,'microlight')]");

    By btn_menu_close_withTicket = By.xpath("//div[contains(text(),'Closes currently active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]");
    By btn_tryout_close_withTicket = By.xpath("//div[contains(text(),'Closes currently active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//div[.='Try it out ']");
    By txtbox_menu_close_withTicket = By.xpath("//*[@id='operations-Ticket-Ticket_Delete']/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input");
    By btn_execute_close_withTicket = By.xpath("//div[contains(text(),'Closes currently active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//button[text()='Execute']");
    By Get_response_headers_closeticket_withTicket = By.xpath("//div[contains(text(),'Closes currently active ticket')]/ancestor::div[contains(@id,'operations-Ticket')]//tr[contains(@class,'response')]//div[contains(.,'Response headers')]//pre[contains(@class,'microlight')]");

    By btn_menu_instrument = By.xpath("//div[contains(@class,'opblock-tag-section')]//h3[.='Instrument']");

    By btn_menu_lastrunerror = By.xpath("//div[contains(text(),'Get last protocol')]/ancestor::div[contains(@id,'operations-Instrument')]");
    By btn_tryout_lastrunerror = By.xpath("//div[contains(text(),'Get last protocol')]/ancestor::div[contains(@id,'operations-Instrument')]//div[.='Try it out ']");
    By btn_execute_lastrunerror = By.xpath("//div[contains(text(),'Get last protocol')]/ancestor::div[contains(@id,'operations-Instrument')]//div[.='Execute']");
    By Get_response_body_lastrunerror = By.xpath("//div[contains(text(),'Get last protocol')]/ancestor::div[contains(@id,'operations-Instrument')]//tr[contains(@class,'response')]//div[contains(.,'Response body')]//pre[contains(@class,'microlight')]");

    public Page_restapi(WebDriver driver) {
        this.driver = driver;
       // PageFactory.initElements(driver, this);
      }

    

    public void Goto_RestApi(){

         // driver.navigate().to("http://169.254.95.201:5005/restapi/index.html#");
        driver.navigate().to("http://169.254.213.48:5005/restapi/index.html#");
    
    }

    public void Click_MenuTiket(){

        driver.findElement(btn_menu_ticket).click();

    }

    public void Click_MenuPOSTCreateTicket(){

        driver.findElement(btn_create_ticket).click();
        driver.findElement(btn_tryout_ticket).click();

    }

    public void Input_CodingCellSeeding1Plate() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Seeding 1 well to 1 daughter plate.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println("Input koding\n" + content);
        driver.findElement(txtbox_menu_ticket).sendKeys(Keys.CONTROL + "a");
        driver.findElement(txtbox_menu_ticket).sendKeys(content);
     
    }

    public void Input_CodingCellSeeding2Plates() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Seeding 1 well to 2 daughter plate.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println("Input koding\n" + content);
        driver.findElement(txtbox_menu_ticket).sendKeys(Keys.CONTROL + "a");
        driver.findElement(txtbox_menu_ticket).sendKeys(content);
     
    }

    public void Input_CodingCellCounting() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Cell counting.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println("Input koding\n" + content);
        driver.findElement(txtbox_menu_ticket).sendKeys(Keys.CONTROL + "a");
        driver.findElement(txtbox_menu_ticket).sendKeys(content);
     
    }

    public void Input_CodingHarvesting() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Harvesting.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println("Input koding\n" + content);
        driver.findElement(txtbox_menu_ticket).sendKeys(Keys.CONTROL + "a");
        driver.findElement(txtbox_menu_ticket).sendKeys(content);
     
    }

    public void Input_CodingFormulateMedia() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Formulate media.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println("Input koding\n" + content);
        driver.findElement(txtbox_menu_ticket).sendKeys(Keys.CONTROL + "a");
        driver.findElement(txtbox_menu_ticket).sendKeys(content);
     
    }

    public void Click_ExecuteCreateTicket(){

        driver.findElement(btn_execute_ticket).click();

    }

    public void Get_ResponseBodyTicket() throws InterruptedException{

        Thread.sleep(2000);
        String get_text;
        get_text = driver.findElement(Get_response_body_ticket).getText();
        System.out.println("Hasil: \n" + get_text);

    }

    public void Get_Ticket() throws InterruptedException{

        Actions act = new Actions(driver);
        String get_tiket;

        WebElement tiket = driver.findElement(Get_ticket);
        act.doubleClick(tiket).perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        get_tiket = driver.findElement(Get_ticket).getText();
        System.out.println("Ticket: \n" + get_tiket);

    }

    public void Click_MenuPOSTAbortTicket(){

        driver.findElement(btn_menu_abort).click();
        driver.findElement(btn_tryout_abort).click();

    }

    public void Paste_TicketinMenuPOSTAbortTicket(){

        driver.findElement(txtbox_menu_abort).sendKeys(Keys.CONTROL + "v");

    }

    public void Click_ExecuteAbortTicket(){

        driver.findElement(btn_execute_abort).click();

    }

    public void Get_ResponseBodyAbortTicket() throws InterruptedException{

        Thread.sleep(2000);
        String get_text321;
        get_text321 = driver.findElement(Get_response_body_abortticket).getText();
        System.out.println("Hasil: \n" + get_text321);
    }

    public void Click_MenuPOSTRunTicket(){

        driver.findElement(btn_menu_run).click();
        driver.findElement(btn_tryout_run).click();

    }

    public void Paste_TiketinMenuPOSTRunTicket(){

        driver.findElement(txtbox_menu_run).sendKeys(Keys.CONTROL + "v");

    }

    public void Click_ExecuteRunTicket(){

        driver.findElement(btn_execute_run).click();

    }

    public void Clear_TextBox_MenuRun(){

        driver.findElement(txtbox_menu_run).sendKeys(Keys.CONTROL,"a",Keys.DELETE);

    }

    public void Click_MenuGETProgressTicket(){

        driver.findElement(btn_menu_progress).click();
        driver.findElement(btn_tryout_progress).click();

    }

    public void Paste_TicketinMenuGETProgressTicket(){

        driver.findElement(txtbox_menu_progress).sendKeys(Keys.CONTROL + "v");

    }

    
    public void Clear_TextBox_MenuProgress(){

        driver.findElement(txtbox_menu_progress).sendKeys(Keys.CONTROL + "a", Keys.DELETE);

    }


    public void Click_Execute1Progress(){

        driver.findElement(btn_execute1_progress).click();

    }

    public void Click_Execute2AndStatusProgress()throws InterruptedException{

       Boolean proses_isVisible = false;
       String get_proses;

       while (!proses_isVisible) {
           driver.findElement(btn_execute2_progress).click();
           Thread.sleep(10000);
           get_proses = driver.findElement(txt_statusinfo_progress).getText();
           System.out.println("Hasil: \n" + get_proses);
           String status = driver.findElement(txt_inprogress_progress).getText();

           if (status.equalsIgnoreCase("\"in-progress\"")) {
               proses_isVisible = false;
           } 
           else {
               proses_isVisible = true;
           }
       }

    }

    public void Click_Execute2AndStatusProgress_mocked() throws InterruptedException{

        Boolean proses_isVisible = false;

       while (!proses_isVisible) {
           driver.findElement(btn_execute2_progress).click();
           Thread.sleep(2000);
           try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds (20));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(txt_status_mocked_progress));
            proses_isVisible = true;
          } catch (Exception e) {
            proses_isVisible = false;
          }
        }
       
     }
 
     public void Get_ResponseBodyProgress_mocked() throws InterruptedException{

        Thread.sleep(2000);
        String get_text;
        get_text = driver.findElement(Get_response_body_progress_mocked).getText();
        System.out.println("Hasil: \n" + get_text);
        
    }

    public void Get_ResponseBodyProgress() throws InterruptedException{

        Thread.sleep(2000);
        String get_text;
        get_text = driver.findElement(Get_response_body_progress).getText();
        System.out.println("Hasil: \n" + get_text);
        
    }

    public void Get_StatusComplete(){

        String get_pesan;
        get_pesan = driver.findElement(txt_statuscomplete_progress).getText();
        System.out.println("Hasil: \n" + get_pesan);

    }

    public void Click_MenuDELETETicket(){

        driver.findElement(btn_menu_close).click();
        driver.findElement(btn_tryout_close).click();

    }

    public void Click_ExecuteCloseTicket(){

        driver.findElement(btn_execute_close).click();

    }

    public void Get_ResponseBodyCloseTicket() throws InterruptedException{

        Thread.sleep(2000);
        String get_text;
        get_text = driver.findElement(Get_response_body_closeticket).getText();
        System.out.println("Hasil: \n" + get_text);

    }

    
    public void Get_ResponseHeadersCloseTicket() throws InterruptedException{

        Thread.sleep(2000);
        String get_text2;
        get_text2 = driver.findElement(Get_response_headers_closeticket).getText();
        System.out.println("Hasil: \n" + get_text2);

    }

    public void Click_MenuDELETETicket_WithTicket(){

        driver.findElement(btn_menu_close_withTicket).click();
        driver.findElement(btn_tryout_close_withTicket).click();

    }

    public void Paste_TicketinMenuDELETECloseTicket_WithTicket(){

        driver.findElement(txtbox_menu_close_withTicket).sendKeys(Keys.CONTROL + "v");

    }

    public void Click_ExecuteCloseTicket_WithTicket(){

        driver.findElement(btn_execute_close_withTicket).click();

    }

    public void Get_ResponseHeadersCloseTicket_WithTicket() throws InterruptedException{

        Thread.sleep(2000);
        String get_text1;
        get_text1 = driver.findElement(Get_response_headers_closeticket_withTicket).getText();
        System.out.println("Hasil: \n" + get_text1);

    }




    public void Click_MenuInstrument(){

        driver.findElement(btn_menu_instrument).click();

    }

    public void Click_MenuGETLastRunError(){

        driver.findElement(btn_menu_lastrunerror).click();
        driver.findElement(btn_tryout_lastrunerror).click();

    }

    public void Click_ExecuteLastRunError(){

        driver.findElement(btn_execute_lastrunerror).click();

    }

    public void Get_ResponseBodyLastRunError() throws InterruptedException{

        Thread.sleep(2000);
        String ambil123;
        ambil123 = driver.findElement(Get_response_body_lastrunerror).getText();
        System.out.println("Hasil: \n" + ambil123);

    }

    public void OpenNewTab_RestApi() throws InterruptedException{

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);

    }
    
}