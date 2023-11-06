package test_package;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/feature-folder"},
plugin = {"json:target/cucumber.json"},
glue = "step_package",tags = {"@Blue"})


public class testclass extends AbstractTestNGCucumberTests {

}
