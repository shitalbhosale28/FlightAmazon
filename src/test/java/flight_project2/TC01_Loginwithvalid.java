package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(value = flight_project2.Testlistener.class)

public class TC01_Loginwithvalid extends LoginQuit {
    @Test(retryAnalyzer = flight_project2.Retry.class)
    public void login() throws IOException, InterruptedException {
        Login_AmazonFlight log = new Login_AmazonFlight(driver);
        log.login();
        Thread.sleep(8000);
        //LoginQuit p = new TC1_Loginwithvalid();
        //p.login();
       // TC1_Loginwithvalid c = (TC1_Loginwithvalid)p;
      //  ((TC1_Loginwithvalid) p).login();
    }


}
