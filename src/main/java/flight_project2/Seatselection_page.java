package flight_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Seatselection_page
{
    WebDriver driver;
    WebDriverWait wait;
@FindBy(xpath="//button[.='Book']")
    WebElement bookFlight_button;
@FindBy(xpath="//button[.='Proceed to traveller details']")
    WebElement proceeddetail;
    @FindBy(xpath="(//i[@class='d726bd8f _4d2636f0'])[1]")
    //input[@id='checkbox__38205']
    WebElement selectAdult;
    @FindBy(xpath="//button[text()='Proceed to seat selection']")
    WebElement proceedtoseat;
    @FindBy(xpath="(//div[@class='_0d462540  _20da3076 _2ae0b8e0 '])[2]")
    WebElement avaialbleSeat;
    @FindBy(xpath="//input[@id='input-mobile']")
    WebElement Mobile;
    @FindBy(xpath="//h2[.='Select Seat']")
    WebElement selectseattext;
@FindBy(xpath="//button[.='Next']")
WebElement nextButton;
@FindBy(xpath="//div[.='Add new adult']")
WebElement addadult_link;
    @FindBy(xpath="(//div[.='Total Amount'])[1]")
    WebElement totalamount;
    @FindBy(xpath="(//span[.='30 Kgs (2 pieces only)'])[1]")
    WebElement baggage;
    @FindBy(xpath="(//div[.='Flight Details'])[2]")
    WebElement flightdetail;

    @FindBy(xpath="(//div[.='Traveller Details'])[2]")
    WebElement traveldetails;
    @FindBy(xpath="//input[@name='mobile']")
    WebElement mobile;
    @FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
    WebElement paymentCheckbox;

    @FindBy(xpath="//button[.='Proceed to Payment']")
    WebElement proceedpayment;
    @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
    WebElement creditcardRadio;
    @FindBy(xpath="//input[@name='addCreditCardNumber']")
    WebElement addCredit;
    @FindBy(xpath="//div[@class='_0d462540  _20da3076 _2ae0b8e0 ']")
    WebElement secondseat;
    @FindBy(xpath="//div[.='Skip seat selection']")
    WebElement skipIteration;
    @FindBy(xpath="//button[.='Next']")
    WebElement nextbutton;


    public void seatselect() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(bookFlight_button));
        bookFlight_button.click();
        wait.until(ExpectedConditions.visibilityOf(proceeddetail));
        proceeddetail.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectAdult));
        selectAdult.click();
        wait.until(ExpectedConditions.visibilityOf(Mobile));
        Mobile.sendKeys("9890311059");
        proceedtoseat.click();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOf(selectseattext));
        wait.until(ExpectedConditions.elementToBeClickable(avaialbleSeat));
wait.until(ExpectedConditions.elementToBeClickable(avaialbleSeat));
        avaialbleSeat.click();
      //  wait.until(ExpectedConditions.elementToBeClickable(secondseat));
      //  secondseat.click();
        //wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        //nextButton.click();
       // skipIteration.click();
    }
    public void paymentselction(){
        nextbutton.click();
        skipIteration.click();
        wait.until(ExpectedConditions.elementToBeClickable(paymentCheckbox));
        paymentCheckbox.click();
        proceedpayment.click();
        wait.until(ExpectedConditions.visibilityOf(creditcardRadio));
        creditcardRadio.click();
        addCredit.sendKeys("12344454545");
    }

public void verifyMulti(){
    wait.until(ExpectedConditions.visibilityOf(bookFlight_button));
                bookFlight_button.click();
                wait.until(ExpectedConditions.visibilityOf(proceeddetail));
                proceeddetail.click();
Assert.assertEquals(addadult_link.isDisplayed(),true);
        }
        public void verifyResult(){
            wait.until(ExpectedConditions.visibilityOf(bookFlight_button));
            bookFlight_button.click();
           SoftAssert soft=new SoftAssert();
            soft.assertEquals(totalamount.isDisplayed(),true);
            soft.assertEquals(baggage.isDisplayed(),true);
            soft.assertEquals(flightdetail.isDisplayed(),true);
            soft.assertAll();
        }
        public void verifyContact() throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOf(bookFlight_button));
            bookFlight_button.click();
            wait.until(ExpectedConditions.visibilityOf(proceeddetail));
            proceeddetail.click();
            Thread.sleep(4000);
            SoftAssert soft=new SoftAssert();
            soft.assertEquals(traveldetails.isDisplayed(),true);
soft.assertEquals(mobile.isDisplayed(),true);
            soft.assertAll();


        }

public Seatselection_page(WebDriver driver){
        this.driver=driver;
    PageFactory.initElements(driver,this);
    wait=new WebDriverWait(driver, Duration.ofSeconds(10));


}

}
