package flight_project2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OneWay_page {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
    WebElement from_airport;
    @FindBy(xpath = "//input[@name='searchText']")
    WebElement searchText;
    //@FindBy(xpath ="(//p[@class='c9d6cfb6'])[1]")
    @FindBy(xpath = "(//div[@class='_32608d65'])[1]")
    WebElement searchResult;
    @FindBy(xpath = "//h3[text()='Search Results']")
    WebElement searchResultPopup;
    @FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[2]")
    WebElement destination_airport;

    @FindBy(xpath = "//P[.='New Delhi']")
    WebElement destinisearch_result;

    @FindBy(xpath="//span[.='One Way']")
    WebElement oneWayRadio;

    @FindBy(xpath = "//span[@class='dcb9db95 colorBase sizeMedium']")
    WebElement date_selection;
    @FindBy(xpath = "(//span[@class='db14b3bc'])[52]")
    WebElement cale_datesel;
    @FindBy(xpath = "(//button[@class='_7e149b6e  '])[2]")
    WebElement adult;
    @FindBy(xpath = "(//button[@class='_7e149b6e  '])[12]")
    WebElement child;
    @FindBy(xpath = "//button[.='Search']")
    WebElement search;
    @FindBy(xpath ="//div[@class='sizeMedium a8cdd5cb']")
    WebElement traveller;
@FindBy(xpath="//div[@class='_79bb5d49']")
WebElement datetextbox;


    public OneWay_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectFromAirport() throws InterruptedException {
        oneWayRadio.click();
        wait.until(ExpectedConditions.visibilityOf(from_airport));
        //Thread.sleep(5000);
        from_airport.click();
        wait.until(ExpectedConditions.elementToBeClickable(searchText));
        searchText.click();
        searchText.sendKeys(getFrom() + Keys.ENTER);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(searchResultPopup));
        wait.until(ExpectedConditions.elementToBeClickable(searchResult));
        searchResult.click();


    }

    private static String getFrom() {
        return "BOM";
    }

    public void selectDestinationAirport() throws InterruptedException {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOf(destination_airport));
            destination_airport.click();
        } catch (Exception e) {
            System.out.println("Ignored as element destination_airport must be already clicked");
           // e.printStackTrace();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        wait.until(ExpectedConditions.elementToBeClickable(searchText));
        searchText.click();
        searchText.sendKeys(getDestin() + Keys.ENTER);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(searchResultPopup));
        wait.until(ExpectedConditions.elementToBeClickable(searchResult));
        searchResult.click();
    }

    private static String getDestin() {
        return "PNQ";
    }

    public void date_select() {
       // wait.until(ExpectedConditions.visibilityOf(datetextbox));
       // datetextbox.click();
        wait.until(ExpectedConditions.elementToBeClickable(date_selection));
        date_selection.click();
    }

    public void calender_search() {
        wait.until(ExpectedConditions.elementToBeClickable(cale_datesel));
        cale_datesel.click();
    }

    public void pasaanger() throws InterruptedException {
wait.until(ExpectedConditions.visibilityOf(traveller));
        traveller.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(adult));
        adult.click();
        child.click();
    }

    public void searchFlight() {
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
    }
}
