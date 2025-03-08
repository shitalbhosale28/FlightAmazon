package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(value = flight_project2.Testlistener.class)
public class TC07_Seatbooking extends LoginQuit{
    @Test(retryAnalyzer = flight_project2.Retry.class)
    public void seatbook() throws IOException, InterruptedException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        Seatselection_page s1=new Seatselection_page(driver);

        log.login();
        Roundtrip_page r1=new Roundtrip_page(driver);
        r1.selectairport_from();
        r1.destination_selectairport();
        r1.calender();

        r1.oneadult();
        Thread.sleep(10000);
        r1.search();
        s1.seatselect();


    }
}
