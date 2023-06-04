package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileNotFoundException;

public class MyDemo implements ITestListener {
    ExtentReports extentReports;
    ExtentTest extentTest;
    @Override
    public void onTestStart(ITestResult result) {
       extentTest=extentReports.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       extentTest.log(Status.PASS,"Test execution passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL,"Test execution failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP,"Test execution skiiped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        try {
            extentReports=ExtentManager.reports();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
       extentReports.flush();
    }
}
