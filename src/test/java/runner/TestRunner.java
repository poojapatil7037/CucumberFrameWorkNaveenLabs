package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "D:\\CucumberFrameWorkNaveenLabs\\src\\test\\resources\\features\\loginpage.feature",
        glue={"org.example.stepsdefs"},
        plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
        monochrome = true,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {


    @DataProvider(parallel = true)
    public Object[][] scenario(){
        return super.scenarios();
    }
}




