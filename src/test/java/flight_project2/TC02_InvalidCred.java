package flight_project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = flight_project2.Testlistener.class)
public class TC02_InvalidCred extends LoginQuit {
    @Test

    public void invalid() {

        InvalidDetails lg = new InvalidDetails(driver);
        lg.loginwithincorrect();

    }

}