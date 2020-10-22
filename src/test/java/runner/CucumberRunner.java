package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "json:target/CucumberRunner/cucumber.json", "html:target/CucumberRunner/cucumber.html"},
        features = "src/test/java/features",
        glue = "steps"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {


}