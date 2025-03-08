package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(value = flight_project2.Testlistener.class)
public class TC11_SearchLogout extends LoginQuit{
    @Test(retryAnalyzer = flight_project2.Retry.class)
    public void loginLogout() throws IOException, InterruptedException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        log.login();
        OneWay_page on = new OneWay_page(driver);

        //on.airportfromsearch();
        on.selectFromAirport();
        on.selectDestinationAirport();

        on.date_select();
        on.searchFlight();
        Logout_page l1=new Logout_page(driver);
        l1.logoutM();


    }
}
