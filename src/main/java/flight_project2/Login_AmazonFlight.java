package flight_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login_AmazonFlight extends DDT {
    WebDriver driver;

    @FindBy(name = "email")
    WebElement emailid_textbox;
    @FindBy(id = "continue")
    WebElement cont_button;

    @FindBy(id = "ap_password")
    WebElement pass_textbox;
    @FindBy(id = "auth-signin-button")
    WebElement sign_button;


    public Login_AmazonFlight(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() throws IOException {
        // Actions a1=new Actions(driver);
        // a1.moveToElement(accountlis_homepagehoverover).perform();
        //sign_button.click();
        ddt();
        emailid_textbox.sendKeys(username);
        cont_button.click();
        pass_textbox.sendKeys(password);
        sign_button.click();


    }


}

