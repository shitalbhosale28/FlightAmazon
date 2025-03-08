package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(value = flight_project2.Testlistener.class)
public class TC06_Multicity extends LoginQuit{
    @Test
    public void multicity() throws IOException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        log.login();
        Multicity_page mult=new Multicity_page(driver);
        mult.selectairport_from();
        mult.destination_selectairport();
        mult.calender();
        mult.business();
        mult.search();
        mult.stopsearch();
    }
}
