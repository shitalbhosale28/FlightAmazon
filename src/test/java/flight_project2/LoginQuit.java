package flight_project2;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class LoginQuit {
    public WebDriver driver;

    @Parameters({"browser", "options"})
    @BeforeMethod
    public void launchBrowser(@Optional String browser, @Optional String options) {
        if ("Edge".equalsIgnoreCase(browser)) {
            if(StringUtils.isNotBlank(options)){
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments(options);
                driver = new EdgeDriver(edgeOptions);
            } else {
                driver = new EdgeDriver();
            }
        } else if ("firefox".equalsIgnoreCase(browser)) {
            if(StringUtils.isNotBlank(options)){
                FirefoxOptions ffOptions = new FirefoxOptions();
                ffOptions.addArguments(options);
                driver = new FirefoxDriver(ffOptions);
            } else {
                driver = new FirefoxDriver();
            }
        } else if ("chrome".equalsIgnoreCase(browser) || StringUtils.isEmpty(browser)) {
            if(StringUtils.isNotBlank(options)){
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(options);
                driver = new ChromeDriver(chromeOptions);
            } else {
                driver = new ChromeDriver();
            }
        }
        driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(1000);
        //driver.quit();
    }

}
