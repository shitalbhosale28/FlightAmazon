package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(value = flight_project2.Testlistener.class)
public class TC05_CabinBusiness extends LoginQuit {
    @Test(retryAnalyzer = flight_project2.Retry.class)
    public void cabin() throws IOException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        log.login();
        Roundtrip_page r1=new Roundtrip_page(driver);
        r1.selectairport_from();
        r1.destination_selectairport();
        r1.calender();
        r1.business();
        r1.search();
    }
}
