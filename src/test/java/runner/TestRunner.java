package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", //path of the feature files
        glue = {"stepDefinitions"}, //path of step definition
        monochrome = true, // display the console output in readable format
        dryRun = false, // Check all the steps have the definitions else will not execute
        tags = ("@Smoke or @Chart or @List or @Popup or @Gesture") //run the tagged scenarios only which are mentioned here
)

public class TestRunner extends AbstractTestNGCucumberTests {

}