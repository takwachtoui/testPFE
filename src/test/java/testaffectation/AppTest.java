package testaffectation;

import org.testng.TestNG;

public class AppTest {

    public static void main(String[] args) {

        // Create a TestNG object
        TestNG testng = new TestNG();

        // Add your test classes to the suite
        testng.setTestClasses(new Class[]{TestLogin.class});

        // Run the tests
        testng.run();
    }
}

