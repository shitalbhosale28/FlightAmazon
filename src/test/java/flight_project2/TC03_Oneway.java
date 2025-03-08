package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(value = flight_project2.Testlistener.class)
public class TC03_Oneway extends LoginQuit {

    @Test(retryAnalyzer = flight_project2.Retry.class)
    public void onewaytest() throws IOException, InterruptedException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        log.login();
        OneWay_page on = new OneWay_page(driver);


        on.selectFromAirport();
        on.selectDestinationAirport();

       // on.destination_search();
       // on.date_select();
        //on.calender_search();
        on.pasaanger();
        on.searchFlight();

    }


}
