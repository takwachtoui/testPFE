package testaffectation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuite {
    @BeforeSuite
    public void setUpSuite() {
        // Initialize the report once before the suite
        TestReport.init();
    }

    @AfterSuite
    public void tearDownSuite() {
        // Flush the report once after all tests in the suite have been executed
        TestReport.flushReport();

    }
}

