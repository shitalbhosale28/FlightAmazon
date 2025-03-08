package flight_project2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class Testlistener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getTestClass().getName()+":"+": Started");
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getTestClass().getName()+": Completed");
        ITestListener.super.onTestSuccess(result);
        Reporter.log("success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.err.println(result.getTestClass().getName()+": FAILED!");
        ITestListener.super.onTestFailure(result);
        Reporter.log("fail");

        WebDriver driver = null;
        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(result.getInstance());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        // WebDriver driver = LoginandQuit.driver; // LoginandQuit.getDriver();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File Source = ts.getScreenshotAs(OutputType.FILE);
        File Destination = new File(
                "C:\\Users\\amolb\\IJ_Workspace\\FlightAmazon\\target\\surefire-reports\\Screenshot\\Test-" + result.getName() + "_" +driver.getClass().getSimpleName() + ".png");

        try {
            FileHandler.copy(Source, Destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ScreenCaptured");
        System.out.println("Source:" + Source);
        System.out.println("Destination:" + Destination);

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getTestClass().getName()+": Skipped");
        ITestListener.super.onTestSkipped(result);
    }
}
