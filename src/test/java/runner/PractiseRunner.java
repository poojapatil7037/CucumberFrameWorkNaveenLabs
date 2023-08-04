package runner;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\CucumberFrameWorkNaveenLabs\\src\\test\\resources\\features\\loginpagePractise.feature",
        glue={"org.example.stepsdefs.PractiseStepDefs.java"}
        //plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
       // monochrome = true,
       // publish = true
)
public class PractiseRunner extends AbstractTestNGCucumberTests {

}
