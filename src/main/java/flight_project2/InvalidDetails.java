package flight_project2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidDetails {
    WebDriver driver;

    @FindBy(name = "email")
    WebElement emailid_textbox;
    @FindBy(id = "continue")
    WebElement cont_button;

    @FindBy(id = "ap_password")
    WebElement pass_textbox;
    @FindBy(id = "auth-signin-button")
    WebElement sign_button;
    @FindBy(xpath = "((//div[@class='a-box-inner a-alert-container'])/child::h4)[1]")
    WebElement errormessage;

    public InvalidDetails(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    public void loginwithincorrect() {
        // Actions a1=new Actions(driver);
        // a1.moveToElement(accountlis_homepagehoverover).perform();
        //sign_button.click();
        emailid_textbox.sendKeys("shital.hotmail@yahoo.com");
        cont_button.click();
        Assert.assertEquals(errormessage.isDisplayed(),true);
      //  emailid_textbox.clear();
     //   emailid_textbox.sendKeys("shital.bhosale@hotmail.com");
       // pass_textbox.sendKeys("password");
      //  sign_button.click();
       // Assert.assertEquals(errormessage.isDisplayed(),true);



    }
}
