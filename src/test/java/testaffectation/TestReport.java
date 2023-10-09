package testaffectation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReport {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentTest test;

    private static TestReport instance;

    private TestReport() {
        // Specify the path to save the report file
        sparkReporter = new ExtentSparkReporter("C:\\Users\\takwa chtioui\\OneDrive - GFI\\Bureau\\PPE-TAKWA\\SeleniumProject");

        // Attach the reporter to ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    public static TestReport getInstance() {
        if (instance == null) {
            instance = new TestReport();
        }
        return instance;
    }

    public static void init() {
    }

    public ExtentTest createTest(String testName) {
        // Create a test with the given name
        test = extent.createTest(testName);
        return test;
    }

    public static void flushReport() {
        // Flush the report to save it
        extent.flush();
    }
}
