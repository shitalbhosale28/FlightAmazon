package flight_project2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OneWayinter_page extends OneWay_page{
    public OneWayinter_page(WebDriver driver) {
        super(driver);
    }

    private static String getDestin() {
        return "PNQ";
    }
    private static String getFrom() {
        return "BOM";
    }
}
