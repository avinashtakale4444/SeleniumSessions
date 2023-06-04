package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExtentManager {
    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;

    public static ExtentReports reports() throws FileNotFoundException {
        extentReports = new ExtentReports();
        sparkReporter = new ExtentSparkReporter("target/extentReport.html");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("TutorialsNinja Test Automation Results Report");
        sparkReporter.config().setDocumentTitle("TN Automation Report");
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
        extentReports.attachReporter(sparkReporter);
        return extentReports;
    }
}
