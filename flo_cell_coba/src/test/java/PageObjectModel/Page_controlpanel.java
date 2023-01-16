package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_controlpanel {

    WebDriver driver;
        
    @FindBy(xpath = "//div[contains(@class,'form-group')]//input[@placeholder='Username']")
    WebElement txt_username;
    @FindBy(xpath = "//div[contains(@class,'form-group')]//input[@placeholder='Password']")
    WebElement txt_password;
    @FindBy(xpath = "//div[contains(@class,'row')]//div[contains(.,'SIGN IN')]")
    WebElement Btn_login;
    @FindBy(xpath = "//div[contains(@class,'App-button-group')]//label[contains(@id,'toggle-check')]")
    WebElement Btn_MANUALMODE;

    
    public void Goto_ControlPanel(){

        driver.navigate().to("http://169.254.213.48:5005/controlpanel/");

    }
    
    public void Enter_UsernamePassword() {
    
        txt_username.sendKeys("service");
        txt_password.sendKeys("Formulatrix2019");
        Btn_login.click();

    }

    public void Click_ButtonMANUALMODE(){

        Btn_MANUALMODE.click();
        
    }

    public void OpenNewTab_ControlPanel() throws InterruptedException{

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);

    }

    public Page_controlpanel(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);

      }

    
   
}
