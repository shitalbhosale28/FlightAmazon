package flight_project2;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class LoginQuit1 {
    public WebDriver driver;

    @Parameters({"browser", "options"})
    @BeforeMethod
    public void launchbrowser(@Optional String browserName, @Optional String options) {
        if ("Edge".equalsIgnoreCase(browserName)) {
            driver = new EdgeDriver();

        } else if ("firefox".equalsIgnoreCase(browserName)) {
            driver = new FirefoxDriver();

        } else if ("chrome".equalsIgnoreCase(browserName) || StringUtils.isEmpty(browserName)) {
            driver = new ChromeDriver();
        }

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
   @AfterMethod
    public void quit() {

        driver.quit();
    }

    }