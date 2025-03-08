package flight_project2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    int initialretrycount = 0;
    int maxRetrycount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (initialretrycount < maxRetrycount) {
            initialretrycount++;
            System.out.println(result.getTestClass().getName()+": Retrying");
            return true;
        }

        return false;
    }
}
