package flight_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Multicity_page {

        WebDriver driver;
        WebDriverWait w1;
        @FindBy(xpath="//span[.='Round Trip']")
        WebElement roundtripRadio;
        @FindBy(xpath="(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[1]")
        WebElement fromlocationTextbox;
        @FindBy(xpath="//input[@name='searchText']")
        WebElement selectAirport;
        @FindBy(xpath="//h3[.='Search Results']")
        WebElement searchresultFrom;


        @FindBy(xpath="(//p[@class='c9d6cfb6'])[1]")
        WebElement searchSelectionFrom;


        @FindBy(xpath="//input[@name='searchText']")
        WebElement destinSelectAirport;
        @FindBy(xpath="//h3[.='Search Results']")
        WebElement searchResultpagedest;
        @FindBy(xpath="(//p[@class='_6f949d1e'])[1]")
        WebElement searchoptioDesination;
        @FindBy(xpath="(//span[@class='db14b3bc'])[51]")
        WebElement calenderSelection;

        @FindBy(xpath="(//button[.='1'])[1]")
        WebElement adultSelection;
        @FindBy(xpath="//button[.='Search']")
        WebElement search;
        @FindBy(xpath="//span[.='Premium Economy']")
        WebElement premeconomy;
        @FindBy(xpath="//span[.='Business']")
        WebElement business;
        @FindBy(xpath="//div[@class='sizeMedium a8cdd5cb']")
        WebElement travelereconomy;
        @FindBy(xpath="//div[.='Number of stops']")
        WebElement numberstop;

@FindBy(xpath="//button[.='1 Stop']")
WebElement onestopt_button;

        public void selectairport_from(){
            roundtripRadio.click();
            w1.until(ExpectedConditions.visibilityOf(fromlocationTextbox));
            fromlocationTextbox.click();
            selectAirport.sendKeys("JFK");
            w1.until(ExpectedConditions.visibilityOf(searchresultFrom));
            searchSelectionFrom.click();
        }
        public void  destination_selectairport(){
            w1.until(ExpectedConditions.visibilityOf(destinSelectAirport));
            destinSelectAirport.sendKeys("BOM");
            w1.until(ExpectedConditions.visibilityOf(searchResultpagedest));
            searchoptioDesination.click();


        }
        public void calender(){
            w1.until(ExpectedConditions.visibilityOf(calenderSelection));
            calenderSelection.click();
        }

        public void search(){
            search.click();
           // Assert.assertEquals(numberstop.isDisplayed(),true);
            //Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
        }
        public void cabinPremiumeco(){
            premeconomy.click();
        }
        public void business(){
            w1.until(ExpectedConditions.visibilityOf(travelereconomy));
            travelereconomy.click();
            business.click();

        }
        public void stopsearch(){
            onestopt_button.click();
        }


        public Multicity_page(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);
            w1=new WebDriverWait(driver, Duration.ofSeconds(4));
            this.w1=w1;
        }




    }
