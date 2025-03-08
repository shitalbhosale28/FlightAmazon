package flight_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LoginQuitBackup {
    WebDriver driver;
/*@Parameters("browser")
    @BeforeMethod
    public void launch(String browsername) {
    if(browsername.equals("chrome")) {
        driver = new ChromeDriver();
    }
    if (browsername.equals("firefox")) {
        driver = new FirefoxDriver();
    }*

 */
    @BeforeMethod
 public void launch() {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void quitbrowser() throws InterruptedException {
        Thread.sleep(300000);
      driver.quit();
    }
}
